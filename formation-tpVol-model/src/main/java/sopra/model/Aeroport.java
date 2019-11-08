package sopra.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Aeroport {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	private String identifiant;
	@Embedded
	private Coordonnee coordonnees;
	@ManyToMany(mappedBy = "aeroport")
	private List<Ville> dessert = new ArrayList<Ville>();
	@OneToMany(mappedBy = "aeroport")
	private List<Escale> escales = new ArrayList<Escale>();
	
	
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Aeroport() {
		super();
	}
	
	public List<Ville> getDessert() {
		return dessert;
	}
	public void setDessert(List<Ville> dessert) {
		this.dessert = dessert;
	}
	public List<Escale> getEscales() {
		return escales;
	}
	public void setEscales(List<Escale> escales) {
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
