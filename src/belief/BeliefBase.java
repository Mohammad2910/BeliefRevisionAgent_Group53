package belief;

import java.util.ArrayList;

import java.util.Scanner;

public class BeliefBase {
    private ArrayList<String> beliefBaseList = new ArrayList<>();
    private ArrayList<Double> beliefBasePlausibility = new ArrayList<>();

    private ArrayList<Belief> beliefList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void contract(String input) {

    }

    public void revise(String input) { // indtaster: a   KB: {-a}
        ArrayList<String> pInput = parseInput(input);
        Belief newBelief;

        if (pInput.size() == 1 && pInput.get(0).length() == 1) {
            for (Belief beliefs: beliefList) {
                if(beliefs.getBelief().equals("-" + pInput.get(0))){
                    // Hvis det omvendte af en proposition findes
                    // så skal vi enten tage den nye proposition eller beholde den gamle
                    // ved ikke hvad er teoretisk korrekt.
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
            }
        } else if (pInput.size() == 1 && pInput.get(0).length() == 2) { // -a
            for (Belief beliefs: beliefList) {
                if(beliefs.getBelief().equals(String.valueOf(pInput.get(0).charAt(1)))){
                    // Hvis det omvendte af en proposition findes
                    // så skal vi enten tage den nye proposition eller beholde den gamle
                    // ved ikke hvad er teoretisk korrekt.
                    System.out.println("-AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("-AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("-AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    System.out.println("-AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
            }
        }

        for (String clause: pInput) {
            System.out.println("Enter plausibility for: " + clause);
            double plausibility = scanner.nextDouble();

            newBelief = new Belief(clause, plausibility);
            beliefList.add(newBelief);
        }


        /*for (String clause : pInput) {

            System.out.println("Enter plausibility for: " + clause);
            Double plausibility = scanner.nextDouble();
            beliefBasePlausibility.add(plausibility);
            beliefBaseList.add(clause);
        } */
    }


    public void expand(String input) {
        ArrayList<String> pInput = parseInput(input);
        //beliefBaseList.addAll(pInput);
    }

    public void clear() {
        //beliefBaseList.clear();
        beliefList.clear();
    }

    /*public ArrayList<String> getBeliefBaseList() {
        return beliefBaseList;
    }*/

    public ArrayList<Belief> getBeliefList() {
        return beliefList;
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
