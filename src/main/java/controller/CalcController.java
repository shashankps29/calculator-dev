package controller;

import entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalcController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute("calculator") Calculator calculator,
                            Model model) {

        double result = 0;

        switch (calculator.getOperation()) {
            case "add":
                result = calculator.getNumber1() + calculator.getNumber2();
                break;
            case "sub":
                result = calculator.getNumber1() - calculator.getNumber2();
                break;
            case "mul":
                result = calculator.getNumber1() * calculator.getNumber2();
                break;
            case "div":
                if (calculator.getNumber2() != 0) {
                    result = calculator.getNumber1() / calculator.getNumber2();
                }
                break;
        }

        calculator.setResult(result);
        model.addAttribute("calculator", calculator);

        return "result";
    }
}