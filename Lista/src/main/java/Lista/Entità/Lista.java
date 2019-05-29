package Lista.Entità;

import java.util.List;
import Lista.Entità.Prodotto;
import javax.persistence.*;

@Entity
@Table(name="lista")
public class Lista {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_lista;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="TotPrezzo")
	private float totPrezzo;
	
	@Column(name="NProdotti")
	private int nProdotti;
	
	@Column(name="IdUtente")
	private int IdUtente;
	
	@Column(name="Prodotti")
	private List<Prodotto> prodotti;
	
	public int getId_lista() {
		return id_lista;
	}
	public void setId_lista(int id_lista) {
		this.id_lista = id_lista;
	}
	public int getnProdotti() {
		return nProdotti;
	}
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	public void setnProdotti(int nProdotti) {
		this.nProdotti = nProdotti;
	}
	public int getIdUtente() {
		return IdUtente;
	}
	public void setIdUtente(int idUtente) {
		IdUtente = idUtente;
	}
	public int getIdLista() {
		return id_lista;
	}
	public void setIdLista(int id_lista) {
		this.id_lista = id_lista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getTotPrezzo() {
		return totPrezzo;
	}
	public void setTotPrezzo(float totPrezzo) {
		this.totPrezzo = totPrezzo;
	}
	public int getNProdotti() {
		return nProdotti;
	}
	public void setNProd(int nProdotti) {
		this.nProdotti = nProdotti;
	}
}