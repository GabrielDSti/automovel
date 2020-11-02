package aulajpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idModelo;
	
	private String descricao;
	private int potencia;
	
	@JoinColumn(name="idMarca", referencedColumnName = "idMarca")
	private Marca idMarca;
	
	
	public Modelo() {
		
	}
	
	public Modelo(Integer idModelo,String descricao,int potencia) {
		
		this.idModelo=idModelo;
		this.descricao=descricao;
		this.potencia=potencia;
		
	}

	@Override
	public String toString() {
		return "Modelo [idModelo=" + idModelo + ", descricao=" + descricao + ", potencia=" + potencia + ", idMarca="
				+ idMarca + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((idMarca == null) ? 0 : idMarca.hashCode());
		result = prime * result + idModelo;
		result = prime * result + potencia;
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
		Modelo other = (Modelo) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idMarca == null) {
			if (other.idMarca != null)
				return false;
		} else if (!idMarca.equals(other.idMarca))
			return false;
		if (idModelo != other.idModelo)
			return false;
		if (potencia != other.potencia)
			return false;
		return true;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Marca getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Marca idMarca) {
		this.idMarca = idMarca;
	}
	
	
	
}
