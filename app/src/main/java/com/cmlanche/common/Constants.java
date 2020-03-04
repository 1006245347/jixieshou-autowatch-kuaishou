package com.cmlanche.common;

import com.cmlanche.jixieshou.R;
import com.cmlanche.model.AppInfo;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final String pkg_douyin  = "com.ss.android.ugc.aweme";
    public static final String pkg_kuaishou = "com.smile.gifmaker";
    public static final String pkg_kuaishou_fast = "com.kuaishou.nebula";
    public static final String pkg_douyin_fast = "com.ss.android.ugc.aweme.lite";
    public static final int defaultPeriod = 1;


    public static final List<AppInfo> appInfos = new ArrayList<>();

    static {


        AppInfo appInfo1 = new AppInfo();
        appInfo1.setName("抖音短视频");
        appInfo1.setAppName("抖音");
        appInfo1.setIcon(R.drawable.dy);
        appInfo1.setPkgName(pkg_douyin);
        appInfo1.setPeriod(100);
        appInfo1.setFree(true);

        AppInfo appInfo2 = new AppInfo();
        appInfo2.setName("快手");
        appInfo2.setAppName("快手");
        appInfo2.setIcon(R.drawable.ks);
        appInfo2.setPkgName(pkg_kuaishou);
        appInfo2.setPeriod(100);
        appInfo2.setFree(true);

        AppInfo appInfo3 = new AppInfo();
        appInfo3.setName("快手极速版");
        appInfo3.setAppName("快手极速版");
        appInfo3.setIcon(R.drawable.ks_fast);
        appInfo3.setPkgName(pkg_kuaishou_fast);
        appInfo3.setPeriod(100);
        appInfo3.setFree(true);

        AppInfo appInfo4 = new AppInfo();
        appInfo4.setName("抖音极速");
        appInfo4.setAppName("抖音极速");
        appInfo4.setIcon(R.drawable.dy_fast);
        appInfo4.setPkgName(pkg_douyin_fast);
        appInfo4.setPeriod(100);
        appInfo4.setFree(true);



        appInfos.add(appInfo1);
        appInfos.add(appInfo2);
        appInfos.add(appInfo3);
        appInfos.add(appInfo4);

    }


}
