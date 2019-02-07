 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer a = integers[0];
        Integer b = integers[1];
        Integer c = integers[2];
        
        // I separated these integers into separate variables to make the
        // ternary operation below more readable.
        
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return Math.max(Math.max(integers[0], integers[2]), Math.max(integers[1], integers[2]));
    }
}
