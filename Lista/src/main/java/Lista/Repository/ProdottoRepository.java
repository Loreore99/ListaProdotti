package Lista.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Lista.Entità.Prodotto;
@Repository("prodottoRepository")
public interface ProdottoRepository extends CrudRepository<Prodotto,Integer>{

}
