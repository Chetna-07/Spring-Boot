package com.springGame.learnspringgame;

import com.springGame.learnspringgame.enterprise.web.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springGame.learnspringgame.game.GameRunner;
import com.springGame.learnspringgame.game.GeneralGame;
import com.springGame.learnspringgame.game.MarioGame;
import com.springGame.learnspringgame.game.PacMan;
import com.springGame.learnspringgame.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringGameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringGameApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyController controller = context.getBean(MyController.class);
		System.out.println(controller.getBuissnesData());
	}

}
