
public abstract class PigDTO {
	protected int hp = 50;  //집을 짓는거에 따라 숙련
	public int bulid =(int)(Math.random()*3)+3; //랜덤으로 얼만큼 더 지어지는지
	protected int eat = 0; //먹는건 나이에 따라 다르니까
	protected int count = 0; //몇번 망치질 했는지
	
	public abstract void color(); //집에 따른 색이 다름
	
	public abstract void door();//집에 문
	
	public abstract void furniture(); //집에 따른 가구가 다름
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void home() {
		// TODO Auto-generated method stub
		
	}
	
	

}
