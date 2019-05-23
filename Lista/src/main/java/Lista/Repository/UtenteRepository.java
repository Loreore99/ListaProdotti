package Lista.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Lista.Entità.Utente;
import java.util.List;
@Repository("utenteRepository")
public interface UtenteRepository extends CrudRepository<Utente,Integer> {
public List<Utente> findByEmailAndPassword(String Email,String Password);	
public List<Utente> findByEmail(String Email);
}
