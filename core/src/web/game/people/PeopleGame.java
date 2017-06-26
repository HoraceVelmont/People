package web.game.people;

import com.badlogic.gdx.Game;
import web.game.di.component.DaggerPeopleBuilder;
import web.game.di.component.PeopleBuilder;
import web.game.gameReference.GameInstance;
import web.game.gameReference.GameInstanceImpl;
import web.game.screen.MainScreen;

public class PeopleGame extends Game {
	GameInstance gameInstance;
	
	@Override
	public void create () {
		PeopleBuilder peopleBuilder = DaggerPeopleBuilder.create();
		this.gameInstance = peopleBuilder.getGameInstance();
		this.setScreen(new MainScreen(this));
	}

	public GameInstance getGameInstance(){
		return gameInstance;
	}


	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
}
