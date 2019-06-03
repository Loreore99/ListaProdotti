package Lista.Service;
import java.util.List;

import Lista.Entità.Lista;
public interface ListaService {
	public Lista RinominaLista(Lista lista,String nuovonome);
	public Lista CreaLista(Lista lista);
	public void EliminaLista(Lista lista);
	public Lista AcquistaLista(Lista lista);
	public List<Lista> MostraLista(Lista lista);

}
