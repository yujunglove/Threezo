import java.util.Scanner;

public class Pig2 extends PigDTO {

	@Override
	public void home() { 
		if(this.hp<100) {
			System.out.println("\n둘째돼지가 나뭇가지를 친구들에게 다 얻었습니다!");
		}else {
			System.out.println("\n둘째돼지가 나무를 다 모아서 집을 완성했어요!");
		}
	}

	@Override
	public void deco() {
		if (build == 0) { 
			System.out.println("\n*★。 • ˚ ˚ ˛ ˚ ˛ ★* 。 • ˚ ");
			System.out.println("•。★ 。 • ˚ ˚ ˛ ˚ ˛  ★ 。* 。");
			System.out.println("° 。 ° ˚* _Π_____*。*˚*");
			System.out.println("˚ ˛ •˛•*/______/~＼。˚ ˚ ˛* ");
			System.out.println("˚ ˛ •˛• ｜   田田｜門｜");
			System.out.println("🧚-둘째돼지가 반짝반짝한 나무 집을 다 지었어요.");

			Scanner sc = new Scanner(System.in);

			System.out.print("\n여러분이 누르시는 키에 따라 발코니가 확장됩니다!일단 f를 눌러주세요! ");

			while(true) {
				

				String make1 = sc.nextLine();
				
			if(make1.equalsIgnoreCase("z")) {
				System.out.println("발코니의 평수가 100% 입니다 !! 이제 다른 친구들에게도 자랑을 할 수 있겠네요 ");
				new GameService2().gameStart2();
			} else if (make1.equalsIgnoreCase("t")) {
				System.out.println("발코니의 청결함이 50 올라갑니다! 더 치워야겠는걸요?");
				System.out.print("\n거의 다 왔어요!! "Z"를 눌러주세요! ");
				continue;
			} else if (make1.equalsIgnoreCase("s")) {
				System.out.println("발코니의 평수가 20 올라갑니다! 얼마 안남았어요 첫째돼지와 더 넓혀주세요!");
				System.out.print("\n다음은 "T"를 눌러주세요! ");
				continue;
			} else if (make1.equalsIgnoreCase("f")) {
				System.out.println("발코니의 평수가 0입니다! 어서 넗혀주세요!");
				System.out.print("\n다음은 "S"를 눌러주세요! ");
				continue;
			} else {
				System.out.print("\n순서대로 다시 입력해주세요. 초기화면으로 돌아갑니다. ");
			}break;
		}
		}
	}

		
	}
