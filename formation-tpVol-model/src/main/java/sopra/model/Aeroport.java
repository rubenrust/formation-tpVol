package sopra.model;

import java.util.ArrayList;

public class Aeroport {

	private Long id;
	private String nom;
	private String identifiant;
	private Coordonnee coordonnees;
	private ArrayList<Ville> dessert = new ArrayList<Ville>();
	private ArrayList<Escale> escales = new ArrayList<Escale>();
	
	public ArrayList<Ville> getDessert() {
		return dessert;
	}
	public void setDessert(ArrayList<Ville> dessert) {
		this.dessert = dessert;
	}
	public ArrayList<Escale> getEscales() {
		return escales;
	}
	public void setEscales(ArrayList<Escale> escales) {
		this.escales = escales;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public Coordonnee getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(Coordonnee coordonnees) {
		this.coordonnees = coordonnees;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
