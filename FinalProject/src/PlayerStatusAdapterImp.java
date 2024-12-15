package FinalProject.src;

public class PlayerStatusAdapterImp implements PlayerStatusAdapter {
	private Type_A_GameObject objA;
	private Type_B_GameObeject objB;
	private Type_C_GameObject objC;
	private Type_D_GameObject objD;
	
	public PlayerStatusAdapterImp(Type_A_GameObject objA, Type_B_GameObeject objB, Type_C_GameObject objC, Type_D_GameObject objD) 
	{
		this.objA = objA;
		this.objB = objB;
		this.objC = objC;
		this.objD = objD;
	}
	
	public void changePlayerStatus() {
		changePlayer();
	}
	
	public GameObject changePlayer() 
	{
		if(objD.getPlayerStatus() == true) {
			objA.setPlayerStatus(true);
			objD.setPlayerStatus(false);
		}
		else if(objA.getPlayerStatus() == true) 
		{
			objA.setPlayerStatus(false);
			objA.setDirection(Direction.UP);
			objB.setPlayerStatus(true);
		}
		else if(objB.getPlayerStatus() == true) 
		{
			objB.setPlayerStatus(false);
			objB.setDirection(Direction.DOWN);
			objC.setPlayerStatus(true);
		}
		else if(objC.getPlayerStatus() == true) 
		{
			objC.setPlayerStatus(false);
			objC.setDirection(Direction.RIGHT);
			objD.setPlayerStatus(true);
		}
		return null;
	}

}
