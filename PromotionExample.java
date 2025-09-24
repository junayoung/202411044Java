package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		int x = 10;
        int y = 10;
        int z;

        // x 증가
        ++x;
        System.out.println("x = " + x);
        System.out.println("------");

        // y 감소
        y--;
        System.out.println("y = " + y);
        System.out.println("------");

        // 후위 증가
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("------");

        // 전위 증가
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("------");

        // 전위 증가 + 후위 증가
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

	}

}
