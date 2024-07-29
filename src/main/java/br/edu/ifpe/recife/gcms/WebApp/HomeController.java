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

	@RequestMapping("/rinaldo")
	public @ResponseBody String greetingRinaldo() {
		return "Hello, Rinaldo!";
	}

	@RequestMapping("/fork/albert")
	public @ResponseBody String greetingForkAlbert() {
		return "Hello from Albert's fork!";
	}
}