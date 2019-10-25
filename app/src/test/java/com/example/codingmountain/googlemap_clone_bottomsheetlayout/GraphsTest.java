package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import static org.junit.Assert.*;

import static org.junit.Assert.*;
@RunWith(RobolectricTestRunner.class)
public class GraphsTest {
    Graphs graphs;
    @Before
    public void setUp() throws Exception {
        graphs=Robolectric.setupActivity(Graphs.class);
    }

    @Test
    public void check() {

        assertNotNull(graphs);
    }
    @After
    public void tearDown() throws Exception {
    }
}