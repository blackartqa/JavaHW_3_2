public class Main {
    public static void main(String[] args) {
        int currentBalance = 10000;                 //начальный баланс клиента в копейках
        int transactionAmount = 520032;             //сумма пополнения в копейках
        int bonusAmount = 10000;                    //сумма в копейках, за которую начисляется бонус
        int bonusLimit = 100000;                    //сумма в копейках, до которой бонусная политика не работает
        int bonusPrice = 100;                       //сумма бонуса в копейках за каждый bonusAmount
        int totalBonus;                             //итоговый бонус в копейках
        int totalBalanceKop;                        //итоговый баланс в копейках
        float totalBalance;                         //итоговый баланс для показа пользователю

        if (transactionAmount > bonusLimit){
            totalBonus = transactionAmount/bonusAmount*bonusPrice;
            totalBalanceKop = currentBalance + transactionAmount + totalBonus;
            System.out.println("Вам начислено " +totalBonus/100+ " рублей в подарок за пополнение счёта.");
        }
        else {
            totalBalanceKop = currentBalance + transactionAmount;
        }
        totalBalance = (float)(totalBalanceKop/100f);
        System.out.printf("Ваш баланс %.2f рублей", totalBalance);
    }
}
