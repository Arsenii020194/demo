package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class for generation random type of ts.
 */
@RestController
public class Ts {

    /**
     * Generates random type of ts.
     * @return String random type of ts.
     */
    @RequestMapping("/ts")
    public String ts() {
        String [] ts = {"велосипед","мопед","автопоезд","прицеп","маршрутное ТС","легковой автомобиль","грузовой автомобиль","мотоцикл"};
        Random random = new Random();
        int k = random.nextInt(ts.length);

        String str = ts[k];;
        try {
            DemoApplication.out.write((str+"-/ts"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
