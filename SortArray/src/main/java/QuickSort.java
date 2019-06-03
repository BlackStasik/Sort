import javax.swing.*;

public class QuickSort extends JPanel {

    Screen screen;
    int[] array;
    int num;
    public QuickSort(int[] array){
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

        quickSort();

        frame.setVisible(true);
        frame.dispose();
    }


    public void quickSort() {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex);
    }

    private void doSort( int start, int end) {
        if (start >= end){
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        int temp = 0;
        while (i < j) {
            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
            else{
            }
            screen.setHighlight(j,i);
            screen.repaint();
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
}