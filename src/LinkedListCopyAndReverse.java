
/*
(Copying and Reversing LinkedLists) Write a program that
creates a LinkedList object of 10 characters, then
creates a second LinkedList object containing a copy of the first list, but in reverse order.

 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListCopyAndReverse {

    public static List<Character> copyAndReverse(List<Character> originalList) {
        LinkedList<Character> reversedList = new LinkedList<>(originalList);
        LinkedList<Character> reversedCopy = new LinkedList<>();

        while (!reversedList.isEmpty()) {
            reversedCopy.add(reversedList.removeLast());
        }

        return reversedCopy;
    }
}
