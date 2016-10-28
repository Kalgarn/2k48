package com.kalgarn.j2k48;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class J2k48Game extends Game {
	SpriteBatch batch;

	
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
