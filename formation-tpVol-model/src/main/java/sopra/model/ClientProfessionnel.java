package tpVol;

public class ClientProfessionnel extends Client{

	private String siret;
	private String tva;
	
	
	public ClientProfessionnel(String siret, String tva) {
		this.siret = siret;
		this.tva = tva;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getTva() {
		return tva;
	}
	public void setTva(String tva) {
		this.tva = tva;
	}
	
	
}
