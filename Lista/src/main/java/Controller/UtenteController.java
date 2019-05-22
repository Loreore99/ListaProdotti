package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Entità.Utente;
import Service.*;
@Controller
@RequestMapping("utente")
public class UtenteController {
	@Autowired
	private UtenteService utenteService;
	@RequestMapping(method = RequestMethod.GET)
	public String Home(ModelMap modelMap) {
		modelMap.put("utente", new Utente());
		return "ListaProdotti/home";
	}
	
	

}
