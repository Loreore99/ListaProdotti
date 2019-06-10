package ListaProdotti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ListaProdotti.Entità.Utente;
import ListaProdotti.Repository.UtenteRepository;

import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("utenteService")
public class UtenteServiceImpl implements UtenteService{
	@Autowired
	private UtenteRepository utenteRepository;
	@Override 
	public void Registrazione(Utente utente)
	{
	 utenteRepository.save(utente);
	}
	public void CancellaUtente(Utente utente)
	{
		utenteRepository.delete(utente);
	}
	@Override
	public Float SaldoDisp(Utente utente) {
		return utente.getWallet();
	}
	@Override
	public boolean isAdmin(Utente utente) {
		return utente.isAdmin();
	}
	@Override
	public boolean Login(Utente utente) 
	{
		if (utenteRepository.findByEmailAndPassword(utente.getEmail(),utente.getPassword()) != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
