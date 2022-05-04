package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos ")
public class Produtos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "o atributo nome precisar ser preenchido")
	@Size (min = 5, max = 1000, message = "o texto deve conter caracteres no minimo 5 e no maximo 255")
	private String nome;
	
	@NotBlank(message = "o atributo produtos precisar ser preenchido")
	@Size (min = 5, max = 255, message = "o texto deve conter caracteres no minimo 5 e no maximo 255")
	private String descricao;
	
	@NotBlank(message = "o atributo produtos precisar ser preenchido")
	@Size (min = 5, max = 255, message = "o texto deve conter caracteres no minimo 5 e no maximo 255")
	private String console;
	
	
	@NotEmpty(message = "o valor quantido precisa ser digitado")
	@Positive(message = "O numero tem que ser positivo")
	private String quantidade;
	
	
	@NotEmpty(message = "atributo preco precisa ser digitado")
	@Positive(message = "O numero tem que ser positivo")
	private double preco;
	
	@NotBlank(message = "o atributo produtos precisar ser preenchido")
	@Size (min = 5, max = 1000, message = "o texto deve conter caracteres no minimo 5 e no maximo 255")
	private String foto;
	

	@ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
		
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
