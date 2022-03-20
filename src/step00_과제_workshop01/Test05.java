package step00_과제_workshop01;
/*[����5]
ȭ���� ������ �����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
C(celcius): ����, F(fahrenheit): ȭ��
����: C = 5/9 * (F-32)

1. ���� Ŭ����
Ŭ������ �޼ҵ� ����
Test05 +main(String args[]): void main �Լ� �ȿ��� ��� �ڵ� �۾� ����

2. ���� ���
����� �Ʒ��� ���� �̷�� ����. 
Fahrenheit:100
Celcius:37.77778
*/

public class Test05 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ((float)fahrenheit-32)*5/9;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
