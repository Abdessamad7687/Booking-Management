/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDAO;
import entities.Utilisateur;

/**
 *
 * @author Inas
 */
public class UtilisateurService implements IDAO<Utilisateur>{

	@Override
	public boolean create(Utilisateur o) {
		// TODO Auto-generated method stub
		String req = "INSERT INTO utilisateur values(null,?,?,?,?)";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setString(3, o.getUsername());
			ps.setString(4, o.getPassword());
			
			if(ps.executeUpdate() == 1){
				System.out.println("successfully created User");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean update(Utilisateur o) {
		// TODO Auto-generated method stub
		String req = "UPDATE utilisateur SET nom=?, prenom=?, username=?, password=? WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setString(3, o.getUsername());
			ps.setString(4, o.getPassword());
			ps.setInt(5, o.getId());
			if(ps.executeUpdate() == 1){
				System.out.println("successfully updated user");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean delete(Utilisateur o) {
		// TODO Auto-generated method stub
		String req = "DELETE FROM utilisateur Where id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate() == 1) {
				System.out.println("successfully deleted user");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Utilisateur findById(int id) {
		// TODO Auto-generated method stub
		String req = "SELECT * FROM utilisateur WHERE id=?";
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Utilisateur(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		List<Utilisateur> usersList = new ArrayList<Utilisateur>();
		
		String req = "SELECT * FROM utilisateur";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				usersList.add( new Utilisateur(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersList;
	}

}
