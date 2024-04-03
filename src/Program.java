import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();

        Account andrew = new Account("Андрій", 30, 12, 1995, "andrew@gmail.com",
                380951234567l, "Барч", 80, 120, 15348);
        Account lisa = new Account("Єлизавета", 12, 1, 1999, "elizabeth@gmail.com",
                380951234567l, "Шевченко", 58, 123, 11354);
        Account phillip = new Account("Філіп", 24, 2, 1994, "phillip@gmail.com",
                380951234567l, "Паркер", 88, 128, 16492);

        andrew.printAccountInfo();
        System.out.println("\n--------------------------------------------------------------------------");
        lisa.printAccountInfo();
        System.out.println("\n--------------------------------------------------------------------------");
        phillip.printAccountInfo();

        andrew.setWeight(andrew.getWeight() - random.nextInt());
        andrew.setPressure(andrew.getPressure() + random.nextInt(10) - 5);
        andrew.setStep(andrew.getStep() + random.nextInt(3000));

        phillip.setWeight(phillip.getWeight() - random.nextInt());
        phillip.setPressure(phillip.getPressure() + random.nextInt(10) - 5);
        phillip.setStep(phillip.getStep() + random.nextInt(3000));

        System.out.println("\n\n\nОНОВЛЕНІ ДАНІ\n");
        andrew.printAccountInfo();
        System.out.println("\n--------------------------------------------------------------------------");
        phillip.printAccountInfo();
    }
}
