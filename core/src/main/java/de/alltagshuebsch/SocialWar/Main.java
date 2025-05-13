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
    Sprite sBackground;
    Sprite sBotland;
    Sprite sEmpoeristan;
    Sprite sGrosspessimistien;
    Sprite sIdealien;
    Sprite sVerschwoernica;

    SpriteBatch spriteBatch;
    FitViewport viewport;

    @Override
    public void create() {
        sBackground = new Sprite(new Texture("map/Background.png"));
        sBackground.setSize(5,5);
        sBackground.setPosition(1.5F,0.5F);
        sBotland = new Sprite(new Texture("map/Botland.png"));
        sBotland.setSize(5,5);
        sBotland.setPosition(1.5F,0.5F);
        sEmpoeristan = new Sprite(new Texture("map/Empoeristan.png"));
        sEmpoeristan.setSize(5,5);
        sEmpoeristan.setPosition(1.5F,0.5F);
        sGrosspessimistien = new Sprite(new Texture("map/Grosspessimistien.png"));
        sGrosspessimistien.setSize(5,5);
        sGrosspessimistien.setPosition(1.5F,0.5F);
        sIdealien = new Sprite(new Texture("map/Idealien.png"));
        sIdealien.setSize(5,5);
        sIdealien.setPosition(1.5F,0.5F);
        sVerschwoernica = new Sprite(new Texture("map/Verschwoernica.png"));
        sVerschwoernica.setSize(5,5);
        sVerschwoernica.setPosition(1.5F,0.5F);



        spriteBatch = new SpriteBatch();
        viewport = new FitViewport(8,6);
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
        ScreenUtils.clear(Color.valueOf("A6A6A6"));
        viewport.apply();

        spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
        spriteBatch.begin();
            //Hier wird Zeug gezeichnet
        sBackground.draw(spriteBatch);
        sBotland.draw(spriteBatch);
        sVerschwoernica.draw(spriteBatch);
        sIdealien.draw(spriteBatch);
        sGrosspessimistien.draw(spriteBatch);
        sEmpoeristan.draw(spriteBatch);

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
