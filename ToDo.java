import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class ToDo {
    Object [] headers = {"№","Business"};
    Object [][] data = {
            {"1","To eat"},
            {"2","go to school"},
            {"3","to go home"},
            {"4","to eat and go sleep"}
};

    //Объект таблицы
    private JTable Business;
    ToDo() {
        //Создаем новый контейнер JFrame
    JFrame jfrm = new JFrame("ToDo");
        //Устанавливаем диспетчер компоновки
        jfrm.getContentPane().setLayout(new FlowLayout());
        //Устанавливаем размер окна
        jfrm.setSize(300, 170);
        //Устанавливаем завершение программы при закрытии окна
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Создаем новую таблицу на основе двумерного массива данных и заголовков
        Business = new JTable(data,headers);
        //Создаем панель прокрутки и включаем в ее состав нашу таблицу
        JScrollPane jscrlp = new JScrollPane(Business);
        //Устаналиваем размеры прокручиваемой области
        Business.setPreferredScrollableViewportSize(new Dimension(250, 100));
        //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
        jfrm.getContentPane().add(jscrlp);
        //Отображаем контейнер
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        //Создаем фрейм в потоке обработки событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDo();
            }
        });
    }
}

