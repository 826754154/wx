package com.hzit.wxweb.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JiandaoShitouBu {
    public static List<String> test(String clickContent){
        String ranContent[]={"剪刀","石头","布"};
        String url[]={"https://bucketzhangwentao.oss-cn-beijing.aliyuncs.com/1.png","https://bucketzhangwentao.oss-cn-beijing.aliyuncs.com/2.png","https://bucketzhangwentao.oss-cn-beijing.aliyuncs.com/3.png"};
        int i=new Random().nextInt(3);
        String responseText=null;
        String picurl=null;
        List<String> responseList = new ArrayList<>();
        if (clickContent.equals("jiandao")){
            if (ranContent[i].equals("剪刀")){
                 responseText="麦兜出的是：剪刀"+"\n"+"我出的是：剪刀"+"\n"+"平局";
                picurl=url[1];
            }
            if (ranContent[i].equals("石头")){
                responseText="麦兜出的是：石头"+"\n"+"我出的是：剪刀"+"\n"+"你输了";
                picurl=url[0];
            }
            if (ranContent[i].equals("布")){
                responseText="麦兜出的是：布"+"\n"+"我出的是：剪刀"+"\n"+"你赢了";
                picurl=url[2];
            }
        }else if (clickContent.equals("shitou")){
            if (ranContent[i].equals("剪刀")){
                responseText="麦兜出的是：剪刀"+"\n"+"我出的是：石头"+"\n"+"你赢了";
                picurl=url[2];
            }
            if (ranContent[i].equals("石头")){
                responseText="麦兜出的是：石头"+"\n"+"我出的是：石头"+"\n"+"平局";
                picurl=url[1];
            }
            if (ranContent[i].equals("布")){
                responseText= "麦兜出的是：布"+"\n"+"我出的是：石头"+"\n"+"你输了";
                picurl=url[0];
            }
        }else if (clickContent.equals("bu")){
            if (ranContent[i].equals("剪刀")){
                responseText= "麦兜出的是：剪刀"+"\n"+"我出的是：布"+"\n"+"你输了";
                picurl=url[0];
            }
            if (ranContent[i].equals("石头")){
                responseText= "麦兜出的是：石头"+"\n"+"我出的是：布"+"\n"+"你赢了";
                picurl=url[2];

            }
            if (ranContent[i].equals("布")){
                responseText= "麦兜出的是：布"+"\n"+"我出的是：布"+"\n"+"平局";
                picurl=url[1];
            }
        }
        responseList.add(0,responseText);
        responseList.add(1,picurl);
        return responseList;
    }
}
