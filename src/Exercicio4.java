import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int qua = i * i;
			int cub = i * i * i;
			System.out.println(i + " " + qua + " " + cub);
		}
		
		sc.close();
	}

}
