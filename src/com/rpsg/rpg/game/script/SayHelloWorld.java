package com.rpsg.rpg.game.script;

import com.rpsg.rpg.object.script.Script;
import com.rpsg.rpg.utils.display.ColorUtil;
import com.rpsg.rpg.view.*;

public class SayHelloWorld extends Script{
	
	public void init() {
		$(()->{
			if(++GameViews.global.day>2)
				GameViews.global.day=0;
			if(GameViews.global.day==0)
				_$(setGameTime(ColorUtil.DAY));
			else if(GameViews.global.day==1)
				_$(setGameTime(ColorUtil.DUSK));
			else
				_$(setGameTime(ColorUtil.NIGHT));
		});
//		lock(true);
//		faceToHero();
//		showMSG();
//		showFGLeft(爱丽丝立绘, 思考);
//		say("你好!");
//		hideFG();
//		hideMSG();
//		lock(false);
	}
}
