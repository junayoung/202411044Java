package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 14;
		int v2 = 0; // int v2 밖에서 선언
		
		if(v1>10) {
			v2 = v1 - 10; // 값만 대입
		}
		int v3 = v1 + v2 + 5;

	}

}
