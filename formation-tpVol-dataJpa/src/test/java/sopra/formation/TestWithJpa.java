package sopra.formation;

import sopra.model.Aeroport;
import sopra.tpVol.Singleton;
import sopra.tpVol.repository.IAeroportRepository;

public class TestWithJpa {

	public static void main(String[] args) {
		
		IAeroportRepository aeroRepo = Singleton.getInstance().getAeroRepository();
		
		Aeroport aeroport = new Aeroport();
		aeroport.setNom("Paris CDG");
		aeroport.setIdentifiant("CDG");
		
		aeroRepo.save(aeroport);

	}

}
