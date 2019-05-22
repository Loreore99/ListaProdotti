package Lista.Service;
import Lista.Entità.Lista;
public interface ListaService {
	public Lista RinominaLista(Lista lista);
	public Lista CreaLista();
	public void EliminaLista(Lista lista);
	public Lista AcquistaLista(Lista lista);
	public Lista MostraLista(Lista lista);

}
