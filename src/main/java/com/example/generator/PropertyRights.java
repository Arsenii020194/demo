package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random property rights.
 */
@RestController
public class PropertyRights {

    /**
     * Generates random property rights.
     * @return String random property rights.
     */
    @RequestMapping("/propetyRight")
    public String propetyRights () {
        Random random = new Random();
        String [] rights ={"Право владения","Право пользования", "Право распоряжения"};
        int k=random.nextInt(rights.length);

        String str = rights[k];
        try {
            DemoApplication.out.write((str+"-/propetyRight"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
