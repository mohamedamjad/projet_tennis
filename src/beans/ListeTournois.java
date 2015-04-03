package beans;

import java.util.ArrayList;
import java.util.List;

public final class ListeTournois {

	private List<Tournois> liste = new ArrayList<Tournois>();
	
	// Getters
	public List<Tournois> getListe() {
		return liste;
	}
	
	// Setters
	public void setListe(List<Tournois> liste) {
		this.liste = liste;
	}
	
}
