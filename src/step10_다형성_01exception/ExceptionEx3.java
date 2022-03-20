package step10_다형성_01exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception : ����� ����ó���� �ʿ�
public class ExceptionEx3 {
	int str;

	public ExceptionEx3()/* throws IOException */ {
		input();
	}

	public void input() /* throws IOException */ {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ��� �Է��ϼ���");
		try{str=Integer.parseInt(br.readLine());}
		catch (IOException e) {
			System.out.println("�Էµ� ���� ������ �ִµ�....1");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("�Էµ� ���� ������ �ִµ�....2");
		}catch (Exception e) {// �̰� ���� ���ٿ� ������ IOException ����� ���ܵ��� 
			//���� �����̶� �̹� Exception������ ó���� �Ǿ� ������. ���� Exception�� ���� �Ʒ� ��ġ���ش�.
				System.out.println("�Էµ� ���� ������ �ִµ�....3");
	}
	}
	public void output() {
		System.out.println("��� : "+str);
	}

	public static void main(String[] args)/* throws IOException */ {
		new ExceptionEx3().output();
		System.out.println("---------------------");
	}

}
