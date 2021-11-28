public class Main {
  public static void main(String[] args) {
   executeOperations(args);

  }

  public static void executeOperations(String[] args) {
    ErrorHandler errorHandler = new ErrorHandler();
    if (errorHandler.validate(args)) {
      TodoList todoList = new TodoList(new FileHandler("todo.txt"));
      switch (args[0]) {
        case "-la": {
          System.out.println(todoList);
          break;
        }
        case "-l":
          todoList.getToDos();
          System.out.println(todoList);
          break;
        case "-a": {
          todoList.addToDo(args[1]);
          break;
        }
        case "-r": {
          todoList.removeToDo(Integer.parseInt(args[1]));
          break;
        }
        case "-c": {
          todoList.completeToDo(Integer.parseInt(args[1]));
          break;
        }

      }
    }
  }
}