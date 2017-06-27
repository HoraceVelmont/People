package web.game.model;


import lombok.Data;
import lombok.Getter;

import javax.inject.Singleton;

/**
 * Created by Velmont on 2017-06-14.
 */
@Singleton
@Data
public class UserInfo {
    private @Getter int age;

    public UserInfo(){
        this.age = 3;
    }
}
