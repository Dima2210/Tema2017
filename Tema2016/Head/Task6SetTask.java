/**
 * 
 */
package MyRepository.Tema2016.Head;

import java.util.Date;

/**
 * @author User
 *������ 6
 * �������� ���������� ��������� ������� ������������, ���� � ����� ��������� ������� � ����� ���� � ����� ����� �������
 * ��� ��������� ��������� ���� � ������� ����������� ����� Calendar �� ������ java.util 
 * 
 * � ���� ������ ����� �������� ���������� �������� ����� ������ ������ ������������
 */
public class Task6SetTask {
    
    /**
     * ���� �������� ����� ������ ������� ������������ � ������������
     */
    
    private long timeSetTask;

    /**
     * ����������� �������� � ���� timeSetTask ����� ���������� �� ��� 
     */
    public Task6SetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeSetTask = time.getTime();
    }
    
    /**
     * ����������� �������� �������� ��-�� ������ �7
     */
    public Task6SetTask(){
        Date time = new Date();
        timeSetTask = time.getTime();
    }
    
    /**
     * ������� �������� ���� timeSetTask
     */
    public long getTimeSetTask(){
        return timeSetTask;
    }

}
