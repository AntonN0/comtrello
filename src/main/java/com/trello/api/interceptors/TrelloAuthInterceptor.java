package com.trello.api.interceptors;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by lolik on 03.02.17.
 */
public class TrelloAuthInterceptor implements Interceptor {


    private static final String KEY = "893c8615b80674e3a1cad250e02e1666";
    private static final String TOKEN = "eb7650d55aa8c17a0dbaca1971f2b2e5c55dec00e5ec96a316fc95729658e582";


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("key", KEY)
                .addQueryParameter("token", TOKEN)
                .build();

        // Request customization: add request headers
        Request.Builder requestBuilder = original.newBuilder()
                .url(url);

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }


}
