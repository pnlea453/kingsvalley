package nl.xnagames.kingsvalley.screens;

import nl.xnagames.kingsvalley.KingsValley;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public class SplashScreen implements Screen 
{
	// Fields
	//private KingsValley game;
	
	
	public SplashScreen(KingsValley game)
	{
		//this.game = game;
	}	
	
	@Override
	public void render(float delta) 
	{
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) 
	{
		
	}

	@Override
	public void show() 
	{
				
	}

	@Override
	public void hide() 
	{
		
	}

	@Override
	public void pause() 
	{
		
	}

	@Override
	public void resume() 
	{
		
	}

	@Override
	public void dispose() 
	{
		
	}
}
