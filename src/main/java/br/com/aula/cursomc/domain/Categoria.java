package br.com.aula.cursomc.domain;

import java.io.Serializable;

/**
 * Checklist para criar entidades:
 * 1. Atributos básicos
 * 2. Associações (inicie as coleções)
 * 3. Construtores (não inclua coleções no construtor 
 * 4. com parâmetros )
 * 5. Getter e Setter
 * 6. hashCode e equals (implementação padrão: somente id)
 * 7. Serializable (padrão: 1L)
 */
// Serializable: objetos podera convertido para byte, trafegar rede
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public Categoria() {}
	
	public Categoria(Integer id, String nome) {
		super();
		this.id =id;
		this.nome = nome;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome =nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
