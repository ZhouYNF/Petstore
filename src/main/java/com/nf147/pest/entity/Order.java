package com.nf147.pest.entity;

public class Order {
    private Integer or_id;

    private Integer or_quantity;

    private String or_shipDate;

    private String or_status;

    private byte[] or_complete;

    private Pet pet;

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Integer getOr_quantity() {
        return or_quantity;
    }

    public void setOr_quantity(Integer or_quantity) {
        this.or_quantity = or_quantity;
    }

    public String getOr_shipDate() {
        return or_shipDate;
    }

    public void setOr_shipDate(String or_shipDate) {
        this.or_shipDate = or_shipDate == null ? null : or_shipDate.trim();
    }

    public String getOr_status() {
        return or_status;
    }

    public void setOr_status(String or_status) {
        this.or_status = or_status == null ? null : or_status.trim();
    }

    public byte[] getOr_complete() {
        return or_complete;
    }

    public void setOr_complete(byte[] or_complete) {
        this.or_complete = or_complete;
    }
}