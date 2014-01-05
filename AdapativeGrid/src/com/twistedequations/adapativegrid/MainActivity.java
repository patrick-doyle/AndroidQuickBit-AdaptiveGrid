package com.twistedequations.adapativegrid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	GridView gridview;
	String[] array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gridview = (GridView) findViewById(R.id.gridView);
		array = this.getResources().getStringArray(R.array.gridViewStrings);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.grid_row ,R.id.textview , array);
		gridview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
