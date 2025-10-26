public class Bank {
    private long[] bal;

    public Bank(long[] balance) {
        this.bal = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!isValid(account1) || !isValid(account2)) return false;
        if(bal[account1 - 1] < money) return false;
        bal[account1 - 1] -= money;
        bal[account2 - 1] += money;
        return true; 
    }
    
    public boolean deposit(int account, long money) {
        if(!isValid(account)) return false;
        bal[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValid(account)) return false;
        if(bal[account - 1] < money) return false;
        bal[account - 1] -= money;
        return true;
    }

    private boolean isValid(int account) {
        return account >= 1 && account <= bal.length; 
    }

    // Optional: method to print balances for testing
    public void printBalances() {
        for(long b : bal) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
