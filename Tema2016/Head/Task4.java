/**
 * 
 */
package MyRepository.Tema2016.Head;

/**
 * �������� ���������� ��� ����� ������ �� ��������� ������ � ��������� ��� �� ������� - ��������
 * @author User
 *
 */
public class Task4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Task4 t4 = new Task4();
        t4.start();

    }
    
    public void start (){
        //������ ������ � ������� ��� � Task4Keys tKeys
        String s = "121";
        
        Task4Keys tKeys = new Task4Keys(s);


        // ������� ������ ������������
        Task4CommandLineInput user = new Task4CommandLineInput();
       // ��������� �� 28.11.16
        user.setKeyUser();
        // ��������� ������ ������������ � ���������� � tKeys

        Task4Equals tequals = new Task4Equals(user.getKeysUser(),tKeys.getKeys());
        tequals.printTask4Equals();
    }

}
