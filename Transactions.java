//银行账户
import java.text.NumberFormat;

public class Transactions{
    public static void main(String[] args) {
        
        //创建对象
        Account acct1 = new Account("Ted Murohy", 72354, 102.56);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);
        System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));

        acct1.addInterest();
        acct1.addInterest();
        acct1.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);

        }

        static class Account{

            private final double RATE = 0.035;


            private long acctNumber;
            private double balance;
            private String name;

            
            //构造方法
            public Account(String owner, long account, double initial){

                name = owner;
                acctNumber = account;
                balance = initial;
            }


            public double deposit(double amount){

                balance = balance + amount;
                return balance;
            }


            public double withdraw(double amount, double fee){

                balance = balance - amount -fee;
                return balance;
            }

            //计算余额
            public double addInterest(){

                balance += (balance * RATE);
                return balance;
            }


            public double getBalance(){

                return balance;
            }


            public String toString(){

                NumberFormat fmt = NumberFormat.getCurrencyInstance();
                return acctNumber + "\t" + name + "\t" + fmt.format(balance);
            }

        }
}