package Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entità.Lista;
import Repository.ListaRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("listaService")
public class ListaServiceImpl implements ListaService {
	@Autowired
	private ListaRepository listaRepository;
	public Lista CreaLista(Lista lista)
	{
		return listaRepository.save(lista);
	}
	public void EliminaLista(Lista lista)
	{
		 listaRepository.delete(lista);
	}
	@Override
	public Lista RinominaLista(Lista lista) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Lista CreaLista() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Lista AcquistaLista(Lista lista) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Lista MostraLista(Lista lista) {
		// TODO Auto-generated method stub
		return null;
	}

}
