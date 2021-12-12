package bank;

public class HungarianForint extends Currency{
public static final Code CODE=Code.HUF;
public  static final String CENTRAL_BANK_NAME="Hungarian National Bank";

  public HungarianForint(double value) {
    super(CODE,CENTRAL_BANK_NAME,0);
  }

  public HungarianForint() {
    this(0);
  }
}

