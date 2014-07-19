package com.google.cloud.backend.sample.guestbook;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MapActivity extends Activity {
    public static final int MENU_TEXT = Menu.FIRST;
    public static final int MENU_MAP = Menu.FIRST + 1;
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// MenuInflater inflater = getMenuInflater();
		// inflater.inflate(R.menu.activity_main, menu);
		// return super.onCreateOptionsMenu(menu);
		super.onCreateOptionsMenu(menu);
		menu.add(Menu.NONE, MENU_TEXT, Menu.NONE, "Text");
		menu.add(Menu.NONE, MENU_MAP, Menu.NONE, "Map");
		return true;
	}

	/**
	 * Override Activity lifecycle method.
	 */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		/*
		 * MenuItem loginItem = menu.findItem(R.id.switch_account);
		 * loginItem.setVisible(Consts.IS_AUTH_ENABLED);
		 */
		return true;

	}

	/**
	 * Override Activity lifecycle method.
	 * <p>
	 * To add more option menu items in your client, add the item to
	 * menu/activity_main.xml, and provide additional case statements in this
	 * method.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/*
		 * switch (item.getItemId()) { case R.id.switch_account:
		 * mProcessingFragment.signInAndSubscribe(true); return true; default:
		 * return super.onOptionsItemSelected(item); }
		 */
		switch (item.getItemId()) {
		case MENU_TEXT:
			Intent intent = new Intent(MapActivity.this,
					GuestbookActivity.class);
			startActivity(intent);
			return true;
		case MENU_MAP:


			return true;
		default:
			return super.onOptionsItemSelected(item);
		}

	}

}
