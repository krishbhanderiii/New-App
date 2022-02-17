package com.news.ne_uz.News;

public class News {
    private String source;
    private String author;
    private String title;
    private String url;
    private String urlToImage;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

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

    public News(String source, String author, String title,  String url, String urlToImage) {
        this.source = source;
        this.author = author;
        this.title = title;

        this.url = url;
        this.urlToImage = urlToImage;
    }
}
