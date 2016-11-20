package com.example.generator;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Random;

/**
 * Class for generation random family status.
 */
@RestController
@RequestMapping("/family")
public class FamilyStatus {
    static String [] pol = new String [2];

    /**
     * Generates random male family status.
     * @return String random male family status.
     */
    @RequestMapping("/male")
    public static String genereationSemPolMale() {
        pol[0] = "Холост";
        pol[1] = "Женат";
        Random random = new Random();
        int k = random.nextInt(2);
        String str = pol[k];;
        try {
            DemoApplication.out.write((str+"-family/male"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     *Generates random female family status.
     * @return String random female family status.
     */
    @RequestMapping("/female")
    public String genereationSemPolFemale() {
        pol[0] = "Замужем";
        pol[1] = "Не замужем";
        Random random = new Random();
        int k = random.nextInt(2);

        String str = pol[k];;
        try {
            DemoApplication.out.write((str+"-family/female"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
