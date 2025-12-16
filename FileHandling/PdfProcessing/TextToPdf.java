package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName.HELVETICA;

public class TextToPdf
{
    public static void main(String[] args) {
        String textFile="src/main/java/org/example/resources/text.txt";
        String pdfFile="src/main/java/org/example/resources/text.pdf";
        try{
            PDDocument document=new PDDocument();
            BufferedReader br=new BufferedReader(new FileReader(textFile));
            PDPage page=new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream=new PDPageContentStream(document,page);
            contentStream.setFont(new PDType1Font(HELVETICA),14);
            contentStream.beginText();
            contentStream.setLeading(14.5F);
            contentStream.newLineAtOffset(40,700);

            String line;
            while ((line = br.readLine()) != null) {
                contentStream.showText(line);
                contentStream.newLine();
            }

            contentStream.endText();
            contentStream.close();

            document.save(pdfFile);
            System.out.println("PDF created successfully!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
