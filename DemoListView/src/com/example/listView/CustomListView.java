package com.example.listView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomListView extends ListView {

	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST) ;
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
