package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;



import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import java.util.concurrent.TimeUnit;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
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



public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule = new ActivityTestRule<>(LoginActivity.class);
    private LoginActivity loginActivity = null;
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MapsActivity.class.getName(),null,false);
    Instrumentation.ActivityMonitor monitor1 = getInstrumentation().addMonitor(LoginActivity.class.getName(),null,false);
    Instrumentation.ActivityMonitor monitor2 = getInstrumentation().addMonitor(SignupActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {
        loginActivity = activityActivityTestRule.getActivity();
    }

    @Test
    public void onCreate() {
        View log = loginActivity.findViewById(R.id.input_email);
        assertEquals(log,loginActivity._emailText);
        View pass = loginActivity.findViewById(R.id.input_password);
        assertEquals(pass,loginActivity._passwordText);
        View b = loginActivity.findViewById(R.id.btn_login);
        assertEquals(b,loginActivity._loginButton);
        View up = loginActivity.findViewById(R.id.link_signup);
        assertEquals(up,loginActivity._signupLink);

    }

    @Test
    public void login() {
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        assertNotNull(loginActivity.findViewById(R.id.input_email));
        assertNotNull(loginActivity.findViewById(R.id.input_password));


        onView(withId(R.id.input_email)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("123456"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        Activity MapActivity = getInstrumentation().waitForMonitorWithTimeout(monitor,10000);

        assertNotNull(MapActivity);

        MapActivity.finish();
    }

    @Test
    public void onclick() throws InterruptedException{

        onView(withId(R.id.link_ForgetP)).perform(click());
        onView(withId(R.id.send_mail)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_reset)).perform(click());


        Activity fpassword = getInstrumentation().waitForMonitorWithTimeout(monitor1,10000);
        assertNotNull(fpassword);
        fpassword.finish();

    }
    @Test
    public void onclicksignup() throws InterruptedException {

        onView(withId(R.id.link_signup)).perform(click());
        //onView(withId(R.id.link_signup)).perform(click());
        //TimeUnit.SECONDS.sleep(2);
        Activity signup= getInstrumentation().waitForMonitorWithTimeout(monitor2,10000);
        assertNotNull(signup);
        signup.finish();


    }
    @Test
    public void shouldShowToast() {

        onView(withId(R.id.input_email)).perform(typeText("alec@gmail.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("12346"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        onView(withText("Incorrect Password or Email")).inRoot(withDecorView(not(is(activityActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

    }




}