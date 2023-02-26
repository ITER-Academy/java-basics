package section8.lesson1.example3;

public class Main {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        if (today == DayOfWeek.WEDNESDAY) {
            System.out.println("Today is Wednesday");
        }

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }

        DayOfWeek[] days = DayOfWeek.values();
        for (DayOfWeek day : days) {
            System.out.println(day);
        }
    }
}
