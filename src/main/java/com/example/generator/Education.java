package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random type of education.
 */
@RestController
public class Education {

    /**
     * Generates random type of education
     * @return String generated type of education.
     */
    @RequestMapping("/education")
    public String education() {
        Random random = new Random();
        String [] edicat ={"Среднее","Начальное", "Неоконченное среднее","Высшее","Неоконченное высшее","Средне-специальное","Неоконченное средне-специальное"};
        int k=random.nextInt(edicat.length);

        String str = edicat[k];
        try {
            DemoApplication.out.write((str+"-/education"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
