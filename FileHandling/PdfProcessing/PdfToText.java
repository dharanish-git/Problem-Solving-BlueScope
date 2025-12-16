package org.example;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PdfToText {
    public static void main(String[] args) {
        File file=new File("src/main/java/org/example/resources/text.pdf");
        try
        {
            PDDocument document= Loader.loadPDF(file);
            PDFTextStripper text=new PDFTextStripper();
            String fullText=text.getText(document);
            File textFile=new File("/home/dharanish/Desktop/FileHandling/PdfProcessing/src/main/java/org/example/resources/text.txt");
            textFile.getParentFile().mkdirs();
            FileWriter fw=new FileWriter(textFile);
            fw.write(fullText);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
