package Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Entità.Lista;
import Entità.Prodotto;
import Repository.ProdottoRepository;
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
	@Override
	public void InserisciProdLista(Prodotto prodotto, Lista lista) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RimuoviProdLista(Prodotto prodotto, Lista lista) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void CancellaProd(Prodotto prodotto) {
		prodottoRepository.delete(prodotto);
		
	}
	

}
