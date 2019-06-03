import javax.swing.*;
import java.awt.*;

public class MergerSort extends JPanel{

    private int[] array;
    private int[] tempMergArr;
    private int length;

    Screen screen;
    int num;

    public MergerSort(int[] array){
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

        sort(array);
//        int left, right, medium;
//        int[] z = new int[array.length];
//        left = 0;
//        medium = Math.round(array.length / 2);
//        right = medium;
//        for (int p = left; p < right; p++) {
//            for (int i = p + 1; i < right; i++) {
//                if (array[i] < array[p]) {
//                    array[p] = array[p] + array[i];
//                    array[i] = array[p] - array[i];
//                    array[p] = array[p] - array[i];
//                }
//            }
//        }
//        for (int p = right; p < array.length; p++) {
//            for (int i = p + 1; i < array.length; i++) {
//                if (array[i] < array[p]) {
//                    array[p] = array[p] + array[i];
//                    array[i] = array[p] - array[i];
//                    array[p] = array[p] - array[i];
//                }
//            }
//        }
//
//        left = 0;
//        right = medium;
//        for (int i = 0; i < array.length; i++) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e1) {
//                e1.printStackTrace();
//            }
//            if (left >= medium) {
//                z[i] = array[right];
//                right++;
//                continue;
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
//            if (right > array.length - 1) {
//                z[i] = array[left];
//                left++;
//                continue;
//            }
//            if (array[left] < array[right]) {
//                z[i] = array[left];
//                left++;
//            } else {
//                z[i] = array[right];
//                right++;
//            }
//            screen.setHighlight(left,i);
//            screen.repaint();
//        }
//        screen.repaint();

        frame.setVisible(true);
        frame.dispose();
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            screen.setHighlight(k,i);
            screen.repaint();
        }
        while (i <= middle) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            array[k] = tempMergArr[i];
            k++;
            i++;
            screen.setHighlight(k,i);
            screen.repaint();
        }

    }


}


