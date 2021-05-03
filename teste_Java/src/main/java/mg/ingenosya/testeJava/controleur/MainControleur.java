package mg.ingenosya.testeJava.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mg.ingenosya.testeJava.Repository.VoitureRepository;
import mg.ingenosya.testeJava.classe.Voiture;

@Controller
@RequestMapping(value="/")
public class MainControleur {
	@Autowired
	VoitureRepository voitureRepository;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String accueil(Model model) {
		List<Voiture> voitures = (List<Voiture>) voitureRepository.findAll();
		model.addAttribute("voitures", voitures);
		return "index";
	}
	@RequestMapping(value="inscription", method = RequestMethod.GET)
	public String connexion(Model model) {
		return "/utilisateurs/inscription";
	}
	
}
