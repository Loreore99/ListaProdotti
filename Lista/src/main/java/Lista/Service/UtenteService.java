package Lista.Service;
import Lista.Entità.Utente;
public interface UtenteService {
	public boolean Login(Utente utente);
	public Utente Registrazione(Utente utente);
	public Float SaldoDisp(Utente utente);
	public boolean isAdmin(Utente utente);
    public void CancellaUtente(Utente utente);
}
