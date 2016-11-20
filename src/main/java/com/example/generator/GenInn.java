package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * class for generate random inn.
 */
@RestController
@RequestMapping("/inn")
public class GenInn {

    Random random = new Random();

    /**
     * Method for generate inn ur.
     * @return String random ur inn.
     */
    @RequestMapping("/ur")
    public String generateInn() {
        int k=0;
        int c = 0;
        String inn = ""; //инн
        String codeSub= codeSubject(); //код субъекта
        String numInspect = numberInspection(); //номер инспекции
        k=5;
        c=1;
        String numberNalogoplat = numberNalogoplat(k); //номер налогплательщика
        String ss = codeSub + numInspect + numberNalogoplat;
        String cs = checkSum(ss,c);
        String str = ss +cs;
        try {
            DemoApplication.out.write((str+"-/inn/ur"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;


    }

    /**
     * method for generate inn fiz.
     * @return String random inn fiz.
     */
    @RequestMapping("/fiz")
    public String generateInn2() {
        int k=0;
        int c = 0;
        String inn = ""; //инн
        String codeSub= codeSubject(); //код субъекта
        String numInspect = numberInspection(); //номер инспекции
        k=6;
        c=2;
        String numberNalogoplat = numberNalogoplat(k); //номер налогплательщика
        String ss = codeSub + numInspect + numberNalogoplat;
        String cs = checkSum(ss,c);
        String str = ss +cs;;
        try {
            DemoApplication.out.write((str+"-/inn/fiz"+"\n").getBytes());
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

    private String numberNalogoplat(int k) {
        String numberNalogoplat = "";
            int[] np = new int[k];
            for (int j = 0; j < np.length; j++) {
                np[j] = random.nextInt(8) + 1;
            }
            for (int j = 0; j < np.length; j++) {
                numberNalogoplat += np[j];
            }
        return numberNalogoplat;
    }

    private String numberInspection() {
        int num=random.nextInt(98)+1;
        if (num<10) {
            return "0"+num;
        }
        else {
            return Integer.toString(num);
        }
    }

    private String checkSum(String ss, int c) {
        String s="";
        char [] cc = ss.toCharArray();
        int m=0;
        int n=0;
        if (c==1) {
            m=((2*(cc[0])+4*(cc[1])+10*(cc[2])+3*(cc[3])+5*(cc[4])+9*(cc[5])+4*(cc[6])+6*(cc[7])+8*(cc[8]))%11)%10;
            s =  Integer.toString(m);
        }
        if (c==2) {
            m = ((7*(cc[0])+2*(cc[1])+4*(cc[2])+10*(cc[3])+3*(cc[4])+5*(cc[5])+9*(cc[6])+4*(cc[7])+6*(cc[8])+8*(cc[9]))%11)%10;
            n = ((3*(cc[0])+7*(cc[1])+2*(cc[2])+4*(cc[3])+10*(cc[4])+3*(cc[5])+5*(cc[6])+9*(cc[7])+4*(cc[8])+6*(cc[9])+8*m)%11)%10;
            s =  Integer.toString(m)+Integer.toString(n);
        }
        return s;
    }
}
