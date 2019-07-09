///*
//package junk;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import okhttp3.Cookie;
//import okhttp3.FormBody;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.util.Map;
//
//import static com.trello.ui.core.BrowserFactory.driver;
//
//public class TrelloApiLogin {
//
//    Gson gson=new Gson();
//    CookieStorage cookieStorage = new CookieStorage();
//    OkHttpClient client = new OkHttpClient.Builder().cookieJar(cookieStorage).build();
//
//
//    @Test
//    public void loginByApi() throws IOException {
//
//        FormBody formData = new FormBody.Builder()
//                .add("method","password")
//                .add("factors[user]","noga.anton+test@gmail.com")
//                .add("factors[password]","qwer1234")
//                .build();
//        Request request= new Request.Builder().url("https://trello.com/1/autherntication").post(formData).build();
//        String response = client.newCall(request).execute().body().string();
//        Map<String,String> map = gson.fromJson(response, new TypeToken<Map<String,String>>(){}.getType());
//        String code = map.get("code");
//
//        // authorization/session
//        String dsc = cookieStorage.cookies.stream().filter(cookie -> cookie.name().equals("dsc")).findFirst().get().value();
//        FormBody sessionFormData = new FormBody.Builder()
//                .add("authentication", code)
//                .add("dsc", dsc)
//                .build();
//        Request requestSession = new Request.Builder().url("https://trello.com/1/authorization/session").post(sessionFormData).build();
//        response = client.newCall(requestSession).execute().body().string();
//        System.out.println(response);
//
//        driver().get("URL");
//
//        for (Cookie cookie : cookieStorage.cookies) {
//            org.openqa.selenium.Cookie seleniumCookie = new org.openqa.selenium.Cookie(cookie.name(),cookie.value());
//            driver().manage().addCookie(seleniumCookie);
//        }
//
//        driver().navigate().refresh();
//        //Thread.sleep(10000);
//
//    }
//}
//*/
