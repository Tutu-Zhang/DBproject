package com.example.dbproject.entity;

import java.util.Date;

public class SteamDetailed {
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
    private String detailed_description;

    private String about_the_game;

    private String short_description;

    private String header_image;

    private String screenshots;

    private String background;

    private String movies;

    private String pc_requirements;

    private String mac_requirements;

    private String linux_requirements;

    private String minimum;

    private String recommended;

    private String website;

    private String support_url;

    private String support_email;

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

    public String getDetailed_description() {
        return detailed_description;
    }

    public void setDetailed_description(String detailed_description) {
        this.detailed_description = detailed_description;
    }

    public String getAbout_the_game() {
        return about_the_game;
    }

    public void setAbout_the_game(String about_the_game) {
        this.about_the_game = about_the_game;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getHeader_image() {
        return header_image;
    }

    public void setHeader_image(String header_image) {
        this.header_image = header_image;
    }

    public String getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(String screenshots) {
        this.screenshots = screenshots;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public String getPc_requirements() {
        return pc_requirements;
    }

    public void setPc_requirements(String pc_requirements) {
        this.pc_requirements = pc_requirements;
    }

    public String getMac_requirements() {
        return mac_requirements;
    }

    public void setMac_requirements(String mac_requirements) {
        this.mac_requirements = mac_requirements;
    }

    public String getLinux_requirements() {
        return linux_requirements;
    }

    public void setLinux_requirements(String linux_requirements) {
        this.linux_requirements = linux_requirements;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSupport_url() {
        return support_url;
    }

    public void setSupport_url(String support_url) {
        this.support_url = support_url;
    }

    public String getSupport_email() {
        return support_email;
    }

    public void setSupport_email(String support_email) {
        this.support_email = support_email;
    }
}
