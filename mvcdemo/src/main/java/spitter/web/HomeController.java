package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zzhang on 2017/7/18.
 */
@Controller
@RequestMapping({"/homepage"})
public class HomeController {

    @RequestMapping(method = {RequestMethod.GET})
    public String home() {
        return "home";
    }
}
