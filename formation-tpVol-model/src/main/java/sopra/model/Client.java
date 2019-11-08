package sopra.model;

import java.util.ArrayList;
import java.util.List;

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
	private List<Reservation> achats = new ArrayList<Reservation>();
	
	
	public Client() {
		super();
	}
	
	public List<Reservation> getAchats() {
		return achats;
	}
	public void setAchats(List<Reservation> achats) {
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

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
