package com.example.paramvir.testpracticesample;

import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest {

    @Test
    public void testSwap() {
        int[] items = {8, 14};
        int temp = new ShellSort().swap(items, 0, 20);
        Assert.assertEquals(items[0], 20);
        Assert.assertEquals(temp, 8);
    }
}
