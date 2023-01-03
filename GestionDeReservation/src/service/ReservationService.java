package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import connexion.Connexion;
import dao.IDAO;
import entities.Chambre;
import entities.Client;
import entities.Reservation;

public class ReservationService implements IDAO<Reservation> {
		
	public ReservationService() {
		
	}

	@Override
	public boolean create(Reservation o) {
		if(o.getDatedebut().after(o.getDatefin())) {
			System.out.println("Date de debut depasse la date de fin");
			return false;
		}
		
		boolean chambreLibre = true;
		
		List<Reservation> reservations = this.findAll();
		for(Reservation r : reservations) {
			if(r.getChambre().getId() == o.getChambre().getId()) {
				if(!(o.getDatedebut().before(r.getDatedebut()) && o.getDatefin().before(r.getDatedebut()) 
						|| o.getDatedebut().after(r.getDatefin()) && o.getDatefin().after(r.getDatefin()))) {
					chambreLibre = false;
					break;
				}
			}
		}
		if(chambreLibre) {
			String req = "INSERT INTO reservation values(null,?,?,?,?)";
			try {
				PreparedStatement ps = Connexion.getCon().prepareStatement(req);
				ps.setInt(1, o.getClient().getId());
				ps.setInt(2, o.getChambre().getId());
				ps.setDate(3, new Date(o.getDatedebut().getTime()));
				ps.setDate(4, new Date(o.getDatefin().getTime()));
				if(ps.executeUpdate() == 1){
					System.out.println("successfully created reservation");
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		else
			System.out.println("Room Not avilable");
			return false;
	}

	@Override
	public boolean update(Reservation o) {
		
		
		
		if(o.getDatedebut().after(o.getDatefin())) {
			System.out.println("Invalid period!");
			return false;
		}
		
		
		boolean chambreLibre = true;
		List<Reservation> reservations = this.findAll();
		for(Reservation r : reservations) {
                    if(r.getId() != o.getId()){
                        if(r.getChambre().getId() == o.getChambre().getId()) {
				if(!(o.getDatedebut().before(r.getDatedebut()) && o.getDatefin().before(r.getDatedebut()) 
						|| o.getDatedebut().after(r.getDatefin()) && o.getDatefin().after(r.getDatefin()))) {
					chambreLibre = false;
					break;
				}
			}
                    }
		}
		
		
		if(chambreLibre) {
                            String req = "UPDATE reservation SET idClient=?,idChambre=?,dateDebut=?,dateFin=?  WHERE id=?";
			try {
				PreparedStatement ps = Connexion.getCon().prepareStatement(req);
				ps.setInt(1, o.getClient().getId());
				ps.setInt(2, o.getChambre().getId());
				ps.setDate(3, new Date(o.getDatedebut().getTime()));
				ps.setDate(4, new Date(o.getDatefin().getTime()));
                                ps.setInt(5, o.getId());
				if(ps.executeUpdate() == 1){
					System.out.println("successfully updated chambre");
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		} 
		else
			System.out.println("Chambre occupee dans cette periode");
			return false;
	}

	@Override
	public boolean delete(Reservation o) {
		String req = "DELETE FROM reservation Where id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate() == 1) {
				System.out.println("successfully deleted reservation");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Reservation findById(int id) {
		ClientService cs = new ClientService();
		ChambreService chs = new ChambreService();
		String req = "SELECT * FROM reservation WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Reservation(rs.getInt(1), cs.findById(rs.getInt(2)), chs.findById(rs.getInt(3))
						, rs.getDate(4), rs.getDate(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Reservation> findAll() {
		ClientService cs = new ClientService();
		ChambreService chs = new ChambreService();
		List<Reservation> resList = new ArrayList<Reservation>();
		
		String req = "SELECT * FROM reservation";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				resList.add(new Reservation(rs.getInt(1), cs.findById(rs.getInt(2)), chs.findById(rs.getInt(3)), rs.getDate(4), rs.getDate(5) ));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resList;
	}
	
	public List<Chambre> findChambreBetweenDates(Client clt, java.util.Date date, java.util.Date date2){
		List<Chambre> reservedChambres = new ArrayList<Chambre>();
		
		List<Reservation> reservations = this.findAll();
		for(Reservation r : reservations) {
			if(r.getClient().getId() == clt.getId()) {
				if(r.getDatedebut().after(date) && r.getDatefin().before(date2) 
						|| r.getDatedebut().equals(date) || r.getDatefin().equals(date2)) {
					
					reservedChambres.add(r.getChambre());
				}
			}
		}
		
		return reservedChambres;
	}

}
