package sopra.tpVol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.tpVol.repository.IAeroportRepository;
import sopra.tpVol.repository.IClientRepository;
import sopra.tpVol.repository.ICompagnieRepository;
import sopra.tpVol.repository.ICompagnieVolRepository;
import sopra.tpVol.repository.IEscaleRepository;
import sopra.tpVol.repository.IPassagerRepository;
import sopra.tpVol.repository.IReservationRepository;
import sopra.tpVol.repository.IVilleRepository;
import sopra.tpVol.repository.IVolRepository;
import sopra.tpVol.repository.jpa.AeroportRepository;
import sopra.tpVol.repository.jpa.ClientRepository;
import sopra.tpVol.repository.jpa.CompagnieRepository;
import sopra.tpVol.repository.jpa.CompagnieVolRepository;
import sopra.tpVol.repository.jpa.EscaleRepository;
import sopra.tpVol.repository.jpa.PassagerRepository;
import sopra.tpVol.repository.jpa.ReservationRepository;
import sopra.tpVol.repository.jpa.VilleRepository;
import sopra.tpVol.repository.jpa.VolRepository;

public class Singleton {
	private static Singleton instance = null;
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-tpVol");
	
	private final IAeroportRepository aeroRepository = new AeroportRepository();
	
	private final IClientRepository clientRepository = new ClientRepository();
	
	private final ICompagnieRepository compagnieRepository = new CompagnieRepository();
	
	private final ICompagnieVolRepository compagnieVolRepository = new CompagnieVolRepository();
	
	private final IEscaleRepository escaleRepository = new EscaleRepository();
	
	private final IPassagerRepository passagerRepository = new PassagerRepository();
	
	private final IReservationRepository reservationRepository = new ReservationRepository();
	
	private final IVilleRepository villeRepository = new VilleRepository();
	
	private final IVolRepository volRepository = new VolRepository();
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IAeroportRepository getAeroRepository() {
		return aeroRepository;
	}

	public IClientRepository getClientRepository() {
		return clientRepository;
	}

	public ICompagnieRepository getCompagnieRepository() {
		return compagnieRepository;
	}

	public ICompagnieVolRepository getCompagnieVolRepository() {
		return compagnieVolRepository;
	}

	public IEscaleRepository getEscaleRepository() {
		return escaleRepository;
	}

	public IPassagerRepository getPassagerRepository() {
		return passagerRepository;
	}

	public IReservationRepository getReservationRepository() {
		return reservationRepository;
	}

	public IVilleRepository getVilleRepository() {
		return villeRepository;
	}

	public IVolRepository getVolRepository() {
		return volRepository;
	}
	
	
	
}
