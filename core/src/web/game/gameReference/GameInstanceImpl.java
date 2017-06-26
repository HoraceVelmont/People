package web.game.gameReference;

import com.badlogic.gdx.Game;
import dagger.Module;
import dagger.Provides;
import web.game.model.UserInfo;
import web.game.manager.peopleAction.PeopleActionManager;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Velmont on 2017-06-14.
 */
@Singleton
public class GameInstanceImpl implements GameInstance{
    UserInfo userInfo;
    PeopleActionManager peopleActionManager;

    public GameInstanceImpl(){
        userInfo = new UserInfo();
        peopleActionManager = new PeopleActionManager();
    }

    @Override
    public UserInfo getUserInfo() {
        return userInfo;
    }
}
