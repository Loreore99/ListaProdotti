package Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entità.Prodotto;
import Entità.Lista;
import Repository.ProdottoRepository;
import Repository.ListaRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("prodottoService")
public class ProdottoServiceImpl implements ProdottoService {
	@Autowired
	private ProdottoRepository prodottoRepository;
	public int DisponibilitàProd(Prodotto prodotto)
	{
		return 0;
	}
	public Prodotto NuovoProd(Prodotto prodotto)
	{
		return prodottoRepository.save(prodotto);
	}
	public Prodotto ModificaProd(Prodotto prodotto)
	{
		return prodottoRepository.save(prodotto);
	}
	public void Cancellaprod(Prodotto prodotto)
	{
		prodottoRepository.delete(prodotto);
	}
	

}
