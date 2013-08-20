package com.jiahaoliuliu.android.dynamicresourcegetter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView)findViewById(R.id.textView);
		
		String appName = "app_name";
		String actionSettings = "action_settings";
		String helloWorld = "hello_world";
		String notExistenceResource = "not_exists";
		
		int appNameId = getResources().getIdentifier(appName, "string", getApplicationInfo().packageName);
		int actionSettingsId = getResources().getIdentifier(actionSettings, "string", getApplicationInfo().packageName);
		int helloWorldId = getResources().getIdentifier(helloWorld, "string", getApplicationInfo().packageName);
		int notExistenceResourceId = getResources().getIdentifier(notExistenceResource, "string", getApplicationInfo().packageName);
		
		textView.setText(
				"This application called " + getResources().getString(appNameId) + "\n" +
				"has an setting menu called " + getResources().getString(actionSettingsId) + "\n" +
				"and by default it shows " + getResources().getString(helloWorldId) + "\n\n" + 
				"Resource not found id " + notExistenceResourceId + " (Not valid).");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
