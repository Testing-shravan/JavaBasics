package Sec_05_SingleDimensionalArray;

public class ObjectArray {


        public static void main (String[] args)
        {
            ObjArray();

        }

        public static void ObjArray()
        {
            Object obj[]= new Object[3];  // Initialising the object array (syntax), we can use alpha numeric special characters, decimal values as well
            obj[0]= "String123@";         // String array will not hold the integer values only
            obj[1]= 12345;                // In company they are using object array only
            obj[2]= 10.20;

            System.out.println(" Length of the string is = " +obj.length);
            System.out.println( " Value of 0th Index is = " +obj[0]);
            System.out.println( " Value of 0th Index is = " +obj[1]);
            System.out.println( " Value of 0th Index is = " +obj[2]);

        }
    }



