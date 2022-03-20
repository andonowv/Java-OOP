import org.junit.Assert;
import org.junit.Test;
import p04_BubbleSortTest.Bubble;

public class TestBubble {

    @Test
    public void testSort (){
        int [] array = {4, 6, 20, 15, 10};
        Bubble.sort(array);
        int [] expectedArray = {4, 6, 10, 15, 20};
        Assert.assertEquals(array.length, expectedArray.length);
        Assert.assertArrayEquals(array, expectedArray);
    }
}
