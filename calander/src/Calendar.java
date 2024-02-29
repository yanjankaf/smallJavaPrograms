import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar {
    public static void main(String[] args) {
        // I don't care about user input, so i will just print the calander of the current month
        LocalDate d = LocalDate.now();
        int dateToday = d.getDayOfMonth();
        int currentMonth = d.getMonth().getValue();

        //	Print the header

        System.out.printf("%39s\n", Month.of(currentMonth).toString() + " of " + d.getYear());
        System.out.println();
        for (var i : DayOfWeek.values()) {
            System.out.print(i.toString().substring(0, 3) + " ".repeat(3));
        }
        System.out.println();

		LocalDate dayToday = d.minusDays(dateToday - 1);
		int firstDayOfWeek = dayToday.getDayOfWeek().getValue();


		for (int i = 1; i < firstDayOfWeek; ++i){
            System.out.print(" ".repeat(6));
        };

        while (dayToday.getMonth().getValue() == currentMonth){
            System.out.printf("%3s", dayToday.getDayOfMonth());
            System.out.print(" ".repeat(3));
            dayToday = dayToday.plusDays(1);
            if(dayToday.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }

    }
}