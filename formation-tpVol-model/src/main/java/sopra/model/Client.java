package sopra.model;

import java.util.ArrayList;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeClient")
public class Client {

	@Id
	@GeneratedValue
	private Long Id;
	@Version
	private int version;
	private String nom;
	@Embedded
	private Coordonnee coordonnees;
	private String moyenPaiement;
	@OneToMany(mappedBy = "client")
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
