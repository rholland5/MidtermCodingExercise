package pkgTestShape;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTests {

	@Test
	public void ConstructorTest() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertTrue(cub instanceof Cuboid);
	}

	@Test
	public void getiLenthTest1() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertTrue(cub.getiLength() == 2);
	}

	@Test
	public void getiLenthTest2() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertFalse(cub.getiLength() == 3);
	}

	@Test
	public void getwidthTest1() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertEquals(cub.getiWidth(), 3);
	}

	@Test
	public void getiDepthTest() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertEquals(cub.getiDepth(), 4);
	}

	@Test
	public void VolumeTest() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertTrue(cub.volume() == 24);
	}

	@Test
	public void areaTest() throws Exception {
		Cuboid cub = new Cuboid(2, 3, 4);
		assertTrue(cub.area() == 52);
	}

	@Test
	public void perimeterTest() throws UnsupportedOperationException {
		boolean thr = false;
		try {
			Cuboid cub = new Cuboid(2, 3, 4);
			cub.perimeter();
		} catch (Exception unsupportedOperationException) {
			thr = true;
		}
		assertTrue(thr);
	}

	@Test
	public void compareToTest() throws Exception {

		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(2, 3, 4);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		Collections.sort(cubList1);
		assertTrue(cubList1.get(0).area() == 52.0);
		assertTrue(cubList1.get(1).area() == 94.0);
		assertTrue(cubList1.get(2).area() == 148.0);

	}
	@Test
	public void sortByVolumeTest() throws Exception {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>(3);
		Cuboid cub1 = new Cuboid(2,3,4);
		Cuboid cub2 = new Cuboid(2,4,5);
		Cuboid cub3 = new Cuboid(2,5,6);
		
		cub.add(cub3);
		cub.add(cub2);
		cub.add(cub1);
		
		ArrayList<Cuboid> expected= new ArrayList<Cuboid>(3);
		
		expected.add(cub1);
		expected.add(cub2);
		expected.add(cub3);
		
		assertTrue(cub.equals(expected));
	}
	@Test 
	public void sortByAreaTest() throws Exception{
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>(3);
		Cuboid cub1 = new Cuboid(1,2,3);
		Cuboid cub2 = new Cuboid(3,4,5);
		Cuboid cub3 = new Cuboid(2,3,4);
		
		cub.add(cub3);
		cub.add(cub2);
		cub.add(cub1);
		
		ArrayList<Cuboid> expected= new ArrayList<Cuboid>(3);
		
		expected.add(cub1);
		expected.add(cub3);
		expected.add(cub2);
		
		assertTrue(cub.equals(expected));
	}
}
