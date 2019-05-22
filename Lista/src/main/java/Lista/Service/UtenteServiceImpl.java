package Lista.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Lista.Entità.Utente;
import Lista.Repository.UtenteRepository;
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
		return utente.isAdmin();
	}
	@Override
	public Utente Logout(Utente utente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean Login(Utente utente) 
	{
		if (((utente.getEmail())!=null)&&(utente.getPassword()!=null))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
