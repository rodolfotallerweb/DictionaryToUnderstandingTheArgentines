package com.singlar.dictionarytounderstandingtheargentines;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_WORD = "com.singlar.dictionarytounderstandingtheargentines.WORD";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	/** Called when the user clicks the Search button */
	public void searchWord(View view) {
		// Do something in response to button
		Intent intent = new Intent(this, DisplayResultActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_word);
		String word = editText.getText().toString();
		intent.putExtra(EXTRA_WORD, word);
		startActivity(intent);
		
	}

}
