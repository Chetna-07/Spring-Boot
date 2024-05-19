package com.springGame.learnspringgame.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	//private MarioGame game;
	private GeneralGame game;
	
	public GameRunner(GeneralGame game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

	
	
}
