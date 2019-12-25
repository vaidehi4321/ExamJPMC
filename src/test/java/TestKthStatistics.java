import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestKthStatistics {
    @Test
    public void test1()  {
        String input = "3\n5 2 9 7";
          String expected = "7";
      KthStatistics kStat = new KthStatistics();
         String actual = kStat.findKthStatistics(input);
        Assert.assertEquals(expected , actual);
    }
    @Test
    public void test2()  {
        String input = "8\n9 5 3 7 2 1 4 6 8";
        String expected = "8";
        KthStatistics kStat = new KthStatistics();
        String actual = kStat.findKthStatistics(input);
        Assert.assertEquals(expected , actual);
    }
    @Test
    public void test3()  {
        String input = "13\n55 -22 -44 -55 66 -77 44 -66 88 33 99 -88 77 -11 11 -33 22 99 0";
        String expected = "44";
        KthStatistics kStat = new KthStatistics();
        String actual = kStat.findKthStatistics(input);
        Assert.assertEquals(expected , actual);
    }
}
