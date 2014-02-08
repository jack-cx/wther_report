package com.xmlservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.R.integer;
import android.util.Log;

import com.res.wether;

public class pullxml {

	public List<wether> getListFromXml(InputStream inputStream, String quname)
			throws XmlPullParserException, IOException {
		List<wether> list = new ArrayList<wether>();
		wether Wether = null;

		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		XmlPullParser xpp = factory.newPullParser();

		xpp.setInput(inputStream, "utf-8");
		int eventype = xpp.getEventType();
		while (eventype != XmlPullParser.END_DOCUMENT) {
			while (eventype == XmlPullParser.START_TAG) {
				if ("city".equals(xpp.getName())) {
					String quName = xpp.getAttributeValue(0);
					String pyname = xpp.getAttributeValue(1);
					String cityname = xpp.getAttributeValue(2);
					String state1 = xpp.getAttributeType(3);
					String state2 = xpp.getAttributeValue(4);
					String stateDetailed = xpp.getAttributeValue(5);
					String term1 = xpp.getAttributeValue(6);
					String term2 = xpp.getAttributeValue(7);
					String windState = xpp.getAttributeValue(8);

					Wether = new wether(quName, pyname, cityname, state1,
							state2, stateDetailed, term1, term2, windState);

				}
				eventype = xpp.next();
				if (Wether != null && Wether.getQuName().equals(quname)) {
					list.add(Wether);
				}
			}
			eventype = xpp.next();
		}

		return list;
	}

	public pullxml() {
		// TODO Auto-generated constructor stub
	}
}
