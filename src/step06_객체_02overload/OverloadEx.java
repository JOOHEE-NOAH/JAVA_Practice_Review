package step06_객체_02overload;

/*�����ε� �޼��� overload method, �Ǵ� �ߺ��Լ� : ���� �̸��� �Լ��� ������ ����.
 * 1. �ݵ�� �Լ��̸��� �����ؾ���.
 * 2. �Ű������� �ڷ����� �ٸ��ų� ������ �޶�� ��.
 *  
 * */
public class OverloadEx {
	int x=17;
	int y=15;
	public int max() {
		return (x>y)? x:y;
	}
	public int max(int x, int y) { // x,y�� ��������. �Ű������� ������ �ٸ�.
		//�� �������� (���������� ������ �̸��� ������)���������� ������.
		return (x>y)? x:y;
	}
	public float max(float x, float y) { // x,y�� ��������. �Ű������� ������ �ٸ�.
		//�� �������� (���������� ������ �̸��� ������)���������� ������.
		return (x>y)? x:y;
	}
	public static void main(String[] args) {
		OverloadEx ob=new OverloadEx();
		System.out.println("ū�� : "+ob.max());
		System.out.println("ū�� : "+ob.max(75,100));
		System.out.println("ū�� : "+ob.max(75f,100f));
	}

}
