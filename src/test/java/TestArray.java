import org.junit.Assert;
import org.junit.Test;

public class TestArray {

    @Test
    public void arrayTest1() {
        int[] in = new int[]{1, 3, 4, 5, 5, 6, 8};
        int[] out = new int[]{5, 5, 6, 8};
        Assert.assertArrayEquals(out, MyTestDrive.arrayTestOne(in));
    }

    @Test(expected = RuntimeException.class)
    public void arrayTest2() {
        int[] in = new int[]{1, 3, 5, 5, 6, 8};
        MyTestDrive.arrayTestOne(in);
    }

    @Test
    public void arrayContains1and4Test1() {
        int[] in = new int[]{1, 3, 4, 5, 5, 6, 8};
        Assert.assertFalse(MyTestDrive.arrayContains1and4(in));
    }

    @Test
    public void arrayContains1and4Test2() {
        int[] in = new int[]{1, 4, 4, 1};
        Assert.assertTrue(
                MyTestDrive.arrayContains1and4(in));
    }

}
