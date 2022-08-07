package com.dio.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public static void main(String[] args) {
		Condutor condutor = new Condutor(new Carro());
		condutor.automovel();
		System.out.println("******************");
		Condutor condutor1 = new Condutor(new Moto());
		condutor1.automovel();

	}
	
	@Autowired
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}
	
	public void automovel() {
		veiculo.acao();
		
	}

}
