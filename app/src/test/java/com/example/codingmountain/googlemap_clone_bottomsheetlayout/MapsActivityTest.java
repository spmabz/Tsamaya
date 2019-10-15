package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import android.content.Intent;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
@RunWith(RobolectricTestRunner.class)

public class MapsActivityTest {
    MapsActivity maps;
    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent(RuntimeEnvironment.application,MapsActivity.class);
        intent.putExtra("email","alec@gmail.com");
        maps=Robolectric.setupActivity(MapsActivity.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oncreate() {

        assertNotNull(maps);
    }



}