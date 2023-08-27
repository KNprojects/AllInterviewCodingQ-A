package main.java.StringCodingQues;

import java.util.Scanner;

public class RemoveWhiteSpacesInString {

    public static void main(String[] args) {

         //ByUsing InBuiltMethod
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which have to be clean the white spaces");
        String inputString=sc.nextLine();
       /* String StringWithOutSpaces=inputString.replaceAll("\\s+","");
        System.out.println("InputString > "+ inputString);
        System.out.println("StringWithOutSpaces > "+ StringWithOutSpaces);
*/
        //Without InBuiltMethod
        char[] charArray=inputString.toCharArray();
        String stringWithOutSpaces1="";
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] != ' ') && (charArray[i] != '\t')){
                stringWithOutSpaces1=stringWithOutSpaces1+charArray[i];
            }
        }
        System.out.println("InputString : "+ inputString);
        System.out.println("StringWithOutSpaces: "+ stringWithOutSpaces1);


        sc.close();

    }


}
