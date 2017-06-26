package web.game.running;

import org.junit.Test;
import web.game.model.UserInfo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Velmont on 2017-06-22.
 */
public class RunningTest {
    @Test
    public void Test(){

        assertTrue(true);
    }

    @Test
    public void TestAge(){
        UserInfo userInfo = new UserInfo();
        assertThat(userInfo.getAge(), is(3));
    }

}
