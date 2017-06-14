package web.game.gameRef;

import web.game.model.UserInfo;
import web.game.manager.peopleAction.PeopleActionManager;
/**
 * Created by Velmont on 2017-06-14.
 */
public class GameReference {
    private UserInfo userInfo;
    private PeopleActionManager peopleActionManager;

    public GameReference(){
        this.userInfo = new UserInfo();//TODO 추후 가져오는 방식으로 수정
        this.peopleActionManager = new PeopleActionManager(userInfo);
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
