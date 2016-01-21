package trabTres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Classificacao {

	public String funcional(Set<String> dominio) {
		int i = 0;
		for (Iterator<String> iteratorA = dominio.iterator(); iteratorA
				.hasNext();) {
			int a = Integer.parseInt(iteratorA.next());
			for (Iterator<String> iteratorB = dominio.iterator(); iteratorB
					.hasNext();) {
				int b = Integer.parseInt(iteratorB.next());
				if (a == b) {
					i++;
				}
			}
		}
		if (i == dominio.size()) {
			return "Funcional";
		} else {
			return "Nao eh funcional";
		}
	}

	public String injetora(Set<String> imagem) {
		int i = 0;
		for (Iterator<String> iteratorA = imagem.iterator(); iteratorA.hasNext();) {
			int a = Integer.parseInt(iteratorA.next());
			for (Iterator<String> iteratorB = imagem.iterator(); iteratorB
					.hasNext();) {
				int b = Integer.parseInt(iteratorB.next());
				if (a == b) {
					i++;
				}
			}
		}
		if (i == imagem.size()) {
			return "Injetora";
		} else {
			return "Nao eh injetora";
		}
	}

	public String total(String[] conjunto1, Set<String> dominio) {
		if (conjunto1.equals(dominio)) {
			return "Total";
		} else {
			return "Nao eh total";
		}
	}

	public String sobrejetora(String[] conjunto2, Set<String> imagem) {
		if (conjunto2.equals(imagem)) {
			return "Sobrejetora";
		} else {
			return "Nao eh sobrejetora";
		}
	}
	public String monomorfismo(Set<String> imagem,String[] conjunto1, Set<String> dominio){
		if(injetora(imagem).equalsIgnoreCase("injetora") && total(conjunto1, dominio).equalsIgnoreCase("total")){
		return "É monomorfismo";
	}else{
		return "Não é monomorfismo";
	}
	}
	public String epimorfismo(Set<String> dominio, String[] conjunto2, Set<String> imagem){
	if(funcional(dominio).equalsIgnoreCase("funcional") && sobrejetora(conjunto2, imagem).equalsIgnoreCase("sobrejetora")){
		return "É epimorfismo";
	}else{
		return "Não é epimorfismo";
	}
	}
	
}
