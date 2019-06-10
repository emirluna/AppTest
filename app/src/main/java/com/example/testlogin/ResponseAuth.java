
package com.example.testlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAuth {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("rol")
    @Expose
    private String rol;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseAuth() {
    }

    /**
     * 
     * @param nombre
     * @param email
     * @param token
     * @param rol
     * @param success
     */
    public ResponseAuth(Boolean success, String token, String nombre, String email, String rol) {
        super();
        this.success = success;
        this.token = token;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ResponseAuth withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ResponseAuth withToken(String token) {
        this.token = token;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ResponseAuth withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ResponseAuth withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ResponseAuth withRol(String rol) {
        this.rol = rol;
        return this;
    }

}
