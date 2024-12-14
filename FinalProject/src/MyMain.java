package FinalProject.src;

public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		//TASK 2:  ADD A USER GAME OBJECT OF TYPE D
		Type_D_GameObject user = new Type_D_GameObject(200, 200);
		user.setVelocity(10);
		canvas.addKeyListener(user);
		canvas.addGameObject(user);
		
		// ADD GAME OBJECT TYPE A
		Type_A_GameObject objA = new Type_A_GameObject(200,200);
		objA.setVelocity(10);
		canvas.addKeyListener(objA);
		canvas.addGameObject(objA);
		
		// 	ADD GAME OBJECT TYPE B
		Type_B_GameObeject objB = new Type_B_GameObeject(200,200);
		objB.setVelocity(10);
		canvas.addKeyListener(objB);
		canvas.addGameObject(objB);
	}

}

