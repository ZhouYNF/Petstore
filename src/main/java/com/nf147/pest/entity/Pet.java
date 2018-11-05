package com.nf147.pest.entity;

public class Pet {
    private Integer pet_id;     //ID

    private String pet_name;    //名字

    private String pet_photoUrls;   //图片

    private String pet_status;  //状态

    private int pet_category_id;

    private int pet_tags_id;

    /*private Category petstoreCategory;  //类型

    private Tag petstoreTag;    //标签
*/
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

  /*  public Category getPetstoreCategory() {
        return petstoreCategory;
    }

    public void setPetstoreCategory(Category petstoreCategory) {
        this.petstoreCategory = petstoreCategory;
    }

    public Tag getPetstoreTag() {
        return petstoreTag;
    }

    public void setPetstoreTag(Tag petstoreTag) {
        this.petstoreTag = petstoreTag;
    }
*/

    public int getPet_category_id() {
        return pet_category_id;
    }

    public void setPet_category_id(int pet_category_id) {
        this.pet_category_id = pet_category_id;
    }

    public int getPet_tags_id() {
        return pet_tags_id;
    }

    public void setPet_tags_id(int pet_tags_id) {
        this.pet_tags_id = pet_tags_id;
    }
}