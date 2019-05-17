package Entità;

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