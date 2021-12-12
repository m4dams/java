package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  protected List<BankAccount>bankAccountList;

  public Bank() {
    this.bankAccountList = new ArrayList<>();
  }

  public void createAccount(BankAccount bankAccount){
    this.bankAccountList.add(bankAccount);
  }
  public double getAllMoney(){
    double allMoney=0;
    for (BankAccount bankAccount : this.bankAccountList) {
      allMoney+=bankAccount.currency.getValue();
    }
    return allMoney;
  }
}
