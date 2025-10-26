public class Main {
    public static void main(String[] args) {
        long[] balances = {10, 100, 20, 50, 30};
        Bank bank = new Bank(balances);

        System.out.println(bank.withdraw(3, 10));  // true
        System.out.println(bank.transfer(5, 1, 20)); // true
        System.out.println(bank.deposit(5, 20)); // true
        System.out.println(bank.transfer(3, 4, 15)); // false
        System.out.println(bank.withdraw(10, 50)); // false

        // Print balances to see the result
        bank.printBalances();
    }
}
