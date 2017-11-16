package Sec_04_AccessModifier;

public class Protected {

    public static void main(String[] args) {

        // Protected method can access only within the same class and outside the other class and within the package
        // We cannot able to access outside the package

        // ** Sub class from some other package can use protected method using extends keyword (Inheritance Method)
        // ** Need to import the package in sub class for differnt package

        Public.publiceg();
        protectedeg();

            }

    protected static void protectedeg() {

        System.out.println("Protected Method access only within package");

    }
}
