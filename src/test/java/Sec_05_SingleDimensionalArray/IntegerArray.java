package Sec_05_SingleDimensionalArray;

public class IntegerArray { // Integer will hold integer array only

    public static void main (String[] args)
    {
        IntArray();
    }

    public static void IntArray()
    {
        int x[]= new int [3];  // Initialising the integer array (Syantax)
        x[0]=10;
        x[1]=20;
        x[2]=30;

        System.out.println(" Length of the Integer Array is = " +x.length);
        System.out.println("Array value of 1st index = "+x[0]);
        System.out.println("Array value of 1st index = "+x[1]);
        System.out.println("Array value of 1st index = "+x[2]);

    }
}
