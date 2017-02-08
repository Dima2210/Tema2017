/**
 * 
 */
package MyRepository.Tema2016.Head;

import java.util.Calendar;
import java.util.Date;

/**
 * @author User
 * ������ 6
 * �������� ���������� ��������� ������� ������������, ���� � ����� ��������� ������� � ����� ���� � ����� ����� �������
 * ��� ��������� ��������� ���� � ������� ����������� ����� Calendar �� ������ java.util
 */

public class Task6 {

    /**
     * @param args
     */
    /*
    public static void main(String args[]) {
        // TODO Auto-generated method stub

        Task6 t6 = new Task6();
        t6.start();

    }
*/
    /**
     * ����� start ��������� ���������� �� ������ 6
     */
    public void start() {
        Date time1 = new Date();
        Task6SetTask setTask = new Task6SetTask(time1);
        Calendar cl1 = Calendar.getInstance();
        cl1.setTimeInMillis(setTask.getTimeSetTask());

        String name = "������";
        Task6NameUser nameUser = new Task6NameUser(name);

        Date time2 = new Date();
        Task6GetTask getTask = new Task6GetTask(time2);
        Calendar cl2 = Calendar.getInstance();
        cl2.setTimeInMillis(getTask.getTimeGetTask());

        System.out.print("��� ������������ " + nameUser.getName() + " ����� ��������� ������� " + cl1.getTime());
        System.out.println(" ����� ���������� ������� "  + cl2.getTime());
        
        System.out.println("����� ������ ������ � ������������  " + cl1.getTimeInMillis());
        
        System.out.println("����� ��������� ������ � ������������  " + cl2.getTimeInMillis());
        
    }
}
