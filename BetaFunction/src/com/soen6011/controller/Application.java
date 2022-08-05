package com.soen6011.controller;

import com.soen6011.view.*;
import com.soen6011.model.*;

/**
 * <p>
 * The application class has the main method from where the application starts
 * </p>
 * 
 * @author Indraneel Rachakonda
 * @version 1.0
 * @since 2022-07-16
 */

public class Application {

	/**
	 * This is the main method used to start the application.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		View view = new View();
		Model model = new Model();
		@SuppressWarnings("unused")
		Controller controller = new Controller(view, model);

		view.setVisible(true);
	}
}