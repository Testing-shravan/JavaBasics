package Sec_04_AccessModifier;

public class AllAccess {

    public static void main(String[] args) {

        // Public method can able to access in any class and any package
           Public.publiceg();

        // Private Method can access only with in the same class We cannot access outside the class or package
           privateeg();

        // Protected method can access only within the same class and outside the other class and within the package
        // We cannot able to access outside the package

        // ** Sub class from some other package can use protected method using extends keyword (Inheritance Method)
        // ** Need to import the package in sub class for differnt package
           Protected.protectedeg();

        // Default method is same as protected method
        // but in default its not possible to access some other package using extends keyword
           Default.defaulteg();

    }

    private static void privateeg() {

        System.out.println("Private Method display only within class");

    }


}
