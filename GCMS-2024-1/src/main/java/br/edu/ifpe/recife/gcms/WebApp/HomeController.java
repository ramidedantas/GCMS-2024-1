package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!!";
    }

    @RequestMapping("/fulano")
    public @ResponseBody String greetingFulano() {
        return "Hello, Fulano!";
    }

    @RequestMapping("/main")
    public @ResponseBody String greetingMain() {
        return "Hello, Main!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotfix() {
        return "Hello, Hotfix!";
    }

    @RequestMapping("/albert")
    public @ResponseBody String greetingAlbert() {
        return "Hello, Albert!";
    }

    @RequestMapping("/branch/albert-alvin")
    public @ResponseBody String greetingFromBranchAlbertAlvin() {
        return "Hello from branch albert-alvin!";
    }

    @RequestMapping("/fork/albert")
    public @ResponseBody String greetingForkAlbert() {
        return "Hello from Albert's fork!";
    }

    @RequestMapping("/JoaoGouveia")
    public @ResponseBody String greetingJoaoGouveia() {
        return "Hello, João Gouveia!";
    }

    @RequestMapping("/rinaldo")
    public @ResponseBody String greetingRinaldo() {
        return "Hello, Rinaldo!";
    }

    @RequestMapping("/Diogo")
    public @ResponseBody String greetingDiogo() {
        return "Hello, Diogo!";
    }

    @RequestMapping("/richardson")
    public @ResponseBody String greetingRichardson() {
        return "Hello, Richardson Silva!";
    }

    @RequestMapping("/fernando")
    public @ResponseBody String greetingFernando() {
        return "Hello, Fernando!";
    }
    @RequestMapping("/branch/fernando")
    public @ResponseBody String greetingFromFernandoBranch() {
        return "Hello from Fernando branch";
    }

    @RequestMapping("/victor")
    public @ResponseBody String greetingVictor() {
        return "Hello, Víctor!";
    }
    
    @RequestMapping("/jamilly")
    public @ResponseBody String greetingJamilly() {
        return "Hello, Jamilly!";
    }
    
    @RequestMapping("/ramide")
    public @ResponseBody String greetingRamide() {
        return "Hello, Ramide Fork!";
    }
    
    @RequestMapping("/augusto")
    public @ResponseBody String greetingAugusto() {
    return "Hello, Augusto!";
    }


}
