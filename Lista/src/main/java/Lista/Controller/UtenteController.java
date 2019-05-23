package Lista.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Lista.Entità.Utente;
import Lista.Service.*;
@Controller
@RequestMapping("Utente")
public class UtenteController {
	@Autowired
	private UtenteService utenteService;
	@RequestMapping(method = RequestMethod.GET)
	public String Home(ModelMap modelMap) {
		modelMap.put("Utente", new Utente());
		return "ListaProdotti/home";
	}
	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public String Login(@ModelAttribute("Utente") Utente utente) {
		return "ListaProdotti/Login";
	}
	@RequestMapping(value="Registrazione",method = RequestMethod.POST)
	public String Registrazione(@ModelAttribute("Utente") Utente utente)
	{
		return "ListaProdotti/Registrazione";
	}
	

}
