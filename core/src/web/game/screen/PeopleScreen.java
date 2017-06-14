package web.game.screen;

import com.badlogic.gdx.Screen;
import web.game.gameRef.GameReference;
import web.game.people.PeopleGame;

/**
 * Created by Velmont on 2017-06-14.
 */
public abstract class PeopleScreen implements Screen {
    private PeopleGame game;
    private GameReference gameRef;

    public PeopleScreen(PeopleGame game){
        this.game = game;
        this.gameRef = game.getGameRef();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
