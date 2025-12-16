package org.example;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;
public class ImageProcessor {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("src/main/java/org/example/resources/images.jpeg");
        BufferedImage originalImage = ImageIO.read(inputFile);


        int newWidth = 200;
        int newHeight = 200;

        BufferedImage resizedImage = resizeImage(originalImage, newWidth, newHeight);
        ImageIO.write(resizedImage, "jpg", new File("resized.jpg"));


        BufferedImage grayImage = convertToGray(resizedImage);
        ImageIO.write(grayImage, "jpg", new File("src/main/java/org/example/resources/grayscale.jpg"));

        System.out.println("Image processing completed.");
    }


    private static BufferedImage resizeImage(BufferedImage original, int width, int height) {
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resized.createGraphics();
        g.drawImage(original, 0, 0, width, height, null);
        g.dispose();
        return resized;
    }


    private static BufferedImage convertToGray(BufferedImage colorImage) {
        BufferedImage gray = new BufferedImage(
                colorImage.getWidth(),
                colorImage.getHeight(),
                BufferedImage.TYPE_BYTE_GRAY
        );

        Graphics g = gray.getGraphics();
        g.drawImage(colorImage, 0, 0, null);
        g.dispose();

        return gray;
    }
}
