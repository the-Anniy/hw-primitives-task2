public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int add = 300;


        if (add > 1000) {
            int bonus = add / 100;
            int total = amount + add + bonus;
            System.out.println("Итоговая сумма на счете: " + total + " рублей");
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            int total = amount + add;
            System.out.println("Итоговая сумма на счете: " + total + " рублей");
            System.out.println("Бонусные рубли не начислены");
        }

    }
}