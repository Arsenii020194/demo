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
 * Class for generation random car model.
 */
@RestController
public class MarkTS {

    /**
     *Generates random car model.
     * @return String import java.util.Random; car model.
     */
    @RequestMapping("/markTS")
    public String markTs() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\main\\java\\com\\example\\generator\\Cars.txt"));
        List<String> carList=new ArrayList();

        try {
            String s;
            while ((s = in.readLine()) != null) {
                carList.add(s);
            }
        } finally {
            in.close();
        }

        String Str =carList.get(new Random().nextInt(carList.size()));
        try {
            DemoApplication.out.write((Str+"-/markTS/en"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Str;
    }
}
