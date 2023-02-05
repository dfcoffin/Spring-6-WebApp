package guru.springframework.Spring6WebApp.controllers;

import guru.springframework.Spring6WebApp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Donald F. Coffin
 */
@Controller
public class AuthorController {

	private final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}

	@RequestMapping(value = "/authors")
	public String getAuthors(Model model) {

		model.addAttribute("authors", authorService.findAll());

		return "authors";
	}
}
