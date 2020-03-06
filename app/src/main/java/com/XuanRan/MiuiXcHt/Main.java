package com.XuanRan.MiuiXcHt;

import de.robv.android.xposed.*;
import de.robv.android.xposed.callbacks.*;
import de.robv.android.xposed.XC_MethodHook.*;


public class Main implements IXposedHookLoadPackage
{
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable
    {
        if(loadPackageParam.packageName.equals("com.miui.gallery")){
            
            XposedHelpers.findAndHookMethod("com.miui.gallery.editor.photo.app.filter.skytransfer.SkyLibResVersionHelper",loadPackageParam.classLoader,"isSupportDynamicSkylnner",new XC_MethodHook(){
                   
                     @Override
                    protected void afterHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable
                      {
                        super.afterHookedMethod(param);
                        param.setResult(true);
                    }
            });
        }
        
    }
}

