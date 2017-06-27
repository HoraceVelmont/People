package web.game.manager.peopleAction;

import web.game.model.UserInfo;

import javax.inject.Inject;

/**
 * Created by Velmont on 2017-06-14.
 */
public class PeopleActionManager {
    @Inject
    UserInfo userInfo;

    public PeopleActionManager(){
    }

    public void doPeopleActionRoutine(){
        System.out.println(userInfo);
    }
}
