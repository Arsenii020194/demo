package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tyuly on 19.11.2016.
 */

/**
 * Class for generation random city type.
 */
@RestController
public class CityType {

    /**
     * Generates random city type.
     * @return String random city type.
     */
    @RequestMapping("/cityType")
    public String cityType () {
        Random random = new Random();
        String [] citiesType = {"Город", "Село", "Поселок", "Деревня", "Поселок городского типа"};
        int k=random.nextInt(citiesType.length);

        String str = citiesType[k];
        try {
            DemoApplication.out.write((str+"-/cityType"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
