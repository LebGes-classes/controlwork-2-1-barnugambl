package ControlWork1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {
    LinkList<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkList<>();
        linkedList.add(10);
        linkedList.add(43);
        linkedList.add(1043);

    }

    void add() {
        linkedList.add(13255);
        assertEquals(13255, linkedList.get(3));
    }

    @Test
    void addToBeginning() {
        linkedList.addToBeginning(12);
        assertEquals(12, linkedList.get(0));
    }

    @Test
    void remove() {
        linkedList.remove(43);
        assertEquals(2, linkedList.size());

    }

    @Test
    void get() {
        assertEquals(43, linkedList.get(1));
    }


    @Test
    void isEmpty() {
        linkedList.clear();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void clear() {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    void addAtIndex() {
        linkedList.addAtIndex(1, 434);
        assertEquals(434, linkedList.get(1));
    }
    @Test
    void size(){
        assertEquals(3, linkedList.size());
    }
    @Test
    void removeByIndex(){
        linkedList.removeByIndex(0);
        assertEquals(2, linkedList.size());
    }
}