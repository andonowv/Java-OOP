import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

    int HEALTH = 100;
    int EXPERIENCE = 100;

    Dummy dummy = new Dummy(HEALTH, EXPERIENCE);

    @Test
    public void testIfAttackReduceHealth(){
        dummy.takeAttack(10);
        Assert.assertEquals(HEALTH - 10, dummy.getHealth());
    }
    @Test (expected = IllegalStateException.class)
    public void testIfDeadDummyThrowsException(){
        Dummy dummy = new Dummy(0, 50);
        dummy.takeAttack(101);
    }

    @Test
    public void testIfDeadDummyCanGiveXP(){
        Dummy dummy = new Dummy(0, 100);
        dummy.giveExperience();
        Assert.assertEquals(100, dummy.getExperience());
    }

    @Test (expected = IllegalStateException.class)
    public void testIfDummyCantGiveXP(){
        Dummy dummy = new Dummy(100, 100);
        dummy.giveExperience();

    }
}
