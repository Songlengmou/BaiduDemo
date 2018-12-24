package com.demo.baidu.utils;

public final class Constants {
    /**
     * 语音导航ID
     */
    public static final String TTS_APP_ID = "10551810";
    /**
     * 轨迹服务ID
     */
    public static final long serviceId = 156788;

    public static final String TAG = "BaiduTraceSDK_V3";

    public static final int REQUEST_CODE = 1;

    public static final int RESULT_CODE = 1;

    public static final int REQUEST_QUERY_CODE = 2;

    public static final int RESULT_QUERY_CODE = 2;

    public static final int DEFAULT_RADIUS_THRESHOLD = 0;

    public static final int PAGE_SIZE = 5000;

    /**
     * 轨迹分析查询间隔时间（1分钟）
     */
    public static final int ANALYSIS_QUERY_INTERVAL = 60;

    /**
     * 停留点默认停留时间（1分钟）
     */
    public static final int STAY_TIME = 60;

    /**
     * 启动停留时间
     */
    public static final int SPLASH_TIME = 3000;

    /**
     * 默认采集周期
     */
    public static final int DEFAULT_GATHER_INTERVAL = 5;

    /**
     * 默认打包周期
     */
    public static final int DEFAULT_PACK_INTERVAL = 20;

    /**
     * 实时定位间隔(单位:秒)
     */
    public static final int LOC_INTERVAL = 5;

    /**
     * 最后一次定位信息
     */
    public static final String LAST_LOCATION = "last_location";

}
