/**
 *fsdafsasafsadfsafsaf   dsadasdasd
 *  dasdasdsadasdasdasdv asf asdasdadasd
 *  ������ �� 2 ���� ����� ������
 *  �� ���� �������� ���������� ������� ����� ������� ������������, ���� � ����� ��������� �������, � ����� ���� �
 *  ����� ����� �������. ��� ��������� ��������� ���� � ������� ������� ������������ ����� Date. �������� ����������
 *  � ��������� ����� , ������� ��� ������������ � HTML-���� � ����������� ���������� �������� � Web-���������.
 */
package MyRepository.Tema2016.Tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ���� 2 ������ 1
 * @author User
 * ������ n ����� � �������, ����� ����� ������� ������. ������� �������� ������ � �� �����
 *
 */
public class Tema2Task1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("���");
        //������ ����� 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        // ������ ����� �� ������ � ������ markSupported() ���� ������� ���������
        // ��������� ����� ��� ���������� ���������� � �������  ��� �������� ���� �� for � ��������������� ������ � ������� ���-�� �����
        while (reader.markSupported()) {
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                System.out.println("А вОТ ошибочка возникла иза 1обработки  String ");

            }
        }
        // ���� ��� ������ �� ����� �������� ����� � ��������� �� ������� � ����� ����������� ����� ������ ������
        for (int index = 0; index < list.size(); index ++) {
            System.out.println("�������� ������; " + list.get(index) + "Ÿ ������ ����� " );
        }

        
        

    }

}
