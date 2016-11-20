package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random time.
 */
@RestController
public class Time {

    /**
     * Generates random time.
     * @return String random time.
     */
    @RequestMapping("/time")
    public String time() {
        Random random = new Random();
        int k = random.nextInt(24);
        String hours = "";
        if (k<10) {
            hours = "0" + k;
        }
        else {
            hours = Integer.toString(k);
        }
        k = random.nextInt(61);
        String minutes = "";
        if (k<10) {
            minutes = "0" + k;
        }
        else {
            minutes =Integer.toString(k);
        }
        k = random.nextInt(61);
        String secomds = "";
        if (k<10) {
            secomds = "0" + k;
        }
        else {
            secomds =Integer.toString(k);
        }

        String str = hours + ":" + minutes + ":" + secomds;
        try {
            DemoApplication.out.write((str+"-/time"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
