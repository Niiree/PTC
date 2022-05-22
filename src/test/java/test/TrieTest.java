package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.rmi.UnexpectedException;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import init.Trie;

public class TrieTest {
	
	private Trie trie = new Trie();

	
	@Test
	public void partitionTest() throws Exception {
		int[] testValeur = {1,2,3,4,5,6};
		int testTaille= 3;
		
		
		int[][] result = trie.partition(testValeur, testTaille);
		
		assertEquals(Arrays.deepToString(result), "[[1, 2, 3], [4, 5, 6]]");
		
	}
	
	//Null passer en parametre de taille
	@Test
	public void partitionExceptionWithNullTailleTest() {
		int[] testValeur = {1,2,3,4,5,6};

		try {
	
			trie.partition(testValeur,null);
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Impossible de diviser par 0 ou null");
			
		}

	
	}
	//Null passer en parametre de liste
	@Test
	public void partitionExceptionWithNullListTest() {
		int[] testValeur = {1,2,3,4,5,6};	

		try {
			
			trie.partition(null, 2);
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Impossible de diviser une liste null");
		}
		

		
		
	}
	//Si division est plus grande que la longueur de la liste
	@Test
	public void partitionExceptionTest() {
		int[] testValeur = {1,2,3,4,5,6};
		
		

		try {
			
			trie.partition(testValeur, 30);
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "La taille doit être inférieur à la longueur de la liste");
		}
		
		
	}
	
	
	
	

}
