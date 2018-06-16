package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.paid.MainActivity;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class TestAsyncTask extends AndroidTestCase {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test() {
        try {
            Task task = new Task();
            task.execute(new Task.Tellable() {
                @Override
                public void end(String joke) {
                    // do nothing
                }
            });
            String res = task.get(30, TimeUnit.SECONDS);

            Assert.assertNotNull(res);
            Assert.assertTrue(!res.isEmpty());
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
