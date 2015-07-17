package com.example.weChar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("TaskID"+getTaskId());
		sp = getSharedPreferences("config", 0);
		boolean result = sp.getBoolean("isEnter", false);
		if (result) {
			// 说明第二页面已经进入过
			// (1)第一次进入的话 就进入到第二个页面 三秒钟之后
			new Handler().postDelayed(new Runnable() {

				@Override
				public void run() {
					Intent intent = new Intent(MainActivity.this,
							ThirdActivity.class);
					startActivity(intent);
					finish();
				}
			}, 3000);

		} else {
			// (2)三秒之后
			new Handler().postDelayed(new Runnable() {

				@Override
				public void run() {
					Intent intent = new Intent(MainActivity.this,
							SecondActivity.class);
					startActivity(intent);
				}
			}, 3000);
			finish();

		}
	}

}
