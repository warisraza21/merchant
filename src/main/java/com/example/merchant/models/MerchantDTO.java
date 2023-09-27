package com.example.merchant.models;

public class MerchantDTO {
    private String merchantId;
    private String name;
    private String email;
    private String businessType;
    private String address;
    private String phone;

    public MerchantDTO() {
    }

    public MerchantDTO(String merchantId, String name, String email, String businessType, String address, String phone) {
        this.merchantId = merchantId;
        this.name = name;
        this.email = email;
        this.businessType = businessType;
        this.address = address;
        this.phone = phone;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
