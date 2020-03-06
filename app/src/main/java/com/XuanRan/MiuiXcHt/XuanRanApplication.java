package com.XuanRan.MiuiXcHt;
import android.app.*;

public class XuanRanApplication extends Application
{

	@Override
	public void onCreate()
	{
		super.onCreate();
		com.XuanRan.Exception.Handing.CrashHandler.init(this,"/sdcard/XuanRan/"+"NoKnow Log"+"/Log/");
	}
	
}
