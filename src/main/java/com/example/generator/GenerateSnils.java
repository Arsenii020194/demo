package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generation random snils.
 */
@RestController
public class GenerateSnils {
    static Random random = new Random();

    /**
     * Generates random snils.
     * @return String random snils.
     */
    @RequestMapping("/snils")
    public String snils() {
        String s = "";
        String s1 = "";
        for (int i = 0; i < 3; i++) {
            int a = random.nextInt(8) + 1;
            int b = random.nextInt(8) + 1;
            int c = random.nextInt(8) + 1;
            s+=Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
            if (i <= 1) {
                s1 += Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + "-";
            }
            else {
                s1 += Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
            }
        }
        char [] c = s.toCharArray();
        String s2 = checkSum(c);

        String str = s1 + " " + s2;
        try {
            DemoApplication.out.write((str+"-/snils"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;

    }

    private String checkSum(char[] c) {
        String s = "";
        int z = 0;
        int k = 0;
        k = (c[0] * 9 + c[1] * 8 + c[2] * 7 + c[3] * 6 + c[4] * 5 + c[5] * 4 + c[6] * 3 + c[7] * 2 + c[8] * 2);
        if (k > 101) {
            k = k % 101;
        }

        if ((k == 100) || (k == 101)) {
            k = 0;
        }

        if (k<10) {
            s = "0"+k;
        }
        else {
            s = Integer.toString(k);
        }
        return s;
    }
}