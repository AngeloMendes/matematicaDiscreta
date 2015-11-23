package trabDois;

import java.util.ArrayList;

public class Operacoes {

	static ArrayList<String[]> conjFormatado = new ArrayList<>();
	static ArrayList<String> elementos = new ArrayList<>();
	LimpaLixo formata = new LimpaLixo();

	public static boolean pertence(String elemento, String[] conjunto) {

		for (int i = 0; i < conjunto.length; i++) {
			if (elemento.compareTo(conjunto[i]) == 0) {

				return true;
			}
		}
		return false;

	}

	public static boolean pertence(String elemento, ArrayList conjunto) {

		for (int i = 0; i < conjunto.size(); i++) {
			if (elemento.compareTo(conjunto.get(i).toString()) == 0) {

				return true;
			}
		}
		return false;

	}

	public static boolean contido(String[] conj1, String[] conj2) {

		for (int i = 0; i < conj1.length; i++) {
			if (!(pertence(conj1[i], conj2))) {
				return false;
			}
		}
		return true;

	}

	public String uniao() {

		ArrayList<String> uniao = new ArrayList<>();

		for (int i = 0; i < conjFormatado.size(); i++) {
			for (int j = 0; j < conjFormatado.get(i).length; j++) {
				if (j != 0 || i > 0) {
					if (!(pertence(conjFormatado.get(i)[j], uniao))) {
						uniao.add(conjFormatado.get(i)[j]);

					}
				} else {
					uniao.add(conjFormatado.get(i)[j]);

				}
			}
		}
		return formata.agrupaConjunto(uniao);
	}

	public void intersecao(String[] conjunto1, String[] conjunto2) {//, String[] conjunto3){
		//para quest�o 2.2 que trabalha com 3 conjunto foi necessario alterar este m�todo adicionando mais um parametro
		// as altera��es foram comentadas 
		System.out.print('{');
		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				//for (int k = 0; k < conjunto3.length; k++) {
					if (conjunto1[i].compareTo(conjunto2[j]) == 0){// && conjunto1[i].compareTo(conjunto3[k])==0) {
						System.out.print(conjunto1[i] + ',');
					//}
				}
			}
		}
		System.out.println('}');

	}

	public void produtoCartesiano(String[] conjunto1, String[] conjunto2) {
		// {a,b,c} {d,e,f}
		// <a,d> <b,e> <c,f> <a,e> <b,f> <c,d> <a,f> <b,d> <c,e>
		ArrayList<String> produto = new ArrayList<>();
		for (int i = 0; i < conjunto1.length; i++) {
			for (int j = 0; j < conjunto2.length; j++) {
				produto.add("<");
				produto.add(conjunto1[i]);
				produto.add(conjunto2[j]);
				produto.add(">");
			}
		}
		System.out.println(produto);

	}

}
