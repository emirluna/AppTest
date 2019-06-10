
package com.example.testlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestLogin {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("rol")
    @Expose
    private String rol;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestLogin() {
    }

    /**
     * 
     * @param email
     * @param name
     * @param rol
     * @param password
     */
    public RequestLogin(String name, String email, String password, String rol) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.rol = rol;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
