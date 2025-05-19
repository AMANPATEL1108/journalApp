package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.jws.soap.SOAPBinding;

@Component
public class WeatherService {

    private static final String apiKey = "";

    private static final String API = "http://api.weatherstack.com/current?access_key={apiKey}&query={city}";

    @Autowired
    private RestTemplate restTemplate;


//    public WeatherResponse getWeather(String city) {
//        String finalAPI = API.replace("CITY", city).replace("API_KEY", apiKey);
//        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
//        WeatherResponse body = response.getBody();
//        return body;
//    }

    public WeatherResponse getWeather1(String city) {
        String finalAPI = API.replace("CITY", city).replace("API_KEY", apiKey);

//        String reqestBody = "{
//        "userName":"aman", "password":"aman"
//    }"'

        //http header transfer
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Key", "value");

        User user = (User) User.builder().username("aman1").password("aman1").build();
//in this add afetr user to ser Http header set for set header
        HttpEntity<User> httpEntity = new HttpEntity<>(user);

        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, httpEntity, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }

}
