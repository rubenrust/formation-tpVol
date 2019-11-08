package sopra.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("particulier")
public class ClientParticulier extends Client{

	private String prenom;

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
