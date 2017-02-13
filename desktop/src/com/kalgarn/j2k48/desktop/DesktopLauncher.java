package com.kalgarn.j2k48.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kalgarn.j2k48.J2k48Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "2048";
		config.width = 400;
		config.height = 500;
		new LwjglApplication(new J2k48Game(), config);
	}
}
