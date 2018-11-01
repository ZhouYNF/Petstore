package com.nf147.pest.entity;

public class PetstoreCategory {
    private Integer cg_id;

    private String cg_name;

    public Integer getCg_id() {
        return cg_id;
    }

    public void setCg_id(Integer cg_id) {
        this.cg_id = cg_id;
    }

    public String getCg_name() {
        return cg_name;
    }

    public void setCg_name(String cg_name) {
        this.cg_name = cg_name == null ? null : cg_name.trim();
    }
}