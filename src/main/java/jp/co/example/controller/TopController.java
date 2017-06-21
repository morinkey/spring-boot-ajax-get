package jp.co.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopController {

    @RequestMapping("/")
    public String top() {
        return "top";
    }

    @RequestMapping("/ajax14")
    public String ajax14() {
        return "ajax14";
    }

    @RequestMapping("/ajax15")
    public String ajax15() {
        return "ajax15";
    }

    @RequestMapping("/ajax16")
    public String ajax16() {
        return "ajax16";
    }

    @RequestMapping("/ajax30")
    public String ajax30() {
        return "ajax30";
    }
    
    @RequestMapping(value="/api/v1/tickets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> get(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id.toString());
        return map;
    }

}
