package aulajpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Automovel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idAutomovel;
	
	private int anoFabricacao;
	private String observacoes;
	private Float preco;
	private int kilometragem;
	@JoinColumn(name="idModelo", referencedColumnName = "idModelo")
	private Modelo modeloId;
	
	
	public Automovel() {
		
	}
	
	public Automovel(Integer idAutomovel,int anoFabricacao,String obs, Float preco,int klmtgm) {
		this.idAutomovel=idAutomovel;
		this.anoFabricacao=anoFabricacao;
		this.observacoes=obs;
		this.preco=preco;
		this.kilometragem=klmtgm;
	}
	
	public int getIdAutomovel() {
		return idAutomovel;
	}
	public void setIdAutomovel(int idAutomovel) {
		this.idAutomovel = idAutomovel;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public int getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}
	public Modelo getModeloId() {
		return modeloId;
	}
	public void setModeloId(Modelo modeloId) {
		this.modeloId = modeloId;
	}
	@Override
	public String toString() {
		return "Automovel [idAutomovel=" + idAutomovel + ", anoFabricacao=" + anoFabricacao + ", observacoes="
				+ observacoes + ", preco=" + preco + ", kilometragem=" + kilometragem + ", modeloId=" + modeloId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoFabricacao;
		result = prime * result + idAutomovel;
		result = prime * result + kilometragem;
		result = prime * result + ((modeloId == null) ? 0 : modeloId.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (anoFabricacao != other.anoFabricacao)
			return false;
		if (idAutomovel != other.idAutomovel)
			return false;
		if (kilometragem != other.kilometragem)
			return false;
		if (modeloId == null) {
			if (other.modeloId != null)
				return false;
		} else if (!modeloId.equals(other.modeloId))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	
	
	
}
