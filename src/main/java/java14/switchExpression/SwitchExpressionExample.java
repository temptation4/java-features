package java14.switchExpression;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        String day1 = "MONDAY";
        String day2 = "SUNDAY";
        String day3 = "WEDNESDAY";
        String invalidDay = "HOLIDAY";

        // Example 1: Basic switch expression using arrow syntax
        int hours1 = getWorkingHours(day1);
        System.out.println(day1 + " -> Working Hours: " + hours1);

        // Example 2: switch with multiple labels
        int hours2 = getWorkingHours(day2);
        System.out.println(day2 + " -> Working Hours: " + hours2);

        // Example 3: switch with yield block
        int hours3 = getWorkingHours(day3);
        System.out.println(day3 + " -> Working Hours: " + hours3);

        // Example 4: invalid day
        int hours4 = getWorkingHours(invalidDay);
        System.out.println(invalidDay + " -> Working Hours: " + hours4);
    }

    public static int getWorkingHours(String day) {
        return switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> 8;
            case "SATURDAY" -> 4;
            case "SUNDAY" -> 0;

            // block with yield (e.g., for logging or additional logic)
            default -> {
                System.out.println("Unknown day: " + day);
                yield -1;
            }
        };
    }
}

