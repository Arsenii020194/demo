package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * class for generation random military ranks.
 */
@RestController
public class Title {

    /**
     *Generates random military-rank.
     * @return String military-rank.
     */
    @RequestMapping("/militaryRunk")
    public String runks() {
        String [] runks = {"Рядовой","Ефрейтор","Сержант","Младший сержант","Старший сержант","Старшина","Прапорщие",
                "Старший прапорщик","Лейтенант","Младший лейтенант","Старший лейтенант","Капитан","Майор",
                "Подполковник","Полковник","Генерал-майор","Генерал-лейтенант","Генерал-полковник","Генерал","Маршал"};
        Random random = new Random();
        int k = random.nextInt(runks.length);

        String str = runks[k];;
        try {
            DemoApplication.out.write((str+"-/militaryRunk"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
