package com.tul.project_news_2;

public class NewsModal {

    private String author,title,desc,url, urlToImage,published;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {

        this.urlToImage = urlToImage;
    }

    public String getPublished() {

        return published;
    }

    public void setPublished(String published) {

        this.published = published;
    }

    public NewsModal(String author, String title, String desc, String url, String urlToImage, String published) {
        this.author = author;
        this.title = title;
        this.desc = desc;
        this.url = url;
        this.urlToImage = urlToImage;
        this.published = published;
    }

}
