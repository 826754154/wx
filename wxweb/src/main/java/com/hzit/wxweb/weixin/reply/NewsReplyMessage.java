package com.hzit.wxweb.weixin.reply;


import com.alibaba.fastjson.annotation.JSONField;
import com.hzit.wxweb.weixin.reply.node.Articles;
import com.hzit.wxweb.weixin.reply.node.NewsItem;




public class NewsReplyMessage extends BaseReplyMessage{

    @JSONField(name="Articles")
    private Articles articles;

    @JSONField(name="ArticleCount")
    private Integer articleCount;

    public NewsReplyMessage() {
        articles= new Articles();
    }

    public Articles getArticles() {
        return articles;
    }

    public void addNewsItem(NewsItem item){
        articles.getItem().add(item);
    }

    public void setArticles(Articles articles) {
        this.articles = articles;
    }

    @Override
    public String initType() {
        return "news";
    }



    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }
}
