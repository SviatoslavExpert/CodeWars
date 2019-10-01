package com.granovskiy;

public class Kata {
    public static String greet(String language){
        String result = "";
        if (language == "english" || language == "IP_ADDRESS_INVALID"
                || language == "IP_ADDRESS_NOT_FOUND"
                || language == "IP_ADDRESS_REQUIRED") {
            result = "Welcome";
        }
        if (language == "czech") {
            result = "Vitejte";
        }
        if (language == "danish") {
            result = "Velkomst";
        }
        if (language == "dutch") {
            result = "Welkom";
        }
        if (language == "estonian") {
            result = "Tere tulemast";
        }
        if (language == "finnish") {
            result = "Tervetuloa";
        }
        if (language == "flemish") {
            result = "Welgekomen";
        }
        if (language == "french") {
            result = "Bienvenue";
        }
        if (language == "german") {
            result = "Willkommen";
        }
        if (language == "irish") {
            result = "Failte";
        }
        if (language == "italian") {
            result = "Benvenuto";
        }
        if (language == "latvian") {
            result = "Gaidits";
        }
        if (language == "lithuanian") {
            result = "Laukiamas";
        }
        if (language == "polish") {
            result = "Witamy";
        }
        if (language == "spanish") {
            result = "Bienvenido";
        }
        if (language == "swedish") {
            result = "Valkommen";
        }
        if (language == "welsh") {
            result = "Croeso";
        }
        return result;
    }
}
