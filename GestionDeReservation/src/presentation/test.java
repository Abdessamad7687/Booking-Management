package presentation;

import GUI.Main;
import java.util.Date;
import java.util.List;

import entities.Categorie;
import entities.Chambre;
import entities.Client;
import entities.Reservation;
import service.CategorieService;
import service.ChambreService;
import service.ClientService;
import service.ReservationService;

public class test {

	public static void main(String[] args) {
		ClientService cs = new ClientService();
		CategorieService cats = new CategorieService();
		ChambreService chs = new ChambreService();
		ReservationService rs = new ReservationService();
		

//		cs.create(new Client("Inas", "El Mehdi", "0663646156", "elmehdiines@gmail.com"));
//		
//		
//		cats.create(new Categorie("DBL", "Double"));
//		cats.create(new Categorie("SMP", "Simple"));
//		cats.create(new Categorie("TRP", "Triple"));
//		cats.create(new Categorie("ST", "Suite"));
//		
//		chs.create(new Chambre("0808111111", cats.findById(2)));
//		chs.create(new Chambre("0808111112", cats.findById(2)));
//		chs.create(new Chambre("0808111113", cats.findById(1)));
//		chs.create(new Chambre("0808111114", cats.findById(1)));
//		chs.create(new Chambre("0808111115", cats.findById(3)));
//		chs.create(new Chambre("0808111116", cats.findById(4)));
//		
//		
//		if(rs.create(new Reservation(cs.findById(1), chs.findById(1), new Date("2022/01/01"), new Date("2022/01/10")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(1), chs.findById(5), new Date("2022/01/10"), new Date("2022/01/20")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(2), chs.findById(2), new Date("2022/01/01"), new Date("2022/01/12")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(3), chs.findById(3), new Date("2022/01/01"), new Date("2022/01/12")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(4), chs.findById(4), new Date("2022/01/01"), new Date("2022/01/12")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(5), chs.findById(5), new Date("2022/01/01"), new Date("2022/01/12")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(6), chs.findById(6), new Date("2022/01/01"), new Date("2022/01/12")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(7), chs.findById(1), new Date("2022/01/15"), new Date("2022/01/17")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		if(rs.create(new Reservation(cs.findById(8), chs.findById(2), new Date("2022/01/16"), new Date("2022/01/20")))) {
//			System.out.println("reservation Resussie");
//		} else {
//			System.out.println("echec de reservation");
//		}
//		
//		System.out.println();
		
//		if(rs.update(rs.findById(1))) {
//			System.out.println("reservation modifier: " + rs.findById(1));
//		} else {
//			System.out.println("echec de modification reservation");
//		}
		
//		System.out.println("Liste des chambres reserver par le client: " + cs.findById(1));
//		for(Chambre c : rs.findChambreBetweenDates(cs.findById(1), new Date("2022/01/01"), new Date("2022/01/24"))) {
//			System.out.println(c.toString());
//		}
//		cats.create(new Categorie("DB", "double"));
//		cats.create(new Categorie("SP", "simple"));
//		cats.create(new Categorie("TP", "triple"));
		
//		chs.create(new Chambre("0523547589", cats.findById(1)));
//		chs.create(new Chambre("0523556677", cats.findById(1)));
//		chs.create(new Chambre("0523333333", cats.findById(2)));
		
//		cs.create(new Client("ouairem", "imad", "0628431397", "imad@gmail.com"));
//		cs.create(new Client("akram", "karim", "0628282828", "akram@gmail.com"));
//		cs.create(new Client("adnane", "adnane", "0625263828", "adnane@gmail.com"));
		
//		cs.delete(cs.findById(2));
		
//		Client c = cs.findById(9);
//		if(c == null) {
//			System.out.println("null");
//		}
//		c.setTelephone("0666666666");
//		cs.update(c);
//		
//		
//		System.out.println(cs.findById(1).toString());
		
//		rs.create(new Reservation(cs.findById(1), chs.findById(3), new Date("2022/01/01"), new Date("2022/01/10")));
//		rs.create(new Reservation(cs.findById(5), chs.findById(3), new Date("2022/01/11"), new Date("2022/01/15")));
//		rs.create(new Reservation(cs.findById(1), chs.findById(1), new Date("2022/01/01"), new Date("2022/01/10")));
		
//		Reservation r2 = rs.findById(1);
//		System.out.println(r2.toString());
//		r2.setDatedebut(new Date("2022/01/12"));
//		r2.setDatefin(new Date("2022/01/16"));
//		rs.update(r2);
		
		List<Client> l = cs.findAll();
		
		for(Client c : l) {
			System.out.println(c.toString());
		}
		
		for(Chambre c : rs.findChambreBetweenDates(cs.findById(1), new Date("2022/01/01"), new Date("2022/01/24"))) {
			System.out.println(c.toString());
		}
                
	}

}
