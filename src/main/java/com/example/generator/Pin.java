package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random pincode.
 */
@RestController
public class Pin {

    /**
     * Generate random pincode.
     * @return String random pincode.
     */
    @RequestMapping("/pin")
    public String pin(){
        Random random = new Random();
        String pin="";
        for (int i = 0; i < 4; i++) {
            int a = random.nextInt(10);
            pin+=Integer.toString(a);
        }
        String str = pin;
        try {
            DemoApplication.out.write((str+"-/pin"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
