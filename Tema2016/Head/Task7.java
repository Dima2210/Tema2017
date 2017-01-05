/**
 * 
 */
package MyRepository.Tema2016.Head;

import java.awt.*;
import java.util.Calendar;

/**
 * @author User
 *������ 7
 *�������� ������ �� ������ ����������� ������� � ��������� ��� � ������� HTML - ���������
 *
 */
public class Task7 extends javax.swing.JApplet {

    private Calendar calendar;

    public void init() {
        calendar = Calendar.getInstance();
        setSize(800, 250);
    }
    public void paint(Graphics g) {
        g.drawString("������ �������:", 20, 15);
        Calendar cl = Calendar.getInstance();

        Task6NameUser nameUser = new Task6NameUser("������ ����");
        g.drawString("��� ������������ " + nameUser.getName(), 20, 35);

        Task6SetTask taskSet = new Task6SetTask();
        cl.setTimeInMillis(taskSet.getTimeSetTask());
        g.drawString("����� ��������� ������� " + cl.getTime(), 20, 55);

        Task6GetTask taskGet = new Task6GetTask();
        cl.setTimeInMillis(taskGet.getTimeGetTask());
        g.drawString("����� ����� ������� " + cl.getTime(), 20, 75);
    }
    public void User() {

    }
}
