package ListaProdotti.Entità;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Utente")
public class Utente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_utente;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Cognome")
	private String cognome;
	
	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;
	
	@Column(name="Wallet")
	private float wallet;
    
	@Column(name="isAdmin")
	private boolean isAdmin;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="id_lista")
	private Set<Lista> IdLista;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		password = Password;
	}

	

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int getIdUtente() {
		return id_utente;
	}

	public void setIdUtente(int id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getWallet() {
		return wallet;
	}

	public void setWallet(float wallet) {
		this.wallet = wallet;
	}

	public Set<Lista> getIdLista() {
		return IdLista;
	}

	public void setIdLista(Set<Lista> idLista) {
		IdLista = idLista;
	}







}