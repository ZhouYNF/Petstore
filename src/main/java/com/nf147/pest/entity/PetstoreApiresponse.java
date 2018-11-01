package com.nf147.pest.entity;

public class PetstoreApiresponse {
    private Integer ar_code;

    private String ar_type;

    private String ar_message;

    public Integer getAr_code() {
        return ar_code;
    }

    public void setAr_code(Integer ar_code) {
        this.ar_code = ar_code;
    }

    public String getAr_type() {
        return ar_type;
    }

    public void setAr_type(String ar_type) {
        this.ar_type = ar_type == null ? null : ar_type.trim();
    }

    public String getAr_message() {
        return ar_message;
    }

    public void setAr_message(String ar_message) {
        this.ar_message = ar_message == null ? null : ar_message.trim();
    }
}