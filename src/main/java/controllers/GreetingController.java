package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class GreetingController {
    @GetMapping
    public String Converter(){
        return "index";
    }
@PostMapping
public ModelAndView Translate(@RequestParam("usd") String usd, @RequestParam("rate") String rate) {
    double amountUSD = Double.parseDouble(usd);
    double exchangeRate = Double.parseDouble(rate);
    double amountVND = amountUSD *exchangeRate;
    ModelAndView model = new ModelAndView("converted");
    model.addObject("usd", amountUSD);
    model.addObject("vnd", amountVND);
    return model;
}
}