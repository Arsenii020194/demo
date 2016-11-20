package com.example.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Сlass for generation get requests.
 */
public class RequestGenerator {

    /**
     * @param k Count of requests needed to generate.
     * @throws IOException
     */
    public RequestGenerator(int k) throws IOException {

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/card");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/city");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/cityType");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/cvv");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/document");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/education");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/family/male");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/family/female");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/fio/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/fio/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();

        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/fio/men");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/fio/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/ogrn");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/ogrnp/ur");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/snils");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
           URL url = new URL("http://localhost:8080/inn/ur");
          BufferedReader in = new BufferedReader(
                 new InputStreamReader(url.openStream()));

         String inputLine;
         StringBuilder sb = new StringBuilder();
         while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/inn/fiz");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/kpp");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/lang");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/markTS");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/material");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/men");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/opf");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/generateSex/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/generateSex/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/generateSex/de");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/propetyRight");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/stateFlat");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/surname/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/surname/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/surname/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/surname/men");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/time");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/militaryRunk");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/en");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/ru");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/name/women");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/ts");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/typeStreet");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/pin");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }

        for (int i = 0; i < k; i++) {
            URL url = new URL("http://localhost:8080/color");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
        }
}
}
