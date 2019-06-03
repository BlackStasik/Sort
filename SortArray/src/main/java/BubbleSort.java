import javax.swing.*;

public class BubbleSort extends JPanel{

    Screen screen;
    int[] array;
    int num;

    public BubbleSort(int[] array){
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

        for(int i = 0; i < array.length; i++){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int x = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    x = array[j];
                    array[j] = array[i];
                    array[i] = x;
                }
                else {

                }
                screen.setHighlight(j,i);
                screen.repaint();
            }
        }

        frame.setVisible(true);
        frame.dispose();
    }
}

