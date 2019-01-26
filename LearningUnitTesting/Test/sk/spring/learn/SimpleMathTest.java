package sk.spring.learn;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void Sum() {
        SimpleMath simpleMath = new SimpleMath();
        int res = simpleMath.sum(new int[] {1,2,3});
        assertEquals(6,res);
        System.out.println("Test Method");
    }
}