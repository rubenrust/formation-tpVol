package sopra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nbReservation;
	private String statut;
	private float prix;
	private String place;
	private String classe;
	private int nbBagage;
	@ManyToOne
	@JoinColumn(name = "vol_id")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	@OneToOne
	@JoinColumn(name = "passager_id")
	private Passager passager;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Reservation() {
		super();
	}

	@Override
	public String toString() {
		return "Reservation [nbReservation=" + nbReservation + ", statut=" + statut + ", prix=" + prix + ", place="
				+ place + ", classe=" + classe + ", nbBagage=" + nbBagage + ", vol=" + vol + ", client=" + client
				+ ", passager=" + passager + "]";
	}
	
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Passager getPassager() {
		return passager;
	}
	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	public String getNbReservation() {
		return nbReservation;
	}
	public void setNbReservation(String nbReservation) {
		this.nbReservation = nbReservation;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getNbBagage() {
		return nbBagage;
	}
	public void setNbBagage(int nbBagage) {
		this.nbBagage = nbBagage;
	}
	
}
