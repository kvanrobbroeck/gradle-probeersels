package be.vdab;

import org.junit.Assert;
import org.junit.Test;
import be.vdab.arrays.Lotto;

import java.util.TreeSet;

public class LottoTest {
    @Test
    public void lottoTrekkingDoesNotMisbehave() {
        for(int i = 0; i < 1000; i++) {
            TreeSet<Integer> ref = new TreeSet<>();
            int[] resultaat = Lotto.voerTrekkingUit(1, 45);
            Assert.assertEquals("Te veel cijfers getrokken", 6, resultaat.length);
            for (int getal : resultaat) {
                Assert.assertFalse("Dubbel voorgekomen", ref.contains(getal));
                Assert.assertTrue("Range is fout", getal >= 1 && getal <= 45);
                ref.add(getal);
            }
        }
    }
}
