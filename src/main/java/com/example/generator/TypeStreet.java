package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random type of street.
 */
@RestController
public class TypeStreet {

    /**
     * Generates random type of street.
     * @return String random type of the street.
     */
    @RequestMapping("/typeStreet")
    public String streetType () {
        Random random = new Random();
        String[] streetsType = {"улица", "проспект", "бульвар", "проезд", "шоссе", "переулок", "тупик"};
        int k = random.nextInt(streetsType.length);

        String str = streetsType[k];
        try {
            DemoApplication.out.write((str+"-/typeStreet"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}