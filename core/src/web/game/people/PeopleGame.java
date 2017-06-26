package web.game.people;

import com.badlogic.gdx.Game;
import web.game.di.component.DaggerPeopleBuilder;
import web.game.di.component.PeopleBuilder;
import web.game.gameReference.GameInstanceImpl;
import web.game.screen.MainScreen;

public class PeopleGame extends Game {
	private GameInstanceImpl gameRef;
	
	@Override
	public void create () {
		PeopleBuilder peopleBuilder = DaggerPeopleBuilder.create();
		int age = peopleBuilder.getGameInstance().getUserInfo().getAge();
		System.out.println(age);
		this.setScreen(new MainScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
}
