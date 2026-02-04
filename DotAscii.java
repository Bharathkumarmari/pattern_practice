import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DotAscii {
    public static void main(String[] args) {
        // 🔧 Change this to your image path
        String inputPath = "C:\\Users\\bhara\\Desktop\\2024 Dumb\\my\\mech bef.jpg";
        int newWidth = 120; // bigger = more detail

        try {
            BufferedImage image = ImageIO.read(new File(inputPath));
            if (image == null) {
                System.out.println("❌ Error: Not a valid image file.");
                return;
            }

            // Resize
            Image tmp = image.getScaledInstance(newWidth, -1, Image.SCALE_SMOOTH);
            BufferedImage resized = new BufferedImage(tmp.getWidth(null), tmp.getHeight(null), BufferedImage.TYPE_INT_RGB);
            resized.getGraphics().drawImage(tmp, 0, 0, null);

            // Convert to DOT pattern
            for (int y = 0; y < resized.getHeight(); y++) {
                StringBuilder sb = new StringBuilder();
                for (int x = 0; x < resized.getWidth(); x++) {
                    Color pixel = new Color(resized.getRGB(x, y));
                    int gray = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;

                    // threshold: dark → dot, light → space
                    if (gray < 128) {
                        sb.append(".");
                    } else {
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
