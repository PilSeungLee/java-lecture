import student.EleStudent;
// student 패키지 내에 EleStudent 라는 클래스만 사용

//import java.io.*;

//또는 import student.*; 
//student 패키지 및 폴더에 있는 모든 클래스를 참조할 수 있다

public class PackageExample {

	public static void main(String[] args) {
		EleStudent ele = new EleStudent();
		ele.name = "이종석";
		ele.grade = 4;

	}

}
