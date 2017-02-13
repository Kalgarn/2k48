package com.kalgarn.j2k48.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Jerome on 28/10/2016.
 */

public class Tile {

    private Texture imgTile;
    private Rectangle tile;
    private int tileValue;
    private Vector3 position;


    public Tile(int value, int x, int y){
        imgTile = new Texture("badlogic.jpg");
        tile = new Rectangle(x, y, imgTile.getWidth(), imgTile.getHeight());
        position = new Vector3(x, y, 0);
    }



    public void update(float dt){
        tile.setPosition(position.x, position.y);

    }

    public Texture getImgTile() {
        return imgTile;
    }

    public void setImgTile(Texture imgTile) {
        this.imgTile = imgTile;
    }

    public Rectangle getTile() {
        return tile;
    }

    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public void setTile(Rectangle tile) {
        this.tile = tile;
    }

    public int getTileValue() {
        return tileValue;
    }

    public void setTileValue(int tileValue) {
        this.tileValue = tileValue;
    }
}
