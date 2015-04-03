package beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tournois implements Serializable{
	private static final long serialVersionUID=1;
	

	// Paramètres
	@Id@GeneratedValue
	private static int Code;
	private String Nom;
	private String Lieu;
	private String Jour;
	private String Niveau;
	
	// COnstructeur
	public Tournois(){
		
	}
	
	// Getters
	public static int getCode() {
		return Code;
	}
	
	public String getJour() {
		return Jour;
	}
	
	public String getLieu() {
		return Lieu;
	}
	
	public String getNiveau() {
		return Niveau;
	}
	
	public String getNom() {
		return Nom;
	}
	
	// Setters
	public void setJour(String jour) {
		Jour = jour;
	}
	
	public void setLieu(String lieu) {
		Lieu = lieu;
	}
	
	public void setNiveau(String niveau) {
		Niveau = niveau;
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	
}
