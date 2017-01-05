/**
 * 
 */
package MyRepository.Tema2016.Head;

import java.util.Date;

/**
 * @author User
 * ������ 6
 * �������� ���������� ��������� ������� ������������, ���� � ����� ��������� ������� � ����� ���� � ����� ����� �������
 * ��� ��������� ��������� ���� � ������� ����������� ����� Calendar �� ������ java.util 
 *  * 
 * � ���� ������ ����� �������� ���������� �������� ����� ���������� ������
 */
public class Task6GetTask {
    
    /**
     * ���� timeGetTask ������ ����� ����������� ������� � ������������
     */
    private long timeGetTask;

    /**
     * ������ �������� ���� timeGetTask 
     */
    public Task6GetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeGetTask = time.getTime();
    }
    /**
     * �������� ������� ����������� �� �� ������ �7
     * @param time
     */
    public Task6GetTask() {
        // TODO Auto-generated constructor stub
        Date time = new Date();
        timeGetTask = time.getTime();
    }
    /**
     * ������� ����� ����������� ������� � ������������
     * @return
     */
    public long getTimeGetTask(){
        return timeGetTask;
        
    }
    
    
    

}
