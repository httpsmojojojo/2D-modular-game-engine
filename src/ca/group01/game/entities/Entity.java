package ca.group01.game.entities;

import ca.group01.game.gfx.Screen;
import ca.group01.game.level.Level;

public abstract class Entity {

	public int x, y;
	protected Level level;

	public Entity(Level level) {
		init(level);
	}

	public final void init(Level level) {
		this.level = level;
	}

	public abstract void tick();

	public abstract void render(Screen screen);
}
