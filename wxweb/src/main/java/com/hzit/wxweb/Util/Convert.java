package com.hzit.wxweb.Util;

import org.json.XML;

public class Convert {
    /**
     * xml字符串转JSON字符串
     */
    public static String xmlToJson(String xml){
       return XML.toJSONObject(xml).toString();
    }



    /**
     * JSON字符串转xml字符串
     */
    public static String jsonToXml(String json){
        //创建一个org.json下面的JsonObject对象
        org.json.JSONObject source=new org.json.JSONObject(json);

       return XML.toString(source);
    }
}
