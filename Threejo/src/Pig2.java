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
			System.out.println("🧚-둘째돼지가 향기로운 나무 집을 다 지었어요.");

			Scanner sc = new Scanner(System.in);

			System.out.print("\n여러분이 누르시는 키에 따라 발코니가 확장됩니다!일단 F를 눌러주세요! ");

			while(true) {
				

				String make1 = sc.nextLine();
				
			if(make1.equalsIgnoreCase("z")) {
				System.out.println("발코니를 모두 확장했어요! 세상에서 제일 멋진 발코니를 가진 돼지입니다~");
				new GameService2().gameStart2();
			} else if (make1.equalsIgnoreCase("t")) {
				System.out.println("발코니에 잔디를 깔았어요! 꽤나 멋있는걸요?");
				System.out.print("\n거의 다 왔어요!! \"Z\"를 눌러주세요! ");
				continue;
			} else if (make1.equalsIgnoreCase("s")) {
				System.out.println("발코니가 너무 작아요... 여기선 파티도 못하겠어요!");
				System.out.print("\n다음은 \"T\"를 눌러주세요! ");
				continue;
			} else if (make1.equalsIgnoreCase("f")) {
				System.out.println("발코니가 없습니다. 발코니를 만들어주세요~");
				System.out.print("\n다음은 \"S\"를 눌러주세요! ");
				continue;
			} else {
				System.out.print("\n순서대로 다시 입력해주세요. 초기화면으로 돌아갑니다. ");
			}break;
		}
		}
	}

		
	}
