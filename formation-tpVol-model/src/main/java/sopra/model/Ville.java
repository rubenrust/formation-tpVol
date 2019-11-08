package sopra.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Ville {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String codePostal;
	private String pays;
	private String nom;
	@ManyToMany
	@JoinTable(
			name = "aeroportVille", 
			joinColumns = @JoinColumn(name = "ville_id", referencedColumnName = "id" ),
			inverseJoinColumns = @JoinColumn(name = "aeroport_id", referencedColumnName = "id"))
	private List<Aeroport> aeroport = new ArrayList<Aeroport>();
	
	
	
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
	public Ville() {
		super();
	}
	public List<Aeroport> getAeroport() {
		return aeroport;
	}
	public void setAeroport(List<Aeroport> aeroport) {
		this.aeroport = aeroport;
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
