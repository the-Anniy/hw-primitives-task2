public class Main {
  public static void main(String[] args) {

    int amount = 2890;
    int add = 345;
    int total = amount + add;
    int bonus = add / 100;

      System.out.println("Итоговая сумма на счете: " + total + "рублей");
      if (add > 1000) {
          System.out.println("Начислено бонусов: " + bonus);
    } else {
          System.out.println("Бонусы не начислены");
      }

  }
}