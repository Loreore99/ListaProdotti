package Lista.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Lista.Entità.Lista;
import Lista.Entità.Prodotto;
import Lista.Repository.ProdottoRepository;
@Transactional
@Service("prodottoService")
public class ProdottoServiceImpl implements ProdottoService {
	@Autowired
	private ProdottoRepository prodottoRepository;
	public int DisponibilitàProd(Prodotto prodotto)
	{
		if((prodotto.getQuantità()-prodotto.getAcquistati())>0)
		{
			
			return (prodotto.getQuantità()-prodotto.getAcquistati());
		}
		else
		{
			return 0;
		}
		
		
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
		
		
	}
	@Override
	public void RimuoviProdLista(Prodotto prodotto, Lista lista) {
		
		
	}
	@Override
	public void CancellaProd(Prodotto prodotto) {
		prodottoRepository.delete(prodotto);
		
	}
	

}
