package init;

import java.util.Arrays;

public class Main {
	
	
	public static void main (String[] args) {
	Trie trie = new Trie();
	int[] exemple ={1,2,3,4,5,6};
	
	//Voir le résultat de sortie
	try {
		System.out.print(Arrays.deepToString(trie.partition(exemple,2)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}
}

