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
    
    @RequestMapping("/branch/joao-gouveia")
    public @ResponseBody String greetingFromBranchJoaoGouveia() {
        return "Hello from branch joao-gouveia!";
    }

    @RequestMapping("/rinaldohub")
    public @ResponseBody String greetingRinaldo() {
        return "Hello, RinaldoHub!";
    }

    @RequestMapping("/Diogo")
    public @ResponseBody String greetingDiogo() {
        return "Hello, Diogo!";
    }

    @RequestMapping("/richardson")
    public @ResponseBody String greetingRichardson() {
        return "Hello, Richardson Silva!";
    }

    @RequestMapping("/branch/richardson-silva")
    public @ResponseBody String greetingFromBranchRicardson() {
        return "Hello from branch richardson-silva!";
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
        return "Hello, Victor!";
    }

    @RequestMapping("/branch/victor")
    public @ResponseBody String greetingBranchVictor() {
        return "Hello, Branch Victor!";
    }

    @RequestMapping("/fork/victor")
    public @ResponseBody String greetingForkVictor() {
        return "Hello, Fork Victor!";
    }

    @RequestMapping("/jamilly")
    public @ResponseBody String greetingJamilly() {
        return "Hello, Jamilly! Esse projeto é um fork de https://github.com/ramidedantas/GCMS-2024-1";
    }

    @RequestMapping("/ramide")
    public @ResponseBody String greetingRamide() {
        return "Hello, Ramide Fork!";
    }

    @RequestMapping("/augusto")
    public @ResponseBody String greetingAugusto() {
        return "Hello, Augusto!";
    }

    @RequestMapping("/julia")
    public @ResponseBody String greetingJulia() {
        return "Hello, Julia!";
    }

    @RequestMapping("/joaoTorpe")
    public @ResponseBody String greetingJoaoTorpe() {
        return "Hello, joaoTorpe!";
    }
    
    @RequestMapping("/aurianlira")
    public @ResponseBody String greetingAurianLira() {
        return "Hello, Aurian Lira!";
    }
}
