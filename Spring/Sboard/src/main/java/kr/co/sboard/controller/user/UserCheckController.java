package kr.co.sboard.controller.user;

import kr.co.sboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/check")
public class UserCheckController {

    @Autowired
    private UserService userService;

    @GetMapping("/uid/{uid}")
    public int checkUid(@PathVariable("uid") String uid){
        return userService.countUid(uid);
    }
    @GetMapping("/nick/{nick}")
    public void checkNick(@PathVariable("nick") String nick){
       // return userService.countNick(nick);
    }
    @GetMapping("/hp/{hp}")
    public void checkHp(@PathVariable("hp") String hp){
        //return userService.countHp(hp);
    }
    @GetMapping("/email/{email}")
    public void checkEmail(@PathVariable("email") String email){
        //return userService.countHp(hp);
    }


}
