package com.example.dbproject.entity;

import java.util.Date;

public class Steam {
    private Integer appid;

    private String name;

    private Date release_date;

    private Integer english;

    private String developer;

    private String publisher;

    private String platforms;

    private Integer required_age;

    private String categories;

    private String genres;

    private String steamspy_tags;

    private Integer achievements;

    private Integer positive_ratings;

    private Integer negative_ratings;

    private Integer average_playtime;

    private Integer median_playtime;

    private String owners;

    private String price;

    //以下都是外键
    private String header_image;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Integer getRequired_age() {
        return required_age;
    }

    public void setRequired_age(Integer required_age) {
        this.required_age = required_age;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getSteamspy_tags() {
        return steamspy_tags;
    }

    public void setSteamspy_tags(String steamspy_tags) {
        this.steamspy_tags = steamspy_tags;
    }

    public Integer getAchievements() {
        return achievements;
    }

    public void setAchievements(Integer achievements) {
        this.achievements = achievements;
    }

    public Integer getPositive_ratings() {
        return positive_ratings;
    }

    public void setPositive_ratings(Integer positive_ratings) {
        this.positive_ratings = positive_ratings;
    }

    public Integer getNegative_ratings() {
        return negative_ratings;
    }

    public void setNegative_ratings(Integer negative_ratings) {
        this.negative_ratings = negative_ratings;
    }

    public Integer getAverage_playtime() {
        return average_playtime;
    }

    public void setAverage_playtime(Integer average_playtime) {
        this.average_playtime = average_playtime;
    }

    public Integer getMedian_playtime() {
        return median_playtime;
    }

    public void setMedian_playtime(Integer median_playtime) {
        this.median_playtime = median_playtime;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHeader_image() {
        return header_image;
    }

    public void setHeader_image(String header_image) {
        this.header_image = header_image;
    }
}
