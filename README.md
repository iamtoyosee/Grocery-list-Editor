# GroceryList Java Program

The `GroceryList` program is a utility for managing a grocery list with undo functionality. This program demonstrates object-oriented programming concepts in Java, using classes, stacks, and collections to implement operations such as adding, removing, swapping items, and undoing actions.

---

## Features

- **Add Items with Undo:** Add a new item to the grocery list and save the undo command to remove it later.
- **Remove Items with Undo:** Remove an item at a specific index and save the undo command to reinsert it later.
- **Swap Items with Undo:** Swap two items in the list and save the undo command to revert the swap.
- **Undo Last Operation:** Undo the last operation performed on the list using a stack-based command pattern.
- **Print Grocery List:** Print the current state of the grocery list to a specified output stream.

---

## Class Methods

### Public Methods

#### 1. `addWithUndo(String newItemName)`
Adds a new item to the grocery list and saves an undo command to remove it later.

#### 2. `removeAtWithUndo(int removalIndex)`
Removes an item at the specified index and saves an undo command to reinsert the removed item at the same position.

#### 3. `swapWithUndo(int index1, int index2)`
Swaps the positions of two items in the list and saves an undo command to revert the swap.

#### 4. `executeUndo()`
Executes the last undo command, reverting the last modification to the list.

#### 5. `print(PrintWriter outputStream)`
Prints the grocery list to the provided `PrintWriter` output stream, with each item numbered.

### Protected Fields

- `listItems` : An `ArrayList<String>` storing the items in the grocery list.
- `undoStack` : A `Stack<UndoCommand>` storing undo commands to revert list operations.

### Additional Helper Methods

- `getListSize()`: Returns the size of the grocery list.
- `getUndoStackSize()`: Returns the size of the undo stack.
- `getVectorCopy()`: Returns a copy of the current grocery list.

---

## Requirements

- **Java Version:** Ensure you have Java 8 or later installed.
- **Libraries Used:** 
  - `java.util.*` for `ArrayList` and `Stack`
  - `java.io.PrintWriter` for printing the list to an output stream.

---
