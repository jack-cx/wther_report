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
		showtext.setText("ʡ��:"+province+"\n"+"ʡ�᣺"+ctiy+"\n"+"����¶ȣ�"+temp1+"\n"+"����¶ȣ�"+temp2+"\n"+"���"+windstate);
	}

}
