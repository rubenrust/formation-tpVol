package sopra.model;

import javax.persistence.Embeddable;

@Embeddable
public class Coordonnee {

	private String ville;
	private String rue;
	private String complement;
	private String tel;
	private String mail;
	private String codePostal;
	private String pays;
	
	
	
	public Coordonnee() {
		super();
	}

	@Override
	public String toString() {
		return "Coordonnee [ville=" + ville + ", rue=" + rue + ", complement=" + complement + ", tel=" + tel + ", mail="
				+ mail + ", codePostal=" + codePostal + ", pays=" + pays + "]";
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	
	
}
