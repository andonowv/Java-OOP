import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class TestListIterator {
    private ListIterator listIterator;
    private static final String [] DATA = {"Sasho", "Ivan", "Georgi", "Desi", "Pencho"};

    @Before
    public void setUp() throws OperationNotSupportedException {
        listIterator = new ListIterator(DATA);
    }
    @Test (expected = OperationNotSupportedException.class)
    public void TestConstructorWithNullParam() throws OperationNotSupportedException {
        listIterator = new ListIterator(null);
    }
    @Test
    public void TestHasNextAndMove(){
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertFalse(listIterator.hasNext());
        listIterator.move();

    }
    @Test (expected = IllegalStateException.class)
    public void TestPrintEmptyList() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void PrintCorrect(){
        int index = 0;

        while (listIterator.hasNext()){
            Assert.assertEquals(listIterator.print(), DATA [index]);
            listIterator.move();
            index++;
        }
    }
}
