package com.zlx.module_network.util;

import android.app.Application;

/**
 * FileName: UtilsBridge
 * Created by zlx on 2020/9/22 10:22
 * Email: 1170762202@qq.com
 * Description:
 */
public class UtilsBridge {

    public static Application getApplicationByReflect() {
        return Utils.getInstance().getApplicationByReflect();
    }
}
