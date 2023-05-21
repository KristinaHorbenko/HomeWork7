public class SubscriberServiceImpl implements SubscriberSevice {

    @Override
    public void subscriberOfLocalCallsExceeds(Subscriber[] subscribers, int time) {

        for (Subscriber s : subscribers) {
            if(s.getCityCallDurationMin() > time) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void subscriberUsedLongDistanceCommunication(Subscriber[] subscribers) {
        for (Subscriber s : subscribers) {
            if(s.getInterCityCallDurationMin() > 0) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void subscriberFirstLetterParameter(Subscriber[] subscribers, char firstLetterLastName) {
        char firstLetter;
        for (Subscriber s : subscribers) {
            firstLetter = s.getLastName().charAt(0);
            if (firstLetter == firstLetterLastName) {
                System.out.println(s);
            }
        }
     }

     @Override
    public void totalInternetCity(Subscriber[] subscribers,  String st) {
        int summa = 0;

        for (Subscriber s : subscribers) {
            if (s.getCity().equals(st)) {
                summa = summa + s.getInternetrafficGB();
                System.out.println(s);
            }
        }

        System.out.println("сумарне споживання трафіку інтернету: " + summa + " GB");

    }

    @Override
    public void subscribersWithAnegativeBalance(Subscriber[] subscribers) {
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                System.out.println(s);
            }
        }
    }
}
