package br.com.umdrinkconta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.umdrinkconta.utils.Constantes;

@Controller
@RequestMapping("/")
public class Home {

	@GetMapping("Home/pt")
	public ModelAndView paginaPrincipalPT() {
		return new ModelAndView(Constantes.HOME_PT);
	}
	
	@GetMapping("Home/en")
	public ModelAndView paginaPrincipalEN() {
		return new ModelAndView(Constantes.HOME_EN);
	}
	
	@GetMapping("Home/Beer/pt")
	public ModelAndView paginaCervejaPT() {
		return new ModelAndView(Constantes.BEER_PT);
	}
	
	@GetMapping("Home/Beer/en")
	public ModelAndView paginaCervejaEN() {
		return new ModelAndView(Constantes.BEER_EN);
	}
	
	@GetMapping("Home/Wine/pt")
	public ModelAndView paginaVinhoPT() {
		return new ModelAndView(Constantes.WINE_PT);
	}
	
	@GetMapping("Home/Wine/en")
	public ModelAndView paginaVinhoEN() {
		return new ModelAndView(Constantes.WINE_EN);
	}
	
	@GetMapping("Home/Whisky/pt")
	public ModelAndView paginaWhiskyPT() {
		return new ModelAndView(Constantes.WHISKY_PT);
	}
	
	@GetMapping("Home/Whisky/en")
	public ModelAndView paginaWhiskyEN() {
		return new ModelAndView(Constantes.WHISKY_EN);
	}
	
}
