public class main {
    public static void main(String[] args) {
    int i = 100; // начальная сумма на счете клиента
    int x = 1100; // сумма пополнения
    int b = x / 100; // бонусы
    if ( x >= 1000 ) {
        System.out.println("Количество бонусных рублей " + b );
        System.out.println("Итоговый счет " + (i + x + b));
    } else {
        System.out.println("Итоговый счет " + (i + x));
    }
}
}
