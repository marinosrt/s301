package n1exercici1.Class;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Undo {

    private static Undo undo;
    private static List<String> commandList = null;

    private Undo(){

    }

    public static Undo getUndo(){
        if (undo == null){
            undo = new Undo();
        }
        return undo;
    }

    public void addCommand (String command){
        if (commandList == null){
            commandList = new ArrayList<>();
        }

        commandList.add(command);
        System.out.println("\nCommand added!");
    }

    public void deleteCommand (String command){

        if (commandList.stream().anyMatch(str -> str.matches(command))){
            commandList.removeIf(str -> str.matches(command));
            System.out.println("\nCommand deleted!");
        } else {
            System.out.println("\nCouldn't find this command");
        }
    }

    public void listAllCommands (int numCom){
        if (commandList == null){
            System.out.println("\nNo previous commands to prompt out");
        } else {
            ListIterator<String> it = commandList.listIterator(commandList.size());

            if (commandList.size() < numCom){
                System.out.println("\nNot enough commands stored. Here are the last " + commandList.size() + ":\n");
            }

            while (it.hasPrevious() && numCom > 0){
                System.out.println(it.previous());
                numCom--;
            }
        }
    }

}
