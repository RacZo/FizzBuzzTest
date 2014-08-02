package com.oscarsalguero.fizzbuzz.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.ListView;

import com.oscarsalguero.fizzbuzz.MainActivity;

/**
 * 
 * This is an Instrumentation Test Case that scrolls a list and clicks on one of
 * items to bring an information dialog up.
 * 
 * @author Oscar Salguero <info@realactionsoft.com>
 * @version 2014.0731
 * @since 1.0
 */
public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		activity = getActivity();
	}

	@MediumTest
	public void testListScroll() throws Exception {

		assertNotNull(activity);
		
		final ListView listView = (ListView) activity
				.findViewById(android.R.id.list);
		
		assertNotNull(listView);
		
		TouchUtils.scrollToBottom(this, activity, listView);
		TouchUtils.clickView(this, listView);

	}

}
