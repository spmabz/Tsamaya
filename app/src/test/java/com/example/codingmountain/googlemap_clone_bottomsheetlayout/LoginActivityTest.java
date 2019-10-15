package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseApp;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
@RunWith(RobolectricTestRunner.class)

public class LoginActivityTest {

    LoginActivity login;

    @Before
    public void setUp() throws Exception {

        login=Robolectric.setupActivity(LoginActivity.class);
    }
    @Test
    public void checkUser() {

        assertNotNull(login);
    }

    @Test
    public void checkUser2() {
        login._emailText.setText("alec@gmail.com");
//        login._passwordText.setText("123456");
        login.findViewById(R.id.btn_login).performClick();
    }

    @Test
    public void checkUser3() {
        login._emailText.setText("");
        login._passwordText.setText("");
        login.findViewById(R.id.btn_login).performClick();

    }
    @After
    public void tearDown() throws Exception {
    }
}