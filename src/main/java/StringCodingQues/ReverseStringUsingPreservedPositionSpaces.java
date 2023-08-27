package main.java.StringCodingQues;

public class ReverseStringUsingPreservedPositionSpaces {
        public static void main(String[] args) {
            String input = "I Am Not String";
            String reversedString = reverseString(input);
            System.out.println(reversedString);
        }

        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                if (input.charAt(i) != ' ') {
                    reversed.append(input.charAt(i));
                }
            }

            int spaceCount = input.length() - reversed.length();

            for (int i = 0; i < spaceCount; i++) {
                reversed.insert(spaceCount, ' ');
            }

            return reversed.toString();
        }
    }
