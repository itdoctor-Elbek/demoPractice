package com.example.demoPractice.utils;

public enum Language {
    RU,
    EN,
    KG;

    public static Language getLanguage(int Ordinal){
        switch (Ordinal){
            case 1:
                return RU;
            case 2:
                return EN;
            case 3:
                return KG;
            default:
                return RU;
        }

    }
}
