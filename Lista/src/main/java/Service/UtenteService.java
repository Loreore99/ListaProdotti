package Service;
import Entità.Utente;
public interface UtenteService {
	public boolean Login(Utente utente);
	public Utente Registrazione(Utente utente);
	public Float SaldoDisp(Utente utente);
	public boolean isAdmin(Utente utente);

}
