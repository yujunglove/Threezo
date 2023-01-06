import java.util.Scanner;

public class Pig1 extends PigDTO {

	@Override
	public void home() { 
		if(this.hp<100) {
			System.out.println("\n첫째돼지가 지푸라기를 친구들에게 다 얻었습니다!");
		}else {
			System.out.println("\n지푸라기가 모두 모아졌어요, 어서 집을 만들어주세요!");
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
			System.out.println("🧚-첫째돼지가 반짝반짝한 지푸라기 집을 다 지었어요.");

			Scanner sc = new Scanner(System.in);

			System.out.print("\n여러분이 누르시는 키에 따라 마당의 청결함이 올라갑니다! 일단 f를 눌러주세요! ");

			while(true) {
				

				String make1 = sc.nextLine();
				
				if(make1.equalsIgnoreCase("z")) {
					System.out.println("마당의 청결함이 100% 입니다 !! 이제 다른 친구들에게도 자랑을 할 수 있겠네요 ");
					new GameService1().gameStart1();
				} else if (make1.equalsIgnoreCase("t")) {
					System.out.println("마당의 청결함이 50 올라갑니다! 더 치워야겠는걸요?");
					System.out.print("\n거의 다 왔어요!! z를 눌러주세요! ");
					continue;
				} else if (make1.equalsIgnoreCase("s")) {
					System.out.println("마당의 청결함이 20 올라갑니다! 얼마 안남았어요 첫째돼지와 더 치워주세요!");
					System.out.print("\n다음은 t를 눌러주세요! ");
					continue;
				} else if (make1.equalsIgnoreCase("f")) {
					System.out.println("마당의 청결함이 10 올라갑니다! 어서 치워주세요!");
					System.out.print("\n다음은 s를 눌러주세요! ");
					continue;
				} else {
					System.out.print("\n순서대로 다시 입력해주세요. 초기화면으로 돌아갑니다. ");
				}break;
		}
		}
	}
}
	

