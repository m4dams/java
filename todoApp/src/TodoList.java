import java.util.ArrayList;
import java.util.List;

public class TodoList {
  List<ToDo> todos;
  FileHandler fileHandler;

  public TodoList(FileHandler fileHandler) {
    this.todos = fetchTodos();
    this.fileHandler = fileHandler;
  }

  public TodoList(List<ToDo> todos, FileHandler fileHandler) {
    this.todos = todos;
    this.fileHandler = fileHandler;
  }

  private void saveToDos() {
    FileHandler.saveToDos(this.todos);
  }

  private List<ToDo> fetchTodos() {
    return FileHandler.loadToDos();
  }

  public void addToDo(String todo) {
    this.todos.add(new ToDo(todo));
    saveToDos();
  }

  public String getToDo(int number) {
    return this.todos.get(number - 1).getDescription();
  }

  public void removeToDo(int number) {
    try {
      this.todos.remove(number - 1);
      saveToDos();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Unable to remove: index is out of bound");
      System.exit(0);
    }

  }

  public void completeToDo(int number) {
    try {
      todos.get(number - 1).markDone();
      saveToDos();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Unable to check: index is out of bound");
      System.exit(0);
    }

  }

  @Override
  public String toString() {
    if (this.todos.isEmpty()) {
      return "No todos for today! :)";
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < this.todos.size(); i++) {
        stringBuilder.append(String.format("%s. %s\n", i + 1, this.todos.get(i)));
      }
      return stringBuilder.toString();
    }
  }

  public void getToDos() {
    List<ToDo> uncheckedToDos = new ArrayList<>();
    for (ToDo todo : this.todos) {
      if (!todo.isDone()) {
        uncheckedToDos.add(todo);
      }
    }
    this.todos.clear();
    this.todos.addAll(uncheckedToDos);
  }
}

