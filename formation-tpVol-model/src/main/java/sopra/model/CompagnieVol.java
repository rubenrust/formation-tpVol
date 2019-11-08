package sopra.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class CompagnieVol {

	@Id
	@GeneratedValue
	private Long Id;
	@Version
	private int version;
	private String numero;
	@OneToMany(mappedBy = "compagnieVol")
	private ArrayList<Vol> vols = new ArrayList<Vol>();
	@ManyToOne
	@JoinColumn(name = "compagnie_id")
	private Compagnie compagnie;


	public ArrayList<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
