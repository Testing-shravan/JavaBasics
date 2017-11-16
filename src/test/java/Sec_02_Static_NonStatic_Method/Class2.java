package Sec_02_Static_NonStatic_Method;

public class Class2 {

    public static void main (String[] args)
    {
        // We can able to call static and non static method in same class as well as different class and same package as well as different package

        // Below Static Method called from Class1.java

        Class1.StaticMethod(5,5);

        // Below Non Static method called from Classfile1.java

        Class1 obj=new Class1();
        obj.NonStaticMethod(7,7);
    }
}
