package ru.kryptex.contactmanager;

import android.net.Uri;

public class Contact {

    private String name, phone, email, address;
    private Uri imageUri;
    private int id;

//    public Contact (String name) {
//        this.name = name;
//    }

    public Contact (int id, String name, String phone, String email, String address, Uri uri) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        imageUri = uri;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Uri getImageUri() {
        return imageUri;
    }

}
