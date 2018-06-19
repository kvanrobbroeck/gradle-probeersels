package be.vdab;

import org.junit.Assert;
import org.junit.Test;
import be.vdab.beehive.Soldier;

public class SoldierTest {
    @Test
    public void soldiersHaveAName() {
        Soldier s = new Soldier("Jimi", 10, 2);
        Assert.assertEquals("Jimi", s.getName());
    }

//    @Test
//    public void soldierCanAttackOtherSoldier() {
//        Assert.fail("TODO");
//    }
//
//    @Test
//    public void soldierDiesIfAttackedByStrongerOpponent() {
//        Assert.fail("TODO");
//    }
}
