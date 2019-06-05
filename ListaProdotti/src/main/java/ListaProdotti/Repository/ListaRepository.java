package ListaProdotti.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ListaProdotti.Entità.Lista;
@Repository("listaRepository")
public interface ListaRepository extends CrudRepository<Lista,Integer> {
	public List<Lista> findByNome(String Nome);

}
