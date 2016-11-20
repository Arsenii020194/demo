package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random organizational form.
 */
@RestController
public class Opf {

    /**
     *Generates random organizational form.
     * @return String random organizational form.
     */
    @RequestMapping("/opf")
    public String form() {

        String[] form = {"ооо", "оао", "зао", "нко", "ип"};
        Random random = new Random();
        int k = random.nextInt(form.length);

        String str = form[k];;
        try {
            DemoApplication.out.write((str+"-/opf"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
