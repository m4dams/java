import java.io.Serializable;

public class ToDo implements Serializable {
  private String description;
  private boolean isDone;

  public ToDo(String description) {
    this.description = description;
    this.isDone = false;
  }

  public ToDo(String description, boolean isDone) {
    this.description = description;
    this.isDone = isDone;
  }

  public void markDone() {
    this.isDone = !this.isDone;
  }

  @Override
  public String toString() {
    return String.format("[%s] %s",
        this.isDone ? "x" : " ",
        this.description);
  }

  public String getDescription() {
    return description;
  }
}
