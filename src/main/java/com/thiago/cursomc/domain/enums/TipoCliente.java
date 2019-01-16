package com.thiago.cursomc.domain.enums;

// Classe para auxiliar no gerenciamento dos ids dos enums
public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	// Variável criada para armazenar o id de um enum
	private int cod;
	// Variável criada para armazenar a descricao de um enum
	private String descricao;

	// Construtor necessário para inicializar as variaveis de acordo
	// com os valores especificados nos enums 'id' e 'descricao'
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	// Método estático utilizado para retornar o objeto do tipo
	// 'TipoCliente' que tem o 'id' igual ao parametro 'cod'
	// recebido no método
	public static TipoCliente toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		// Percorre os enums que possuem o 'cod' igual
		// ao parametro 'cod' que foi recebido pelo método
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		// Lança uma exception caso o 'cod' buscado nao pertença
		// a nenhum enum
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
