package com.example.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * class for generation random color
 */
@RestController
public class Color {

    /**
     * Generates random color.
     * @return String String random color.
     */
    @RequestMapping("/color")
    public String color () {
        Random random = new Random();
        String [] cl ={"Красный","Оранжевый", "Желтый", "Зеленый", "Голубой","Фиолетовый"};
        int k=random.nextInt(cl.length);
        String str = cl[k];
        try {
            DemoApplication.out.write((str+"-/color"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
