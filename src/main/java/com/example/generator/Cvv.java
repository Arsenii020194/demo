package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Class for generation cvv number on the bank card.
 */
@RestController
public class Cvv {

    /**
     * Generates cvv-number for card.
     * @return String random cvv number.
     */
    @RequestMapping("/cvv")
    public String cvv() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);

        String str = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
        try {
            DemoApplication.out.write((str+"-/cvv"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
