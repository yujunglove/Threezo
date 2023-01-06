import java.util.Arrays;
import java.util.Scanner;
public class GameService2 {

		void gameStart2() {
			
//			public static void main(String[] args) {
			final int life = 5; 			// 시도할 수 있는 횟수
			int count = 0;
			String solution;
			Scanner sc = new Scanner(System.in);
			
			String[] words = { "소녀시대"};
			char index1 = nextLine(words.length);
			solution = words[index1]; 			// 인덱스의 문자열 지정
			char[] test = solution.toCharArray();		// 정답 배열
			char[] answer = new char[solution.length()]; 	// 답을 넣을 배열
			for (int i = 0; i < answer.length; i++) {
				answer[i]=' ';		// 맞춰야할 answer 배열은 공백으로 초기화한다
			}
				
			Scanner sc1 = new Scanner(System.in);
			
			//오프닝

		    System.out.println();
			System.out.println("늑대 : 흐흐흐... 오늘은 포동포동한 아기 돼지가 생각 나네..츄릅..");
			System.out.println("늑대 : 어디 돼지들을 잡아먹으러 가볼까? (저벅저벅)");

			sc1.nextLine();
			System.out.println("(´･(00)･｀)첫쨰 돼지: 아니? 저기 멀리 산에서 늑대가 내려 오는 거 같아!");
			System.out.println("(´･(00)･｀)셋쨰 돼지: 형님들 어떡하죠! 저희 다 먹히게 생겼어요 집도 열심히 지었는데...");
			sc1.nextLine();
			System.out.println("(´･(00)･｀)둘쨰 돼지: 엉엉엉... 엄마...");
			System.out.println("(´･(00)･｀)첫쨰 돼지: 괜찮아! 이 별림반 친구가 도와줄거야! 친구야 너의 이름은 뭐니?");
			
		    System.out.println();
		    System.out.print("플레이어의 이름을 입력해주세요 : ");
			
		    Scanner sc4 = new Scanner(System.in);
		    String player = sc4.next();
		    System.out.print("\n(▼✪(oo)✪▼)돼지 삼형제 : 안녕! "+player+" 친구!! 그럼 늑대와 게임을 진행해서 우릴 구해줘!!!");
			sc1.nextLine();
		    System.out.println("\n　　 ∩＿＿＿∩");
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
		    
		    sc1.nextLine();
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 단단한 나무집이군! 어디 내가 바람을 후 불어볼까?");
			sc1.nextLine();
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 아니? 나한테 대결을 요청하다니 특별히 받아주지!! ");
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 행맨 게임과 같은, 4글자 가요 맞추기 게임이다! ");
			sc1.nextLine();
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 내가 내는 문제는 우리나라의 가요다!");
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 한글자씩 이야기 해야 하고, 총 1문제를 낼거다 기회는 단...1번! 틀린다면 너와 돼지들을 몽땅 잡아먹겠다!");
			System.out.println();
			System.out.println(player + "님 [Enter]를 눌러 도전하세요.");

			String str2=sc.nextLine();
				
			System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 어리다고 놀리지 말아요.수줍어서 말도 못하고. 어리다고 놀리지말아요.. 스쳐가는 얘기 뿐인걸!");
//			String str3=sc.nextLine();

			while (true) {
				System.out.print("\n한 글자씩 가사의 노래 이름을 적어주세요~");
				System.out.print("\n현재의 상태: ");
				for (int i = 0; i < answer.length; i++) {
					if(answer[i]==' ') {
					System.out.print("_"); 				// 맞추지 못한 문자수 만큼 '_' 표시
					}else {
					System.out.print(answer[i]);
					}
					}
					
				if(Arrays.equals(answer, test)) {			// 배열을 비교할때 사용하는 메소드
			    	System.out.println();
					System.out.println("　 ∧∧");
				    System.out.println("　(｢･ω･)｢ 별림 별림 권법!");
				    System.out.println("　/　/");
				    System.out.println("`ノ￣ゝ");
				    System.out.println("\n🧚-"+player+"님이 이겼습니다!");
				    
				    sc1.nextLine();
				    
				    System.out.println("(ง ˃ ᴥ ˂)ว ⁼³₌₃⁼³");
					System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 아이고! 맞추다니 분하구나! 나의 노래실력이 너무 대단해서 맞춘거겠지??");
					System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 이걸 지다니!! 그리고 대리석 집이라 안 불어지네?? 어서 도망가야겠다!!!");
					
					sc1.nextLine();
					
					System.out.println("(▼✪(oo)✪▼)돼지 삼형제: 우와!!! "+player+"님 만세!!!");
					
				}
					
					
//				System.out.println("\n남은 기회 : " + (life-count));
				if (life-count == 0) { 
					System.out.println();
					System.out.println("\n늑대가 이겼습니다");
					sc1.nextLine();
					System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 크하하 너는 날 절대 이기지 못한다. 돼지들을 잡아먹겠다!");
					System.out.println("(´･(00)･｀)돼지들 : 살려줘!!!!");
					sc1.nextLine();
					System.out.println("GAMEOVER");
					System.out.println();
					System.out.println("🧚-게임을 다시 시작하세요.");
					System.out.println("🧚-게임을 종료합니다.");
					System.out.println();
					break;
					}
					System.out.println();
					char g = sc.next().charAt(0); 			
					for (int j = 0; j < test.length; j++) {
						if(test[j]==g) {
							answer[j]=g;
							System.out.print("돼지 삼형제 : "+player+"님 화이팅!!");
						}
					}
					count++;
					
				}

				
			}
			
		private char nextLine(int length) {
			// TODO Auto-generated method stub
			return 0;
		}

	}