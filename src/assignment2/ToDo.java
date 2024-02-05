// https://ilabsweden.github.io/ToDo/se/his/it401g/todo/package-summary.html

package assignment2;
import javax.swing.JFrame;

import se.his.it401g.todo.HomeTask;
import se.his.it401g.todo.Task;

public class ToDo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		Task htask = new HomeTask();
		htask.getText();
		// k asdad = new StudyTask();
		frame.add(htask.getGuiComponent());
		//frame.add(asdad.getGuiComponent());
		
		
		frame.setBounds(100,100,400,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
