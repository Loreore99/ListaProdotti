package Lista.Entità;

import javax.persistence.*;

@Entity
@Table(name="Prodotto")
public class Prodotto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_prodotto;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Prezzo")
	private float prezzo;
	
	@Column(name="Quantità")
	private int quantità;
	
	@Column(name="Acquistati")
	private int acquistati;
	
	@Column(name="Lista")
	private Lista Lista;
	
	public int getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public int getIdProdotto() {
		return id_prodotto;
	}
	
	public Lista getLista() {
		return Lista;
	}

	public void setLista(Lista lista) {
		Lista = lista;
	}

	public void setIdProdotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getQuantità() {
		return quantità;
	}
	
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
	public int getAcquistati() {
		return acquistati;
	}
	
	public void setAcquistati(int acquistati) {
		this.acquistati = acquistati;
	}
}