package com.damir00109;

import net.fabricmc.api.ClientModInitializer;

public class CoordsCompassClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CompassRender.start();
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}