package VIVA2;

    // isValidISBN Method:
    // This method takes a single ISBN-10 number as input and performs validation.
    // It calculates the weighted sum of the first 9 digits and compares the last character (check digit)
    // using the given formula.

public class V2Q4 {
    public static boolean isValidISBN(String isbn) {
        int checkDigit = 0; // Reset checkDigit for each ISBN
        boolean isValid = true; // Flag to check if the ISBN is valid

        // Check if characters from index 0 to 8 are all digits
        for (int j = 0; j < 9;j++) {
            if (j < isbn.length()) { 
                char currentChar = isbn.charAt(j);
                if (!Character.isDigit(currentChar)) {
                    isValid = false; // Set flag to false if any character is not a digit
                    break; // Exit the loop early
                }
            } else {
                isValid = false; // If the ISBN is too short
                break;
            }
        }
        
        if (!isValid) {
            return false; // Invalid ISBN
        }

        char last = isbn.charAt(isbn.length() - 1);
        
        // Calculate check digit
        for (int j = 0; j < isbn.length() - 1;j++) {
            char currentChar = isbn.charAt(j);
            int value = Character.getNumericValue(currentChar);
            checkDigit += (j + 1) * value; // Weighted sum
        }

        // Calculate the modulus
        int res = checkDigit % 11;

        // Adjust for 'X' in the last character
        if (last == 'X') {
            res = 10; // 'X' represents 10
        }

        // Determine if the computed check digit matches the last character
        return (res == Character.getNumericValue(last) || (last == 'X' && res == 10));
    }

    // validateISBNList Method:
    // This method takes an array of ISBN-10 strings, validates each one using the isValidISBN method,
    // and prints the results.
    public static void validateISBNList(String[] isbnList) {
        for (String isbn : isbnList) {
            boolean isValid = isValidISBN(isbn);
            System.out.println(isValid);
        }
    }
    
    public static void main(String[] args) {
        // Sample Input:
        String[]isbnList={"123456789X","1234567890","0471958697"};
        // Call the method to validate the list of ISBNs
        validateISBNList(isbnList);
    }
}
