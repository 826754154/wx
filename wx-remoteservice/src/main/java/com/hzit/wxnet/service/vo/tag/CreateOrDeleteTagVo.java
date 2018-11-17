package com.hzit.wxnet.service.vo.tag;

import java.util.ArrayList;
import java.util.List;

public class CreateOrDeleteTagVo {
    private List<String> openid_list;
    private int tagid;

    public CreateOrDeleteTagVo() {
        openid_list=new ArrayList<>();
    }

    public void setOpenid_list(List<String> openid_list) {
        this.openid_list = openid_list;
    }
    public List<String> getOpenid_list() {
        return openid_list;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }
    public int getTagid() {
        return tagid;
    }
}
