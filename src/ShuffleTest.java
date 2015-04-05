import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Lilly_94
 *
 */
public class ShuffleTest {

	/**
	 * Test method for {@link Shuffle#shuffle(int[])}.
	 */
	Shuffle s=new Shuffle();
	@Test
	public void testShuffleIntArray() {
		int [] source=new int [] {1,2,3,4,5,6,7,8,9};
		int bound=(int)Math.floor(0.25*source.length);
		int [] result=s.copyArray(source);
		s.shuffle(result);
		int amount=0;
		for(int i=0;i<source.length;i++)
			if(source[i]!=result[i])
				amount++;
		System.out.println("TEST ARRAY");
		System.out.println("Amount "+amount);
		System.out.println("Bound "+bound);
		assertTrue(amount==bound || amount==(bound+1));
	}

	/**
	 * Test method for {@link Shuffle#shuffle(int[][])}.
	 */
	@Test
	public void testShuffleIntArrayArray() {
		int [][] source=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int bound=s.countMatrixAmount(source);
		int [][] result=s.copyMatrix(source);
		s.shuffle(result);
		int amount=0;
		for(int i=0;i<source.length;i++)
			for(int j=0;j<source[i].length;j++)
			     if(source[i][j]!=result[i][j])
				      amount++;
		System.out.println("TEST MATRIX");
		System.out.println("Amount "+amount);
		System.out.println("Bound "+bound);
		assertTrue(amount==bound || amount==(bound+1));
	}

}
