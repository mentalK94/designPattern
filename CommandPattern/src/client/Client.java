package client;

import model.Button;
import model.Lamp;

public class Client {

	public static void main(String[] args) {
		Button lampButton = new Button(new Lamp());
		lampButton.pressed();
	}

}
