package com.hzit.wxnet.service.vo.imageAndTextMessage;

import com.hzit.wxnet.service.vo.MessageVo;

import java.io.Serializable;

public class ImageAndTextMessageVo extends MessageVo implements Serializable {
    private News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}



