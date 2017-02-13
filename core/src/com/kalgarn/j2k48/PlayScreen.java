package com.kalgarn.j2k48;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Jerome on 27/10/2016.
 */
public class PlayScreen implements Screen {

    //Reference to our Game, used to set Screens
    private J2k48Game panelgame;


    //
    private Tile tile;
    //


    public PlayScreen(J2k48Game game) {
        this.panelgame = game;

        tile = new Tile(2,20,20);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        panelgame.batch.begin();
        panelgame.batch.draw(tile.getImgTile(), tile.getPosition().x, tile.getPosition().y);
        panelgame.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
