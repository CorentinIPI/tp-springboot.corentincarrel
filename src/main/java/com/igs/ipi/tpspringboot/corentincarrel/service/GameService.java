package com.igs.ipi.tpspringboot.corentincarrel.service;

import org.springframework.stereotype.Service;

import com.igs.ipi.tpspringboot.corentincarrel.model.GameModel;

@Service
public class GameService{
	public GameModel newGame() {
		GameModel gm = new GameModel();
		gm.setNom1("Clement");
		gm.setNom2("Yann");
		return gm;
	}
}