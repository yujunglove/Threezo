import java.util.Scanner;

import javax.sound.sampled.AudioFormat.Encoding;

	public class GameService3{
		
		public void gameStart3() {
		      Scanner sc = new Scanner(System.in);
		      
		      long a = 0;
		      long b = 0;
		      double result = 0;
		      
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
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 벽돌 집이군! 어디 내가 바람을 후 불어볼까?");
			    System.out.println();
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 아니? 나한테 대결을 요청하다니 특별히 받아주지!! ");
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 첫번째는 주사위 게임이다! ");
			    System.out.println();
			    System.out.println(player + "님 <Enter>를 눌러 도전하세요.");
		      //sc.nextLine();
		      a = System.currentTimeMillis();
		      
		      System.out.println("7초가 되었을 때 <Enter>를 눌러주세요.");
		      sc.nextLine();
		      b = System.currentTimeMillis();
		      
		      result = (double)((b - a) * 0.001);
		      
		      System.out.println("종료시간 : " + result + "초");      

		      if((int)result == 7) {
		    	System.out.println();
			    System.out.println("　 ∧∧");
			    System.out.println("　(｢･ω･)｢ 별림 별림 권법!");
			    System.out.println("　/　/");
			    System.out.println("`ノ￣ゝ");

		    	System.out.println("🧚-"+player+"님 축하드립니다! 늑대에게 게임을 이겼어요!");
		    	System.out.println();
			    System.out.println("(ง ˃ ³ ˂)ว ⁼³₌₃⁼³");
				System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 이걸 지다니!! 집도 벽돌집이라 안 불어지는 구나!! 도망가자!!");
				System.out.println("(▼✪(oo)✪▼)돼지 삼형제: 우와!!!"+player+"만세!!!");
		    	  System.out.println();
		    	  //만약 이기면 다음 엔딩 여기에 넣기

		      } else {
					System.out.println("늑대가 이겼습니다");
					System.out.println("ʕ ᓀ ᴥ ᓂ ʔ늑대 : 크하하 너는 날 절대 이기지 못한다. 돼지들을 잡아먹겠다!");
					System.out.println("(´･(00)･｀)아기돼지들 : "+player+"살려줘!!!!");
					System.out.println();
					System.out.println("GAMEOVER");
					System.out.println("🧚-게임을 다시 시작하세요.");
					System.out.println("🧚-게임을 종료합니다.");
					System.out.println();
		      
		}
		}
	}
