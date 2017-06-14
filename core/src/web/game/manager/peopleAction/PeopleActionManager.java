package web.game.manager.peopleAction;

import web.game.model.UserInfo;

/**
 * Created by Velmont on 2017-06-14.
 */
public class PeopleActionManager {
    private UserInfo userInfo;

    public PeopleActionManager(UserInfo userInfo){
        this.userInfo = userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
