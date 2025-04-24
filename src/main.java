public class main {
    public static void main(String[] args) {
        int initialAccount = 100; // начальная сумма на счете клиента
        int amountDeposit = 1100; // сумма пополнения
        int bonus = amountDeposit / 100; // бонусы
        if (amountDeposit >= 1000) {
            System.out.println("Количество бонусных рублей " + bonus);
            System.out.println("Итоговый счет " + (initialAccount + amountDeposit + bonus));
        } else {
            System.out.println("Итоговый счет " + (initialAccount + amountDeposit));
        }
    }
}
