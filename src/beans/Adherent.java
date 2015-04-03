package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Adherent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue
	private static int Id_Adherent;
	private String Nom;
	private String Prenom;
	private String Telephone;
	private String Adresse;
	private String Login;
	private String Password; 
	private List<Tournois> Liste_Tournois = new ArrayList<Tournois>();
	
	// Constructeur
	
	
	public Adherent(String nom, String prenom, String telephone, String adresse, String password, String login) {
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Telephone = telephone;
		Password = password;
		Login = login;
	}
	
	// Setters
	
	public void setListe_Tournois(List<Tournois> liste_Tournois) {
		Liste_Tournois = liste_Tournois;
	}
	
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	// Getters
	
	public String getPassword() {
		return Password;
	}
	
	public List<Tournois> getListe_Tournois() {
		return Liste_Tournois;
	}
	
	public String getAdresse() {
		return Adresse;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String getTelephone() {
		return Telephone;
	}

}
