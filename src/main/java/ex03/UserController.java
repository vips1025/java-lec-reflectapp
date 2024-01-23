package ex03;

@Controller
public class UserController {

    @RequestMapping(uri = "/login")
    public void login(){
        System.out.println("login 호출");
    }

    @RequestMapping(uri = "/join")
    public void join(){
        System.out.println("join 호출");
    }

    @RequestMapping(uri = "/userinfo")
    public void userinfo(){
        System.out.println("유저정보 보기");
    }

    @RequestMapping(uri = "/update-password")
    public void updatePassword(){
        System.out.println("비밀번호 수정");
    }
}
