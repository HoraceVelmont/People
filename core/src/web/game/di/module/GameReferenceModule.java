package web.game.di.module;

import dagger.Module;
import dagger.Provides;
import web.game.gameReference.GameInstance;
import web.game.gameReference.GameInstanceImpl;

import javax.inject.Singleton;

/**
 * Created by Velmont on 2017-06-26.
 */
@Module
public class GameReferenceModule {
    @Provides @Singleton
    static GameInstance provideGameReference(){
        return new GameInstanceImpl();
    }
}
