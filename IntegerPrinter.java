

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    // I put the main method into its own class, called Main
}
