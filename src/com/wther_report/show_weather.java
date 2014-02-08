package com.wther_report;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class show_weather extends Activity {
	TextView showtext = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_weather);
		showtext = (TextView) findViewById(R.id.show_wether);
		Intent intent = getIntent();
		String province = intent.getStringExtra("quname");
		String ctiy = intent.getStringExtra("ctiy");
		String temp1 = intent.getStringExtra("temp1");
		String temp2 = intent.getStringExtra("temp2");
		String windstate = intent.getStringExtra("windstate");
		showtext.setText("省份:"+province+"\n"+"省会："+ctiy+"\n"+"最低温度："+temp1+"\n"+"最高温度："+temp2+"\n"+"风况"+windstate);
	}

}
