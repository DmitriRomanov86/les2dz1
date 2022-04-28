public class Main {

    public static void main(String[] args) {
        int price = 320; // стоимость билета в рублях

        int amount = 20; // каждые потраченые рубли
        int miles = 1; // бонус

        System.out.println("Стоимость билета 320 рублей");
        System.out.println("Начисленное количество бонусов:");
        System.out.println((price / amount) + " миль");

    }
}
