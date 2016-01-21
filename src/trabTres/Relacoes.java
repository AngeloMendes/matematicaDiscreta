package trabTres;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Relacoes {

	static ArrayList<String[]> conjFormatado = new ArrayList<>();

//	LimpaLixo formata = new LimpaLixo();
	public ArrayList<String> produto = new ArrayList<>();
	public Set<String> dominio = new LinkedHashSet<String>();
	public Set<String> imagem = new LinkedHashSet<String>();

	public void maior(String[] conjunto1, String[] conjunto2) {
		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (Integer.parseInt(conjunto1[i]) > Integer
						.parseInt(conjunto2[j])) {
					dominio.add(conjunto1[i]);
					imagem.add(conjunto2[j]);
					produto.add("<");
					produto.add(conjunto1[i]);
					produto.add(conjunto2[j]);
					produto.add(">");
				}
			}
		}
		//remover redundancia 
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}
	}

	public void menor(String[] conjunto1, String[] conjunto2) {
		
		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (Integer.parseInt(conjunto1[i]) < Integer
						.parseInt(conjunto2[j])) {

					dominio.add(conjunto1[i]);
					imagem.add(conjunto2[j]);
					produto.add("<");
					produto.add(conjunto1[i]);
					produto.add(conjunto2[j]);
					produto.add(">");
				}
			}
		}
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}

	}

	public void igual(String[] conjunto1, String[] conjunto2) {

		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (Integer.parseInt(conjunto1[i]) == Integer
						.parseInt(conjunto2[j])) {
					dominio.add(conjunto1[i]);
					imagem.add(conjunto2[j]);
					produto.add("<");
					produto.add(conjunto1[i]);
					produto.add(conjunto2[j]);
					produto.add(">");
				}
			}
		}
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}

	}

	public void quadrado(String[] conjunto1, String[] conjunto2) {

		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (Integer.parseInt(conjunto1[i])
						/ Integer.parseInt(conjunto2[j]) == Integer
							.parseInt(conjunto2[j])) {

					dominio.add(conjunto1[i]);
					imagem.add(conjunto2[j]);
					produto.add("<");
					produto.add(conjunto1[i]);
					produto.add(conjunto2[j]);
					produto.add(">");
				}
			}
		}
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}

	}

	public void raiz(String[] conjunto1, String[] conjunto2) {

		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				if (Integer.parseInt(conjunto1[i])
						* Integer.parseInt(conjunto1[i]) == Integer
							.parseInt(conjunto2[j])) {

					dominio.add(conjunto1[i]);
					imagem.add(conjunto2[j]);
					produto.add("<");
					produto.add(conjunto1[i]);
					produto.add(conjunto2[j]);
					produto.add(">");
				}
			}
		}
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}

	}

	ArrayList<String> imagemFinal = new ArrayList<>();

	public void RelacaoComposta(String[] conjunto1, String[] conjunto2,
			String[] conjunto3, String op1, String op2) {
		if (op1.equals(">")) {
			maior(conjunto1, conjunto2);
		} else if (op1.equals("<")) {
			menor(conjunto1, conjunto2);
		} else if (op1.equals("=")) {
			igual(conjunto1, conjunto2);
		} else if (op1.equals("q")) {
			quadrado(conjunto1, conjunto2);
		} else if (op1.equals("r")) {
			raiz(conjunto1, conjunto2);
		}
		if (op2.equals(">")) {
			menor(conjunto3, conjunto2);
		} else if (op2.equals("<")) {
			maior(conjunto3, conjunto2);
		} else if (op2.equals("=")) {
			igual(conjunto2, conjunto3);
		} else if (op2.equals("r")) {
			quadrado(conjunto3, conjunto2);
		} else if (op2.equals("q")) {
			raiz(conjunto3, conjunto2);
		}
		for(String valor: dominio){
			dominio.add(valor);
		}
		for(String valor: imagem){
			imagem.add(valor);
		}


	}

}