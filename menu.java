package menumenu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class menu {

	public static void main(String[] args) {

		Frame frame = new Frame("Menu");

		MenuBar menuBar = new MenuBar();

		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		Menu ayushMenu = new Menu("Ayush");
		Menu beit3 = new Menu("Beit");

		// menu items
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem exitItem = new MenuItem("Exit");

		MenuItem newItem1 = new MenuItem("New");
		MenuItem openItem1 = new MenuItem("Open");
		MenuItem saveItem1 = new MenuItem("Save");
		MenuItem exitItem1 = new MenuItem("Exit");

		MenuItem newItem2 = new MenuItem("Kya re");
		MenuItem openItem2 = new MenuItem("bhai");
		MenuItem saveItem2 = new MenuItem("Apna ");
		MenuItem exitItem2 = new MenuItem("Rasta nap");
		Menu ayush = new Menu("Rasta nap");

		MenuItem newItem3 = new MenuItem("New");
		MenuItem openItem3 = new MenuItem("Open");
		MenuItem saveItem3 = new MenuItem("Save");
		MenuItem exitItem3 = new MenuItem("Exit");

		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		fileMenu.addSeparator();

		editMenu.add(newItem1);
		editMenu.add(openItem1);
		editMenu.add(saveItem1);
		editMenu.addSeparator();

		ayushMenu.add(exitItem2);
		ayushMenu.add(newItem2);
		ayushMenu.add(openItem2);
		ayushMenu.add(saveItem2);
		ayushMenu.add(exitItem2);
		ayushMenu.addSeparator();

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(ayushMenu);
		menuBar.add(beit3);

		ayush.add(exitItem3);
		ayush.add(newItem3);
		ayush.add(openItem3);
		ayush.add(saveItem3);

		frame.setMenuBar(menuBar);
		// frame.add(frame)

		ayushMenu.add(ayush);

		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
