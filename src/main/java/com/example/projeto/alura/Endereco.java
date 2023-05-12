package com.example.projeto.alura;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	public String logradouro;
	public String bairro;
	public String cep;
	public String numero;
	public String complemento;
	public String cidade;
	public String uf;
	
	
	public Endereco(String logradouro, String bairro, String cep, String numero, String complemento, String cidade,
			String uf) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Endereco(DadosEndereco dados) {
		this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
	}

	
	
}
