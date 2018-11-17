package com.hzit.wxnet.service.vo.tag;

import java.io.Serializable;
import java.util.List;

public class TagListVo implements Serializable {
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "TagListVo{" +
                "tags=" + tags +
                '}';
    }
}
