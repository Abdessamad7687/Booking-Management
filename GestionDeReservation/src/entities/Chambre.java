package entities;

public class Chambre {
	private int id;
	private String telephone;
	private Categorie categ;
	private static int count=0;
	
	public Chambre(String telephone, Categorie c) {
		this.id = ++count;
		this.telephone = telephone;
		this.categ = c;
	}
	public Chambre(int id, String telephone, Categorie c) {
		this.id = id;
		this.telephone = telephone;
		this.categ = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

	public Categorie getCateg() {
		return categ;
	}

	public void setCateg(Categorie categ) {
		this.categ = categ;
	}

	@Override
	public String toString() {
		return this.id + " | " + this.categ;
	}
	
	
}
