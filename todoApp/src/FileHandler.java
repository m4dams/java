import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileHandler implements Serializable {
  private static String filepath;

  public FileHandler(String filepath) {
    this.filepath = filepath;
  }

  public static List<ToDo> loadToDos() {
    List<ToDo> toDos = new ArrayList<>();
    try {
      FileInputStream fileInputStream = new FileInputStream(new File(filepath));
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      boolean cont = true;
      while (cont) {
        try {
          ToDo toDo = (ToDo) objectInputStream.readObject();
          if (toDo != null) {
            toDos.add(toDo);
          }
        } catch (EOFException e) {
          cont = false;
          objectInputStream.close();
          fileInputStream.close();
        }
      }
      return toDos;
    } catch (FileNotFoundException e) {
      return toDos;
    } catch (Exception e) {
      e.printStackTrace();
      return toDos;
    }
  }

  public static void saveToDos(List<ToDo> todoList) {
    try {
      FileOutputStream fileOutputStream =
          new FileOutputStream(new File(FileHandler.filepath));
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      for (ToDo toDo : todoList) {
        objectOutputStream.writeObject(toDo);
      }
      objectOutputStream.close();
      fileOutputStream.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
