package Sec_03_Methods_Arguements_ReturnValues;

import Sec_02_Static_NonStatic_Method.Class1;

public class WithArguements {

    public static void main(String[] args) {


        // Methods called from same class
        Arguments(6,6);
        WithoutArguments();
        int obj=ReturnValue(7,7);
        NotReturnValue(obj,5);

        // Static and Non static method called from other package (Sec_02_Static_Nonstatic_Method
        Class1.StaticMethod(12,12);
        Class1 obj1=new Class1();
        obj1.NonStaticMethod(15,15);

    }

    public static void Arguments(int a, int b)    {
        int c= a+b;
        System.out.println(" Script with Arguments Value -->" +c);
    }

    public static void WithoutArguments()	      {
        int x=10;
        int y=10;
        int z=x+y;
        System.out.println(" Script without Arguments Value -->" +z);

    }

    public static int ReturnValue(int i, int j)    {
        int k=i+j;
        return k;
    }

    public static void NotReturnValue(int e, int f){
        int g= e+f;
        System.out.println("VOID does not return any value -->" +g);
    }

}
