package mg.ingenosya.testeJava.classe;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Utilisateur {
	@Id
	private String pseudo;
	private String mdp;
	@OneToMany(mappedBy = "utilisateur", fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Commentaire> commentaires;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String pseudo, String mdp) {
		super();
		this.pseudo = pseudo;
		this.mdp = mdp;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	
}
