package com.example.johan.mytestproject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Johan on 2015-05-24.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, emulateSdk = 18)
public class MainActivityTest {

    private MainActivity mActivity;

    @Before
    public void setUp() { mActivity = Robolectric.buildActivity(MainActivity.class).create().get(); }

    @Test
    public void testSomething() throws Exception {
        int a = 1;
        int b = 1;
        Assert.assertEquals(a, b);
    }

    @Test
    public void testSomethingMore() throws Exception {
        Assert.assertEquals(1, 1);
    }
}