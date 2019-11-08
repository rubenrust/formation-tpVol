package sopra.model;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Compagnie {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	private String siret;
	@Embedded
	private Coordonnee coordonnees;
	@OneToMany(mappedBy = "compagnie")
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
