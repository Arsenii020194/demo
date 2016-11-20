package com.example.generator;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classs for generation random ogrn number without parameters.
 */
@RestController
public class GenerateOgrn {
    Random random = new Random();

    /**
     * Generates random ogrn number.
     * @return String random ogrn number.
     */
    @RequestMapping("/ogrn")
    public String ogrn() {
        int k;
        String first  = first();
        String [] dateSymbol = new String[99];
        for (int i = 0; i < dateSymbol.length; i++) {
            if (i<10) {
                dateSymbol[i] = "0" + i;
            }
            else {
                dateSymbol[i] = Integer.toString(i);
            }

        }
        k = random.nextInt(dateSymbol.length);
        String date = dateSymbol[k]; //второй и третий год
        String codeSub = ""; //код субъекта
        codeSub= codeSubject(); //код субъекта
        String [] inspectionCode =  new String[99];
        for (int i = 0; i < inspectionCode.length; i++) {
            if (i<10) {
                inspectionCode[i] = "0" + i;
            }
            else {
                inspectionCode[i] = Integer.toString(i);
            }

        }
        k = random.nextInt(inspectionCode.length);
        String incCode = dateSymbol[k]; //второй и третий год
        int a = random.nextInt(9);
        int b = random.nextInt(9);
        int c = random.nextInt(9);
        int d = random.nextInt(9);
        int e = random.nextInt(9);
        String numberNote = Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d) + Integer.toString(e); //номер записи 8-12
        String ss = first + date + codeSub + incCode + numberNote;
        long l = Long.parseLong(ss);
        long ch = l % 11;
        if (ch == 10) {
            ch = 0;
        }
        String checksum = Long.toString(ch);
        String ogrn = ss + checksum;

        String str = ogrn;
        try {
            DemoApplication.out.write((str+"-/ogrn"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    private String codeSubject() {
        String[] codSub = new String[94]; //код субъекта
        for (int j = 0; j < 93; j++) {
            if (j < 10) {
                codSub[j] = "0" + (j + 1);
            } else {
                codSub[j] = Integer.toString(j + 1);
            }
        }
        codSub[93] = "99";
        return codSub[random.nextInt(codSub.length-1)+1];
    }

    private String first() {
        int [] firstSymbol= {1,5};
        int k = random.nextInt(firstSymbol.length);

        return Integer.toString(firstSymbol[k]);

    }
}
