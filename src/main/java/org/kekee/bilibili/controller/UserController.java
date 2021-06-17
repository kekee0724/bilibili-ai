package org.kekee.bilibili.controller;

import org.kekee.bilibili.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 可可
 * @date 2021/6/17 13:39
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 根据id查询
     *
     * @param name
     * @return User
     */
    @GetMapping("/getUserInfo")
    public User getUserInfo(@RequestParam(name="UserName", defaultValue="可可") String name) {
        System.out.println("查询成功");
        User user=new User();
        user.setName(name);
        user.setAge(21);
        return user;
    }

}
