import net.semanticmetadata.lire.imageanalysis.features.global.FuzzyColorHistogram;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

public class Main {


    public static void main(String[] args) {

        FuzzyColorHistogram fuzzyColorHistogram = new FuzzyColorHistogram();
        String imgPath = "C:\\Users\\Ash\\Desktop\\nathalia-segato-iAk_yM7r8iE-unsplash.jpg";
        try{
            BufferedImage image = ImageIO.read(new FileInputStream(imgPath));
            fuzzyColorHistogram.extract(image);
        }
        catch (Exception ex){
            System.out.println("Hello World!");
        }


    }
}
