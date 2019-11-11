package com.example.codingmountain.googlemap_clone_bottomsheetlayout;

import android.widget.LinearLayout;
import android.widget.Toast;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import static org.junit.Assert.*;

import static org.junit.Assert.*;import static org.hamcrest.CoreMatchers.equalTo;
@RunWith(RobolectricTestRunner.class)
public class ReportChangesTest {
    ReportChanges change;
    @Before
    public void setUp() throws Exception {
        change=Robolectric.setupActivity(ReportChanges.class);
    }

    @Test
    public void check() {

        assertNotNull(change);
    }
    @After
    public void tearDown() throws Exception {
    }

}