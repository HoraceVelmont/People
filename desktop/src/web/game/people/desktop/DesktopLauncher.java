package web.game.people.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import web.game.people.PeopleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "People";
		config.width = 540;
		config.height = 720;
		config.resizable = false;
		new LwjglApplication(new PeopleGame(), config);
	}
}
