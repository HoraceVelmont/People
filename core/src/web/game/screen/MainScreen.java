package web.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import web.game.people.PeopleGame;

import javax.inject.Inject;

/**
 * Created by Velmont on 2017-06-14.
 */
public class MainScreen extends PeopleScreen {
    SpriteBatch batch;
    Texture img;
    Stage stage;

    public MainScreen(PeopleGame game) {
        super(game);
        img = new Texture("badlogic.jpg");
        batch = new SpriteBatch();
    }

    @Override
    public void show(){

    }

    @Override
    public void draw(float delta) {

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0, 0, 1, 1);
        batch.begin();

        batch.disableBlending();
        batch.draw(img, 300, 300);
        batch.end();
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void dispose(){
        batch.dispose();
        img.dispose();
    }


}
