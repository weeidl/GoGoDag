package com.weeidl.gogodag.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecentsData {

    private String placeName;
    private String countryName;
    private String price;
    private String description;
    private List<Integer> imageUrls;
    private Integer stars;

    public RecentsData(String placeName, String countryName, String price, String description, Integer stars, Integer... imageUrls) {
        this.placeName = placeName;
        this.countryName = countryName;
        this.price = price;
        this.imageUrls = new ArrayList<>(Arrays.asList(imageUrls));
        this.description = description;
        this.stars = stars;
    }

    public String getPlaceName() {
        return placeName;
    }

    public List<Integer> getImageUrls() {
        return imageUrls;
    }

    public String getDescription(){
        return description;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPrice() {
        return price;
    }

    public int getStars() { return stars; }



    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setImageUrls(List<Integer> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public void setImageUrls(Integer... imageUrls) { this.imageUrls = new ArrayList<>(Arrays.asList(imageUrls)); }

    public void setDescription(String description) { this.description = description; }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void addImageUrl(Integer imageUrl){ imageUrls.add(imageUrl); }

    public void setStars(int stars){ this.stars = stars; }
}