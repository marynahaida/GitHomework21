public class Account {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private long phoneNumber;
    private String lastName;
    private int weight;
    private int pressure;
    private int step;
    private int age;

    public Account(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                   String email, long phoneNumber, String lastName, int weight, int pressure, int step) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getStep() {
        return step;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStep(int step) {
        this.step = step;
    }
    public void printAccountInfo(){
        age = 2020 - yearOfBirth;
        System.out.printf("Користувач %s %s\nВік: %d\nДата народження: %d.%d.%d\nКонтактні дані:\n   Номер телефону: %d\n   Email:%s" +
                "\nДані про стан здоров'я:\n  Вага: %d кг\n  Тиск: %d\n  К-сть кроків: %d", name, lastName, age, dayOfBirth, monthOfBirth,
                yearOfBirth,phoneNumber,email,weight,pressure,step);
    }
}
