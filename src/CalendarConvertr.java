public class CalendarConvertr {
    final static int poniedzialek = 1;
    final static int wtorek = 2;
    final static int sroda = 3;
    final static int czwartek = 4;
    final static int piatek = 5;
    final static int sobota = 6;
    final static int niedziela = 7;

    public static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case poniedzialek:
                return "poniedzialek";
            case wtorek:
                return "wtorek";
            case sroda:
                return "sroda";
            case czwartek:
                return "czwartek";
            case piatek:
                return "piatek";
            case sobota:
                return "sobota";
            case niedziela:
                return "niedziela";

        }
        return"WRONG";
    }
}

