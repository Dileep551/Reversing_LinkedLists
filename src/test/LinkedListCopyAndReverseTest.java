
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCopyAndReverseTest {

    @Test
    void testCopyAndReverse() {
        LinkedList<Character> originalList = new LinkedList<>();
        for (char ch = 'A'; ch <= 'J'; ch++) {
            originalList.add(ch);
        }

        List<Character> reversedCopy = LinkedListCopyAndReverse.copyAndReverse(originalList);

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed Copy: " + reversedCopy);


        assertEquals(originalList.size(), reversedCopy.size());
        for (int i = 0; i < originalList.size(); i++) {
            assertEquals(originalList.get(i), reversedCopy.get(reversedCopy.size() - 1 - i));
        }
    }
}