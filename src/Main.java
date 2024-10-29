public class Main {
    public static void main(String[] args) {

        int amount = 2890;
        int add = 100;
        int bonus = add / 100;
        int total = amount + add + bonus;


        System.out.println("Итоговая сумма на счете: " + total + " рублей");
        if (add > 1000) {
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            System.out.println("Бонусные рубли не начислены");
        }

    }
}task