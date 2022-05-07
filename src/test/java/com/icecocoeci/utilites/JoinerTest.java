package com.icecocoeci.utilites;

import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther wlf
 * @Date: 2022/05/07/21:15
 * @Description:
 */
public class JoinerTest {
    private final List<String> stringList = Arrays.asList(
            "Google","Guava","Java","Scala","Kafka"
    );
    private final List<String> stringListWithNullValue = Arrays.asList(
            "Google","Guava","Java","Scala",null
    );

    @Test
    public void testJoinOnJoin(){
        String result = Joiner.on("#").join(stringList);
        assertThat(result,equalTo("Google#Guava#Java#Scala#Kafka"));
    }

}
