package counter;

public class Counter {
  private int counter;
  private int resetTo;

  public Counter() {
    this(0);
    this.resetTo = 0;
  }

  public Counter(int counter) {
    this.counter = counter;
    this.resetTo = counter;
  }

  public void add() {
    counter++;
  }

  public void add(int number) {
    this.counter += number;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    this.counter = resetTo;
  }
}
