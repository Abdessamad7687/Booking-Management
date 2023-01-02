package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDAO;
import entities.Chambre;

public class ChambreService implements IDAO<Chambre> {
	
	
	public ChambreService() {
	}

	@Override
	public boolean create(Chambre o) {
		String req = "INSERT INTO chambre values(null,?,?)";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getTelephone());
			ps.setInt(2, o.getCateg().getId());
			if(ps.executeUpdate() == 1){
				System.out.println("successfully created chambre");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean update(Chambre o) {
		String req = "UPDATE chambre SET telephone=?,idcategorie=? WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getTelephone());
			ps.setInt(2, o.getCateg().getId());
			ps.setInt(3, o.getId());
			if(ps.executeUpdate() == 1){
				System.out.println("successfully updated chambre");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean delete(Chambre o) {
		String req = "DELETE FROM chambre Where id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate() == 1) {
				System.out.println("successfully deleted chambre");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Chambre findById(int id) {
		CategorieService catgs = new CategorieService();
		String req = "SELECT * FROM chambre WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Chambre(rs.getInt(1), rs.getString(2), catgs.findById(rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Chambre> findAll() {
		CategorieService catgs = new CategorieService();
		List<Chambre> catList = new ArrayList<Chambre>();
		
		String req = "SELECT * FROM chambre";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				catList.add( new Chambre(rs.getInt(1), rs.getString(2), catgs.findById(rs.getInt(3))));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return catList;
	}

}
