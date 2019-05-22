package Lista.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Lista.Entità.Utente;
@Repository("utenteRepository")
public interface UtenteRepository extends CrudRepository<Utente,Integer> {

}
