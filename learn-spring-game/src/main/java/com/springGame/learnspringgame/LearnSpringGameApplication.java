package com.springGame.learnspringgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springGame.learnspringgame.game.GameRunner;
import com.springGame.learnspringgame.game.GeneralGame;
import com.springGame.learnspringgame.game.MarioGame;
import com.springGame.learnspringgame.game.PacMan;
import com.springGame.learnspringgame.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringGameApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GeneralGame game = new GeneralGame();
		PacMan game = new PacMan();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
