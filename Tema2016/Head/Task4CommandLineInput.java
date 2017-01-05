/**
 * 
 */
package MyRepository.Tema2016.Head;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ����� ��� ��������� � ������������ ������ 
 * @author User
 *
 */
public class Task4CommandLineInput {

    /** 
     * ������ 4
     * ��������� ������ �������� ������ �������� ������������� 
     */
    private String keysUser; 
    /** ��������� 28.11.16
     * ������ 5
     *  ��������� ������ �������� ����� ����� �������� ������������� 
     */
    
    private long numberUser;
    /**
     * ����������� ���� ����������� �������� � ������������ ����  (String)
     * @
     */
    /* ������� �� 25.11.16
    public Task4CommandLineInput() {
        // TODO Auto-generated constructor stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� ���������� ");
        try {
            keysUser = reader.readLine();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    */
    // ������� �� 28.11.16
    /**
     * ����� ������ ����������� ��������� ���� keysUser
     */
    public  void setKeyUser () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� ��� ");
        try {
            keysUser = reader.readLine();

        } catch (IOException e) {
            // TOsddsadDO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getKeysUser() {
        return keysUser;
    }
    
    //������� � ������ �5 �� 28.11.16
    public void setNumberUser(){
       // �� ���� ������������� �.� �� ����� ������ ��� �������� ��� ����� � ��������� ���� long ��� ��� 
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� ����� �����: ");
        
        try{
            String s = reader.readLine();
            long l = Long.parseUnsignedLong(s);
            numberUser = l;
        } catch (IOException e){
            //e.printStackTrace();
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� �����: ");
        if (sc.hasNextLong()){
            numberUser = sc.nextLong();
        } else {
            System.out.println("��������� �������� ������ ��� �� ������������� ������������� ����");
        }
    }

    /**
     * ���������
     * @return
     */
    public static void readNamber() {

        // ������� �� 09.12.16
    /*  public static long readNamber() {
        Scanner sc = new Scanner(System.in);
        long summa = 0;
       do {
            System.out.println("������� ����� �����: ");
            if (sc.hasNextLong()) {
                summa = +sc.nextLong();
           // } else if ("Enter".equals(sc.nextLine())) {
           //     return summa;
            } else if (!"Enter".equals(sc.nextLine())){
                System.out.println("��������� �������� ������ ��� �� ������������� ������������� ����");
               // throw new RuntimeException(" �������� ���������� �� ������������� ���� Long");

            } else {
                System.out.println("����� ����� " + summa);
            }
        } while(!"Enter".equals(sc.nextLine()));
       System.out.println("����� ����� " + summa);
        return summa;
        */
        //������� 09.12.16
        
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� �����: ");
        long summa = 0;
        do {
            if (sc.hasNextLong()) {
                summa += sc.nextLong();
            } else {
String stt = sc.next();
                if ("Enter".equals(sc.nextLine())) {
                    System.out.print("����� �������� ����� ����� " + summa);
                } else if (!"Enter2".equals(stt)) {
                    System.out.println("�������� �������� �� ������������� ���� long");
                    throw new RuntimeException("�������� �������� �� ������������� ���� long");
                }
            }
        } while (sc.hasNext());
        System.out.print("��� ����� �������� ����� ����� " + summa);
    }

    public long getNumberUser() {
        return numberUser;
    }
}
