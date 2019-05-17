package Entità;

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
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Wallet")
	private float wallet;

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
}