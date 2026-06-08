public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("----- Kid User Test Cases -----");

        kiduser kid1 = new kiduser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println();

        kiduser kid2 = new kiduser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println();

        System.out.println("----- Adult User Test Cases -----");

        adultuser adult1 = new adultuser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println();

        adultuser adult2 = new adultuser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}
