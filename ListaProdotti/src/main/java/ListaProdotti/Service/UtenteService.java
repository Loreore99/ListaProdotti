package ListaProdotti.Service;
import ListaProdotti.Entità.Utente;
public interface UtenteService {
	public boolean Login(Utente utente);
	public void Registrazione(Utente utente);
	public Float SaldoDisp(Utente utente);
	public boolean isAdmin(Utente utente);
    public void CancellaUtente(Utente utente);
}
