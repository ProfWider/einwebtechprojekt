package htw.berlin.webtech.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/")
    public String base(@RequestParam("text") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/product/id/{idpara}/details/42")
    public String pathpara(@PathVariable String idpara, Model model) {
        model.addAttribute("name", idpara);
        return "greeting";
    }

}
