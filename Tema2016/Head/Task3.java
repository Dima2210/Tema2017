/**
 * 
 */
package MyRepository.Tema2016.Head;

/**
 * @author User
 * �������� ����������, ��������� n ����� � ��������� � ��� �������� �� ����� ������ 
 */
public class Task3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int x = 5;
        Task3 t3 = new Task3();
        t3.printlnString(x);
        t3.printString(x);

    }
    /**
     * ����� printlnString ������� �� ����� ���������� ���-�� ����� � ��������� ������� �� ����� ������� ����� ������� ������
     * @param n
     */
    void printlnString (int n) {
        for ( int index = 0; index < n; index++ ) {
        System.out.println("���");
        }
    }
    
    /**
     * ����� printString ������� �� ����� ���������� ���-�� ����� ��� ��������� ������� �� ����� ������� ����� ������� ������
     * @param n
     */
    void printString (int n) {
        for ( int index = 0; index < n; index++ ) {
            System.out.print("��� ��� ");
            }
    }

}
