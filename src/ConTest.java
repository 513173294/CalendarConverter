public class ConTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            String s = CalendarConvertr.convertDayToString(i);
            System.out.println(i + " dzien tygodnia to " + s);
        }


    }
}
