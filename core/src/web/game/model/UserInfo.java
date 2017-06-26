package web.game.model;

import javax.inject.Singleton;

/**
 * Created by Velmont on 2017-06-14.
 */
@Singleton
public class UserInfo {
    int age;

    public UserInfo(){
        this.age = 3;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
