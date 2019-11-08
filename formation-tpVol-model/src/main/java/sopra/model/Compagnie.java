package tpVol;

import java.util.ArrayList;

public class Compagnie {

	private String nom;
	private String siret;
	private Coordonnee coordonnees;
	private ArrayList<CompagnieVol> compagniesVols = new ArrayList<CompagnieVol>();
	
	public ArrayList<CompagnieVol> getCompagniesVols() {
		return compagniesVols;
	}
	public void setCompagniesVols(ArrayList<CompagnieVol> compagniesVols) {
		this.compagniesVols = compagniesVols;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public Coordonnee getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(Coordonnee coordonnees) {
		this.coordonnees = coordonnees;
	}
	
	
}
