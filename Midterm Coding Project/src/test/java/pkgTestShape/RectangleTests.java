package pkgTestShape;

import static org.junit.Assert.*;

import java.util.*;
import pkgShape.Rectangle;
import org.junit.Test;

public class RectangleTests {

	@Test
	public void ConstructorTest() throws Exception  {
		Rectangle rec = new Rectangle(5,5);
		assertTrue(rec instanceof Rectangle);
	}
	
	@Test
	public void getiWidthTest1() throws Exception {
		Rectangle rec = new Rectangle(2,3);
		assertTrue(rec.getiWidth() == 3);
	}
	
	@Test
	public void getiWidthTest2() throws Exception{
		Rectangle rec = new Rectangle(1,4);
		assertFalse(rec.getiWidth() == 1);
	}
	@Test
	public void setiWidthTest() throws Exception{
		Rectangle rec = new Rectangle(1,6);
		rec.setiWidth(3);
		assertEquals(rec.getiWidth(),3);
	}
	
	@Test 
	public void getiLengthTest1() throws Exception{
		Rectangle rec = new Rectangle(3,5);
		assertTrue(rec.getiLength() == 3);
	}
	
	@Test 
	public void getiLengthTest2() throws Exception{
		Rectangle rec = new Rectangle(1,6);
		assertFalse(rec.getiLength() == 6);
	}
	@Test
	public void setiLengthTest() throws Exception{
		Rectangle rec = new Rectangle(1,6);
		rec.setiLength(4);
		assertEquals(rec.getiLength(),4);
	}
	
	@Test
	public void getAreaTest1() throws Exception {
		Rectangle rec = new Rectangle(2,6);
		assertTrue(rec.area() == 12.0);
	}
	
	@Test
	public void getAreaTest2() throws Exception {
		Rectangle rec = new Rectangle(2,6);
		assertFalse(rec.area() == 10.0);
	}
	@Test 
	public void getPerimeterTest1() throws Exception{
		Rectangle rec = new Rectangle(3,4);
		assertTrue(rec.perimeter() == 14.0);
	}
	@Test 
	public void getPerimeterTest2() throws Exception{
		Rectangle rec = new Rectangle(3,4);
		assertFalse(rec.perimeter() == 9.0);
	}
	
	@Test
	public void CompareToTest1() throws Exception{
		Rectangle rec1 = new Rectangle(2,4);
		Rectangle rec2 = new Rectangle(3,5);
		Rectangle rec3 = new Rectangle(1,2);
		ArrayList<Rectangle>recList = new ArrayList<Rectangle>();
		recList.add(rec1);
		recList.add(rec2);
		recList.add(rec3);
		assertTrue(((Rectangle) recList.get(0)).area() == 2);
		assertTrue(((Rectangle) recList.get(1)).area() == 8);
		assertTrue(((Rectangle) recList.get(2)).area() == 15);
	}
	@Test
	public void CompareToTest2() throws Exception{
		Rectangle rec1 = new Rectangle(2,4);
		Rectangle rec2 = new Rectangle(3,5);
		Rectangle rec3 = new Rectangle(1,2);
		ArrayList<Rectangle>recList = new ArrayList<Rectangle>();
		recList.add(rec1);
		recList.add(rec2);
		recList.add(rec3);
		assertFalse(((Rectangle) recList.get(0)).area() == 15);
		assertTrue(((Rectangle) recList.get(1)).area() == 8);
		assertFalse(((Rectangle) recList.get(2)).area() == 2);
	}	
	@Test (expected = IllegalArgumentException.class)
	public void ErrorTest() throws Exception{
		new Rectangle(-5,5);
	
	}
}
