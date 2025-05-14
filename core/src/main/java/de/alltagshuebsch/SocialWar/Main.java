package de.alltagshuebsch.SocialWar;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import org.w3c.dom.Text;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main implements ApplicationListener {

    //Definieren, aber nicht deklarieren, da erst LibGDX geladen werden muss
    //Endgültige Grafiken
    Sprite sMap;
    Sprite sLeiste;
    Sprite sLeiste2;
    Sprite sPlayerInt;
    Sprite sVillainInt;
    Sprite sBtnBotland;
    Sprite sBtnEmpoeristan;
    Sprite sBtnGrosspessimistien;
    Sprite sBtnIdealien;
    Sprite sBtnVerschwoernica;

    SpriteBatch spriteBatch;
    FitViewport viewport;

    @Override
    public void create() {

        //Hintergrund und Interface
        sMap = new Sprite(new Texture("map.png"));
        sMap.setSize(1024,600);
        sMap.setPosition(0,0);

        sLeiste = new Sprite(new Texture("leiste.png"));
        sLeiste.setSize(585,34);
        sLeiste.setPosition((float) (1024 - 585) /2,25);
        sLeiste2 = new Sprite(new Texture("leiste.png"));
        sLeiste2.setSize(585,34);
        sLeiste2.setPosition((float) (1024 - 585) /2,600-34-25);
        sPlayerInt = new Sprite(new Texture("player_Interface.png"));
        sPlayerInt.setSize(186,549);
        sPlayerInt.setPosition(20,25);
        sVillainInt = new Sprite(new Texture("villain_Interface.png"));
        sVillainInt.setSize(186,549);
        sVillainInt.setPosition(1004-186,25);
        //Die Schriftbuttons
        sBtnBotland = new Sprite(new Texture("btnBotland.png"));
        sBtnBotland.setSize(128,30);
        sBtnBotland.setPosition(1024-650,190);
        sBtnEmpoeristan = new Sprite(new Texture("btnEmpoeristan.png"));
        sBtnEmpoeristan.setSize(146,31);
        sBtnEmpoeristan.setPosition(260,600-155);
        sBtnIdealien = new Sprite(new Texture("btnIdealien.png"));
        sBtnIdealien.setSize(124,31);
        sBtnIdealien.setPosition(580,255);
        sBtnVerschwoernica = new Sprite(new Texture("btnVerschwoernica.png"));
        sBtnVerschwoernica.setSize(165,31);
        sBtnVerschwoernica.setPosition(440,435);
        sBtnGrosspessimistien = new Sprite(new Texture("btnGrosspessimistien.png"));
        sBtnGrosspessimistien.setSize(196,31);
        sBtnGrosspessimistien.setPosition(350,347);


        spriteBatch = new SpriteBatch();
        viewport = new FitViewport(1024,600);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height,true);
    }

    @Override
    public void render() {
        input();
        logic();
        draw();
    }

    private void input() {
        //falls ich einen Zeitgeber brauche:
        float delta = Gdx.graphics.getDeltaTime();

    }

    private void logic() {

    }

    private void draw(){
        ScreenUtils.clear(Color.valueOf("98C0C4"));
        viewport.apply();

        spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
        spriteBatch.begin();

            //Hier wird Zeug gezeichnet
        sMap.draw(spriteBatch);
        sBtnBotland.draw(spriteBatch);
        sBtnEmpoeristan.draw(spriteBatch);
        sBtnIdealien.draw(spriteBatch);
        sBtnVerschwoernica.draw(spriteBatch);
        sBtnGrosspessimistien.draw(spriteBatch);
        sLeiste.draw(spriteBatch);
        sLeiste2.draw(spriteBatch);
        sVillainInt.draw(spriteBatch);
        sPlayerInt.draw(spriteBatch);

            //Hier nicht mehr
        spriteBatch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
