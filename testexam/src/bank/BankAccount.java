package bank;

public class BankAccount {
  String name;
  int pinCode;
  Currency currency;

  public BankAccount(String name, int pinCode, Currency currency) {
    this.name = name;
    this.pinCode = pinCode;
    this.currency = currency;
  }
  public void deposit(double value){
    if (value>=0){
      this.currency.addMoney(value);
    }
  }
  public double withdraw(int pinCode,double value){
    if (this.pinCode==pinCode &&
        this.currency.getValue()>value &&
        value>=0){
      return value;
    } return 0;
  }
}
