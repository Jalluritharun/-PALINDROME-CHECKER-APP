public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ===== UC1: Welcome Message =====
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version:");
        System.out.println("2.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------");

        // ===== UC2: Hardcoded Palindrome Check =====

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Application execution completed.");
    }
}
