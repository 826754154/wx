package com.hzit.wxweb.weixin.reply.node;

import java.util.ArrayList;
import java.util.List;

public class Articles {
    private List<NewsItem> item;

    public Articles() {
        item=new ArrayList<>();
    }

    public Articles(List<NewsItem> item) {
        this.item = item;
    }

    public List<NewsItem> getItem() {

        return item;
    }

    public void setItem(List<NewsItem> item) {
        this.item = item;
    }
}
