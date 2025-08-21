package app.util.node;

import app.util.core.ASCII;
import app.util.core.MainLoop;

public class ImageASCII {
    static final String[] pixels = new String[] {
        " ",                  
        // 0 < >
        ASCII.LightShade,     
        // 1 <░>
        ASCII.MediumShade,    
        // 2 <▒>
        ASCII.DarkShade,     
        // 3 <▓>
        ASCII.FullBlock,      
        // 4 <█>
        ASCII.UpperHalfBlock, 
        // 5 <▀>
        ASCII.LowerHalfBlock, 
        // 6 <▄>
        ASCII.LeftHalfBlock,  
        // 7 <▌>
        ASCII.RightHalfBlock  
        // 8 <▐>

    };
    String[][] map;

    public ImageASCII(int width, int height) { map = new String[height][width]; }

    public ImageASCII setPixel(int[][] data) {
        if (map.length == 0 || map[0].length == 0) { MainLoop.error("ImageMapSize"); return this; }

        if (data.length == 0 || data[0].length == 0) { MainLoop.error("ImageDataEmpty"); return this; }

        if (data.length != map.length || data[0].length != map[0].length) { 
            MainLoop.error("ImageDataSize"); return this; 
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int pixel = data[i][j];
                if (pixel < 0 || pixel >= pixels.length) { MainLoop.error("UndefPixel"); return this; } 
                map[i][j] = pixels[pixel];
            }
        }

        return this;
    }

    public static ImageASCII from(int[][] data) {
        return new ImageASCII(data[0].length, data.length).setPixel(data);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int max = map.length-1;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < map[0].length; j++) {
                builder.append(map[i][j]);
            }
            if (i != max) builder.append("\n");
        }
        return builder.toString();
    }
}
