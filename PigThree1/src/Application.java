import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String pigName1 = "첫째돼지";
		String pigName2 = "둘째돼지";
		String pigName3 = "첫째돼지";

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------------");
		System.out.println("	아 기 돼 지 삼 형 제 게 임		");
		System.out.println("-----------------------------------");
		
		System.out.println("귀여운 아기 돼지 3마리와 집을 업그레이드하고 게임을 진행하세요.		[enter]");
		sc.nextLine();
		System.out.println("당신과 함꼐 할 아기 돼지의 번호를 골라주세요.");
//		sc.nextLine();
		System.out.print("1. 첫째아기돼지 2. 둘째아기돼지 3. 셋째아기돼지			");
		int pigPick = sc.nextInt();

		switch (pigPick) {
		case 1:
			Pig1 pig1 = new Pig1();
			System.out.println("\n귀여운 " + pigName1 +"의 집을 예쁘게 만들어주세요!");
			System.out.println("요정 : " + pigName1 + "의 집을 만들기 위해서는 지푸라기를 모은 후, 집을 지어야 합니다! ");          
			System.out.println("-----------------------------------");
			System.out.println("\n요정 : 수행하실 메뉴에 해당하는 숫자를 입력해주세요."); 
			System.out.print("1. 집을 만들 지푸라기 모으기 / 2. 집 짓기 / 3. 게임 종료하기		");                    

			int num1 = sc.nextInt();

			
			if (num1 == 1) {
				pig1.home();

				System.out.print("집을 만들러 가려면 \"go\"라고 입력해야 해요!				");
				sc.nextLine();
				String next = sc.nextLine();

			if (next.equalsIgnoreCase("go")) {
				pig1.deco(); {
			} 
			}else if (num1 == 2) {
				System.out.println("집을 지을 지푸라기 먼저 모아야 해요! 처음부터 다시 시작하세요.");
			}else if(num1 == 3) {
				System.out.println("게임을 종료합니다.");
			}else{
				System.out.println("go만 입력해주세요! 게임을 다시 실행하세요.");
				break;
			}
			}

		case 2:
			Pig2 pig2 = new Pig2();
			System.out.println("\n울트라 짱 쎈 " + pigName2 +"의 집을 예쁘게 만들어주세요!");
			System.out.println("요정 : " + pigName2 + "의 집을 만들기 위해서는 돌맹이를 모은 후, 집을 지어야 합니다! ");          
			System.out.println("-----------------------------------");
			System.out.println("\n요정 : 수행하실 메뉴에 해당하는 숫자를 입력해주세요."); 
			System.out.print("1. 집을 만들 돌맹이 모으기 / 2. 집 짓기 / 3. 게임 종료하기		");                    

			int num2 = sc.nextInt();

			
			if (num2 == 1) {
				pig2.home();

				System.out.print("집을 만들러 가려면 \"go\"라고 입력해야 해요!				");
				sc.nextLine();
				String next = sc.nextLine();

			if (next.equalsIgnoreCase("go")) {
				pig2.deco();{
			}
			}else if (num2 == 2) {
				System.out.println("집을 지을 돌맹이 먼저 모아야 해요! 처음부터 다시 시작하세요.");
			}else if(num2 == 3) {
				System.out.println("게임을 종료합니다.");
			}else{
				System.out.println("go만 입력해주세요! 게임을 다시 실행하세요.");
				break;
			} break;
		}
		
		case 3:
			Pig3 pig3 = new Pig3();
			System.out.println("\n러블리한 " + pigName3 +"의 집을 예쁘게 만들어주세요!");
			System.out.println("요정 : " + pigName3 + "의 집을 만들기 위해서는 벽돌을 모은 후, 집을 지어야 합니다! ");          
			System.out.println("-----------------------------------");
			System.out.println("\n요정 : 수행하실 메뉴에 해당하는 숫자를 입력해주세요."); 
			System.out.print("1. 집을 만들 벽돌 모으기 / 2. 집 짓기 / 3. 게임 종료하기		");                    

			int num3 = sc.nextInt();

			
			if (num3 == 1) {
				pig3.home();

				System.out.print("집을 만드러 가려면 \"go\"라고 입력해야 해요!				");
				sc.nextLine();
				String next = sc.nextLine();

				if (next.equalsIgnoreCase("go")) {
					pig3.deco();
				} 
			}else if (num3 == 2) {
				System.out.println("집을 지을 벽돌 먼저 모아야 해요! 처음부터 다시 시작하세요.");
			}else if(num3 == 3) {
				System.out.println("게임을 종료합니다.");
			}else{
				System.out.println("go만 입력해주세요! 게임을 다시 실행하세요.");
				break;
			} 


			break;

		}



	}
}