package com.kalgarn.j2k48;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kalgarn.j2k48.screens.PlayScreen;

public class J2k48Game extends Game {
	public SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();


        this.setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
        super.render();
	}

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();

    }
}
