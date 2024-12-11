import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
    private ArrayList<String> sourceList;
    private int index;
    private String item;

    public InsertAtCommand(ArrayList<String> lst, int idx, String itm) {
        this.sourceList = lst;
        this.index = idx;
        this.item = itm;
    }

    // This method inserts the item at the specified index. It makes sure that the
    // index is within the bounds of the list.
    @Override
    public void execute() {
        if (index >= 0 && index <= sourceList.size()) {
            sourceList.add(index, item);
        }
    }
}
