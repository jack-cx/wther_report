package com.wther_report;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.res.wether;
import com.webservice.getInternet;
import com.xmlservice.pullxml;

public class MainActivity extends Activity {

	List<wether> list = new ArrayList<wether>();
	getInternet getinternet = new getInternet();
	InputStream inputStream = getinternet.getInputStream();
	String province = null;
	pullxml wether_Xml = new pullxml();
	Button button = null;
	EditText editText = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		editText = (EditText) findViewById(R.id.provinve);

		button = (Button) findViewById(R.id.but);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				province = editText.getText().toString();
				try {
					list = wether_Xml.getListFromXml(inputStream, province);
				} catch (XmlPullParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wether wether = list.get(0);
				String quName = wether.getQuName();
				String city = wether.getCityname();
				String temp1 = wether.getTem1();
				String temp2 = wether.getTem2();
				String windstate = wether.getWindState();
				
				Intent intent = new Intent(MainActivity.this,
						show_weather.class);
				intent.putExtra("quname",quName);
				intent.putExtra("ctiy", city);
				intent.putExtra("temp1", temp1);
				intent.putExtra("temp2", temp2);
				intent.putExtra("windstate",windstate);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
