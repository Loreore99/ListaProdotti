package Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entità.Utente;
import Repository.UtenteRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("utenteService")
public class UtenteServiceImpl implements UtenteService{
	@Autowired
	private UtenteRepository utenteRepository;
	@Override 
	public Utente Registrazione(Utente utente)
	
	{
		return utenteRepository.save(utente);
	}
	public void CancellaUtente(Utente utente)
	{
		utenteRepository.delete(utente);
	}
	
	@Override
	public Float SaldoDisp(Utente utente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAdmin(Utente utente) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Utente Logout(Utente utente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean Login(Utente utente) {
		// TODO Auto-generated method stub
		return false;
	}

}
