package com.example.generator;

import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class-for generate random fio.
 */
@RestController
@RequestMapping("/fio")
public class FioGenerator {

    /**
     * Method generates random Mens Fio.
     * @return String random mans fio.
     * @throws IOException
     */
    @RequestMapping("/men")
    public String generateMensFio() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensFio.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishMensName.txt"));
        BufferedReader inEngSur = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        List<String> nameList=new ArrayList();
        List<String> engNameList=new ArrayList();
        List<String> engSurnameList=new ArrayList();

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
                engNameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEngSur.readLine()) != null) {
                engSurnameList.add(s);
            }
        } finally {
            in.close();
        }

        for (int i = 0; i <engNameList.size(); i++) {
            nameList.add(engNameList.get(new Random().nextInt(engNameList.size()))+" "+engNameList.get(new Random().nextInt(engNameList.size()))+" "+engSurnameList.get(new Random().nextInt(engSurnameList.size())));
        }

        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-generateFio/men"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates womans Fio.
     * @return String random womans fio.
     * @throws IOException
     */
    @RequestMapping("/women")
    public String generateWomensFio() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensFio.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensEnglishNames.txt"));
        BufferedReader inEngMen = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishMensName.txt"));
        BufferedReader inEngSur = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        List<String> nameList=new ArrayList();
        List<String> engNameList=new ArrayList();
        List<String> engNameMaleList=new ArrayList();
        List<String> engSurnameList=new ArrayList();
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
            while ((s = inEngMen.readLine()) != null) {
                engNameMaleList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                engNameList.add(s);
            }
        } finally {
            in.close();
        }

        try {
            String s;
            while ((s = inEngSur.readLine()) != null) {
                engSurnameList.add(s);
            }
        } finally {
            in.close();
        }

        for (int i = 0; i <engNameList.size(); i++) {
            nameList.add(engNameList.get(new Random().nextInt(engNameList.size()))+" "+engNameMaleList.get(new Random().nextInt(engNameMaleList.size()))+" "+engSurnameList.get(new Random().nextInt(engSurnameList.size())));
        }

        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-generateFio/women"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates russian Fio.
     * @return String random russian fio.
     * @throws IOException
     */
    @RequestMapping("/ru")
    public String generateRussianFio() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensFio.txt"));
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\MensFio.txt"));
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

        String str = nameList.get(new Random().nextInt(nameList.size()));
        try {
            DemoApplication.out.write((str+"-generateFio/ru"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Method generates russian Fio.
     * @return String random womans fio.
     * @throws IOException
     */
    @RequestMapping("/en")
    public String generateEngFio() throws IOException {
        BufferedReader inEng = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\WomensEnglishNames.txt"));
        BufferedReader inEngMen = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishMensName.txt"));
        BufferedReader inEngSur = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\EnglishSurname.txt"));
        List<String> womensEnglishNamesList=new ArrayList();
        List<String> englishMensNameList=new ArrayList();
        List<String> englishSurnameList=new ArrayList();
        List<String> surnameList=new ArrayList();

        try {
            String s;
            while ((s = inEng.readLine()) != null) {
                womensEnglishNamesList.add(s);
            }
        } finally {
            inEng.close();
        }

        try {
            String s;
            while ((s = inEngMen.readLine()) != null) {
                englishMensNameList.add(s);
            }
        } finally {
            inEngMen.close();
        }

        try {
            String s;
            while ((s = inEngSur.readLine()) != null) {
                englishSurnameList.add(s);
            }
        } finally {
            inEngSur.close();
        }

        for (int i = 0; i <womensEnglishNamesList.size(); i++) {
            surnameList.add(womensEnglishNamesList.get(new Random().nextInt(womensEnglishNamesList.size()))+" "+englishMensNameList.get(new Random().nextInt(englishMensNameList.size()))+" "+englishSurnameList.get(new Random().nextInt(englishSurnameList.size())));
        }

        for (int i = 0; i <englishMensNameList.size(); i++) {
            surnameList.add(englishMensNameList.get(new Random().nextInt(englishMensNameList.size()))+" "+englishMensNameList.get(new Random().nextInt(englishMensNameList.size()))+" "+englishSurnameList.get(new Random().nextInt(englishSurnameList.size())));
        }

        String str = surnameList.get(new Random().nextInt(surnameList.size()));
        try {
            DemoApplication.out.write((str+"-generateFio/en"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
