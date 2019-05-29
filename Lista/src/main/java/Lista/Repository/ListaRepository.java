package Lista.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Lista.Entità.Lista;
import Lista.Entità.Utente;
@Repository("listaRepository")
public interface ListaRepository extends CrudRepository<Lista,Integer> {
	public List<Lista> findByNome(String Nome);

}
