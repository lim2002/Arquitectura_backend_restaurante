package com.example.msmenu.dto;

public class TokenDto {
    private String authToken;
    private String refreshToken;
    private int Type;
    private int id;

    public TokenDto() {
    }

    @Override
    public String toString() {
        return "TokenDto{" +
                "authToken='" + authToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", Type=" + Type +
                ", id=" + id +
                '}';
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
