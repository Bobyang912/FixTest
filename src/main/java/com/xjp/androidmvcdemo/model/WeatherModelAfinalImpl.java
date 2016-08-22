package com.xjp.androidmvcdemo.model;

import android.util.Log;

/**
 * Description:从网络获取天气信息接口实现
 * User: xjp
 * Date: 2015/6/3
 * Time: 15:40
 */

public class WeatherModelAfinalImpl implements WeatherModel {
    private static final String TAG = "WeatherModelAfinalImpl";
    @Override
    public void getWeather(String cityNumber, final OnWeatherListener listener) {
        
//        listener.onSuccess();
        Log.e(TAG, "getWeather: ");

//        /*数据层操作*/
//        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/data/sk/" + cityNumber + ".html",
//                Weather.class, new Response.Listener<Weather>() {
//                    @Override
//                    public void onResponse(Weather weather) {
//                        if (weather != null) {
//                            listener.onSuccess(weather);
//                        } else {
//                            listener.onError();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        listener.onError();
//                    }
//                });
    }
}
