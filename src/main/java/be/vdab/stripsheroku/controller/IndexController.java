package be.vdab.stripsheroku.controller;

import be.vdab.stripsheroku.service.FiguurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class IndexController {
    private final FiguurService figuurService;

    public IndexController(FiguurService figuurService) {
        this.figuurService = figuurService;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index", "figuren", figuurService.findAll());
    }
}
