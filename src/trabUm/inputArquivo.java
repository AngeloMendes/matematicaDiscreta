package trabUm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class inputArquivo {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nNome do arquivo: ");
		String nome = entrada.next();
		try {
			FileReader arquivo = new FileReader(nome);
			BufferedReader leitura = new BufferedReader(arquivo);
			while (leitura.ready()) {
				String linha = leitura.readLine();
				if (!linha.equals("FIM"))
					System.out.println(linha);
			}
			leitura.close();
			arquivo.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Arquivo nao existe");
		}
	}
}
