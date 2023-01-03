package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;

public class CategorieService implements IDAO<Categorie> {
	
	public CategorieService() {
		
	}

	@Override
	public boolean create(Categorie o) {
		String req = "INSERT INTO categorie values(null,?,?)";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
			if(ps.executeUpdate() == 1){
				System.out.println("successfully created categorie");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean update(Categorie o) {
		String req = "UPDATE categorie SET code=?,libelle=? WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
			ps.setInt(3, o.getId());
			if(ps.executeUpdate() == 1){
				System.out.println("successfully updated categorie");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean delete(Categorie o) {
		String req = "DELETE FROM categorie Where id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate() == 1) {
				System.out.println("successfully deleted categorie");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Categorie findById(int id) {
		String req = "SELECT * FROM categorie WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Categorie(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Categorie> findAll() {
		List<Categorie> catList = new ArrayList<Categorie>();
		
		String req = "SELECT * FROM categorie";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				catList.add(new Categorie(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return catList;
	}

}
