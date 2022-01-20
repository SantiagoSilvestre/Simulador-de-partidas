package me.san.simulator.service;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientJava {
    private static Retrofit retrofit;
    private static String baseUrl = "https://santiagosilvestre.github.io/matches-simulator-api/";

    public static Retrofit getInstance() {
        if (retrofit != null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
