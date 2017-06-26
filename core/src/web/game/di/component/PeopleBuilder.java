package web.game.di.component;

import dagger.Component;
import web.game.di.module.GameReferenceModule;
import web.game.gameReference.GameInstance;
import web.game.gameReference.GameInstanceImpl;

import javax.inject.Singleton;

/**
 * Created by Velmont on 2017-06-26.
 */
@Singleton
@Component(modules = GameReferenceModule.class)
public interface PeopleBuilder {
    GameInstance getGameInstance();
}
