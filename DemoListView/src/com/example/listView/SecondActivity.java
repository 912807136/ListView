package com.example.listView;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		initView();
	}

	private void initView() {
		ListView listView = (ListView) findViewById(R.id.listView1);
		Button button = new Button(this);
		button.setText("SecondActivity");
		button.setTextSize(20);
		listView.addHeaderView(button);
		String[] strs = {"test1","test2","test3","test4","test5","test6","test7","test8","test9","test10","test11","test12","test13"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs);
		listView.setAdapter(adapter);
	}

	

}
