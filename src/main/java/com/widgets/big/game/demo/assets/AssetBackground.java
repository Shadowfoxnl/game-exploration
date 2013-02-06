package com.widgets.big.game.demo.assets;

import com.widgets.big.game.framework.Background;

public class AssetBackground implements Asset {

	private final Background background;

	public AssetBackground(Background background) {
		this.background = background;
	}

	public Background getBackground() {
		return background;
	}

}
