package bank;

public class USADollar extends Currency{
  public static final Code CODE=Code.USD;
  public  static final String CENTRAL_BANK_NAME="Federal Reserve System";

  public USADollar(double value) {
    super(CODE, CENTRAL_BANK_NAME, value);
  }

  public USADollar() {
    this(0);
  }
}

