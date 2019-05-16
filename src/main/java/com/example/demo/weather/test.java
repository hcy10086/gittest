package com.example.demo.weather;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;

public class test {
    private static String name=null;
    public static String get_weather(String name){
        if(name==null||name.length()==0){
            return null;
        }
        ByteArrayOutputStream out = null;
        GZIPInputStream gip=null;
        String json=null;
        try {
            String s="http://wthrcdn.etouch.cn/weather_mini?city="+URLEncoder.encode(name, "utf-8");
            //String s="http://wthrcdn.etouch.cn/weather_mini?citykey=101210101";
            URL realUrl = new URL(s);
            gip = new GZIPInputStream(realUrl.openStream());
            out = new ByteArrayOutputStream();
            byte []buffer = new byte[1024];
            int len ;
            while((len = gip.read(buffer))!=-1){
                out.write(buffer, 0, len);
            }
            json=new String(out.toByteArray(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try {
                if(out != null){
                    out.close();
                }
                if(gip != null){
                    gip.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //weather d = JSON.parseObject(json, weather.class);
        return json;
    }
    public static String get_weather(){
        if(name!=null)
            return test.get_weather(name);
        else
            return null;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        test.name = name;
    }
}
