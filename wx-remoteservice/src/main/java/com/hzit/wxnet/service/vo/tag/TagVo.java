package com.hzit.wxnet.service.vo.tag;

import java.io.Serializable;

public class TagVo implements Serializable {

    private Tag tag;
    public void setTag(Tag tag) {
        this.tag = tag;
    }
    public Tag getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "TagVo{" +
                "tag=" + tag +
                '}';
    }
}
