package ru.dataart.academy.java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {
        int count = 0;
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while (zipInputStream.getNextEntry() != null) {
                int i;
                while ((i = zipInputStream.read()) != -1) {
                    if ((char) i == character) {
                        count++;
                    }
                }
                zipInputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {
        int max = 0;
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while (zipInputStream.getNextEntry() != null) {
                int i, counter = 0;
                while ((i = zipInputStream.read()) != -1) {
                    if ((char) i == ' ' || (char) i == '\n') {
                        max = Math.max(counter, max);
                        counter = -1;
                    }
                    counter++;
                }
                zipInputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return max;
    }

}
