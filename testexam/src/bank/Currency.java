package bank;

public abstract class Currency {
  private Code code;
  private String centralBankName;
  private double value;



  public Currency(Code code, String centralBankName, double value) {
    this.code = code;
    this.centralBankName = centralBankName;
    setValue(value);
  }
  public void setValue(double value) {
    if (value>=0){
      this.value += value;
    } else {
      System.out.println("Value can't be negative!");
    }
  }

  public double getValue() {
    return value;
  }
  public void addMoney(double deposit){
    this.value+=deposit;
  }
  public void getMoney(double withdrawal){
    this.value-=withdrawal;
  }
}
