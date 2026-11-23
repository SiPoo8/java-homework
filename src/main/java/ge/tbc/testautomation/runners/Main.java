package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Main {
    public static void main(String[] args) {
        try {
            Circle Circle = new Circle(-5);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }
        try {
            Circle circle1 = new Circle(1);
            Circle circle2 = new Circle(2);
            Circle circle3 = new Circle(3);
            Circle circle4 = new Circle(4);
            Circle circle5 = new Circle(5);
            Circle circle6 = new Circle(6);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }
        String text = "Test Automation Bootcamp 12, 2025";

        String lowerAutomation = text.substring(5, 15).toLowerCase();
        System.out.println(lowerAutomation);

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println(text.length());

        String replacedText = text.replace(" ", "-");
        System.out.println(replacedText);

        String[] phoneNumbers = {
                "599-00-11-11",
                "555-00-11-12",
                "595-00-11-13",
                "592-00-11-14",
                "590-00-11-15",
                "599-00-11-1",
                "599-00-11-166"
        };

        for (int i = 0; i < phoneNumbers.length; i++) {
            boolean isValid = phoneNumberValidation(phoneNumbers[i]);
            System.out.println(phoneNumbers[i] + " -> " + isValid);
        }
    }
    private static boolean phoneNumberValidation(String phoneNumber) {
        String cleanedNumber = phoneNumber.replace("-", "");
        String regex = "^(555|595|592|599)[0-9]{6}$";
        return cleanedNumber.matches(regex);
    }
}