package ListaProdotti.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ListaProdotti.Service.ProdottoService;
@Controller
@RequestMapping("Prodotto")
public class ProdottoController {
	@Autowired
	private ProdottoService prodottoService;

}
