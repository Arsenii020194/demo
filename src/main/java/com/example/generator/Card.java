package com.example.generator;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Random;

/**
 * Class for generation random card-number.
 */
@RestController
public class Card {

    /**
     * Generates random card-number.
     * @return String random card-number.
     */
    @RequestMapping("/card")
    public  String cardNumber() {
        Random random = new Random();
        int[] first = {2, 4, 3, 5, 6, 7};
        int k = random.nextInt(first.length);
        String first_s = Integer.toString(first[k]);
        String bin="";
        String id = "";
        String ch = "";
        for (int i = 0; i < 6 ; i++) {

            int b_1 = random.nextInt(10);
            bin += Integer.toString(b_1);
            if (i == 2) {
                bin += " ";
            }
        }
        for (int i = 0; i < 8 ; i++) {

            int i_1 = random.nextInt(10);
            id += Integer.toString(i_1);
            if ((i == 0) || (i==4)) {
                id += " ";
            }
        }

        String s = first_s + bin + id;
        String s1 = s.replaceAll(" ", "");
        char [] c =s1.toCharArray();
        int [] udv = new int [8];
        int [] not_udv = new int [7];
        int z = 0;
        for (int i = 0; i < c.length; i++) { //каждая нечетная удваивается
            if (z>8) {
                break;
            }
            if (i % 2 != 0) {
                udv[z] = c[i] * 2;
                //z++;
            }
            else {
                if (i <= 7) {
                    not_udv[z] = c[i]; //чет не удв
                }
            }
            z++;
        }
        int sum = 0;
        for (int i = 0; i < udv.length; i++) { //суммируем каждый удвоенный со всеми не удвоенными
            for (int j = 0; j < not_udv.length; j++) {
                sum += udv[i] + not_udv[j];
            }
        }
        if (sum % 10 == 0) { //если кратно 10, то 0
            ch = "0";
        }
        else {
            int sum2 = sum;
            while (sum2 % 10 != 0) {
                sum2++;
            }
            ch = Integer.toString(sum2 - sum);
        }
        try {
            DemoApplication.out.write((s +ch+"-/card"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;

        }
}
