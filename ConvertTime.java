package gits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ConvertTime {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter Time: ");
            String line = System.console().readLine();
            if (line.isEmpty())
                break;

            System.out.println(convertTime(line));
        }
    }

    // convert AM/PM to 24-hour format
    public static String convertTime(String time) {
        String result = "";
        if (time.contains("AM")) {
            result = time.replace("AM", "").trim();
            int hour = Integer.parseInt(result.substring(0, 2));
            if (hour == 12)
                hour = 0;

            result = String.format("%02d", hour) + result.substring(2, 5);
        } else {
            result = time.replace("PM", "").trim();
            int hour = Integer.parseInt(result.substring(0, 2));
            if (hour < 12)
                hour += 12;

            result = String.format("%02d", hour) + result.substring(2, 5);
        }
        return result;
    }

    @Test
    public void test() {
        assertEquals("12:00", convertTime("12:00:00 PM"));
        assertEquals("00:00", convertTime("12:00:00 AM"));

        assertEquals("12:23", convertTime("12:23:34 PM"));
        assertEquals("00:25", convertTime("12:25:34 AM"));

        assertEquals("01:25", convertTime("01:25:34 AM"));
        assertEquals("13:25", convertTime("01:25:34 PM"));
    }
}
