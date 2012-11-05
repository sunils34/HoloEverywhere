package com.WazaBe.HoloEverywhere.app;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.WazaBe.HoloEverywhere.LayoutInflater;
import com.WazaBe.HoloEverywhere.preference.SharedPreferences;
import com.actionbarsherlock.internal.view.menu.ContextMenuListener;

public interface BaseFragment extends ContextMenuListener {
	public SharedPreferences getDefaultSharedPreferences();

	public LayoutInflater getLayoutInflater();

	public LayoutInflater getLayoutInflater(Bundle savedInstanceState);

	public SharedPreferences getSharedPreferences(String name, int mode);

	public <T extends Activity & Base> T getSupportActivity();

	public FragmentManager getSupportFragmentManager();

	public boolean isABSSupport();

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState);

	public void onInflate(Activity activity, AttributeSet attrs,
			Bundle savedInstanceState);
}
