import java.util.Random;
import java.util.Scanner;

public class Pig3 extends PigDTO {
	
	@Override
	public void color() { 
		if(this.hp<100) {
			System.out.println("벽돌을 모두 구웠어요~ 어서 집을 만들어주세요!");
		}else if(this.hp<50) {
			System.out.println("아직 벽돌이 부족합니다. 더 필요해요!");
		}else {
			System.out.println("셋째돼지가 가마에 벽돌을 굽고있습니다!");	
		}
	}

	@Override
	public void door() {
		if (hp >= 50) {
			System.out.println("*★。 • ˚ ˚ ˛ ˚ ˛ ★* 。 • ˚ ");
			System.out.println("•。★ 。 • ˚ ˚ ˛ ˚ ˛  ★ 。* 。");
			System.out.println("° 。 ° ˚* _Π_____*。*˚*");
			System.out.println("˚ ˛ •˛•*/______/~＼。˚ ˚ ˛* ");
			System.out.println("˚ ˛ •˛• ｜   田田｜門｜");
			System.out.println("셋째돼지가 으리으리한 벽돌 집을 다 지었어요.");
			System.out.println();
			System.out.println("셋째 돼지가 화원에 가서 씨앗을 사와야 해요. 씨앗은 랜덤값으로 채워집니다."); 
			System.out.println("다음 메뉴가 넘어갈때 까지 2번을 눌러 계속 씨앗을 사와주세요");
			System.out.println();

			hp += 10;
			count++;
			System.out.println("셋째돼지가 \" + count+\"개의 씨앗을 구매했어요");
			System.out.println("현재 셋째돼지의 정원의 점수는 \" + hp + \"입니다." );
			
			if (bulid == count) {
				Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.print("씨앗을 사왔으니 이제 심어야겠죠? ");
					System.out.print("씨앗 심기가 " + count +"번만에 완료되었어요!"+"이제는 정원을 바꿔봐요");
					System.out.println();
					System.out.print("여러분이 누르시는 키에 따라 정원을 가꿉니다!( z , x , c , v)중 하나를 아무거나 눌러보세요! ");
					String make = sc.nextLine();
					
					if(make.equalsIgnoreCase("c")) {
						System.out.println("큰 사과나무가 자랐습니다! ");
						new GameService3().gameStart3();
						
					} else if (make.equalsIgnoreCase("z")) {
						System.out.println("정원에 작은 새싹이 자랐습니다. 아직은 부족해 보이네요~");
						System.out.println("다른 x , c , v 중 키를 눌러보세요 !");
						System.exit(0);
					} else if (make.equalsIgnoreCase("x")) {
						System.out.println("정원에 해바라기가 피었습니다~ 조금 더 근사해졌어요");
						System.out.println("다른 v , c , z 중 키를 눌러보세요 !");
						System.exit(0);
					} else if (make.equalsIgnoreCase("v")) {
						System.out.println("정원에 아무것도 없어요! 어서 씨앗을 심어주세요!");
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