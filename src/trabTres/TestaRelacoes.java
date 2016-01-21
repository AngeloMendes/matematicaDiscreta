package trabTres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaRelacoes {

		
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		ArrayList<String> text = new ArrayList<>();
		Relacoes operacao = new Relacoes();
		LimpaLixo formata = new LimpaLixo();
		Classificacao classificacao = new Classificacao();
		
		Scanner entrada = new Scanner(System.in);
		FileReader arq = new FileReader("relacao.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();

		for (int i = 0; linha.compareTo("FIM") != 0; i++) {

			text.add(linha);
			formata.formataLinha(linha);
			linha = lerArq.readLine();

		}
		int escolha = 0;
		
		
		while(escolha != 99){
			System.out.println("Escolha uma opcao:");
			
			System.out.println("1: Maior");
			System.out.println("2: Menor");
			System.out.println("3: Igual");
			System.out.println("4: Quadrado");
			System.out.println("5: Raiz");
			System.out.println("6: Relacao composta");
			System.out.println("99: Sair");
		
		escolha = entrada.nextInt();

		switch (escolha) {

		case 1:
			System.out.print("Maior:");
			operacao.maior(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			break;
		case 2:
			System.out.print("Menor:");
			operacao.menor(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			
			break;
		case 3:
			System.out.print("Igual:");
			operacao.igual(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			
			break;
		case 4:
			System.out.print("Quadrado:");
			operacao.quadrado(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			
			break;
		case 5:
			System.out.print("Raiz:");
			operacao.raiz(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			
			break;
		case 6:
			System.out.print("Escolha a primeira condicao >,<,=,r,q:");
			String op1= entrada.next();
			System.out.print("Escolha a segunda condicao >,<,=,r,q:");
			String op2= entrada.next();
			operacao.RelacaoComposta(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1), operacao.conjFormatado.get(2), op1, op2);
			System.out.println("Produto" + operacao.produto);
			System.out.println("Dominio" + operacao.dominio);
			System.out.println("Imagem" + operacao.imagem);
			System.out.println(classificacao.funcional(operacao.dominio));
			System.out.println(classificacao.injetora(operacao.imagem));
			System.out.println(classificacao.total(operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.sobrejetora(operacao.conjFormatado.get(1), operacao.imagem));
			System.out.println(classificacao.monomorfismo(operacao.imagem, operacao.conjFormatado.get(0), operacao.dominio));
			System.out.println(classificacao.epimorfismo(operacao.dominio, operacao.conjFormatado.get(1), operacao.imagem));
			operacao.produto.clear();
			operacao.dominio.clear();
			operacao.imagem.clear();
			
			break;
			
		default:
			System.out.print("Opcao inexistente!");
			break;
		}
		}

	}

}
