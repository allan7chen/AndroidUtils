package com.example.allan.androidutils;

import android.text.TextUtils;

/**
 * Created by yunfei.chen on 3/5/18.
 */

public class SmartUtils {

    public static boolean isVaild(String string) {
        return !TextUtils.isEmpty(string);
    }
}
