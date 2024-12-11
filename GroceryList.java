import java.util.*;
import java.io.PrintWriter;

public class GroceryList {
    protected ArrayList<String> listItems = new ArrayList<String>();
    protected Stack<UndoCommand> undoStack = new Stack<UndoCommand>();

    public void addWithUndo(String newItemName) {
        // Add the new list item
        listItems.add(newItemName);

        // Make an undo command that removes the last item and push onto stack
        undoStack.push(new RemoveLastCommand(listItems));
    }

    public void removeAtWithUndo(int removalIndex) {
        // Check if the index is within the bounds of the list
        if (removalIndex >= 0 && removalIndex < listItems.size()) {
            // Remove the item at the specified index
            String removedItem = listItems.remove(removalIndex);
            // Create an InsertAtCommand instance of our insert class and push it onto the
            // removed object's index.
            InsertAtCommand insertAtCommand = new InsertAtCommand(listItems, removalIndex, removedItem);
            undoStack.push(insertAtCommand);
        }
    }

    public void swapWithUndo(int index1, int index2) {
        if (index1 >= 0 && index1 < listItems.size() && index2 >= 0 && index2 < listItems.size()) {
            // Swap the items by storing the value of the first index in a temporary
            // variable and then
            // setting the value of the first index to the value of the second index.
            String temp = listItems.get(index1);
            listItems.set(index1, listItems.get(index2));
            listItems.set(index2, temp);

            // Create a SwapCommand instance of our swap class and push it onto the undo
            // stack
            SwapCommand swapCommand = new SwapCommand(listItems, index1, index2);
            undoStack.push(swapCommand);
        }
    }

    // Pop and execute the command at the top of the stack
    public void executeUndo() {
        if (!undoStack.isEmpty()) {
            UndoCommand command = undoStack.pop();
            command.execute();
        }
    }

    final int getListSize() {
        return listItems.size();
    }

    final int getUndoStackSize() {
        return undoStack.size();
    }

    final ArrayList<String> getVectorCopy() {
        return listItems;
    }

    public void print(PrintWriter outputStream) {
        for (int i = 0; i < listItems.size(); i++) {
            outputStream.write(i + ". " + listItems.get(i) + "\n");
        }
    }
}
