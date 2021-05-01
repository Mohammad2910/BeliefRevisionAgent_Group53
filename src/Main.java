import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        String menuInput;
        BeliefBase bb = new BeliefBase();

        while (!quit) {
            System.out.println("Actions available:");
            System.out.println("‘e’ -> Empty belief base");
            System.out.println("‘p’ -> Print belief base");
            System.out.println("‘r’ -> Belief revision");
            System.out.println("‘c’ -> Belief Contraction");
            System.out.println("‘q’ -> Quit");

            menuInput = scanner.nextLine();

            if (menuInput.startsWith("e")) {
                bb.clear();

            } else if (menuInput.startsWith("p")) {
                printBeliefBase(bb.getBeliefBaseList());

            } else if (menuInput.startsWith("r")) {
                System.out.println("What would you like to Revise?");
                String revisionInput = scanner.nextLine();
                System.out.println("Revisioninput: " + revisionInput);
                bb.revise(revisionInput);
                printBeliefBase(bb.getBeliefBaseList());

            } else if (menuInput.startsWith("c")) {
                String contractionInput = scanner.nextLine();
                bb.contract(contractionInput);
                printBeliefBase(bb.getBeliefBaseList());

            } else if (menuInput.startsWith("q")) {
                quit = true;
            }
        }

        scanner.close();


    }

    public static void printBeliefBase(ArrayList<String> beliefBase) {
        boolean firstTime = true;
        System.out.println("The belief base contains: ");
        for (String belief : beliefBase) {
            if (!firstTime) System.out.print(" & ");
            System.out.print(belief);
            firstTime= false;
        }

        System.out.println("\n--------------------------");
    }
}
