package com.rpsg.rpg.game.object;

import com.rpsg.rpg.game.script.SayHelloWorld;
import com.rpsg.rpg.object.rpgobj.DefaultNPC;
import com.rpsg.rpg.object.script.Script;

public class DOOR extends DefaultNPC{

	private static final long serialVersionUID = -3859019464901632709L;

	public DOOR(String path, Integer width, Integer height) {
		super(path, width, height);
	}

	@Override
	public void init() {
		this.waitWhenCollide=true;
	}
	
}