import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErrorHandler {
  final List<String> validArguments= new ArrayList<>(Arrays.asList(
      "-l","-la", "-a","-r", "-c"));
  final String help="Command Line Todo application\n" +
      "=============================\n\n" +
      "Command line arguments:\n" +
      "\t-l\tLists undone tasks\n"+
      "\t-la\tLists all the tasks\n"+
      "\t-a\tAdds a new task\n" +
      "\t-r\tRemoves an task\n" +
      "\t-c\tCompletes an task\n";

  public boolean validate(String[] args){
    if (args.length==0) {
      System.out.println(help);
      System.exit(0);
      return true;
    } else if (!validArguments.contains(args[0])){
      System.out.println("Unsupported argument");
      System.exit(0);
      return false;
    } else if((args[0].equals("-r")||args[0].equals("-c"))){
      try{
        int testIndex=Integer.parseInt(args[1]);
        return true;
      } catch (NumberFormatException e){
        System.out.printf("Unable to %s: index is not a number",args[0].equals("-r")?"remove":"check");
        System.exit(0);
        return false;
      } catch (IndexOutOfBoundsException e){
        System.out.printf("Unable to %s: no index provided",args[0].equals("-r")?"remove":"check");
        System.exit(0);
        return false;
      }
    }else if (args[0].equals("-a")&&args.length<2){
      System.out.println("Unable to add: no task provided");
      System.exit(0);
      return false;
    } else{
      return true;
    }
  }

}
