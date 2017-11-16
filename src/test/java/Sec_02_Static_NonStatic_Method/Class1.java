package Sec_02_Static_NonStatic_Method;

public class Class1 {

        public static void main(String[] args)  // Main method is always Static
        {
            // No need to create object for static method We can call directly for main method

               StaticMethod(4,4);

           // Object must create for non static method then only we can able to call for main method

               Class1 obj=new Class1();
               obj.NonStaticMethod(9,9);
        }

//  Static Method ---- Used in same class

        public static void StaticMethod(int a, int b) {
            int c=a+b;
            System.out.println("No Object Creation for static method Value -->" +c);

        }

//	Non Static Method ---- Used in same class

        public void NonStaticMethod(int i, int j) {
            int k=i+j;
            System.out.println("Object needs to Create for Non static method Value -->" +k);

        }

    }


