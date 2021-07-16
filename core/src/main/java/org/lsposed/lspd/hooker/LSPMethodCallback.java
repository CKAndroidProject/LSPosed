package org.lsposed.lspd.hooker;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XCallback;

public abstract class LSPMethodCallback extends XCallback {
    public LSPMethodCallback(int priority) {
        super(priority);
    }

    public LSPMethodCallback() {
        super();
    }

    protected abstract void beforeHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable;

    protected abstract void afterHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable;
}
