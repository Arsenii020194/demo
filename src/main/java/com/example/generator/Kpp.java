package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random generate kpp.
 */
@RestController
public class Kpp {

    /**
     *Generates random kpp.
     * @return String number kpp.
     */
    @RequestMapping("/kpp")
    public String generateKpp() {
        Random random = new Random();
        String code_no="";
        int k=60;
        for (int i = 0; i <4 ; i++) {
            int a = random.nextInt(10);
            code_no+=a;

        }
        String [] cause = new String [68];
        for (int i = 0; i < 53; i++) {
            cause[i] = Integer.toString(i+1);
        }
        for (int i = 53; i < 57; i++) {
            cause[i] = Integer.toString(k);
            k++;
        }

        k=70;
        for (int i = 57; i < 63; i++) {
            cause[i] = Integer.toString(k);
            k++;
        }
        k=80;
        for (int i = 63; i < 68; i++) {
            cause[i] = Integer.toString(k);
            k++;
        }
        int l = random.nextInt(cause.length);
        String cs = cause[l];
        String number="";
        for (int i = 0; i < 3; i++) {
            int a = random.nextInt(10);
            number+=a;
        }
        String str = code_no+cs+number;
        try {
            DemoApplication.out.write((str+"-/kpp"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;

        }
}
