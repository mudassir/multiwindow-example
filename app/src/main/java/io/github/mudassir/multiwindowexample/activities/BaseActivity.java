package io.github.mudassir.multiwindowexample.activities;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

import com.github.mudassir.multiwindowexample.R;

import io.github.mudassir.multiwindowexample.MainActivity;

/**
 * Base activity that would log all the lifecycle stages.
 */
public abstract class BaseActivity extends AppCompatActivity {


	protected abstract String getTag();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(getTag(), getTag() + ": onCreate");
		setContentView(R.layout.activity_base);
		((TextView) findViewById(R.id.text)).setText(getIntent().getStringExtra(MainActivity.INTENT));
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.d(getTag(), getTag() + ": onRestoreInstanceState");
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		Log.d(getTag(), getTag() + ": onPostCreate");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(getTag(), getTag() + ": onStart");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(getTag(), getTag() + ": onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(getTag(), getTag() + ": onResume");
	}

	@Override
	protected void onPostResume() {
		super.onPostResume();
		Log.d(getTag(), getTag() + ": onPostResume");
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Log.d(getTag(), getTag() + ": onNewIntent");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(getTag(), getTag() + ": onSaveInstanceState");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(getTag(), getTag() + ": onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(getTag(), getTag() + ": onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(getTag(), getTag() + ": onDestroy");
	}

	@Override
	public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
		super.onMultiWindowModeChanged(isInMultiWindowMode);
		Log.d(getTag(), getTag() + ": onMultiWindowModeChanged");
	}

	@Override
	public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
		super.onPictureInPictureModeChanged(isInPictureInPictureMode);
		Log.d(getTag(), getTag() + ": onPictureInPictureModeChanged");
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		Log.d(getTag(), getTag() + ": onConfigurationChanged");
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		super.onAttachFragment(fragment);
		Log.d(getTag(), getTag() + ": onAttachFragment");
	}

	@Override
	public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
		super.onWindowAttributesChanged(params);
		Log.d(getTag(), getTag() + ": onWindowAttributesChanged");
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		Log.d(getTag(), getTag() + ": onWindowFocusChanged");
	}

	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		Log.d(getTag(), getTag() + ": onAttachedToWindow");
	}

	@Override
	public void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		Log.d(getTag(), getTag() + ": onDetachedFromWindow");
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.d(getTag(), getTag() + ": onActivityResult");
	}
}
