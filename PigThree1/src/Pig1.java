import java.util.Scanner;

public class Pig1 extends PigDTO {
	
		@Override
		public void color() { 
			if(this.hp<100) {
				System.out.println("첫째돼지가 지푸라기를 친구들에게 다 얻었습니다!");
			}else if(this.hp<50) {
				System.out.println("첫째돼지가 지푸라기를 50% 얻었어요 아직 더 얻어야 해요 !");
			}else {
				System.out.println("지푸라기가 모두 모아졌어요, 어서 집을 만들어주세요!");
				
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
				System.out.println("🧚- 첫쨰돼지가 반짝반짝한 지푸라기 집을 다 지었어요.");
				System.out.println();
				System.out.println("🧚-첫쨰돼지가 자랑을 채워야 해야 마당을 가꿀 수 있어요. 자랑은 랜덤값으로 채워집니다."); 
				System.out.println("🧚-다음 메뉴가 넘어갈때 까지 2번을 눌러 계속 집인상을 높여주세요");
				System.out.println();
				

				hp += 10;
				count++;
				System.out.println("첫쨰돼지가 " + count+"번 친구들에게 집을 자랑했어요 마당을 청소할 수 있어요");
				System.out.println("현재 첫째돼지의 집인상은 " + hp + "입니다." );
				
				if (bulid == count) {
					Scanner sc = new Scanner(System.in);
					while(true) {
						System.out.print("친구들에게 하는 집 자랑이 " + count +"번만에 완료되었어요!"+"이제는 마당의 청결함을 가꿔봐요.");
						System.out.println();
						System.out.print("여러분이 누르시는 키에 따라 마당의 청결함이 바뀝니다!( z , x , c , v)중 하나를 아무거나 눌러보세요! ");
						String make1 = sc.nextLine();
						
						if(make1.equalsIgnoreCase("c")) {
							System.out.println("마당의 청결함이 100% 입니다 !! 이제 다른 친구들에게도 자랑을 할 수 있겠네요 ");
							new GameService1().gameStart1();
						} else if (make1.equalsIgnoreCase("z")) {
							System.out.println("마당의 청결함이 50%입니다! 더 치워야겠는걸요?");
							System.out.println("다른 x , c , v 중 키를 눌러보세요 !");
							continue;
						} else if (make1.equalsIgnoreCase("x")) {
							System.out.println("마당의 청결함이 70%입니다! 얼마 안남았어요 첫째돼지와 더 치워주세요!");
							System.out.println("다른 z , c , v 중 키를 눌러보세요 !");
							continue;
						} else if (make1.equalsIgnoreCase("v")) {
							System.out.println("마당의 청결함이 0%입니다! 어서 치워주세요!");
							System.out.println("다른 x , c , z 중 키를 눌러보세요 !");
							continue;
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
