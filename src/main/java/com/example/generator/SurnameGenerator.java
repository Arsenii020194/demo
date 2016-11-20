package com.example.generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *Class for generating random surname.
 */
@RestController
@RequestMapping("/surname")
public class SurnameGenerator {

    /**
     * Method generates random russian surname.
     * @return String random russian surname.
     * @throws IOException
     */
    @RequestMapping("/ru")
    public String generateRussianSurname() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensSurnames.txt"));
        BufferedReader inWom = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensSurnames.txt"));
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
            while ((s = inWom.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/surname/ru"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random english surname.
     * @return String random english surname.
     * @throws IOException
     */
    @RequestMapping("/en")
    public String generateEngSurname() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        List<String> nameList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/surname/en"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random mans surname.
     * @return String random mans surname.
     * @throws IOException
     */
    @RequestMapping("/men")
    public String generateMensSurname() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        BufferedReader inRus = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensSurnames.txt"));
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
            while ((s = inRus.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }


        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-/surname/men"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates random womans surname.
     * @return String random womans surname.
     * @throws IOException
     */
    @RequestMapping("/women")
    public String generateWomensSurname() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        BufferedReader inRus = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensSurnames.txt"));
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
            while ((s = inRus.readLine()) != null) {
                nameList.add(s);
            }
        } finally {
            in.close();
        }

        String str = nameList.get(new Random().nextInt(nameList.size()));;
        try {
            DemoApplication.out.write((str+"-/surname/women"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
