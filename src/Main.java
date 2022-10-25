import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> guide = new HashMap<>();
        Random random = new Random();
        int variable = 0;
        int variableOne = 0;
        int variableTwo = 0;
        String variables = "";
        String variablesNumber = "";
        String variablesOne = "";
        String variablesTwo = "";

        for (int j = 0; j < 20; j++) {
            int phjneNumberVeriableOne = random.nextInt(80000);
            int phoneNumberVeriableTwo = random.nextInt(900000);
            if (phjneNumberVeriableOne > 7000) {
                variableOne = phjneNumberVeriableOne;
            }
            if (phoneNumberVeriableTwo > 100000) {
                variableTwo = phoneNumberVeriableTwo;
            }
            variablesOne = String.valueOf(variableOne);
            variablesTwo = String.valueOf(variableTwo);
            variablesNumber = variablesOne + variablesTwo;
            variable ++;
            variables = String.valueOf(variable);
            String personality = "человек " + variables;
            guide.put(personality, variablesNumber);
            System.out.println(guide.get(personality));
        }

        System.out.println(guide.size());
    }
}