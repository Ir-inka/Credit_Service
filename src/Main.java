public class Main {

    public static void main(String[] args) {
        CreditService service = new CreditService();

        System.out.println("Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 9.99, 12));

        System.out.println("Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 9.99, 24));


        System.out.println("Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 9.99, 36));
    }
}