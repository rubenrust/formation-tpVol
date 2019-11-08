package tpVol;

import java.util.ArrayList;

public class Client {

	private String nom;
	private Coordonnee coordonnees;
	private String moyenPaiement;
	private ArrayList<Reservation> achats = new ArrayList<Reservation>();
	
	public ArrayList<Reservation> getAchats() {
		return achats;
	}
	public void setAchats(ArrayList<Reservation> achats) {
		this.achats = achats;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Coordonnee getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(Coordonnee coordonnees) {
		this.coordonnees = coordonnees;
	}
	public String getMoyenPaiement() {
		return moyenPaiement;
	}
	public void setMoyenPaiement(String moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}
	
	
}
