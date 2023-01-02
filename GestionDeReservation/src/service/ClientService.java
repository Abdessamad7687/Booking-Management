package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDAO;
import entities.Client;

public class ClientService implements IDAO<Client> {
	
	public ClientService() {
	}

	@Override
	public boolean create(Client o) {
		String req = "INSERT INTO client VALUES(null,?,?,?,?)";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setString(3, o.getTelephone());
			ps.setString(4, o.getEmail());
			if (ps.executeUpdate() == 1){
				System.out.println("successfully created client");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Client o) {
		String req = "UPDATE client SET nom=?,prenom=?,telephone=?,email=? WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setString(3, o.getTelephone());
			ps.setString(4, o.getEmail());
			ps.setInt(5, o.getId());
			
			if(ps.executeUpdate() == 1){
				System.out.println("successfully updated client");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean delete(Client o) {
		String req = "DELETE FROM client WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, o.getId());
	
			if(ps.executeUpdate() == 1){
				System.out.println("successfully deleted client");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public Client findById(int id) {
		String req = "SELECT * FROM client WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Client> findAll() {
		List<Client> clientList = new ArrayList<Client>();
		
		String req = "SELECT * FROM client";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				clientList.add(new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientList;
	}

}
