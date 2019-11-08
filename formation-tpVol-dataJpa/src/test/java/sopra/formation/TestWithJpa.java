package sopra.formation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.model.Aeroport;
import sopra.model.ClientProfessionnel;
import sopra.model.Compagnie;
import sopra.model.CompagnieVol;
import sopra.model.Coordonnee;
import sopra.model.Escale;
import sopra.model.Passager;
import sopra.model.Reservation;
import sopra.model.Ville;
import sopra.model.Vol;
import sopra.tpVol.Singleton;
import sopra.tpVol.repository.IAeroportRepository;
import sopra.tpVol.repository.IClientRepository;
import sopra.tpVol.repository.ICompagnieRepository;
import sopra.tpVol.repository.ICompagnieVolRepository;
import sopra.tpVol.repository.IEscaleRepository;
import sopra.tpVol.repository.IPassagerRepository;
import sopra.tpVol.repository.IReservationRepository;
import sopra.tpVol.repository.IVilleRepository;
import sopra.tpVol.repository.IVolRepository;

public class TestWithJpa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-dd/MM/yyyy");
		SimpleDateFormat sdfbis = new SimpleDateFormat("dd/MM/yyyy");
		
		IAeroportRepository aeroRepo = Singleton.getInstance().getAeroRepository();
		
		Coordonnee coordonneesBerlinAeroport = new Coordonnee();
		coordonneesBerlinAeroport.setCodePostal("55440");
		coordonneesBerlinAeroport.setMail("berlin.aeroport@gmail.com");
		coordonneesBerlinAeroport.setPays("Allemagne");
		coordonneesBerlinAeroport.setRue("36 strass hjkjkie");
		coordonneesBerlinAeroport.setTel("0354758452");
		coordonneesBerlinAeroport.setVille("Berlin");
		
		
		Aeroport berlinAeroport = new Aeroport();
		berlinAeroport.setIdentifiant("54654475");
		berlinAeroport.setNom("Aeroport de Berlin");
		berlinAeroport.setCoordonnees(coordonneesBerlinAeroport);
		
		berlinAeroport = aeroRepo.save(berlinAeroport);
		
		berlinAeroport = aeroRepo.find(berlinAeroport.getId());
		aeroRepo.findAll();
		aeroRepo.delete(berlinAeroport);
		
		

		IClientRepository clientRepo = Singleton.getInstance().getClientRepository();
		
		Coordonnee adsop = new Coordonnee();
		adsop.setCodePostal("33700");
		adsop.setVille("Merignac");
		adsop.setRue("Rue Sopra");
		
		ClientProfessionnel sopra = new ClientProfessionnel();
		sopra.setMoyenPaiement("Carte");
		sopra.setNom("Sopra");
		sopra.setSiret("661616146164");
		sopra.setTva("26264561");
		sopra.setCoordonnees(adsop);
		
		sopra = (ClientProfessionnel) clientRepo.save(sopra);
		clientRepo.findAll();
		sopra = (ClientProfessionnel) clientRepo.find(sopra.getId());
		//clientRepo.delete(sopra);
		
		
		ICompagnieRepository compagnieRepo = Singleton.getInstance().getCompagnieRepository();
		ICompagnieVolRepository compagnieVolRepo = Singleton.getInstance().getCompagnieVolRepository();
		
		Compagnie xlAirways = new Compagnie();
		xlAirways.setNom(" XL Airways");
		
		xlAirways = compagnieRepo.save(xlAirways);
		xlAirways = compagnieRepo.find(xlAirways.getId());
		compagnieRepo.findAll();
		//compagnieRepo.delete(xlAirways);
		
		
		
		CompagnieVol a633 = new CompagnieVol();
		a633.setCompagnie(xlAirways);
		a633.setNumero("a633");
		
		a633 = compagnieVolRepo.save(a633);
		a633 = compagnieVolRepo.find(a633.getId());
		compagnieVolRepo.findAll();
		//compagnieVolRepo.delete(a633);
		
		
		IEscaleRepository escaleRepo = Singleton.getInstance().getEscaleRepository();
		
		Escale esc1 = new Escale();
		esc1.setHeureDepart(sdf.parse("18-50-18/1/2019"));
		esc1.setHeureArrivee(sdf.parse("22-50-18/1/2019"));
		esc1.setAeroport(berlinAeroport);
		
		IPassagerRepository passagerRepo = Singleton.getInstance().getPassagerRepository();
		
		Coordonnee coordonneesRuben = new Coordonnee();
		coordonneesRuben.setCodePostal("33800");
		coordonneesRuben.setMail("rust.ruben@gmail.com");
		coordonneesRuben.setPays("France");
		coordonneesRuben.setRue("29 rue Cruchinet");
		coordonneesRuben.setTel("0632227403");
		coordonneesRuben.setVille("Bordeaux");
		
		Passager ruben = new Passager();
		ruben.setNom("Rust");
		ruben.setPrenom("Ruben");
		ruben.setNbIdentite("5469547556");
		ruben.setNationalite("France");
		ruben.setCoordonnees(coordonneesRuben);
		
		ruben = passagerRepo.save(ruben);
		ruben = passagerRepo.find(ruben.getId());
		passagerRepo.findAll();
		//passagerRepo.delete(ruben);
		
		IReservationRepository reservationRepo = Singleton.getInstance().getReservationRepository();
		
		Reservation reservationRuben = new Reservation();
		reservationRuben.setClasse("2eme classe");
		reservationRuben.setNbBagage(1);
		reservationRuben.setClient(sopra);
		reservationRuben.setPassager(ruben);
		reservationRuben.setNbReservation("544564654654");
		reservationRuben.setPlace("45b");
		reservationRuben.setPrix(250.45f);
		reservationRuben.setStatut("Valide");
		
		reservationRuben = reservationRepo.save(reservationRuben);
		reservationRuben = reservationRepo.find(reservationRuben.getId());
		
		
		IVilleRepository villeRepo = Singleton.getInstance().getVilleRepository();
		
		Ville berlin = new Ville();
		berlin.setCodePostal("55440");
		berlin.setNom("Berlin");
		berlin.setPays("Allemagne");
		
		berlin = villeRepo.save(berlin);
		
		IVolRepository volRepo = Singleton.getInstance().getVolRepository();
		
		Vol vol = new Vol();
		Date dtDepart = sdfbis.parse("20/09/2019");
		Date dtArrivee = sdfbis.parse("20/09/2019");
		vol.setDtDepart(dtDepart);
		vol.setDtArrivee(dtArrivee);
		vol.setCapacite(450);
		vol.setArrivee(berlinAeroport);
		vol.setStatut("OK");
	}

}
