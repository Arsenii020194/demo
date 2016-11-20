package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Class for generation walls material
 */
@RestController
public class MaterialWall {

    /**
     * Generates random material for wall.
     * @return String random material for wall.
     */
    @RequestMapping("/material")
    public String material() {

        String[] material = {"кирпич", "гипсокартон", "бетонные блоки", "дерево", "газобетонные блоки", "пенобетонные блоки","керамоблок", "металл"};
        Random random = new Random();
        int k = random.nextInt(material.length);

        String str = material[k];;
        try {
            DemoApplication.out.write((str+"-/material"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
