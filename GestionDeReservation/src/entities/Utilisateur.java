
package entities;


public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String username;
	private String password;
	
	
	
	public Utilisateur(int id, String nom, String prenom, String username, String password) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
	
	public Utilisateur(String nom, String prenom, String username, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}