package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_anim);
		/*
		 * ImageView iv_anim = (ImageView) findViewById(R.id.iv_anim);
		 * 
		 * iv_anim.setBackgroundResource(R.drawable.animation_test);
		 * AnimationDrawable iv = (AnimationDrawable) iv_anim.getBackground();
		 * iv.start();
		 */
		iv = (ImageView) findViewById(R.id.iv);
	}

	// ͸������
	public void click1(View v) {
		/**
		 * fromAlpha 1.0������ȫ��͸�� toAlpha 0.0 ��ȫ͸��
		 */
		AlphaAnimation aa = new AlphaAnimation(1.0f, 0.0f);
		aa.setDuration(2000);// ����ִ��ʱ��
		aa.setRepeatCount(1);// �ظ�ִ�д���
		aa.setRepeatMode(Animation.REVERSE);

		iv.startAnimation(aa);
	}

	// ���Ŷ���
	public void click2(View v) {
		ScaleAnimation sa = new ScaleAnimation(0.1f, 2.0f, 0.1f, 2.0f,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		sa.setDuration(2000);
		sa.setRepeatCount(1);

		sa.setRepeatMode(Animation.REVERSE);
		iv.startAnimation(sa);
	}

	// ��ת����
	public void click3(View v) {
		RotateAnimation ra = new RotateAnimation(0, 360);
		ra.setDuration(2000);
		ra.setRepeatCount(1);
		iv.startAnimation(ra);
	}

	// λ�ƶ���
	public void click4(View v) {
		TranslateAnimation ta = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -0.5f,
				Animation.RELATIVE_TO_PARENT, 0.5f,
				Animation.RELATIVE_TO_PARENT, -0.5f,
				Animation.RELATIVE_TO_PARENT, 0.5f);
		ta.setDuration(2000);
		ta.setRepeatCount(1);

		ta.setRepeatMode(Animation.REVERSE);
		iv.startAnimation(ta);
	}

	// һ���
	public void click5(View v) {
		AnimationSet set = new AnimationSet(false);

		RotateAnimation ra = new RotateAnimation(0, 360);
		ra.setDuration(2000);
		ra.setRepeatCount(1);
		iv.startAnimation(ra);

		TranslateAnimation ta = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -0.5f,
				Animation.RELATIVE_TO_PARENT, 0.5f,
				Animation.RELATIVE_TO_PARENT, -0.5f,
				Animation.RELATIVE_TO_PARENT, 0.5f);
		ta.setDuration(2000);
		ta.setRepeatCount(1);

		ta.setRepeatMode(Animation.REVERSE);
		iv.startAnimation(ta);

		ScaleAnimation sa = new ScaleAnimation(0.1f, 2.0f, 0.1f, 2.0f,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		sa.setDuration(2000);
		sa.setRepeatCount(1);
		sa.setRepeatMode(Animation.REVERSE);
		iv.startAnimation(sa);

		AlphaAnimation aa = new AlphaAnimation(1.0f, 0.0f);
		aa.setDuration(2000);// ����ִ��ʱ��
		aa.setRepeatCount(1);// �ظ�ִ�д���
		aa.setRepeatMode(Animation.REVERSE);

		iv.startAnimation(aa);

		set.addAnimation(sa);
		set.addAnimation(aa);
		set.addAnimation(ta);
		set.addAnimation(aa);
	}
}
