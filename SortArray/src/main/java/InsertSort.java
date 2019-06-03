import javax.swing.*;
import java.awt.*;

public class InsertSort extends JPanel {

    Screen screen;
    int[] array;
    int num;

    public InsertSort(int[] array){
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


        for(int j = 1; j < array.length; j++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            int k = array[j];
            int i = j -1;
            while ( i >= 0 && array[i] >k){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = k;
            screen.setHighlight(j,i);
            screen.repaint();
        }

        frame.setVisible(true);
        frame.dispose();
    }
}
