package web.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import web.game.di.component.DaggerPeopleBuilder;
import web.game.di.component.PeopleBuilder;
import web.game.people.PeopleGame;

import javax.inject.Inject;

/**
 * Created by Velmont on 2017-06-14.
 */
public class MainScreen extends PeopleScreen {
    SpriteBatch batch;
    Texture peopleText;
    Texture startButtonActive;
    Texture startButtonInActive;
    Stage stage;

    public MainScreen(PeopleGame game) {
        super(game);
        peopleText = new Texture("texture/ui/main/people_title.png");
        startButtonActive = new Texture("texture/ui/main/start_text_hovered.png");
        startButtonInActive = new Texture("texture/ui/main/start_text.png");
        batch = new SpriteBatch();

        Music music = Gdx.audio.newMusic(Gdx.files.internal("sound/bgm/bgm_baram_buyeo_castle.mp3"));
        music.play();
        System.out.println(gameInstance.getUserInfo().getAge());
    }

    @Override
    public void show(){

    }

    @Override
    public void draw(float delta) {
        batch.begin();
        batch.draw(peopleText, 150, 600);
        if(Gdx.input.getX() > 750 && Gdx.input.getX() < 1410 && Gdx.input.getY() > 500){
            batch.draw(startButtonActive, 800, 120);
        }else{
            batch.draw(startButtonInActive, 800, 120);
        }
        batch.end();
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void dispose(){
        batch.dispose();
        peopleText.dispose();
    }


}
