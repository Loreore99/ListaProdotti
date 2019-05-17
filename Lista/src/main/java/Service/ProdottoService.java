package Service;
import Entità.Prodotto;
import Entità.Lista;
public interface ProdottoService {
	public void InserisciProdLista(Prodotto prodotto,Lista lista);
	public void RimuoviProdLista(Prodotto prodotto,Lista lista);
	public void DisponibilitàProd(Prodotto prodotto);
	public Prodotto NuovoProd(Prodotto prodotto);
	public Prodotto CancellaProd(Prodotto prodotto);
	public Prodotto ModificaProd(Prodotto prodotto);
}
