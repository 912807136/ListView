package com.example.listView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		ListView listView = (ListView) findViewById(R.id.listView1);
		String[] strs = { "test1", "test2", "test3", "test4", "test5", "test6",
				"test7", "test8", "test9", "test10", "test11", "test12",
				"test13" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, strs);
		listView.setAdapter(adapter);
	}

	public void startToSecond(View view) {
		startActivity(new Intent(this, SecondActivity.class));
	}

}
