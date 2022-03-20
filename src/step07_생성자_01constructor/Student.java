package step07_생성자_01constructor;
/*-name:String
 * -kor: int
 * -eng: int
 * -mat: int
 * 
 * +Student()
 * +Student(name: String, kor:int, eng:int,mat:int)
 * +setter& getter
 * +getTotal():int  <-kor+eng+mat를 리턴
 * +getAvg():double <- getTotal()의 평균 리턴
 * +getGrade():char <- 90이상 A 80 B 70C 60D F학점을 구하여 리턴.
 * +toString():String
 */
public class Student {
private String name;
private int kor;
private int eng;
private int mat;

public Student() {//디폴트 생성자
	
}
public Student(String name,int kor, int eng, int mat) {
	super();
	this.name=name;
	this.kor=kor;
	this.eng=eng;
	this.mat=mat;
}

public String getName() {
	return name;
}
public int getKor() {
	return kor;
}
public int getEng() {
	return eng;
}
public int getMat() {
	return mat;
}
public void setName(String name) {
	this.name = name;
}
public void setKor(int kor) {
	this.kor = kor;
}
public void setEng(int eng) {
	this.eng = eng;
}
public void setMat(int mat) {
	this.mat = mat;
}

public int getTotal() {
	return kor+eng+mat;
}
public double getAvg() {
	return (double)getTotal()/3;
}
public char getGrade() {
	 switch((int)getAvg()/10) {
			case 10:
			case 9: return'A';  
			case 8: return 'B'; 
			case 7: return 'C'; 
			case 6: return 'D'; 
			default: return 'F';
			}
}
public String toString() {
	return "홍길동의 점수는 "+getTotal()+"점이며 평균은 "
+String.format("%.2f", getAvg())+"이고 학점은 "+getGrade()+"입니다";
}

}
