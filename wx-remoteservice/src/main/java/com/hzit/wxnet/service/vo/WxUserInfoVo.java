package com.hzit.wxnet.service.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class WxUserInfoVo implements Serializable {
    @Override
    public String toString() {
        return "WxUserInfoVo{" +
                "subscribe=" + subscribe +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", subscribe_time=" + subscribe_time +
                ", unionid='" + unionid + '\'' +
                ", remark='" + remark + '\'' +
                ", groupid=" + groupid +
                ", tagid_list=" + tagid_list +
                ", subscribe_scene='" + subscribe_scene + '\'' +
                ", qr_scene=" + qr_scene +
                ", qr_scene_str='" + qr_scene_str + '\'' +
                '}';
    }

    private int subscribe;
        private String openid;
        private String nickname;
        private int sex;
        private String language;
        private String city;
        private String province;
        private String country;
        private String headimgurl;
        private long subscribe_time;
        private String unionid;
        private String remark;
        private int groupid;
        private String tagid_list;
        private String subscribe_scene;
        private long qr_scene;
        private String qr_scene_str;


        public void setSubscribe(int subscribe) {
            this.subscribe = subscribe;
        }
        public int getSubscribe() {
            return subscribe;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }
        public String getOpenid() {
            return openid;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
        public String getNickname() {
            return nickname;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
        public int getSex() {
            return sex;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
        public String getLanguage() {
            return language;
        }

        public void setCity(String city) {
            this.city = city;
        }
        public String getCity() {
            return city;
        }

        public void setProvince(String province) {
            this.province = province;
        }
        public String getProvince() {
            return province;
        }

        public void setCountry(String country) {
            this.country = country;
        }
        public String getCountry() {
            return country;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }
        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setSubscribe_time(long subscribe_time) {
            this.subscribe_time = subscribe_time;
        }
        public long getSubscribe_time() {
            return subscribe_time;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }
        public String getUnionid() {
            return unionid;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
        public String getRemark() {
            return remark;
        }

        public void setGroupid(int groupid) {
            this.groupid = groupid;
        }
        public int getGroupid() {
            return groupid;
        }

    public String getTagid_list() {
        return tagid_list;
    }

    public void setTagid_list(String tagid_list) {
        this.tagid_list = tagid_list;
    }

    public void setSubscribe_scene(String subscribe_scene) {
            this.subscribe_scene = subscribe_scene;
        }
        public String getSubscribe_scene() {
            return subscribe_scene;
        }

        public void setQr_scene(long qr_scene) {
            this.qr_scene = qr_scene;
        }
        public long getQr_scene() {
            return qr_scene;
        }

        public void setQr_scene_str(String qr_scene_str) {
            this.qr_scene_str = qr_scene_str;
        }
        public String getQr_scene_str() {
            return qr_scene_str;
        }


}
