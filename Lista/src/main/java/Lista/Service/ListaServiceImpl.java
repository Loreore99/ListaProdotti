package Lista.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Lista.Entità.Lista;
import Lista.Repository.ListaRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("listaService")
public class ListaServiceImpl implements ListaService {
	@Autowired
	private ListaRepository listaRepository;
	public void EliminaLista(Lista lista)
	{
		 listaRepository.delete(lista);
	}
	@Override
	public Lista RinominaLista(Lista lista,String nuovonome) {
		return lista;
		
	
	}
	@Override
	public Lista CreaLista(Lista lista) {
		return listaRepository.save(lista);
	}
	@Override
	public Lista AcquistaLista(Lista lista) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Lista> MostraLista(Lista lista) {
		return listaRepository.findByNome(lista.getNome());
	}
	public List<Lista> findByNome(String Nome)
	{
		return listaRepository.findByNome(Nome);
		
	}

}
