import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Subscriber[] subscribers = SubscriberGenerate.generateSubArray();
    private static SubscriberSevice subscriberSevice = new SubscriberServiceImpl();
    private static int time;
    private static char firstLetterLastName;
    private static String st;

    public static void main(String[] args) {
        runOption(getOption());
    }

    private static int getOption() {

        System.out.println("""
                Виберіть варіант:
                1. Відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий.
                2. Відомості про абонентів, які користувалися міжміським зв'язком.
                3. Відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр.
                4. Сумарне споживання трафіку інтернету для певного міста.
                5. Кількість абонентів з негативним балансом.
                """);
        return scanner.nextInt();
    }

    private static void runOption(int option) {
        switch (option) {

            case 1 -> {
                System.out.println("Укажіть час внутрішньоміських розмов: ");
                time = scanner.nextInt();
                subscriberSevice.subscriberOfLocalCallsExceeds(subscribers, time);
            }
            case 2 -> {
                subscriberSevice.subscriberUsedLongDistanceCommunication(subscribers);
            }
            case 3 -> {
                System.out.println("Укажіть першу літеру для пошуку: ");
                firstLetterLastName = scanner.next().charAt(0);

                subscriberSevice.subscriberFirstLetterParameter(subscribers, firstLetterLastName);
            }
            case 4 -> {
                System.out.println("Укажіть місто для пошуку: ");
                st = scanner.next().toString();
                subscriberSevice.totalInternetCity(subscribers, st);
            }
            case 5 -> {
                subscriberSevice.subscribersWithAnegativeBalance(subscribers);
            }

        }

    }
}
