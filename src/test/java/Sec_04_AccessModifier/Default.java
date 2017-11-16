package Sec_04_AccessModifier;

public class Default {

    public static void main(String[] args) {

        // ** Default Method is same as Protected Method but in protected method Sub class from some other package can use protected method
        // ** using extends keyword (Inheritance Method) but in default its not possible to access some other package using extends keyword

        Public.publiceg();
        Protected.protectedeg();
        defaulteg();

    }

    // In the Method, If you are not giving any access modifier name, By default it will consider as a Default Method

    static void defaulteg() {

        System.out.println("Private Method display only within class");

    }

}
