package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random sex.
 */
@RestController
@RequestMapping("/generateSex")
public class Pol {

    Random random = new Random();
    String [] pol= new String[2];

    /**
     *Generates random sex (lang-rus).
     * @return String generated random sex (lang-rus).
     */
    @RequestMapping("/ru")
    public String genPol1() {
        pol[0] = "женский";
        pol[1] = "мужской";
        int k = random.nextInt(pol.length);

        String str =pol[k];;
        try {
            DemoApplication.out.write((str+"-/generateSex/ru"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
        }

    /**
     * Generates random sex (lang-en).
     * @return String generated random sex (lang-en).
     */
    @RequestMapping("/en")
    public String genPol2() {
        pol[0] = "female";
        pol[1] = "male";
        int k = random.nextInt(pol.length);
        String str =pol[k];
        try {
            DemoApplication.out.write((str+"-/generateSex/en"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Generates random sex (lang-de).
     * @return String generated random sex (lang-de).
     */
    @RequestMapping("/de")
    public String genPol3() {
        pol[0] = "weiblich";
        pol[1] = "männlich";
        int k = random.nextInt(pol.length);
        String str =pol[k];;
        try {
            DemoApplication.out.write((str+"-/generateSex/de"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
