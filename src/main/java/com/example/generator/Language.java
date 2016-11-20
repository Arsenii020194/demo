package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random language
 */
@RestController
public class Language {

    /**
     * Generates random language.
     * @return String random language.
     */
    @RequestMapping("/lang")
    public String language() {
        String [] lang = {"Русский","Английский","Немецкий","Французский","Китайский","Арабский","нНорвежский","Испанский","Итальянский","Чешский"};
        Random random = new Random();
        int k = random.nextInt(lang.length);
        String str = lang[k];
        try {
            DemoApplication.out.write((str+"-/lang"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
