package ListaProdotti.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ListaProdotti.Entità.Utente;
import ListaProdotti.Service.UtenteService;
@Controller
@RequestMapping("Utente")
public class UtenteController 
{
	@Autowired
	private UtenteService utenteService;
	@RequestMapping(method = RequestMethod.GET)
	public String Home(ModelMap modelMap) {
		modelMap.put("Utente", new Utente());
		return "home";
	}
	@RequestMapping(value = "LoginPage", method = RequestMethod.POST)
	public String LoginPage(@ModelAttribute("Utente") Utente utente) {
		 return "Login";
	}
	@RequestMapping(value="RegistrazionePage",method = RequestMethod.POST)
	public String RegistrazionePage(@ModelAttribute("Utente") Utente utente)
	{
		 return "Registrazione";
	}
	@RequestMapping(value="Registrazione",method = RequestMethod.POST)
	public String Registrazione(@ModelAttribute("Utente") Utente utente)
	{
		utenteService.Registrazione(utente);
		 return "RegistrazioneSucc";
	}
	
    //@RequestMapping(value="Login",method = RequestMethod.POST)
    @PostMapping("Login")
	public String Login(@ModelAttribute("Utente") Utente utente){
		if(utenteService.Login(utente)==true)
		{
			 return "UserPage";
		}
		else
		{
			return "errorlogin";
		}
	}

}
