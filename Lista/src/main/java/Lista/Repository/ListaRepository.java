package Lista.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Lista.Entità.Lista;
@Repository("listaRepository")
public interface ListaRepository extends CrudRepository<Lista,Integer> {
	

}
