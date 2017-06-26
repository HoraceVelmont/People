package web.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import web.game.di.component.DaggerPeopleBuilder;
import web.game.di.component.PeopleBuilder;
import web.game.gameReference.GameInstance;
import web.game.people.PeopleGame;

/**
 * Created by Velmont on 2017-06-14.
 */
public abstract class PeopleScreen implements Screen {
    PeopleGame game;
    GameInstance gameInstance;
    private OrthographicCamera camera;
    private OrthogonalTiledMapRenderer mapRenderer;

    public static class PeopleViewPort {
        public static float viewportWidth;
        public static float viewportHeight;
        public static float virtualWidth;
        public static float virtualHeight;
        public static float physicalWidth;
        public static float physicalHeight;
        public static float aspectRation;
    }

    PeopleScreen(PeopleGame game){
        PeopleBuilder peopleBuilder = DaggerPeopleBuilder.create();
        this.gameInstance = peopleBuilder.getGameInstance();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, PeopleViewPort.viewportWidth, PeopleViewPort.viewportHeight);

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
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0, 0, 0, 1);
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
