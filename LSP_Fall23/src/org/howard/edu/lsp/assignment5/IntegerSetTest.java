package org.howard.edu.lsp.assignment5;
import org.howard.edu.lsp.assignment5.IntegerSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

public class IntegerSetTest {
    
	private IntegerSet setA;
	
	@BeforeEach
	void setUp() {
		setA = new IntegerSet();
	}
	
	@Test
	@DisplayName("test that a new, empty integer set is created")
    public void testConstructor() {
        assertFalse(setA.contains(9));
        assertTrue(setA.isEmpty()); 
    }
	
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        
        setA.add(90);
        setA.add(5);
        assertTrue(setA.contains(5));
        assertTrue(setA.contains(90));
        assertFalse(setA.contains(56));
    }
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        
      
        setA.add(6);
        setA.add(9);
        setA.remove(6);
        assertTrue(setA.contains(9));
        assertFalse(setA.contains(6));
    }
    
    
    @Test
    @DisplayName("Test case for contain")
    public void testContains() {
        setA.add(68);
        setA.add(78);
        assertTrue(setA.contains(78));
        assertFalse(setA.contains(67));
    }
    
    
    @Test
    @DisplayName("Test case for empty")
    public void testEmpty() {
        setA.add(34);
        setA.add(78);
        assertFalse(setA.isEmpty());
        setA.clear();
        assertTrue(setA.isEmpty());
    }
    

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        setA.add(7483);
    	setA.add(57);
        assertFalse(setA.isEmpty());
        setA.clear();
        assertTrue(setA.isEmpty());
    }
    
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        assertEquals(78, setA.largest());
    }
    
    @Test
    @DisplayName("Test case for largest exception")
    public void testLargestException() {
        setA.clear();
        try {
            setA.largest(); 
            fail("Expected IntegerSetException was not thrown");
        } catch (IntegerSetException e) {
            
        }
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        assertEquals(5, setA.smallest());
    }
    
    @Test
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() {
        setA.clear(); 
        try {
            setA.smallest(); 
            fail("Expected IntegerSetException was not thrown");
        } catch (IntegerSetException e) {
            
        }
    }
    
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        assertEquals(4, setA.length());
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testString() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        
        assertEquals("[5, 6, 78, 69]", setA.toString());
        setA.clear();
        assertEquals("[]", setA.toString());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        IntegerSet setB = new IntegerSet();
        IntegerSet setC = new IntegerSet();
        setB.add(5);
        setB.add(6);
        setB.add(78);
        setB.add(69);
        setC.add(5);
        setC.add(8);
        setC.add(42);
        assertTrue(setA.equals(setB));
        assertFalse(setA.equals(setC));
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        IntegerSet setB = new IntegerSet();
        setB.add(5);
        setB.add(90);
        setB.add(43);
        setB.add(650);
        setA.union(setB);
        assertTrue(setA.contains(5));
        assertTrue(setA.contains(90));
        assertTrue(setA.contains(69));
    }
    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
    	setA.add(5);
        setA.add(78);
        setA.add(69);
    	IntegerSet setB = new IntegerSet();
        setB.add(5);
        setB.add(6);
        setB.add(43);
        setB.add(78);
        setA.intersect(setB);
        assertTrue(setA.contains(5));
        assertFalse(setA.contains(6));
        assertFalse(setA.contains(43));
    }
    
    @Test
    @DisplayName("Test case for set difference")
    public void testDiff() {
    	IntegerSet setB = new IntegerSet();
    	IntegerSet setC = new IntegerSet();

    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        setB.add(5);
        setB.add(6);
        setB.add(43);
        setB.add(98);
        setC.add(5);
        setC.add(8);
        setC.add(42);
        setA.diff(setB);
        setB.diff(setC);
        assertTrue(setA.contains(78));
        assertFalse(setA.contains(5));
        assertFalse(setA.contains(6));
        assertFalse(setB.contains(5));
        assertTrue(setB.contains(43));
    }
    
   
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
    	setA.add(5);
        setA.add(6);
        setA.add(78);
        setA.add(69);
        IntegerSet setB = new IntegerSet();
        IntegerSet setU = new IntegerSet();
        setB.add(2);
        setB.add(3);
        setB.add(78);
        setU.add(789);
        setU.add(3);
        setU.add(34);
        setU.add(33);
        setU.add(30);
        setU.add(69);
        setA.complement(setB);
        setU.complement(setA);
        assertTrue(setA.contains(5));
        assertFalse(setA.contains(78));
        assertFalse(setA.contains(3));
        assertTrue(setU.contains(3));
        assertFalse(setU.contains(5));
    }
    
}
