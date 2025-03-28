package jpabook.jpashop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@Slf4j // 로그 출력 도우미
public class HomeController {

//    Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j로 대체

    @RequestMapping("/")
    public String home(){
        log.info("home controller");
        return "home";
    }
}
