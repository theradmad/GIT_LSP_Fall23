package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String[] args) {
        Range range1 = new Range(5, 10);
        Range range2 = new Range(8, 15);
        Range range3 = new Range(47, 100);
        Range range4 = new Range(15, 23);
        int testValue = 7;
        
        System.out.println("range1: " + range1.RangeToString());
        System.out.println("Size of range1: " + range1.size());
        System.out.println("Is " + testValue + " in range1? " + range1.isValueInRange(testValue));
        System.out.println("range2: " + range2.RangeToString());
        System.out.println("Size of range2: " + range1.size());
        System.out.println("Is " + testValue + " in range2? " + range2.isValueInRange(testValue));
        System.out.println("Do range1 and range2 overlap? " + range1.doRangesOverlap(range2));
        System.out.println("range3: " + range3.RangeToString());
        System.out.println("Size of range3: " + range1.size());
        System.out.println("Is " + 47 + " in range3? " + range3.isValueInRange(47));
        System.out.println("Do range1 and range3 overlap? " + range1.doRangesOverlap(range3));
        System.out.println("range4: " + range4.RangeToString());
        System.out.println("Is " + 23 + " in range3? " + range4.isValueInRange(23));
        System.out.println("Is " + 24 + " in range3? " + range4.isValueInRange(24));
        System.out.println("Do range2 and range4 overlap? " + range2.doRangesOverlap(range4));
        
    }


}
