package trabSeis;

class TabelaHash {
	
	Item[] arrayHash;
	int tamanhoArray;
	Item itemDelete;
	int num_items;

	TabelaHash(int tamanhoTabela) {
		tamanhoArray = tamanhoTabela;
		arrayHash = new Item[tamanhoArray];
		itemDelete = new Item(0);
		num_items = 0;
	}

	public void mostrar() {
		System.out.print("Tabela: ");
		for (int j = 0; j < tamanhoArray; j++) {
			if (arrayHash[j] != null) {
				System.out.print(arrayHash[j].item + " ");
			} else {
				System.out.print("** ");
			}
		}
		System.out.println("");
	}

	public int hash1(int chave) {
		return chave % tamanhoArray;
	}

	public int hash2(int chave) {
		return 5 - chave % 5;
	}

	public void inserir(int chave, Item item, int tamanho) {
		
		if(procurar(chave)!=null){
		if (num_items == tamanho) {
			System.out.println(" Tabela cheia");
		} else {
			num_items++;
		}
		int hash1 = hash1(chave);
		int hash2 = hash2(chave);
		// enqto hash1 !=nulo e 0 procura o proximo vazio para inserir

		while (arrayHash[hash1] != null && arrayHash[hash1].item != 0) {
			hash1 += hash2;
			hash1 %= tamanhoArray;
		}
		arrayHash[hash1] = item;
		}else {
			System.out.println("Chave ja existe");
		}
	}

	public Item deletar(int chave) {
		int hash1 = hash1(chave);
		int hash2 = hash2(chave);

		while (arrayHash[hash1] != null) {
			if (arrayHash[hash1].item == chave) {
				num_items--;
				Item aux = arrayHash[hash1];
				arrayHash[hash1] = itemDelete;
				return aux;
			}
			hash1 += hash2;
			hash1 %= tamanhoArray;
		}
		return null;
	}

	public Item procurar(int chave) {
		int hash1 = hash1(chave);
		int hash2 = hash2(chave);

		while (arrayHash[hash1] != null) {
			if (arrayHash[hash1].item == chave){
				return arrayHash[hash1];
			}
			System.out.println("hash1" + hash1);
			System.out.println("hash2" + hash2);
			hash1 += hash2;
			hash1 %= tamanhoArray;
			
		}
		return null;
	}

}
