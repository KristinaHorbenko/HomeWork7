import java.util.Objects;

public class Subscriber {
    private int id;

    private String lastName;

    private String firstName;

    private String city;

    private String phoneNumber;

    private int contractNumber;

    private double balance;

    public int cityCallDurationMin;

    private int interCityCallDurationMin;

    private int internetrafficGB;

    public Subscriber(int id, String lastName, String firstName, String city, String phoneNumber, int contractNumber,
                      double balance, int cityCallDurationMin, int interCityCallDurationMin, int internetrafficGB) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDurationMin = cityCallDurationMin;
        this.interCityCallDurationMin = interCityCallDurationMin;
        this.internetrafficGB = internetrafficGB;
    }

    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getCityCallDurationMin() {
        return cityCallDurationMin;
    }

    public int getInterCityCallDurationMin() {
        return interCityCallDurationMin;
    }

    public int getInternetrafficGB() {
        return internetrafficGB;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLastName(), getFirstName(), getCity(), getPhoneNumber(),
                getContractNumber(), getBalance(), getCityCallDurationMin(), getInterCityCallDurationMin(), getInternetrafficGB());
    }

    @Override
    public String toString() {
        return  "Абонент "  +
                "id: " + id + '\n' + lastName + " " + firstName + '\n' +
                " Місто: " + city + '\n' +
                " Номер телефону: " + phoneNumber + '\n' +
                " Номер контракту: " + contractNumber + '\n' +
                " Баланс: " + balance + '\n' +
                " Тривалість міської розмови, хв: " + cityCallDurationMin + '\n' +
                " Тривалість міжміського дзвінка, хв: " + interCityCallDurationMin + '\n' +
                " Інтернет-трафік, ГБ: " + internetrafficGB + '\n'+
                " ";

    }
}