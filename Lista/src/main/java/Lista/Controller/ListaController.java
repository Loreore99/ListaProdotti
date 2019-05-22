package Lista.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Lista.Entità.Lista;
import Lista.Service.*;
@Controller
@RequestMapping("/Lista")
public class ListaController {
	@Autowired
	private ListaService listaService;
}
