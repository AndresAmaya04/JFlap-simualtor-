package views.main_frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Commands;

public class NorthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton restartAutomaton, validateWord, formalism, regex, minnfa;

	public NorthPanel(ActionListener listener) {
		restartAutomaton = new MenuButton("", Color.GRAY, Color.ORANGE);
		validateWord = new MenuButton("", Color.GRAY, Color.ORANGE);
		formalism = new MenuButton("", Color.GRAY, Color.ORANGE);
		regex = new MenuButton("", Color.GRAY, Color.ORANGE);
		minnfa = new MenuButton("", Color.GRAY, Color.ORANGE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBackground(Color.LIGHT_GRAY);
		this.initComponents(listener);
		this.setVisible(true);
	}

	private void initComponents(ActionListener actionListener) {
		this.setLayout(new GridLayout(5,1));
		restartAutomaton.addActionListener(actionListener);
		restartAutomaton.setActionCommand(Commands.C_RESTART.toString());
		this.add(restartAutomaton);
		validateWord.addActionListener(actionListener);
		validateWord.setActionCommand(Commands.C_VALIDATE_WORD.toString());
		validateWord.setText("Ingresar palabra");
		this.add(validateWord);
		formalism.setText("Formalismo");
		formalism.addActionListener(actionListener);
		formalism.setActionCommand(Commands.C_FORMALISM.toString());
		this.add(formalism);
		regex.setText("Expresion Regular");
		regex.addActionListener(actionListener);
		regex.setActionCommand(Commands.C_REGEX.toString());
		this.add(regex);
		minnfa.setText("Minimizar");
		minnfa.addActionListener(actionListener);
		minnfa.setActionCommand(Commands.C_MINNFA.toString());
		this.add(minnfa);
		restartAutomaton.setText("Reiniciar");
	}

}
