package ListaProdotti.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ListaProdotti.Entità.Prodotto;
@Repository("prodottoRepository")
public interface ProdottoRepository extends CrudRepository<Prodotto,Integer>{

}
