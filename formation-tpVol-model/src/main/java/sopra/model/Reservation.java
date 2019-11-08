package tpVol;

public class Reservation {

	private String nbReservation;
	private String statut;
	private float prix;
	private String place;
	private String classe;
	private int nbBagage;
	private Vol vol;
	private Client client;
	private Passager passager;
	
	
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
