package com.igs.ipi.tpspringboot.corentincarrel.controller;


  
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringboot.corentincarrel.model.GameModel;
import com.igs.ipi.tpspringboot.corentincarrel.service.GameService;
 
 @Controller
 public class GameController {
 
	 @Autowired
	 private GameService gameService;
	 
     @RequestMapping("/game/new")
     public ModelAndView newGame() {
    	 GameModel gm = gameService.newGame();
         ModelAndView mv = new ModelAndView("game");
         mv.addObject("gameM", gm);
         return mv;
     }
  }