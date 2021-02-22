
public class Monster {
	
	private String name;
	
	Monster(String name){
		this.name = name;
	
	}
	public String Attack() {
		return "Whoops";
	}
}
class FireMonster extends Monster{
	
	FireMonster(String name){
		super(name);
	}
	

   @Override
   public String Attack() {
	   return "This monster attacks with Fire";
   }
}
class waterMonster extends Monster{
		
     waterMonster(String name){
		super(name);
	}
		

	 @Override
	 public String Attack() {
		 return "This monster attacks with Water";
	 }
}	 
class stoneMonster extends Monster{
			
	 stoneMonster(String name){
		super(name);
	}
			

	@Override
	public String Attack() {
		return "This monster attacks with Stones";
	}	 

	public static void main(String[] args) {
		Monster mon = new FireMonster("xo+>");
		System.out.println(mon.Attack());
		
		Monster mons = new waterMonster(">+xo");
		System.out.println(mons.Attack());
		
		Monster monst = new stoneMonster("ox<+");
		System.out.println(monst.Attack());
		
		

	}

  
 }

