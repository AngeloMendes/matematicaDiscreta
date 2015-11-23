package trabDois;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaOperacoes {

		
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		ArrayList<String> text = new ArrayList<>();
		Operacoes operacao = new Operacoes();
		LimpaLixo formata = new LimpaLixo();

		
		Scanner entrada = new Scanner(System.in);
		FileReader arq = new FileReader("arquivo.txt");
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
			
			System.out.println("1: Pertence");
			System.out.println("2: Nao Pertence");
			System.out.println("3: Contido ou igual");
			System.out.println("4: Nao Contido ou igual");
			System.out.println("5: Contido Propriamente");
			System.out.println("6: Nao Contido Propriamente");
			System.out.println("7: Uniao");
			System.out.println("8: Intersecao");
			System.out.println("9: Produto Cartesiano");
			System.out.println("99: Sair");
		
		escolha = entrada.nextInt();

		switch (escolha) {

		case 1:
			for(int numConj=0; numConj<operacao.conjFormatado.size();numConj++){
				for(int numElemento=0;numElemento<operacao.elementos.size();numElemento++){
				if (operacao.pertence(operacao.elementos.get(numElemento), operacao.conjFormatado.get(numConj))) {
					System.out.println("O Elemento: '" + operacao.elementos.get(numElemento)
							+ "' pertence ao conjunto:" + '{'
							+ formata.agrupaCaracteres(operacao.conjFormatado.get(numConj))+ '}');
				
				}
				}
			}
				break;
		case 2:
			for(int numConj=0; numConj<operacao.conjFormatado.size();numConj++){
			for(int numElemento=0;numElemento<operacao.elementos.size();numElemento++){
			if (!operacao.pertence(operacao.elementos.get(numElemento), operacao.conjFormatado.get(numConj))) {
				System.out.println("O Elemento: '" + operacao.elementos.get(numElemento)
						+ " NAO pertence ao conjunto:" + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(numConj))+ '}');
			
			}
			}
			}
			break;

		case 3:
		case 4:
			
			if (operacao.contido(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1))) {
				System.out.println("O Conjunto: " + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(0)) + '}'
						+ ", Contido ou igual' no Conjunto:" + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(1)) + '}');
			} else {
				System.out.println("O Conjunto: " + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(0)) + '}'
						+ ", 'Nao Contido ou igual' no Conjunto:" + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(1)) + '}');
			}
			break;

		case 5:
		case 6:
			if (!(operacao.contido(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1)) & operacao.contido(
					operacao.conjFormatado.get(1), operacao.conjFormatado.get(0)))) {
				System.out.println("O Conjunto: " + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(0)) + '}'
						+ ", Contido propriamente no Conjunto:" + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(1)) + '}');
			} else {
				System.out.println("O Conjunto: " + '{'
						+ formata.agrupaCaracteres(operacao.conjFormatado.get(0)) + '}'
						+ ", Nao Contido propriamente' no Conjunto:"
						+ '{' + formata.agrupaCaracteres(operacao.conjFormatado.get(1)) + '}');
			}
			break;
		case 7:
			System.out.println("Uniao: " + '{' + operacao.uniao()
					+ '}');
			break;
		case 8:
			System.out.print("Intersecao:");
			operacao.intersecao(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			break;
		case 9:
			System.out.print("Produto:");
			operacao.produtoCartesiano(operacao.conjFormatado.get(0), operacao.conjFormatado.get(1));
			break;
		default:
			System.out.print("Opcao inexistente!");
			break;
		}
		}

	}




}
