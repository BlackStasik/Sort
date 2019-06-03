import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

public class Screen extends JPanel{

    int num = 1;
    int[] array;
    int h1 = -1, h2 = -1;

    public Screen(int[] array) {
        this.array = array;
    }

    void setArray(int[] array){
        this.array = array;
    }

    void color( int num){
       this.num = num;
    }

    void setHighlight(int h1, int h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void paint(Graphics graphics){
        int a = 5;
        graphics.clearRect(0,0,790,610);
        for (int i = 0; i < 80; i++){{
            if (i == h1 || i == h2) {
                if (num%3 == 0){
                    graphics.setColor(Color.GREEN);
                }
                else {
                    if (num%2 == 0){
                        graphics.setColor(Color.ORANGE);
                    }
                    else {
                        graphics.setColor(Color.red);
                    }
                }
            }
            else {
                graphics.setColor(Color.BLACK);
            }
            graphics.fillRect(a, 600-array[i], 7,array[i]);
            a += 10;
        }}

    }

}
