package bank;

public class Main {
  public static void main(String[] args) {
    Bank bank=new Bank();
    bank.createAccount(new BankAccount("a",1234,new HungarianForint(5678)));
    bank.createAccount(new BankAccount("b",4321,new USADollar(5659)));
    bank.createAccount(new BankAccount("c",1563,new HungarianForint(4835141)));
    bank.createAccount(new BankAccount("d",1984,new USADollar(565978)));

    System.out.println(bank.getAllMoney());


  }
}
