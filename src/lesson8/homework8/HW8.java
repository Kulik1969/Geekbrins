package lesson8.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HW8 {

    public static class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("HW8");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 400);
            JButton[] jbs = new JButton[5];
            for (int i = 0; i < 5; i++) {
                jbs[i] = new JButton("#" + i);
            }


            JTextArea area1 = new JTextArea("Многострочное поле", 8, 15);
            // Шрифт и табуляция
            area1.setFont(new Font("Dialog", Font.PLAIN, 23));
            area1.setTabSize(10);

//            JTextArea area2 = new JTextArea(15, 10);
//            area2.setText("Второе многострочное поле");
//            // Параметры переноса слов
//            area2.setLineWrap(true);
//            area2.setWrapStyleWord(true);


            // Добавим поля в окно
            JPanel contents = new JPanel();
            add(contents);
            contents.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    System.out.println("MousePos: " + e.getX() + " " + e.getY());
                }
            });

            contents.add(new JScrollPane(area1));
  //          contents.add(new JScrollPane(area2));
            setContentPane(contents);
             // Выводим окно на экран
 //           setSize(400, 300);
            setVisible(true);

            setLayout(new BorderLayout());   // выбор компоновщика элементов
  //          add(jbs[0], BorderLayout.EAST); // добавление кнопки на форму
  //          add(jbs[1], BorderLayout.WEST);
            add(jbs[2], BorderLayout.SOUTH);
            JButton button = new JButton("КНОПОЧКА");
            button.setPreferredSize(new Dimension(200, 100));
            add(button, BorderLayout.SOUTH);
 //           add(jbs[3], BorderLayout.NORTH);
  //          add(jbs[4], BorderLayout.CENTER);
            setVisible(true);
        }

    }
    public static class MainClass {
        public static void main(String[] args) {
            MyWindow myWindow = new MyWindow();
        }
    }

}
