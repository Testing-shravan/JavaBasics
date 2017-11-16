package Sec_04_AccessModifier;

public class Private {

    public static void main(String[] args) {

        // Private Method can access only with in the same class We cannot access outside the class or package


        Public.publiceg();
        privateeg();
        Protected.protectedeg();
        Default.defaulteg();

    }

    private static void privateeg() {

        System.out.println("Private Method display only within same class");

    }
}
