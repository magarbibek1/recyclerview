package com.bibek.recyclerview;

public class contacts {
    private String Name ;
    private String Phone;
    private int ImageId;

    public contacts(String name, String phone, int imageId) {
        this.Name = name;
        this.Phone = phone;
        this.ImageId = imageId;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int  getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
