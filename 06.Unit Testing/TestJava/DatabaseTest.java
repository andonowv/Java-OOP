import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;
    private static final Integer [] NUMBERS = {5, 8, 25, 68};

    @Before
    public void prepareDataBase () throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void TestConstructorHasToCreateValidObject(){
        Integer [] dataBaseElements = database.getElements();
        Assert.assertEquals(dataBaseElements.length, NUMBERS. length);

        for (int i = 0; i < dataBaseElements.length; i++) {
            Assert.assertEquals(NUMBERS[i], dataBaseElements[i]);
        }
    }
    @Test (expected = OperationNotSupportedException.class)
    public void TestWhetherThrowsExceptionWithMoreThanSixteenElement() throws OperationNotSupportedException {
        Integer [] numbers = new Integer[17];
        database = new Database(numbers);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void TestWhetherTrowsExceptionWithLessThanOneElement() throws OperationNotSupportedException {
        Integer [] number = new Integer[0];
        database = new Database(number);
    }

    @Test
    public void TestAddShouldAddAnElement() throws OperationNotSupportedException {
        database.add(7);
        Assert.assertEquals(database.getElements().length, 5);
        Assert.assertEquals(database.getElements()[database.getElements().length -1], Integer.valueOf(7));
    }
    @Test(expected = OperationNotSupportedException.class)
    public void TestAddShouldNotAddNullElement() throws OperationNotSupportedException {
        database.add(null);
    }
    @Test
    public void TestRemoveShouldRemoveAnElement() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(database.getElements().length, 3);
        Assert.assertEquals(database.getElements()[database.getElements().length -1], Integer.valueOf(25));
    }
    @Test(expected = OperationNotSupportedException.class)
    public void TestRemoveShouldNotRemoveNullElemnt() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }

}
