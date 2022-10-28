package assignments;

import java.util.Random;
public class FirstPresident {
    private static final int[] YEARS = new int[] {
            1881, 1893, 1900, 1910, 1919, 1923, 1930, 1932, 1934, 1938
    };
    private static final String[] QUOTES = new String[] {
            "Teachers are the one and only people who save nations.",
            "Everything we see in the world is the creative work of women.",
            "Our true mentor in life is science.",
            "The future is in the skies.",
            "Peace at home, peace in the world."
    };
    private static int getRandomYear() {
        return YEARS[new Random().nextInt(YEARS.length)];
    }
    private static String getRandomQuote() {
        return QUOTES[new Random().nextInt(QUOTES.length)];
    }
    public static void main(String[] args) {
        int year = getRandomYear();

        String[] EVENTS = new String[]{
                "Mustafa was born in Salonika",
                "Mustafa was given the additional name Kemal at military school",
                "Mustafa Kemal landed in Samsun",
                "Mustafa Kemal was elected as the first president of the Republic of Turkey.",
                "Mustafa Kemal founded the Turkish Linguistic Society.",
                "The Grand National Assembly of Turkey granted him the surname Atatürk.",
                "Atatürk died in Istanbul."
        };

        switch(year) {
            case 1881:
                System.out.printf("In %d, %s", year, EVENTS[0] );
                break;
            case 1893:
                System.out.printf("In %d, %s", year, EVENTS[1] );
                break;
            case 1919:
                System.out.printf("In %d, %s", year, EVENTS[2] );
                break;
            case 1923:
                System.out.printf("In %d, %s", year, EVENTS[3] );
                break;
            case 1932:
                System.out.printf("In %d, %s", year, EVENTS[4] );
                break;
            case 1934:
                System.out.printf("In %d, %s", year, EVENTS[5] );
                break;
            case 1938:
                System.out.printf("In %d, %s", year, EVENTS[6] );
                break;
            default:
                System.out.printf("One of his favorite sayings is, \"%s\"", getRandomQuote());
        }
    }
}