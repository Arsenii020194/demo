package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generating random Ogrn with parameter.
 */
@RestController
@RequestMapping("/ogrnp")
public class GenerateOgrnParam {

    Random random = new Random();

    /**
     * Generates number of ogrn ur.
     * @return String random number of ogrn ur.
     */
    @RequestMapping("/ur")
    public String ogrn() {
        int k;
        int[] firstSymbol=new int [2];
        firstSymbol[0] = 1;//первый символ
        firstSymbol[1] = 5;
        k = random.nextInt(firstSymbol.length);
        String first  = Integer.toString(firstSymbol[k]);
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

        String str = ss + checksum;

        try {
            DemoApplication.out.write((str+"-/ogrnp/ur"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;

    }



    /**
     * Generates number of ogrn for ip.
     * @return String random number of ogrn for ip.
     */
    @RequestMapping("/ip")
    public String ogrn2() {
        int k;
        int[] firstSymbol=new int [2];
        firstSymbol[0] = 3;
        firstSymbol[1] = 0;
        //k = 0;
        k = random.nextInt(firstSymbol.length);
        String first  = Integer.toString(firstSymbol[k]);
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
        String Str = ss + checksum+"-/ogrnp/ip"+"\n";;

        try {
            DemoApplication.out.write(Str.getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Str;

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
}
