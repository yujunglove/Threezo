import java.util.Scanner;

public class Pig3 extends PigDTO {

	@Override
	public void home() { 
		if(this.hp<100) {
			System.out.println("셋째돼지가 벽돌을 모두 구웠습니다!");
		}else {
			System.out.println("벽돌로 집을 만들러 가볼까요~?");
		}
	}

	@Override
	public void deco() {
		if (build == 0) { 
			System.out.println("*★。 • ˚ ˚ ˛ ˚ ˛ ★* 。 • ˚ ");
			System.out.println("•。★ 。 • ˚ ˚ ˛ ˚ ˛  ★ 。* 。");
			System.out.println("° 。 ° ˚* _Π_____*。*˚*");
			System.out.println("˚ ˛ •˛•*/______/~＼。˚ ˚ ˛* ");
			System.out.println("˚ ˛ •˛• ｜   田田｜門｜");
			System.out.println("🧚-셋째돼지가 으리으리한 벽돌집을 다 지었어요.");

			Scanner sc = new Scanner(System.in);

			System.out.print("셋째 돼지가 화원에 가서 씨앗을 사와야 해요. 일단 f를 눌러주세요! ");

			while(true) {
				

				String make1 = sc.nextLine();
				
			if(make1.equalsIgnoreCase("z")) {
				System.out.println("탐스러운 사과가 달린 사과나무가 자랐습니다!");
				new GameService3().gameStart3();
			} else if (make1.equalsIgnoreCase("t")) {
				System.out.println("정원에 작은 새싹이 자랐습니다. 아직은 부족해 보이네요~");
				System.out.println("거의 다 왔어요!! z를 눌러주세요!");
				continue;
			} else if (make1.equalsIgnoreCase("s")) {
				System.out.println("정원에 해바라기가 피었습니다~ 조금 더 근사해졌어요!");
				System.out.println("다음은 t를 눌러주세요!");
				continue;
			} else if (make1.equalsIgnoreCase("f")) {
				System.out.println("정원에 아무것도 없어요! 어서 씨앗을 심어주세요!!");
				System.out.println("다음은 s를 눌러주세요!");
				continue;
			} else {
				System.out.println("순서대로 다시 입력해주세요.");
			}break;
		}
		}
	}
}