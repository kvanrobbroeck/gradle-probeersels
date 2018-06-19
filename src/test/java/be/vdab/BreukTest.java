package be.vdab;

import org.junit.*;
import be.vdab.Breuk;

public class BreukTest {
    private Breuk a;
    private Breuk b;
    private Breuk c;

    @Test
    public void optellen() {
        c = a.plus(b);
        assertBreuk(c, 22, 20);
    }

    public void assertBreuk(Breuk subject, int expectedTeller, int expectedNoemer) {
        Assert.assertEquals("Foute teller", expectedTeller, subject.getTeller());
        Assert.assertEquals("Foute noemer", expectedNoemer, subject.getNoemer());
    }

    @Test
    public void aftrekken() {
        c = a.min(b);
        assertBreuk(c, -2, 20);
    }

    @Test
    public void vermenigvuldigen() {
        c = a.maal(b);
        assertBreuk(c, 6, 20);
    }

    @Test
    public void omkeren() {
        c = a.omkeren();
        assertBreuk(c, 4, 2);
    }

    @Test
    public void delen() {
        c = a.deel(b);
        assertBreuk(c, 10, 12);
    }

    @BeforeClass
    public static void superSetup() {
        System.out.println("BEFORE ALL THE THINGS");
    }

    @AfterClass
    public static void superTeardown() {
        System.out.println("AFTER ALL THE THINGS");
    }

    @Before
    public void setUp() {
        a = new Breuk(2, 4);
        b = new Breuk(3, 5);
    }

    @After
    public void tearDown() {
        System.out.println(c);
    }
}
