package com.tul.project_news_2;

import java.util.ArrayList;

public class DetailNews {

    private String status;
    private String totalNews;

    private ArrayList<NewsModal> articles;

    public DetailNews(String status, String totalNews, ArrayList<NewsModal> articles) {
        this.status = status;
        this.totalNews = totalNews;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalNews() {
        return totalNews;
    }

    public void setTotalNews(String totalNews) {
        this.totalNews = totalNews;
    }

    public ArrayList<NewsModal> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<NewsModal> articles) {
        this.articles = articles;
    }
}
