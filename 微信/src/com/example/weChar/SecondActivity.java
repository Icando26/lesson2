package com.example.weChar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		sp = getSharedPreferences("config", 0);
	}

	// 点击按钮进入到微信zhilv
	public void click(View v) {
		Intent intent = new Intent(this,ThirdActivity.class);
		startActivity(intent);

		sp.edit().putBoolean("isEnter", true).commit();
		finish();
	}
}
