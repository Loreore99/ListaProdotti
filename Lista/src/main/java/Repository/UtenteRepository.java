package Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Entità.Utente;
@Repository("utenteRepository")
public interface UtenteRepository extends CrudRepository<Utente,Integer> {

}
