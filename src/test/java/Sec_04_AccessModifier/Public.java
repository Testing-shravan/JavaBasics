package Sec_04_AccessModifier;

public class Public {

            public static void main(String[] args) {

            // Public method can able to access in any class and any package

            publiceg();
            Protected.protectedeg();

        }

        public static void publiceg() {

            System.out.println("Public Method can access any class & Package");

        }

    }
