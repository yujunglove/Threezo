import java.util.Random;
import java.util.Scanner;
public class GameService1 {

	public void gameStart1() {

				String wolf = "";
				String girl = "";
				String dice = "";
				

				int wolfCount = 0;
				int girlCount = 0;
				
				//오프닝
			    System.out.println();
				System.out.println("늑대 : 흐흐흐... 오늘은 포동포동한 아기 돼지가 생각 나네..츄릅..");
				System.out.println("늑대 : 어디 돼지들을 잡아먹으러 가볼까?");
				System.out.println("(저벅저벅)");
			    System.out.println();
				System.out.println("(´･(00)･｀)첫쨰 돼지: 아니? 저기 멀리 산에서 늑대가 내려 오는 거 같아!");
				System.out.println("(´･(00)･｀)셋쨰 돼지: 형님들 어떡하죠! 저희 다 먹히게 생겼어요 집도 열심히 지었는데...");
			    System.out.println();
				System.out.println("(´･(00)･｀)둘쨰 돼지: 엉엉엉... 엄마...");
				System.out.println("(´･(00)･｀)첫쨰 돼지: 괜찮아! 이 별림반 친구가 도와줄거야! 친구야 너의 이름은 뭐니?");
				
			    System.out.println();
			    System.out.println();
			    System.out.println("플레이어의 이름을 입력해주세요 : ");
			    System.out.println();
			    Scanner sc4 = new Scanner(System.in);
			    String player = sc4.next();
			    System.out.print("(▼✪(oo)✪▼)돼지 삼형제 : 안녕! "+player+"친구! 그럼 늑대와 게임을 진행해서 우릴 구해줘!");
			    System.out.println();
			    System.out.println("　　∩＿＿＿∩");
			    System.out.println("　　|ノ　　　ヽ/⌒)");
			    System.out.println("　 /⌒)(ﾟ)　(ﾟ)/");
			    System.out.println("　/　/　(_●)ミ/");
			    System.out.println("（　ヽ　  |∪|／   크아앙!!!!!");
			    System.out.println("　＼　  　ヽノ/");
			    System.out.println("　 /　　　　/");
			    System.out.println("　｜　　　 /");
			    System.out.println("　｜　／＼ ＼");
			    System.out.println("　｜ /　　)　)");
			    System.out.println("　(_ﾉ　　(　＼");
			    System.out.println("　　　　　＼＿)");
			    
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 지푸라기 집이군! 어디 내가 바람을 후 불어볼까?");
			    System.out.println();
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 아니? 나한테 대결을 요청하다니 특별히 받아주지!! ");
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 :주사위 게임이다! ");
			    System.out.println();

				Scanner sc = new Scanner(System.in);
				System.out.println("주사위 게임을 시작합니다!");
				System.out.println("주사위를 던지세요.(\"던지기\" 작성)");
				String dicePlay = sc.nextLine();
				
				
				Random ran = new Random();

				if(dicePlay.equals("던지기")) {
					System.out.println("엔터를 입력하세요.");
					girl = sc.nextLine();
					while (true) {
						if (girl.equals("")) {
							int ranNum = ran.nextInt(6) + 1;
							girlCount = ranNum;
							System.out.println(player+"님의 숫자는 : " + ranNum + " 입니다.");
							System.out.println();
						}

						System.out.print("늑대가 주사위를 굴립니다.");
						wolf = sc.nextLine();

						if (wolf.equals("")) {
							int ranNum = ran.nextInt(6) + 1;
							wolfCount = ranNum;
							System.out.println("늑대의 숫자는 : " + ranNum + " 입니다.");
						}
						System.out.println();

						if (girlCount > wolfCount) {
					    	System.out.println();
							System.out.println("　 ∧∧");
						    System.out.println("　(｢･ω･)｢ 별림 별림 권법!");
						    System.out.println("　/　/");
						    System.out.println("`ノ￣ゝ");
							System.out.println("🧚-"+player+"님이 이겼습니다!");
					    	System.out.println();
						    System.out.println("(ง ˃ ³ ˂)ว ⁼³₌₃⁼³");
							System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 이걸 지다니!! 어서 도망가야겠다!!!");
							System.out.println("(▼✪(oo)✪▼)돼지 삼형제: 우와!!!"+player+"만세!!!");
							//GameService2 gameService2 = new GameService2();
							
						} else if (girlCount < wolfCount) {
							System.out.println("늑대가 이겼습니다");
							
							System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 크하하 너는 날 절대 이기지 못한다. 돼지들을 잡아먹겠다!");
							System.out.println("(▽-(00)-▽)돼지들 : 살려줘!!!!");
							System.out.println("GAMEOVER");
							break;
							
						} else {
							System.out.println("🧚-비겼습니다");
							System.out.println("🧚-게임을 계속 할까요? Y/N");
							dice = sc.nextLine();

							if (dice.equalsIgnoreCase("Y")) {
								continue;	
							}
							else if(dice.equalsIgnoreCase("N")){
								break;		
							}
						}
						System.out.println();

						System.out.println("게임에서 이겼습니다. 집을 지켜냈습니다!!");
						break;
						
					}
				}else {
					System.out.println("반드시 \"던지기\"라고 작성해야 합니다.");

				}
			
			
			}

		}