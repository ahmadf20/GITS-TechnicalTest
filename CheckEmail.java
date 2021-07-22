package gits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckEmail {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter Email: ");
            String line = System.console().readLine();
            if (line.isEmpty())
                break;

            System.out.println(isValidEmail(line) ? "Valid" : "Invalid");
        }
    }

    public static boolean isValidEmail(String email) {
        String regEmail = "^(.{1,20})(@\\.)(.)+\\.(co\\.id|id)$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regEmail);
        java.util.regex.Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Test
    public void test() {
        assertEquals(true, isValidEmail("ahmad_f20@.gmail.id"));
        assertEquals(true, isValidEmail("ahmad_f20@.gmail.co.id"));
        assertEquals(true, isValidEmail("12345678901234567890@.a.id"));

        // there is no @ symbol
        assertEquals(false, isValidEmail("12345678901234567890123.mail.id"));
        // character after @ is not .
        assertEquals(false, isValidEmail("12345678901234567890123@mail.com"));
        // more than 20 characters before @
        assertEquals(false, isValidEmail("12345678901234567890123@.a.id"));
        // domain is neither .co.id nor .id
        assertEquals(false, isValidEmail("12345678901234567890123@.mail.com"));
        // no char before @
        assertEquals(false, isValidEmail("12345678901234567890123@..id"));
    }
}
