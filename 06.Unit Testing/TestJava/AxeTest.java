import org.junit.Assert;
import org.junit.Test;

public class AxeTest {
    private int ATTACK = 100;
    private int DURABILITY = 100;
    private int HEALTH = 50;
    private int EXPERIENCE = 50;

    @Test
    public void testAttackIfReduceTheDurabilityOfTheAxe(){
        Axe axe = new Axe(ATTACK, DURABILITY);
        Dummy dummy = new Dummy(HEALTH, EXPERIENCE);
        axe.attack(dummy);
        Assert.assertEquals(DURABILITY -1, axe.getDurabilityPoints());
    }

    @Test (expected = IllegalStateException.class)
    public void  testAttackWithNoDurability(){
        Axe axe = new Axe(ATTACK, 0);
        Dummy dummy = new Dummy(HEALTH, EXPERIENCE);
        axe.attack(dummy);
    }
}
