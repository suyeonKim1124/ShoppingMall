package shoppingMall.main;

import shoppingMall.mainController.MainController;
import shoppingMall.mainView.MainView;

public class Main {
	
	public static void main(String[] args) {
		
		new MainController();
		
		MainView mainView = new MainView();
		mainView.mainView();
		
	}
	
}
