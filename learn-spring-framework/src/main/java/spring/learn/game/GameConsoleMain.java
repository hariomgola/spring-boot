package spring.learn.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learn_spring_framework.GamingInterface;

@Configuration
@ComponentScan("spring.learn.game")
public class GameConsoleMain {

	/**
	 * @Bean public GamingInterface game() { var game = new MarioGame(); return
	 *       game; }
	 * 
	 * @Bean public GameRunner gameRunner(GamingInterface game) { var gameRunner =
	 *       new GameRunner(game); return gameRunner; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context = new AnnotationConfigApplicationContext(GameConsoleMain.class)) {
			context.getBean(GamingInterface.class).up();
			context.getBean(GameRunnerComponent.class).run();
		}
	}

}
