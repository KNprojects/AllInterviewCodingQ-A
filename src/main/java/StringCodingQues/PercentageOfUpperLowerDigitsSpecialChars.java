package main.java.StringCodingQues;

public class PercentageOfUpperLowerDigitsSpecialChars {

    public static void main(String[] args) {

        String input="Hello Niharika@welcome1997#";
        int totalChars=input.length();
        int uppercaseCount=0;
        int lowercaseCount=0;
        int specialCharsCount=0;
        int digitsCount=0;

        for (int i=0;i<totalChars;i++){
            char ch=input.charAt(i);

            if (Character.isUpperCase(ch)){
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitsCount++;
            }else {
                specialCharsCount++;
            }

            double uppercasePercent=(double) uppercaseCount/totalChars *100;
            double lowercasePercent=(double) uppercaseCount/totalChars *100;
            double digitsPercent=(double) uppercaseCount/totalChars *100;
            double SpecialcharsPercent=(double) uppercaseCount/totalChars *100;


            System.out.println("Uppercase Letters: " + uppercasePercent + "%");
            System.out.println("Lowercase Letters: " + lowercasePercent + "%");
            System.out.println("Digits: " + digitsPercent + "%");
            System.out.println("Special Characters: " + SpecialcharsPercent + "%");


        }



    }



}
