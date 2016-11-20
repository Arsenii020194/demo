package com.example.generator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generationg random name.
 */
@RestController
@RequestMapping("/name")
public class NameGenerator {

    /**
     * Method generates maans name.
     * @return String random mans name
     * @throws IOException
     */
    @RequestMapping("/men")
    public String generateMenName() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensNames.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishMensName.txt"));
        List<String> nameList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str =nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/name/men"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random russian name
     * @return String random russian name.
     * @throws IOException
     */
    @RequestMapping("/ru")
    public String generateRussianName() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensNames.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensNames.txt"));
        List<String> nameList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str =nameList.get(new Random().nextInt(nameList.size()));;
        try {
            DemoApplication.out.write((str+"-/name/ru"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random womans name
     * @return String random womans name.
     * @throws IOException
     */
    @RequestMapping("/women")
    public String generateWomenName() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensNames.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensEnglishNames.txt"));
        List<String> nameList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str =nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/name/women"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random eng name
     * @return String random eng name.
     * @throws IOException
     */
    @RequestMapping("/en")
    public String generateEngName() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensEnglishNames.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishMensName.txt"));
        List<String> nameList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str =nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/name/en"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
