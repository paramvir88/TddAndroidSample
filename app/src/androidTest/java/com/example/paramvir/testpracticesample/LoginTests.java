package com.example.paramvir.testpracticesample;

import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.Button;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTests {
    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule =
            new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testInitial() {
        onView(withId(R.id.email)).perform(typeText("paramvir@gmail.com"));
        onView(withId(R.id.password)).perform(typeText("password"));
        onView(withId(R.id.email_sign_in_button)).perform(click());

        //onView(withId(R.id.email)).check(matches(isDisplayed()));
        //onView(withId(R.id.email_sign_in_button)).check(matches(getCustomMatcher(11)));



    }


    private Matcher getCustomMatcher(final int value) {
        BoundedMatcher<View, Button> matcher = new BoundedMatcher<View, Button>(Button.class) {
            @Override
            protected boolean matchesSafely(Button item) {
                if (value == 10)
                    return true;
                else return false;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("Pappu yadav");
            }
        };
        return matcher;
    }


}
