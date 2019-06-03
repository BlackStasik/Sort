import javax.swing.*;
import java.awt.*;

public class SwapSort extends JPanel {

    Screen screen;
    int[] array;

    int num;

    public SwapSort(int[] array){
        this.array = array;
    }

    public void chcolor(int num){
        this.num = num;
    }

    public void showRect(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,650);
        frame.setResizable(true);

        screen = new Screen(array);
        screen.color(num);
        frame.add(screen);
        frame.setVisible(true);

        for (int p = 0; p < array.length; p++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i;
            for (i = p + 1; i < array.length; i++) {
                if (array[i] < array[p]) {
                    array[p] = array[p] + array[i];
                    array[i] = array[p] - array[i];
                    array[p] = array[p] - array[i];
                }
                else {

                }
                screen.setHighlight(i,p);
            }
            screen.repaint();
        }

        frame.setVisible(true);
        frame.dispose();
    }
}
