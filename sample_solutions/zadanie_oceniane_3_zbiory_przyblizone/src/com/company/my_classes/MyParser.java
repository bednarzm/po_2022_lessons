package com.company.my_classes;

import com.company.exceptions.PowtorzoneIdException;
import com.company.exceptions.ZlaLiczbaParametrowException;
import com.company.osoba.Kobieta;
import com.company.osoba.Mezczyzna;
import com.company.osoba.Osoba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class MyParser {

    public static Set<Osoba> parsePatients(String fileName) {
        Set<Osoba> zbiorOsob = new HashSet<>();

        InputStream inputStream = MyParser.class.getResourceAsStream("/resources/" + fileName);
        if (inputStream == null) {
            return zbiorOsob;
        }

        // autozamykanie streamu
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parameters = line.split("#");

                if (parameters.length != 7) {
                    throw new ZlaLiczbaParametrowException();
                }

                int id = Integer.parseInt(parameters[0]);
                String plec = parameters[1];
                int wiek = Integer.parseInt(parameters[2]);
                double temperatura = Double.parseDouble(parameters[3]);
                boolean kaszel = Boolean.parseBoolean(parameters[4]);
                boolean covidDodatni = Boolean.parseBoolean(parameters[6]);

                Osoba osoba;

                if (plec.equals("M")) {
                    boolean bylWWojsku = Boolean.parseBoolean(parameters[5]);
                    osoba = new Mezczyzna(id, wiek, temperatura, kaszel, covidDodatni, bylWWojsku);
                } else {
                    String nazwiskoRodowe = parameters[5];
                    osoba = new Kobieta(id, wiek, temperatura, kaszel, covidDodatni, nazwiskoRodowe);
                }

                if (zbiorOsob.contains(osoba)) {
                    // contains pod spodem posluguje sie metoda equals(), a implementacja metody equals() dla klasy Osoba
                    // porownuje id, a wiec sprawdzamy tutaj, czy w kolekcji sa 2 osoby z takim samym id
                    throw new PowtorzoneIdException();
                }
                zbiorOsob.add(osoba);
            }
        } catch (IOException e) {
            System.out.println("Blad przy parsowaniu danych");
            e.printStackTrace();
        } catch (PowtorzoneIdException e) {
            System.out.println("Plik zawiera dwie osoby z takim samym id");
            e.printStackTrace();
        } catch (ZlaLiczbaParametrowException e) {
            System.out.println("Plik zawiera linie ze zla liczba parametrow");
            e.printStackTrace();
        }
        return zbiorOsob;
    }
}
