package com.example.matheus.starwarswiki;

import java.io.Serializable;

public class Characters implements Serializable {

    private String nName;
    private int nHeight;
    private int nMass;
    private String nHairColor;
    private String nSkinColor;
    private String nEyeColor;
    private String nBirthYear;


    public String getnName() {
        return nName;
    }

    public int getnHeight() {
        return nHeight;
    }

    public int getnMass() {
        return nMass;
    }

    public String getnHairColor() {
        return nHairColor;
    }

    public String getnSkinColor() {
        return nSkinColor;
    }

    public String getnEyeColor() {
        return nEyeColor;
    }

    public String getnBirthYear() {
        return nBirthYear;
    }
}
