import java.util.ArrayList;

public class RemoveLastCommand extends UndoCommand {
    private ArrayList<String> sourceList;

    public RemoveLastCommand(ArrayList<String> lst) {
        this.sourceList = lst;
    }

    // This method removes the last item from the list by calling the last index in
    // the ArrayList.
    @Override
    public void execute() {
        if (!sourceList.isEmpty()) {
            sourceList.remove(sourceList.size() - 1);
        }
    }
}
