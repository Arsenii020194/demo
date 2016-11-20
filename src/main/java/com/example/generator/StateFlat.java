package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random state of flat.
 */
@RestController
public class StateFlat {

    /**
     * Generates random state of the flat.
     * @return String random state of the flat.
     */
    @RequestMapping("/stateFlat")
    public String stateFlat () {
        Random random = new Random();
        String [] states ={"отличное","хорошее", "удовлетворительное", "неудовлетворительное"};
        int k=random.nextInt(states.length);

        String str = states[k];
        try {
            DemoApplication.out.write((str+"-/stateFlat"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
