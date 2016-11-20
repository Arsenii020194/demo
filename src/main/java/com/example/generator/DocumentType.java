package com.example.generator;

import java.io.IOException;
import java.util.Random;
import com.example.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for generating random document-type.
 */
@RestController
public class DocumentType {

    /**
     * Generates random document type.
     * @return String random document type.
     */
    @RequestMapping("/document")
    public String documentType() {
        Random random = new Random();
        String [] documentsType ={"Паспорт","Загранспорт", "Пенсионное удостоверение"};
        int k=random.nextInt(documentsType.length);

        String str = documentsType[k];
        try {
            DemoApplication.out.write((str+"-/document"+"\n").getBytes());
            DemoApplication.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
