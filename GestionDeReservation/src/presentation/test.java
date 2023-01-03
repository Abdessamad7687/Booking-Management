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
		

		List<Client> l = cs.findAll();
		
		for(Client c : l) {
			System.out.println(c.toString());
		}
		
		for(Chambre c : rs.findChambreBetweenDates(cs.findById(1), new Date("2022/01/01"), new Date("2022/01/24"))) {
			System.out.println(c.toString());
		}
                
	}

}
