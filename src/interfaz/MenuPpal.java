package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class MenuPpal extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JTextField textResultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPpal frame = new MenuPpal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPpal() {
		////////////
		
		setResizable(false);
		///////////
		setTitle("Calculadora 2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnEdicin = new JMenu("Edición");
		menuBar.add(mnEdicin);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mnEdicin.add(mntmCopiar);
		
		JMenuItem mntmPegar = new JMenuItem("Pegar");
		mnEdicin.add(mntmPegar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmManualDeAyuda = new JMenuItem("Manual de ayuda");
		mnAyuda.add(mntmManualDeAyuda);
		
		JSeparator separator_1 = new JSeparator();
		mnAyuda.add(separator_1);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);
		
		textResultado = new JTextField();
		textResultado.setBackground(Color.WHITE);
		textResultado.setFont(new Font("Arial", Font.PLAIN, 15));
		textResultado.setHorizontalAlignment(JTextField.RIGHT);
		textResultado.setEditable(false);
		// ??
		textResultado.addKeyListener(this);
		textResultado.requestFocus();
		//
		textResultado.setText("0");
		textResultado.setColumns(10);
		GroupLayout gl_panel_Top = new GroupLayout(panel_Top);
		gl_panel_Top.setHorizontalGroup(
			gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Top.createSequentialGroup()
					.addGap(156)
					.addComponent(textResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(160, Short.MAX_VALUE))
		);
		gl_panel_Top.setVerticalGroup(
			gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_Top.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_Top.setLayout(gl_panel_Top);
		
		JPanel panel_Bot = new JPanel();
		contentPane.add(panel_Bot, BorderLayout.SOUTH);
		
		JLabel labelInformación1 = new JLabel("Fecha entrega");
		
		JLabel labelInformacion2 = new JLabel("martes, 30 de mayo");
		GroupLayout gl_panel_Bot = new GroupLayout(panel_Bot);
		gl_panel_Bot.setHorizontalGroup(
			gl_panel_Bot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Bot.createSequentialGroup()
					.addGap(101)
					.addComponent(labelInformación1)
					.addGap(5)
					.addComponent(labelInformacion2))
		);
		gl_panel_Bot.setVerticalGroup(
			gl_panel_Bot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Bot.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_Bot.createParallelGroup(Alignment.LEADING)
						.addComponent(labelInformación1)
						.addComponent(labelInformacion2)))
		);
		panel_Bot.setLayout(gl_panel_Bot);
		
		JPanel panel_Centro = new JPanel();
		contentPane.add(panel_Centro, BorderLayout.WEST);
		panel_Centro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_Centro_Centro = new JPanel();
		panel_Centro.add(panel_Centro_Centro);
		GridBagLayout gbl_panel_Centro_Centro = new GridBagLayout();
		gbl_panel_Centro_Centro.columnWidths = new int[]{0, 0};
		gbl_panel_Centro_Centro.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_Centro_Centro.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_Centro_Centro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Centro_Centro.setLayout(gbl_panel_Centro_Centro);
		
		JButton button_MemoryClear = new JButton("MC");
		GridBagConstraints gbc_button_MemoryClear = new GridBagConstraints();
		gbc_button_MemoryClear.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryClear.gridx = 0;
		gbc_button_MemoryClear.gridy = 0;
		panel_Centro_Centro.add(button_MemoryClear, gbc_button_MemoryClear);
		
		JButton button_MemoryRecall = new JButton("MR");
		GridBagConstraints gbc_button_MemoryRecall = new GridBagConstraints();
		gbc_button_MemoryRecall.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryRecall.gridx = 1;
		gbc_button_MemoryRecall.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRecall, gbc_button_MemoryRecall);
		
		JButton button_MemoryStorage = new JButton("MS");
		button_MemoryStorage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_button_MemoryStorage = new GridBagConstraints();
		gbc_button_MemoryStorage.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryStorage.gridx = 2;
		gbc_button_MemoryStorage.gridy = 0;
		panel_Centro_Centro.add(button_MemoryStorage, gbc_button_MemoryStorage);
		
		JButton button_MemorySumar = new JButton("M+");
		GridBagConstraints gbc_button_MemorySumar = new GridBagConstraints();
		gbc_button_MemorySumar.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemorySumar.gridx = 3;
		gbc_button_MemorySumar.gridy = 0;
		panel_Centro_Centro.add(button_MemorySumar, gbc_button_MemorySumar);
		
		JButton button_MemoryRestar = new JButton("M-");
		GridBagConstraints gbc_button_MemoryRestar = new GridBagConstraints();
		gbc_button_MemoryRestar.insets = new Insets(0, 0, 5, 0);
		gbc_button_MemoryRestar.gridx = 4;
		gbc_button_MemoryRestar.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRestar, gbc_button_MemoryRestar);
		
		JButton button_Retroceder = new JButton("<-");
		GridBagConstraints gbc_button_Retroceder = new GridBagConstraints();
		gbc_button_Retroceder.insets = new Insets(0, 0, 5, 5);
		gbc_button_Retroceder.gridx = 0;
		gbc_button_Retroceder.gridy = 1;
		panel_Centro_Centro.add(button_Retroceder, gbc_button_Retroceder);
		
		JButton buton_ClearError = new JButton("CE");
		GridBagConstraints gbc_buton_ClearError = new GridBagConstraints();
		gbc_buton_ClearError.insets = new Insets(0, 0, 5, 5);
		gbc_buton_ClearError.gridx = 1;
		gbc_buton_ClearError.gridy = 1;
		panel_Centro_Centro.add(buton_ClearError, gbc_buton_ClearError);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 1;
		panel_Centro_Centro.add(btnC, gbc_btnC);
		
		JButton button_CambiarSigno = new JButton("+/-");
		GridBagConstraints gbc_button_CambiarSigno = new GridBagConstraints();
		gbc_button_CambiarSigno.insets = new Insets(0, 0, 5, 5);
		gbc_button_CambiarSigno.gridx = 3;
		gbc_button_CambiarSigno.gridy = 1;
		panel_Centro_Centro.add(button_CambiarSigno, gbc_button_CambiarSigno);
		
		JButton button_RaizCuadrada = new JButton("√");
		GridBagConstraints gbc_button_RaizCuadrada = new GridBagConstraints();
		gbc_button_RaizCuadrada.insets = new Insets(0, 0, 5, 0);
		gbc_button_RaizCuadrada.gridx = 4;
		gbc_button_RaizCuadrada.gridy = 1;
		panel_Centro_Centro.add(button_RaizCuadrada, gbc_button_RaizCuadrada);
		
		JButton button_num7 = new JButton("7");
		GridBagConstraints gbc_button_num7 = new GridBagConstraints();
		gbc_button_num7.insets = new Insets(0, 0, 5, 5);
		gbc_button_num7.gridx = 0;
		gbc_button_num7.gridy = 2;
		panel_Centro_Centro.add(button_num7, gbc_button_num7);
		
		JButton button_num8 = new JButton("8");
		GridBagConstraints gbc_button_num8 = new GridBagConstraints();
		gbc_button_num8.insets = new Insets(0, 0, 5, 5);
		gbc_button_num8.gridx = 1;
		gbc_button_num8.gridy = 2;
		panel_Centro_Centro.add(button_num8, gbc_button_num8);
		
		JButton button_num9 = new JButton("9");
		GridBagConstraints gbc_button_num9 = new GridBagConstraints();
		gbc_button_num9.insets = new Insets(0, 0, 5, 5);
		gbc_button_num9.gridx = 2;
		gbc_button_num9.gridy = 2;
		panel_Centro_Centro.add(button_num9, gbc_button_num9);
		
		JButton button_dividir = new JButton("/");
		GridBagConstraints gbc_button_dividir = new GridBagConstraints();
		gbc_button_dividir.insets = new Insets(0, 0, 5, 5);
		gbc_button_dividir.gridx = 3;
		gbc_button_dividir.gridy = 2;
		panel_Centro_Centro.add(button_dividir, gbc_button_dividir);
		
		JButton button_Pordentaje = new JButton("%");
		GridBagConstraints gbc_button_Pordentaje = new GridBagConstraints();
		gbc_button_Pordentaje.insets = new Insets(0, 0, 5, 0);
		gbc_button_Pordentaje.gridx = 4;
		gbc_button_Pordentaje.gridy = 2;
		panel_Centro_Centro.add(button_Pordentaje, gbc_button_Pordentaje);
		
		JButton button_num4 = new JButton("4");
		GridBagConstraints gbc_button_num4 = new GridBagConstraints();
		gbc_button_num4.insets = new Insets(0, 0, 5, 5);
		gbc_button_num4.gridx = 0;
		gbc_button_num4.gridy = 3;
		panel_Centro_Centro.add(button_num4, gbc_button_num4);
		
		JButton button_num5 = new JButton("5");
		GridBagConstraints gbc_button_num5 = new GridBagConstraints();
		gbc_button_num5.insets = new Insets(0, 0, 5, 5);
		gbc_button_num5.gridx = 1;
		gbc_button_num5.gridy = 3;
		panel_Centro_Centro.add(button_num5, gbc_button_num5);
		
		JButton button_num6 = new JButton("6");
		GridBagConstraints gbc_button_num6 = new GridBagConstraints();
		gbc_button_num6.insets = new Insets(0, 0, 5, 5);
		gbc_button_num6.gridx = 2;
		gbc_button_num6.gridy = 3;
		panel_Centro_Centro.add(button_num6, gbc_button_num6);
		
		JButton button_multiplicar = new JButton("*");
		GridBagConstraints gbc_button_multiplicar = new GridBagConstraints();
		gbc_button_multiplicar.insets = new Insets(0, 0, 5, 5);
		gbc_button_multiplicar.gridx = 3;
		gbc_button_multiplicar.gridy = 3;
		panel_Centro_Centro.add(button_multiplicar, gbc_button_multiplicar);
		
		JButton button_dividirPorX = new JButton("1/x");
		GridBagConstraints gbc_button_dividirPorX = new GridBagConstraints();
		gbc_button_dividirPorX.insets = new Insets(0, 0, 5, 0);
		gbc_button_dividirPorX.gridx = 4;
		gbc_button_dividirPorX.gridy = 3;
		panel_Centro_Centro.add(button_dividirPorX, gbc_button_dividirPorX);
		
		JButton button_num1 = new JButton("1");
		GridBagConstraints gbc_button_num1 = new GridBagConstraints();
		gbc_button_num1.insets = new Insets(0, 0, 5, 5);
		gbc_button_num1.gridx = 0;
		gbc_button_num1.gridy = 4;
		panel_Centro_Centro.add(button_num1, gbc_button_num1);
		
		JButton button_num2 = new JButton("2");
		GridBagConstraints gbc_button_num2 = new GridBagConstraints();
		gbc_button_num2.insets = new Insets(0, 0, 5, 5);
		gbc_button_num2.gridx = 1;
		gbc_button_num2.gridy = 4;
		panel_Centro_Centro.add(button_num2, gbc_button_num2);
		
		JButton button_num3 = new JButton("3");
		GridBagConstraints gbc_button_num3 = new GridBagConstraints();
		gbc_button_num3.insets = new Insets(0, 0, 5, 5);
		gbc_button_num3.gridx = 2;
		gbc_button_num3.gridy = 4;
		panel_Centro_Centro.add(button_num3, gbc_button_num3);
		
		JButton button_restar = new JButton("-");
		GridBagConstraints gbc_button_restar = new GridBagConstraints();
		gbc_button_restar.insets = new Insets(0, 0, 5, 5);
		gbc_button_restar.gridx = 3;
		gbc_button_restar.gridy = 4;
		panel_Centro_Centro.add(button_restar, gbc_button_restar);
		
		JButton button_realizarOperacion = new JButton("=");
		GridBagConstraints gbc_button_realizarOperacion = new GridBagConstraints();
		gbc_button_realizarOperacion.gridheight = 2;
		gbc_button_realizarOperacion.insets = new Insets(0, 0, 5, 0);
		gbc_button_realizarOperacion.gridx = 4;
		gbc_button_realizarOperacion.gridy = 4;
		panel_Centro_Centro.add(button_realizarOperacion, gbc_button_realizarOperacion);
		
		JButton button_num0 = new JButton("0");
		GridBagConstraints gbc_button_num0 = new GridBagConstraints();
		gbc_button_num0.gridwidth = 2;
		gbc_button_num0.insets = new Insets(0, 0, 5, 5);
		gbc_button_num0.gridx = 0;
		gbc_button_num0.gridy = 5;
		panel_Centro_Centro.add(button_num0, gbc_button_num0);
		
		JButton button_coma = new JButton(",");
		GridBagConstraints gbc_button_coma = new GridBagConstraints();
		gbc_button_coma.insets = new Insets(0, 0, 5, 5);
		gbc_button_coma.gridx = 2;
		gbc_button_coma.gridy = 5;
		panel_Centro_Centro.add(button_coma, gbc_button_coma);
		
		JButton button_sumar = new JButton("+");
		GridBagConstraints gbc_button_sumar = new GridBagConstraints();
		gbc_button_sumar.insets = new Insets(0, 0, 5, 5);
		gbc_button_sumar.gridx = 3;
		gbc_button_sumar.gridy = 5;
		panel_Centro_Centro.add(button_sumar, gbc_button_sumar);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		switch (key) {
		case KeyEvent.VK_0: insertarNumero("0"); break;
		case KeyEvent.VK_1: insertarNumero("1"); break;
		case KeyEvent.VK_2: insertarNumero("2"); break;
		case KeyEvent.VK_3: insertarNumero("3"); break;
		case KeyEvent.VK_4: insertarNumero("4"); break;
		case KeyEvent.VK_5: insertarNumero("5"); break;
		case KeyEvent.VK_6: insertarNumero("6"); break;
		case KeyEvent.VK_7: insertarNumero("7"); break;
		case KeyEvent.VK_8: insertarNumero("8"); break;
		case KeyEvent.VK_9: insertarNumero("9"); break;
		
		default:
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	private void insertarNumero(String numero){
		
	}
	private void asignarOperacion(String operacion){
		
	}
	private void calcular(){
		
	}
	private void raiz(){
		
	}
	private void inversa(){
		
	}
	private void cambiarSigno(){
		
	}
	private void retroceder(){
		
	}
	private void clearError(){
		
	}
	private void clear(){
		
	}
	private void refrescarTextoResultado(){
		
	}
}
