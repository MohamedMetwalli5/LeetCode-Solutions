class Bank {

    private long[] Balance;
    public Bank(long[] balance) {
        Balance = new long[balance.length];
        for(int i=0;i<Balance.length;i++){
            Balance[i] = balance[i];
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1-1 >= 0 && account2-1 >= 0 && account1-1 < Balance.length && account2-1 < Balance.length && Balance[account1-1] >= money){
            Balance[account1-1] -= money;
            Balance[account2-1] += money;
            return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account-1 >= 0 && account-1 < Balance.length){
            Balance[account-1] += money;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(account-1 >= 0 && account-1 < Balance.length && Balance[account-1] >= money){
            Balance[account-1] -= money;
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */