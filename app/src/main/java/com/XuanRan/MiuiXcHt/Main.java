package com.XuanRan.MiuiXcHt;

import de.robv.android.xposed.*;
import de.robv.android.xposed.callbacks.*;


public class Main implements IXposedHookLoadPackage
{
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable
    {
        if(loadPackageParam.packageName.equals("")){
            Class<?> clazz=XposedHelpers.findClass("",loadPackageParam.classLoader);
            
        }
    }
}
