package belief;

import java.util.ArrayList;

import java.util.Scanner;

public class BeliefBase {
    private ArrayList<String> beliefBaseList = new ArrayList<>();
    private ArrayList<Double> beliefBasePlausibility = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void contract(String input) {

    }

    public void revise(String input) {
        ArrayList<String> pInput = parseInput(input);

        for (String clause : pInput) {

            System.out.println("Enter plausibility for: " + clause);
            Double plausibility = scanner.nextDouble();
            beliefBasePlausibility.add(plausibility);
            beliefBaseList.add(clause);
        }
    }


    public void expand(String input) {
        ArrayList<String> pInput = parseInput(input);
        beliefBaseList.addAll(pInput);
    }

    public void clear() {
        beliefBaseList.clear();
    }

    public ArrayList<String> getBeliefBaseList() {
        return beliefBaseList;
    }



    public ArrayList<String> parseInput(String input) {
        ArrayList<String> rStatement = new ArrayList<>();
        String[] parsed = input.split("&");
        for (String clause : parsed) {
            rStatement.add(clause.replaceAll(" ", ""));
        }
        return rStatement;
    }
}

