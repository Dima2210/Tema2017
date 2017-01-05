/**
 * 
 */
package MyRepository.Tema2016.Head;

/**
 * ����� ��� ��������� ���� �������
 * @author User
 *
 */
public class Task4Equals {

    /**
     * ���� ������� �������� ��������� ���������
     */
    private boolean equalsKeys = false;
    /**
     * � ������������ ��������� �������� ���� ����� �� ��������� 
     */
    public Task4Equals(String s1, String s2) {
        // TODO Auto-generated constructor stub
        //return s1 == null ? s2 == null : s1.equals(s2);
        if (s1 != null && s2 != null) {
           equalsKeys = s1.equals(s2);
        } else {
            System.out.println("�������� ������� ���������� �� null �� �������� ");
        }
    }
    
    public void printTask4Equals (){
        if(equalsKeys ){
            System.out.println("������ �������");
        } else {
            System.out.println("� ������ �� �� ��� )");
        }
    }

}
