package step00_과제_workshop01;

/*[����4]
 * ������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� ���� ���� b�� ���� true�� �ǵ��� ���α׷�
�� �ϼ� �Ͻÿ�.

char ch = 'z';
boolean b = ;
System.out.println(b);

1. ���� Ŭ����
Ŭ������ �޼ҵ� ����
Test04 +main(String args[]): void main �Լ� �ȿ��� ��� �ڵ� �۾� ����

2. ���� ���
����� �Ʒ��� ���� �̷�� ����.
true*/
public class Test04 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch=='z'||ch=='Z');
		System.out.println(b);
	}

}
