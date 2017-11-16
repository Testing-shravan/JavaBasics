package Sec_03_Methods_Arguements_ReturnValues;

import Sec_02_Static_NonStatic_Method.Class1;

public class WithoutArguements {

    public static void main (String[] args) {

        Arguements1();
        WithArguements.Arguments(8,8); // Methods called from another class - WithArguements.java

        // Methods called from another package for that we should import the package for previous one

        Class1 obj=new Class1();
        obj.NonStaticMethod(2,2);

    }
        public static void Arguements1()
        {
            int a=5;
            int b=6;
            int c=a+b;
            System.out.println(" Without Arguements Value  = " +c);
        }



}
