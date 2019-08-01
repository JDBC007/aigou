package cn.itsource.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;

public class Demo {


    public static void main(String[] args) {

        /*
        * JSON.toJSONString(user);
        * JSON.parseObject(jsonStr, User.class);
        * JSON.parseArray(jsonStr, User.class);
        *
        * */


        //Java对象转json字符串
//        User user = new User(1L,"admin","admin");
//        String jsonString = JSON.toJSONString(user);
//        System.out.println(jsonString);//{"id":1,"password":"admin","username":"admin"}

        //json字符串转java对象
        /*String jsonStr = "{\"id\":1,\"password\":\"admin\",\"username\":\"admin\"}";
        User user = JSON.parseObject(jsonStr, User.class);
        System.out.println(user);*/

        //Java集合转json字符串
//        List<User> list = Arrays.asList(
//                new User(1L,"admin","admin"),
//                new User(2L,"aaa","bbb")
//        );
//        String jsonString = JSON.toJSONString(list);
//        System.out.println(jsonString);//[{"id":1,"password":"admin","username":"admin"},{"id":2,"password":"bbb","username":"aaa"}]

        //json字符串转java集合
        String jsonStr = "[{\"id\":1,\"password\":\"admin\",\"username\":\"admin\"},{\"id\":2,\"password\":\"bbb\",\"username\":\"aaa\"}]";
        List<User> users = JSON.parseArray(jsonStr, User.class);
        for (User user : users) {
            System.out.println(user);
        }


    }

}
