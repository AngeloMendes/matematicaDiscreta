package trabDois;

import java.util.ArrayList;

public class LimpaLixo {
	
	public void formataLinha(String linha) {
		Operacoes operacao = new Operacoes();
		String caracter;
		int tipoLinha = -1;
		for (int i = 0; i < linha.length(); i++) {
			caracter = "" + linha.charAt(i);
			if (caracter.compareTo("=") == 0) {
				caracter = "" + linha.charAt(i + 1);
				if (caracter.compareTo("{") == 0) {
					tipoLinha = 0;
					conjunto(i + 2, linha);

				} else {
					tipoLinha = 1;
					caracter = linha.substring(i + 1, linha.length());
					operacao.elementos.add(caracter);

				}
			}
		}

		if (tipoLinha == -1) {
			System.out.println("A linha :\n");
			System.out.println(linha);
			System.out.println("esta mal formatada");

		}
	}

	public void conjunto(int inicio, String linha) {
		Operacoes operacao = new Operacoes();
		String caracter;

		caracter = linha.substring(inicio, linha.length() - 1);

		String[] linhaFormatada = caracter.split(",");

		operacao.conjFormatado.add(linhaFormatada);

	}

	public String agrupaCaracteres(String[] caracteres) {
		String conjunto = "";

		for (int i = 0; i < caracteres.length; i++) {
			conjunto = conjunto + caracteres[i];
			if (caracteres.length - 1 != i) {
				conjunto = conjunto + ",";
			}
		}

		return conjunto;
	}

	public String agrupaConjunto(ArrayList conjuntos) {
		String conjuntoFinal = "";

		for (int i = 0; i < conjuntos.size(); i++) {
			conjuntoFinal = conjuntoFinal + conjuntos.get(i);
			if (conjuntos.size() - 1 != i) {
				conjuntoFinal = conjuntoFinal + ",";
			}
		}

		return conjuntoFinal;
	}
}
