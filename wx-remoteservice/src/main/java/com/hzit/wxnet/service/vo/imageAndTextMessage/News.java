package com.hzit.wxnet.service.vo.imageAndTextMessage;

import com.hzit.wxnet.service.vo.imageAndTextMessage.Article;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class News implements Serializable {
    private List<Article> articles;

    public News(List<Article> articles) {
        this.articles = articles;
    }

    public News() {
        articles=new ArrayList<>();

    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
