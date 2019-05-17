package Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Entità.Lista;
@Repository("listaRepository")
public interface ListaRepository extends CrudRepository<Lista,Integer> {
	

}
