package FinalProject.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FinalProjectTesting {

// Test if game objects are created correctly
	@Test
	void CreateGameObjects() 
	{
		Type_A_GameObject objA = new Type_A_GameObject(200,200);
		Type_B_GameObeject objB = new Type_B_GameObeject(200,200);
		Type_C_GameObject objC = new Type_C_GameObject(200,200);
		Type_D_GameObject objD = new Type_D_GameObject(200,200);
		
		assertNotEquals(objA, null);
		assertNotEquals(objB, null);
		assertNotEquals(objC, null);
		assertNotEquals(objD, null);
	}
	
// Test if the the Adapter is working properly
	@Test
	void CreateAdapter() 
	{
		Type_A_GameObject objA = new Type_A_GameObject(200,200);
		Type_B_GameObeject objB = new Type_B_GameObeject(200,200);
		Type_C_GameObject objC = new Type_C_GameObject(200,200);
		Type_D_GameObject objD = new Type_D_GameObject(200,200);
		PlayerStatusAdapter changePlayer = new PlayerStatusAdapterImp(objA, objB, objC, objD);
		
		// ObjD must be the ONLY object whose player status is TRUE
		assertEquals(objD.getPlayerStatus(), true);
		assertEquals(objA.getPlayerStatus(), false);
		assertEquals(objB.getPlayerStatus(), false);
		assertEquals(objC.getPlayerStatus(), false);
		
		// Object D has to change to false
		changePlayer.changePlayerStatus();		
		assertEquals(objA.getPlayerStatus(), true);
		assertEquals(objD.getPlayerStatus(), false);
		
		// Object A has to change to false
		changePlayer.changePlayerStatus();
		assertEquals(objB.getPlayerStatus(), true);
		assertEquals(objA.getPlayerStatus(), false);
		
		// Object B has to change to false
		changePlayer.changePlayerStatus();
		assertEquals(objC.getPlayerStatus(), true);
		assertEquals(objB.getPlayerStatus(), false);
		
		// Object C has to change to false
		changePlayer.changePlayerStatus();
		assertEquals(objD.getPlayerStatus(), true);
		assertEquals(objC.getPlayerStatus(), false);
	}

}
