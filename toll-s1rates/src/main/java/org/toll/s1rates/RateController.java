package org.toll.s1rates;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;

    @Value("${officer}")
    String officer;

    @RequestMapping("/rate")
    public String getRate(Model model) {
        model.addAttribute("rate", rate);
        model.addAttribute("lanes", laneCount);
        model.addAttribute("tollStart", tollStart);
        model.addAttribute("officer", officer);
        return "rate";
    }
}
