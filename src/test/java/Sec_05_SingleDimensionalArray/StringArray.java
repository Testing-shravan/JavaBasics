package Sec_05_SingleDimensionalArray;

public class StringArray {

    public static void main (String[] args)
    {
         StrArray();

    }

    public static void StrArray()
    {
        String str[]= new String[3];  // Initialising the string array (syntax), we can use alpha numeric special characters as well
        str[0]= "String123@";         // String array will not hold the integer values only
        str[1]= "String234$";
        str[2]= "String345&";

        System.out.println(" Length of the string is = " +str.length);
        System.out.println( " Value of 0th Index is = " +str[0]);
        System.out.println( " Value of 0th Index is = " +str[1]);
        System.out.println( " Value of 0th Index is = " +str[2]);

    }
}
