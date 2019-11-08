package tpVol;

import java.util.ArrayList;

public class Ville {

	private String codePostal;
	private String pays;
	private String nom;
	private ArrayList<Aeroport> possede = new ArrayList<Aeroport>();
	
	public ArrayList<Aeroport> getPossede() {
		return possede;
	}
	public void setPossede(ArrayList<Aeroport> possede) {
		this.possede = possede;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
