package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	private int id;
	private Client client;
	private Chambre chambre;
	private Date datedebut;
	private Date datefin;
	private static int count=0;
	
	public Reservation(Client c, Chambre chbr, Date datedebut, Date datefin) {
		this.id = ++count;
		this.client = c;
		this.chambre = chbr;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	
	public Reservation(int id,Client c, Chambre chbr, Date datedebut, Date datefin) {
		this.id = id;
		this.client = c;
		this.chambre = chbr;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	
	public int getId() {
		return this.id;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dateD = sdf.format(this.datedebut);
		String dateF = sdf.format(this.datefin);
		return "Reservation [id=" + id + ", client=" + client + ", chambre=" + chambre + ", datedebut=" + dateD
				+ ", datefin=" + dateF + "]";
	}

	
	
	
	
}
