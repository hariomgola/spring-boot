package spring.learn.game;

import org.springframework.stereotype.Component;

import com.spring.learn_spring_framework.GamingInterface;

@Component
public class GameRunnerComponent {
	private GamingInterface game;

	// constructor
	public GameRunnerComponent(GamingInterface game) {
		this.game = game;
	}

	public void run() {
		System.out.println(" |> " + game);
		game.allControl();
	}
}
