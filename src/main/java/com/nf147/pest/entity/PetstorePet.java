package com.nf147.pest.entity;

public class PetstorePet {
    private Integer pet_id;     //ID

    private String pet_name;    //名字

    private String pet_photoUrls;   //图片

    private String pet_status;  //状态

    private PetstoreCategory petstoreCategory;  //类型

    private PetstoreTag petstoreTag;    //标签

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_photoUrls() {
        return pet_photoUrls;
    }

    public void setPet_photoUrls(String pet_photoUrls) {
        this.pet_photoUrls = pet_photoUrls;
    }

    public String getPet_status() {
        return pet_status;
    }

    public void setPet_status(String pet_status) {
        this.pet_status = pet_status;
    }

    public PetstoreCategory getPetstoreCategory() {
        return petstoreCategory;
    }

    public void setPetstoreCategory(PetstoreCategory petstoreCategory) {
        this.petstoreCategory = petstoreCategory;
    }

    public PetstoreTag getPetstoreTag() {
        return petstoreTag;
    }

    public void setPetstoreTag(PetstoreTag petstoreTag) {
        this.petstoreTag = petstoreTag;
    }
}