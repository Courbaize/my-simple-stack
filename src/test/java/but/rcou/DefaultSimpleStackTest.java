package but.rcou;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class DefaultSimpleStackTest {

    @Test
    void isEmptyTrue() {
        // GIVEN une liste vide
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        // WHEN THEN la liste est vide
        assertTrue(defaultSimpleStack.isEmpty());
    }

    @Test
    void isEmptyFalse() {
        // GIVEN une liste avec un item
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        defaultSimpleStack.push(new DefaultItem());
        // WHEN THEN
        assertFalse(defaultSimpleStack.isEmpty());
    }

    @Test
    void getSizeWithEmptyStack() {
        // GIVEN une liste vide
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        // EXCEPTED la taille est de 0
        assertEquals(defaultSimpleStack.getSize(), 0);
    }

    @Test
    void getSizeWithNotEmptyStack() {
        // GIVEN une liste vide
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        // WHEN ajout d'un item
        defaultSimpleStack.push(new DefaultItem());
        // THEN la taille est de 0
        assertEquals(defaultSimpleStack.getSize(), 1);
        // THEN la liste n'est pas vide
        assertFalse(defaultSimpleStack.isEmpty());

        // WHEN ajout d'un item
        defaultSimpleStack.push(new DefaultItem());
        // THEN la taille est de 1
        assertEquals(defaultSimpleStack.getSize(), 2);
        // THEN la liste n'est pas vide
        assertFalse(defaultSimpleStack.isEmpty());
    }

    @Test
    void pushAItem() {
        // GIVEN une liste vide
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        // WHEN ajout d'un item
        defaultSimpleStack.push(new DefaultItem());
        // THEN la taille de la liste est de 1
        assertEquals(defaultSimpleStack.getSize(), 1);
        // THEN la liste n'est pas vide
        assertFalse(defaultSimpleStack.isEmpty());
    }

    @Test
    void popWithEmptyStack() {
        // GIVEN une liste vide
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        // EXCEPTED erreur lors de la recuperation du premier item
        assertThrows(EmptyStackException.class, () -> defaultSimpleStack.pop());
    }

    @Test
    void popWithNotEmptyStack() {
        // GIVEN une liste avec un item
        DefaultSimpleStack defaultSimpleStack = new DefaultSimpleStack();
        DefaultItem defaultItem = new DefaultItem();
        defaultSimpleStack.push(defaultItem);
        // WHEN recupere le premier item
        Item itemRecupere = defaultSimpleStack.pop();
        // THEN l'item recupere est le meme que celui insere
        assertEquals(itemRecupere, defaultItem);
        // THEN la liste est vide
        assertTrue(defaultSimpleStack.isEmpty());

        // GIVEN une liste avec 2 items
        defaultSimpleStack.push(defaultItem);
        DefaultItem defaultItem1 = new DefaultItem();
        defaultSimpleStack.push(defaultItem1);
        // WHEN recupere le premier item
        itemRecupere = defaultSimpleStack.pop();
        // THEN l'item recupere est le meme que celui insere
        assertEquals(itemRecupere, defaultItem1);
        // THEN la liste est vide
        assertEquals(defaultSimpleStack.getSize(), 1);
    }

    @Test
    void peek() {

    }
}