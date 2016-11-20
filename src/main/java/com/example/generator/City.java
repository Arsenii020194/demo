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
 * Created by tyuly on 19.11.2016.
 */

/**
 * Class for generation random city.
 */
@RestController
public class City {

    /**
     * Generates random city.
     * @return String random city.
     * @throws IOException
     */
    @RequestMapping("/city")
    public String generateCity() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\City.txt"));
        List<String> nameList = new ArrayList();

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
            DemoApplication.out.write((str+"-/city"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
