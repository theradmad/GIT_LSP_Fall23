package org.howard.edu.lsp.assignment5;
import org.howard.edu.lsp.assignment5.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

public class IntegerSetTest {
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet intSet = new IntegerSet();
        
        intSet.add(5);
        assertTrue(intSet.contains(5));
    }
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(6);
        intSet.add(9);
        intSet.remove(6);
        assertTrue(intSet.contains(5));
        assertFalse(intSet.contains(6));
    }
    
    @Test
    @DisplayName("Test case for contain")
    public void testContains() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(78);
        assertTrue(intSet.contains(5));
        assertFalse(intSet.contains(67));
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(78);
        assertEquals(intSet.toString(), "[5, 78]");
    }
    
    @Test
    @DisplayName("Test case for empty")
    public void testEmpty() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        assertFalse(intSet.isEmpty());
        intSet.remove(5);
        assertTrue(intSet.isEmpty());
    }
    
    

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(57);
        assertFalse(intSet.isEmpty());
        intSet.clear();
        assertTrue(intSet.isEmpty());
    }
    
    
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(10);
        assertEquals(10, intSet.largest());
    }
    
    @Test
    @DisplayName("Test case for largest exception")
    public void testLargestException() {
        IntegerSet intSet = new IntegerSet(); 
        try {
            intSet.largest(); 
            fail("Expected IntegerSetException was not thrown");
        } catch (IntegerSetException e) {
            
        }
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(10);
        assertEquals(5, intSet.smallest());
    }
    
    @Test
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() {
        IntegerSet intSet = new IntegerSet(); 
        try {
            intSet.smallest(); 
            fail("Expected IntegerSetException was not thrown");
        } catch (IntegerSetException e) {
            
        }
    }
    
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet intSet = new IntegerSet();
        intSet.add(5);
        intSet.add(10);
        assertEquals(2, intSet.length());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet intSetA = new IntegerSet();
        intSetA.add(5);
        intSetA.add(10);
        IntegerSet intSetB = new IntegerSet();
        intSetB.add(5);
        intSetB.add(10);
        IntegerSet intSetC = new IntegerSet();
        intSetC.add(6);
        intSetC.add(109);
        assertTrue(intSetA.equals(intSetB));
        assertFalse(intSetA.equals(intSetC));
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet intSetA = new IntegerSet();
        intSetA.add(1);
        intSetA.add(2);
        IntegerSet intSetB = new IntegerSet();
        intSetB.add(2);
        intSetB.add(3);
        intSetA.union(intSetB);
        assertTrue(intSetA.contains(1));
        assertTrue(intSetA.contains(2));
        assertTrue(intSetA.contains(3));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet intSetA = new IntegerSet();
        intSetA.add(1);
        intSetA.add(2);
        IntegerSet intSetB = new IntegerSet();
        intSetB.add(2);
        intSetB.add(3);
        intSetA.intersect(intSetB);
        assertTrue(intSetA.contains(2));
        assertFalse(intSetA.contains(1));
        assertFalse(intSetA.contains(3));
    }
    
    @Test
    @DisplayName("Test case for set difference")
    public void testDiff() {
        IntegerSet intSetA = new IntegerSet();
        intSetA.add(1);
        intSetA.add(2);
        IntegerSet intSetB = new IntegerSet();
        intSetB.add(2);
        intSetB.add(3);
        intSetA.diff(intSetB);
        assertTrue(intSetA.contains(1));
        assertFalse(intSetA.contains(2));
        assertFalse(intSetA.contains(3));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet intSetA = new IntegerSet();
        intSetA.add(1);
        intSetA.add(2);
        IntegerSet intSetB = new IntegerSet();
        intSetB.add(2);
        intSetB.add(3);
        intSetA.complement(intSetB);
        assertTrue(intSetA.contains(1));
        assertFalse(intSetA.contains(2));
        assertFalse(intSetA.contains(3));
    }
    
    
}
