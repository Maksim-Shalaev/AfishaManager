package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager(10);

    @Test
    void shouldAdd() {
        AfishaItem first = new AfishaItem(1, "Harry Potter: Philosopher's Stone", "Fantasy");
        AfishaItem second = new AfishaItem(2, "Harry Potter: Chamber of Secrets", "Fantasy");
        AfishaItem third = new AfishaItem(5, "Harry Potter: Prisoner of Azkaban", "Fantasy");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAfishaEmpty() {
        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMoreThanTen() {
        AfishaItem first = new AfishaItem(1, "Harry Potter: Philosopher's Stone", "Fantasy");
        AfishaItem second = new AfishaItem(2, "Harry Potter: Chamber of Secrets", "Fantasy");
        AfishaItem third = new AfishaItem(5, "Harry Potter: Prisoner of Azkaban", "Fantasy");
        AfishaItem fourth = new AfishaItem(3, "Harry Potter: Goblet of Fire", "Fantasy");
        AfishaItem fifth = new AfishaItem(4, "Harry Potter: Order of the Phoenix", "Fantasy");
        AfishaItem sixth = new AfishaItem(7, "Harry Potter: Half-Blood Prince",  "Fantasy");
        AfishaItem seventh = new AfishaItem(6, "Harry Potter: Deathly Hallow", "Fantasy");
        AfishaItem eighth = new AfishaItem(8, "The Lord of the Rings: The Fellowship of the Ring", "Fantasy");
        AfishaItem ninth = new AfishaItem(10, "The Lord of the Rings: The Two Towers", "Fantasy");
        AfishaItem tenth = new AfishaItem(9, "The Lord of the Rings: The Return of the King", "Fantasy");
        AfishaItem eleventh = new AfishaItem(11, "Lock, Stock and Two Smoking Barrels", "Thriller");
        AfishaItem twelfth = new AfishaItem(12, "Pulp Fiction", "Thriller, Dark humor");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }
}