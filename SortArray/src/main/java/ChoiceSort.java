import javax.swing.*;
import java.awt.*;

public class ChoiceSort extends JPanel{

    Screen screen;
    int[] array;
    int num;

    public ChoiceSort(int[] array){
        this.array = array;
    }

    public void chcolor(int num){
        this.num = num;
    }

    public void showRect(){
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,650);
        frame.setResizable(true);

        screen = new Screen(array);
        screen.color(num);
        frame.add(screen);
        frame.setVisible(true);

        int s = 0;
        int i;
        for (i = 0; i < array.length - 1; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }

            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            s = array[index];
            array[index] = array[i];
            array[i] = s;
            screen.setHighlight(index,i);
            screen.repaint();
        }
        screen.setHighlight(s,i);
        screen.repaint();

        frame.setVisible(true);
        frame.dispose();
    }

}