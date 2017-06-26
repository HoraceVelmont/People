package web.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import web.game.gameReference.GameInstanceImpl;
import web.game.people.PeopleGame;

import javax.inject.Inject;

/**
 * Created by Velmont on 2017-06-14.
 */
public abstract class PeopleScreen implements Screen {
    PeopleGame game;
    @Inject
    GameInstanceImpl gameRef;

    PeopleScreen(PeopleGame game){
        this.game = game;
    }

    @Override
    public void show() {

    }

    /** Called when a screen should render itself */
    public abstract void draw (float delta);

    /** Called when the screen should update itself, e.g. continue a simulation etc. */
    public abstract void update (float delta);

    @Override
    public void render(float delta) {
        update(delta);
        draw(delta);
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
