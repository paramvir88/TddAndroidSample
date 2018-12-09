package com.example.paramvir.testpracticesample;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TextPRactice {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void listGoesOverTheFold() {
        Espresso.onView(ViewMatchers.withText("Hello World!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void myFirstTest(){
        Espresso.onView(ViewMatchers.withId(R.id.my_button)).check(ViewAssertions.matches(ViewMatchers.withText("Submit result")));
    }
}
