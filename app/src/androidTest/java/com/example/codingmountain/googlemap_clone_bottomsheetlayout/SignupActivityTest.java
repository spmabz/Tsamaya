package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;




public class SignupActivityTest {

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(LoginActivity.class.getName(),null,false);

    @Rule
    public ActivityTestRule<SignupActivity> activityActivityTestRule = new ActivityTestRule<>(SignupActivity.class);
    private SignupActivity signupActivity = null;

    @Before
    public void setUp() throws Exception {
        signupActivity = activityActivityTestRule.getActivity();
    }

    @Test
    public void onCreate() {
    }

//    @Test
//    public void signup() {
//
//        ViewInteraction name = onView( withId(R.id.input_name));
//        name.perform(ViewActions.typeText("name"),ViewActions.closeSoftKeyboard());
//
//        View n = signupActivity.findViewById(R.id.input_name);
//        assertEquals(n,signupActivity._nameText);
//
//        ViewInteraction user_email = onView( withId( R.id.input_email));
//        user_email.perform(ViewActions.typeText("redeye@gmail.com"),ViewActions.closeSoftKeyboard());
//
//        ViewInteraction pass = onView(withId(R.id.input_password));
//        pass.perform(ViewActions.typeText("123456"),ViewActions.closeSoftKeyboard() );
//        onView(withId(R.id.btn_signup)).perform(click());
//
//        Activity login= getInstrumentation().waitForMonitorWithTimeout(monitor,10000);
//        assertNotNull(login);
//        login.finish();
//    }


   /* @Test
    public void ShowToast_name() {

        //ViewInteraction name = onView( withId(R.id.input_name));
        //name.perform(ViewActions.typeText("name"),ViewActions.closeSoftKeyboard());
        onView(withId(R.id.input_email)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("12346"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_signup)).perform(click());

        onView(withText("at least 3 characters")).inRoot(withDecorView(not(is(activityActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

    }*/
//    @Test
//    public void ShowToast_email() {
//
//        ViewInteraction name = onView( withId(R.id.input_name));
//        name.perform(ViewActions.typeText("name"),ViewActions.closeSoftKeyboard());
//       // onView(withId(R.id.input_email)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
//        onView(withId(R.id.input_password)).perform(typeText("12346"), ViewActions.closeSoftKeyboard());
//        onView(withId(R.id.btn_signup)).perform(click());
//
//        onView(withText("enter a valid email address")).inRoot(withDecorView(not(is(activityActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
//
//    }
//
//    @Test
//    public void ShowToast_password() {
//
//        ViewInteraction name = onView( withId(R.id.input_name));
//        name.perform(ViewActions.typeText("name"),ViewActions.closeSoftKeyboard());
//        onView(withId(R.id.input_email)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
//        //onView(withId(R.id.input_password)).perform(typeText("12346"), ViewActions.closeSoftKeyboard());
//        onView(withId(R.id.btn_signup)).perform(click());
//
//        onView(withText("between 6 and 15 alphanumeric characters")).inRoot(withDecorView(not(is(activityActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
//
//    }




}