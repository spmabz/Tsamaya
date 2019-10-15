package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
@RunWith(RobolectricTestRunner.class)

public class RatingActivityTest {
    RatingActivity rating;

    @Before
    public void setUp() throws Exception {

        rating=Robolectric.setupActivity(RatingActivity.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {

        assertNotNull(rating);
    }
}