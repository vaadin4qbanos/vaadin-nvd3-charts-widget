package com.github.qbanos.charts.nvd3.client;

import com.google.gwt.user.client.ui.Label;

// Extend any GWT Widget
public class MyComponentWidget extends Label {

	public MyComponentWidget() {

		// CSS class-name should not be v- prefixed
		setStyleName("vaadin-nvd3-charts");

		// State is set to widget in MyComponentConnector		
	}

}