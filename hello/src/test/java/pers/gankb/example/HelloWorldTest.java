package pers.gankb.example;

import org.junit.Test;
import pers.gankb.example.restful.HelloWorld;

/**
 * @description: Test Hello World
 * @author: Gandaif
 * @date: 2020/9/30
 */
public class HelloWorldTest {

    @Test
    public void testHello() {
        HelloWorld.hello("Gandaif`s first GitHub!");
    }
}
