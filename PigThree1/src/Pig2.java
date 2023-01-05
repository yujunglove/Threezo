import java.util.Scanner;

public class Pig2 extends PigDTO {

	@Override
	public void color() { 
		if(this.hp<100) {
			System.out.println("둘째돼지가 대리석을 친구들에게 다 얻었습니다!");
		}else if(this.hp<50) {
			System.out.println("첫째돼지가 대리석을 50% 얻었어요 아직 더 얻어야 해요 !");
		}else {
			System.out.println("대리석이 모두 모아졌어요, 어서 집을 만들어주세요!");
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
		public void door() {
			if (hp >= 50) { 
				System.out.println("*★。 • ˚ ˚ ˛ ˚ ˛ ★* 。 • ˚ ");
				System.out.println("•。★ 。 • ˚ ˚ ˛ ˚ ˛  ★ 。* 。");
				System.out.println("° 。 ° ˚* _Π_____*。*˚*");
				System.out.println("˚ ˛ •˛•*/______/~＼。˚ ˚ ˛* ");
				System.out.println("˚ ˛ •˛• ｜   田田｜門｜");
				System.out.println("둘째돼지가 으리으리한 대리석 집을 다 지었어요.");
				System.out.println();
				System.out.println("둘째돼지가 자랑을 해야 발코니를 넓힐 수 있어요. 자랑은 랜덤값으로 채워집니다."); 
				System.out.println("다음 메뉴가 넘어갈때 까지 2번을 눌러 계속 집의 자랑을 높여주세요");
				System.out.println();
				hp += 10;
				count++;
				System.out.println("둘째돼지가 " + count+"번 친구들에게 집을 자랑했어요 마당을 청소할 수 있어요");
				System.out.println("현재 둘째돼지의 집인상은 " + hp + "입니다." );
				
				if (bulid == count) {
					Scanner sc = new Scanner(System.in);
					while(true) {
						System.out.print("친구들에게 하는 집 자랑이 " + count +"번만에 완료되었어요!"+"이제는 발코니를 확장해 봐요");
						System.out.println();
						System.out.print("여러분이 누르시는 키에 따라 발코니가 확장됩니다! ( z , x , c , v)중 하나를 아무거나 눌러보세요! ");
						String make = sc.nextLine();
						
						if(make.equalsIgnoreCase("c")) {
							System.out.println("발코니의 평수가 100% 입니다 !! 이제 다른 친구들에게도 자랑을 할 수 있겠네요 ");
							new GameService2().gameStart2();
						} else if (make.equalsIgnoreCase("z")) {
							System.out.println("발코니의 평수가 50% 입니다! 더 넓혀야겠는걸요?");
							System.out.println("다른 v , c , x 중 키를 눌러보세요 !");
							System.exit(0);
						} else if (make.equalsIgnoreCase("x")) {
							System.out.println("발코니의 평수가 70%입니다! 얼마 안남았어요 첫째돼지와 더 넓혀주세요!");
							System.out.println("다른 v , c , z 중 키를 눌러보세요 !");
							System.exit(0);
						} else if (make.equalsIgnoreCase("v")) {
							System.out.println("발코니의 평수가 0%입니다! 어서 넗혀주세요!");
							System.out.println("다른 x , c , z 중 키를 눌러보세요 !");
							System.exit(0);
						} else {
							System.out.println("z , x , c , v 중 하나만을 입력해야합니다. 다시 입력해주세요.");
						}continue;
				}
			}
			
			
		}
	}

	@Override
	public void furniture() {
		// TODO Auto-generated method stub
		
	}
				
			

		
	}

