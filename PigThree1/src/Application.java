
import java.util.Scanner;
public class Application {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("-----------------------------------");
			System.out.println("원하는 아기 돼지를 골라주세요.");
//						System.out.println("돼지에 따라 해당하는 게임이 각각 다릅니다."); 
			System.out.println("1. 첫째아기돼지 2. 둘째아기돼지 3. 셋째아기돼지");
			System.out.println("-----------------------------------");

			int pigpick = sc.nextInt();
			sc.nextLine();

			String pig = "";

			while (true) {
				switch (pigpick) {
				case 3:
					pig = "셋째돼지";
					Pig3 pig3 = new Pig3();

					System.out.println(pig + " : " + "좋아! 나의 집을 만들러 가보자~!!");

					System.out.print("\n \"y\" / \"n\"	\n");
					;
					System.out.println();
					System.out.println("-----------------------------------");

					while (true) {
						String anwser = sc.nextLine();
						if (anwser.equalsIgnoreCase("y")) {
							System.out.print(pig + " : 고마워 잘 부탁해..!\n");
							System.out.println("\n귀여운 " + pig + "와 함께 집을 만들어 봅시다!");
							System.out.println("\n귀여운 " + pig + "와 함께 집을 만들어 봅시다!");

							sc.nextLine();

							Pig3 p3 = new Pig3();
							p3.door();

							
						} else if (anwser.equalsIgnoreCase("n")) {
							System.out.println(pig + " : 다시 생각 부탁해.. 제발	");
						} else {
							System.out.println("🧚 : 수행 할 수 없는 걸 눌렀어! 다시 눌러줘");
						}
					}
				}
			}
		}
	

}
