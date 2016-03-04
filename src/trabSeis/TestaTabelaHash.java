package trabSeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestaTabelaHash {
	public static void main(String[] args) throws IOException {
		int chave;
		Item item;
		int tamanho;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tamanho da tabela: ");
		tamanho = entrada.nextInt();
		TabelaHash tabela = new TabelaHash(tamanho);

		while (true) 
		{
			System.out
					.println("Escolha 1-mostrar, 2-inserir, 3-deletar, 4-procurar: ");
			int escolha = entrada.nextInt();
			switch (escolha) {
			case 1:
				tabela.mostrar();
				break;
			case 2:
				System.out.println("Digite o valor para inserir: ");
				chave = entrada.nextInt();
				item = new Item(chave);
				tabela.inserir(chave, item, tamanho);
				break;
			case 3:
				System.out.println("Digite o valor para deletar: ");
				chave = entrada.nextInt();
				tabela.deletar(chave);
				break;
			case 4:
				System.out.println("Digite o valor para procurar: ");
				chave = entrada.nextInt();
				item = tabela.procurar(chave);
				if (item != null)
					System.out.println("Encontrado " + chave);
				else
					System.out.println("Nao foi encontrado " + chave);
				break;
			default:
				System.out.println("Nao ha essa opcao\n");
				System.exit(0);
				//break;
			}
		}
	}
}
