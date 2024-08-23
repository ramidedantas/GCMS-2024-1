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
        return "Hello, Hotfix(Gabriel)!";
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
    
    @RequestMapping("/fork/joao-gouveia")
    public @ResponseBody String greetingForkJoao() {
        return "Hello from Joao's fork!";
    }

    @RequestMapping("/rinaldohub")
    public @ResponseBody String greetingRinaldo() {
        return "Hello, RinaldoHub!";
    }

    @RequestMapping("/Diogo")
    public @ResponseBody String greetingDiogo() {
        return "Hello, Diogo!";
    }
    
    @RequestMapping("/DiogoB")
    public @ResponseBody String greetingDiogoBranch() {
        return "Hello from Diogo's Branch!";
    }
    
    @RequestMapping("/Diogof")
    public @ResponseBody String greetingDiogoForck() {
        return "Hello from Diogo's Forck!";
    }


    @RequestMapping("/richardson")
    public @ResponseBody String greetingRichardson() {
        return "Hello, Richardson Silva!";
    }

    @RequestMapping("/branch/richardson-silva")
    public @ResponseBody String greetingFromBranchRicardson() {
        return "Hello from branch richardson-silva!";
    }

    @RequestMapping("/fork/richardson-silva")
    public @ResponseBody String greetingForkRichardson() {
        return "Hello from Richardson Silva's fork!";
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
    
    @RequestMapping("/branch/augusto-allan")
    public @ResponseBody String greetingBranchAugustoAllan() {
        return "Hello from branch augusto-allan!";
    }
    
    @RequestMapping("/fork/augusto-allan")
    public @ResponseBody String greetingForkAugustoAllan() {
        return "Hello from fork augusto-allan!";
    }

    @RequestMapping("/julia")
    public @ResponseBody String greetingJulia() {
        return "Hello, Julia!";
    }

    @RequestMapping("/branch/julia")
    public @ResponseBody String greetingJuliaBranch() {
        return "Hello, from branch julia-didra!";
    }

    @RequestMapping("/fork/julia")
    public @ResponseBody String greetingJuliaFork() {
        return "Hello, julia-didra fork's!";
    }

    @RequestMapping("/joaoTorpe")
    public @ResponseBody String greetingJoaoTorpe() {
        return "Hello, joaoTorpe!";
    }

    @RequestMapping("/aurianlira")
    public @ResponseBody String greetingAurianLira() {
        return "Hello, Aurian Lira!";
    }

    @RequestMapping("Mateus")
    public @ResponseBody String greetingMateus() {
        return "Hello, Mateus!";
    }
    
    @RequestMapping("/branch/aurianmoura")
    public @ResponseBody String greetingFromBranchAurian() {
        return "Hello from branch aurianmoura"; 

    }


    @RequestMapping("/raul")
    public @ResponseBody String greetingRaul() {
        return "Hello, Raul!";
    }

    @RequestMapping("/gustavo")
    public @ResponseBody String greetingGustavo() {
        return "Hello, Gustavo!";
    }

    @RequestMapping("/branch/gustavo")
    public @ResponseBody String greetingBranchGustavo() {
        return "Hello, Branch Gustavo!";
    }

    @RequestMapping("/fork/gustavo")
    public @ResponseBody String greetingForkGustavo() {
        return "Hello, Fork Gustavo!";
    }
    @RequestMapping("/branch/raul")
    public @ResponseBody String greetingBranchRaul() {
        return "Hello, Branch Raul!";
    }
    @RequestMapping("/fork/raul")
    public @ResponseBody String greetingForkRaul() {
        return "Hello, Fork Raul!";
    }

    @RequestMapping("/fork/aurianlira")
    public @ResponseBody String greetingForkAurianFork() {
        return "Hello from Aurian Lira's fork!";
    }

    @RequestMapping("/fork/joaoTorpe")
    public @ResponseBody String greetingForkJoaoTorpe() {
        return "Hello, Fork joaoTorpe!";
    }

    @RequestMapping("/branch/joaoTorpe")
    public @ResponseBody String greetingBranchJoaoTorpe() {
        return "Hello, Branch joaoTorpe!";
    }
    
    @RequestMapping("/Gabriel")
    public @ResponseBody String greetingGabriel() {
    	return "Hello, Gabriel!";
    }

    @RequestMapping("/branch/gabriel")
    public @ResponseBody String greetingBranchGabriel() {
    	return "Hello, Branch Gabriel!";
    }

}
