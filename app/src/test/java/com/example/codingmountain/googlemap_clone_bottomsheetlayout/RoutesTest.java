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

public class RoutesTest {

    Routes routes;

    @Before
    public void setUp() throws Exception {
        routes=Robolectric.setupActivity(Routes.class);
    }

    @Test
    public void check() {

        assertNotNull(routes);
    }
    @After
    public void tearDown() throws Exception {
    }
}