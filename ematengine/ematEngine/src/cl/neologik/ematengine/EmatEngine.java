package cl.neologik.ematengine;

import cl.neologik.ematengine.screen.MenuPrincipal;

import com.badlogic.gdx.Game;

public class EmatEngine extends Game {

	@Override
	public void create() {
		setScreen(new MenuPrincipal());
	}
}