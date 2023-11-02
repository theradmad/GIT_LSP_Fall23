package org.howard.edu.lsp.assignment4;

import org.howard.edu.lsp.assignment4.IntegerSetException;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

/**
 * Represents a set of integers and provides various operations on the set.
 */
public class IntegerSet {
	private List<Integer> set;
	/**
     * constructs an empty IntegerSet.
     */
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	/**
     * constructs an IntegerSet from the given arraylist of integers.
     * @param set - the arraylist representing the set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	/** 
	 * empties the set
	 */
	public void clear() {
		set.clear();
	}
	/** 
	 * finds amount of elements in set
	 * @return length of set
	 */
	public int length() {
		return set.size();
	} 
	/** 
	 * @param b
	 * check if the set equals b
	 * @return true if equal, false otherwise
	 */
	public boolean equals(IntegerSet b) {
		return set.containsAll(b.set) && b.set.containsAll(set);
	} 
	/** 
	 * @param value integer to check if its in the set
	 * check if the value in the set
	 * @return true if equal, false otherwise
	 */
	public boolean contains(int value) {
		return set.contains(value);
		}   
	/** 
	 * @return largest value of set
	 */
	public int largest()  {
		if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty.");
        }
        int max = set.get(0);
        for (int i : set) {
            if (i > max) {
                max = i;
            }
        }
        return max;
       	} 
	/** 
	 * @return smallest value of set
	 */
	public int smallest() {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty.");
		}
    	int min = set.get(0);
    	for (int i : set) {
    		if (i < min) {
    			min = i;
    		}
    	}
    	return min;
    }
	/**
	 * adds an item to a list
	 * @param item to add to list
	 */
	public void add(int item) {
		if (!set.contains(item)) {
            set.add(item);
        }
	} 
	/**
	 * removes item from list
	 * @param item to remove
	 */
	
	public void remove(int item) {
		set.remove((Integer) item);
	} 
	/**
	 * combines the set with setb, no duplicates
	 * @param intSetb set to combine with set
	 */
	public void union(IntegerSet intSetb) {
        Set<Integer> unionSet = new HashSet<>(set);
        unionSet.addAll(intSetb.set);
        set.clear();  
        set.addAll(unionSet);  
    }
	/**
	 * finds the intersection of set with setb
	 * @param intSetb set to find intersection with
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	} 
	/**
	 * subtracts setb from set
	 * @param intSetb set to subtract from set
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	/**
	 * finds the complement of set with setb (all elements in setb that arent in the set)
	 * @param intSetb
	 */

	public void complement(IntegerSet intSetb) {
	    List<Integer> complement = new ArrayList<>();
	    Collections.sort(intSetb.set);
	    int indexA = 0;
	    int indexB = 0;
	    while (indexA < set.size() && indexB < intSetb.set.size()) {
	        int elementA = set.get(indexA);
	        int elementB = intSetb.set.get(indexB);

	        if (elementA < elementB) {
	            complement.add(elementA);
	            indexA++;
	        } else if (elementA > elementB) {
	            indexB++;
	        } else {
	            indexA++;
	            indexB++;
	        }
	    }
	    while (indexA < set.size()) {
	        complement.add(set.get(indexA));
	        indexA++;
	    }
	    set = complement;
	}
	/**
	 * check if the set is empty
	 * @return true if true, else false
	 */
	
	boolean isEmpty() {
		return set.isEmpty();
	}
	/**
	 * @return the set as a string
	 */
	
	public String toString() {
		return set.toString();
		
	}	


}
