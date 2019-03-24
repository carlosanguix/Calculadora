package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

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
		
		setBounds(2000, 1000, 320, 425);
		
		
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
		contentPane.setBorder(new EmptyBorder(20, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Top = new JPanel();
		panel_Top.setBorder(null);
		contentPane.add(panel_Top, BorderLayout.NORTH);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBackground(Color.WHITE);
		textResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		textResultado.setFont(new Font("Arial", Font.PLAIN, 15));
		textResultado.setHorizontalAlignment(JTextField.RIGHT);
		// ??
		textResultado.addKeyListener(this);
		textResultado.requestFocus();
		//
		textResultado.setText("0");
		GroupLayout gl_panel_Top = new GroupLayout(panel_Top);
		gl_panel_Top.setHorizontalGroup(
			gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Top.createSequentialGroup()
					.addContainerGap()
					.addComponent(textResultado, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_Top.setVerticalGroup(
			gl_panel_Top.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Top.createSequentialGroup()
					.addGap(0)
					.addComponent(textResultado, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_Top.setLayout(gl_panel_Top);
		
		JPanel panel_Centro = new JPanel();
		contentPane.add(panel_Centro, BorderLayout.CENTER);
		
		JPanel panel_Centro_Centro = new JPanel();
		panel_Centro.add(panel_Centro_Centro);
		GridBagLayout gbl_panel_Centro_Centro = new GridBagLayout();
		gbl_panel_Centro_Centro.columnWidths = new int[] {40, 40, 40, 40, 40};
		gbl_panel_Centro_Centro.rowHeights = new int[] {40, 40, 40, 40, 40, 40};
		panel_Centro_Centro.setLayout(gbl_panel_Centro_Centro);
		
		JButton button_MemoryClear = new JButton("MC");
		GridBagConstraints gbc_button_MemoryClear = new GridBagConstraints();
		gbc_button_MemoryClear.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryClear.insets = new Insets(0, 6, 5, 5);
		gbc_button_MemoryClear.gridx = 0;
		gbc_button_MemoryClear.gridy = 0;
		panel_Centro_Centro.add(button_MemoryClear, gbc_button_MemoryClear);
		
		JButton button_MemoryRecall = new JButton("MR");
		GridBagConstraints gbc_button_MemoryRecall = new GridBagConstraints();
		gbc_button_MemoryRecall.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryRecall.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryRecall.gridx = 1;
		gbc_button_MemoryRecall.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRecall, gbc_button_MemoryRecall);
		
		JButton button_MemoryStorage = new JButton("MS");
		GridBagConstraints gbc_button_MemoryStorage = new GridBagConstraints();
		gbc_button_MemoryStorage.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryStorage.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryStorage.gridx = 2;
		gbc_button_MemoryStorage.gridy = 0;
		panel_Centro_Centro.add(button_MemoryStorage, gbc_button_MemoryStorage);
		
		JButton button_MemorySumar = new JButton("M+");
		GridBagConstraints gbc_button_MemorySumar = new GridBagConstraints();
		gbc_button_MemorySumar.fill = GridBagConstraints.BOTH;
		gbc_button_MemorySumar.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemorySumar.gridx = 3;
		gbc_button_MemorySumar.gridy = 0;
		panel_Centro_Centro.add(button_MemorySumar, gbc_button_MemorySumar);
		
		JButton button_MemoryRestar = new JButton("M-");
		GridBagConstraints gbc_button_MemoryRestar = new GridBagConstraints();
		gbc_button_MemoryRestar.fill = GridBagConstraints.BOTH;
		gbc_button_MemoryRestar.insets = new Insets(0, 0, 5, 5);
		gbc_button_MemoryRestar.gridx = 4;
		gbc_button_MemoryRestar.gridy = 0;
		panel_Centro_Centro.add(button_MemoryRestar, gbc_button_MemoryRestar);
		
		JButton button_Retroceder = new JButton("←");
		GridBagConstraints gbc_button_Retroceder = new GridBagConstraints();
		gbc_button_Retroceder.fill = GridBagConstraints.BOTH;
		gbc_button_Retroceder.insets = new Insets(0, 6, 5, 5);
		gbc_button_Retroceder.gridx = 0;
		gbc_button_Retroceder.gridy = 1;
		panel_Centro_Centro.add(button_Retroceder, gbc_button_Retroceder);
		
		JButton button_ClearError = new JButton("CE");
		GridBagConstraints gbc_button_ClearError = new GridBagConstraints();
		gbc_button_ClearError.fill = GridBagConstraints.BOTH;
		gbc_button_ClearError.insets = new Insets(0, 0, 5, 5);
		gbc_button_ClearError.gridx = 1;
		gbc_button_ClearError.gridy = 1;
		panel_Centro_Centro.add(button_ClearError, gbc_button_ClearError);
		
		JButton button_Clear = new JButton("C");
		GridBagConstraints gbc_button_Clear = new GridBagConstraints();
		gbc_button_Clear.fill = GridBagConstraints.BOTH;
		gbc_button_Clear.insets = new Insets(0, 0, 5, 5);
		gbc_button_Clear.gridx = 2;
		gbc_button_Clear.gridy = 1;
		panel_Centro_Centro.add(button_Clear, gbc_button_Clear);
		
		JButton button_CambiarSigno = new JButton("+/-");
		GridBagConstraints gbc_button_CambiarSigno = new GridBagConstraints();
		gbc_button_CambiarSigno.fill = GridBagConstraints.BOTH;
		gbc_button_CambiarSigno.insets = new Insets(0, 0, 5, 5);
		gbc_button_CambiarSigno.gridx = 3;
		gbc_button_CambiarSigno.gridy = 1;
		panel_Centro_Centro.add(button_CambiarSigno, gbc_button_CambiarSigno);
		
		JButton button_RaizCuadrada = new JButton("√");
		GridBagConstraints gbc_button_RaizCuadrada = new GridBagConstraints();
		gbc_button_RaizCuadrada.fill = GridBagConstraints.BOTH;
		gbc_button_RaizCuadrada.insets = new Insets(0, 0, 5, 5);
		gbc_button_RaizCuadrada.gridx = 4;
		gbc_button_RaizCuadrada.gridy = 1;
		panel_Centro_Centro.add(button_RaizCuadrada, gbc_button_RaizCuadrada);
		
		JButton button_Num7 = new JButton("7");
		GridBagConstraints gbc_button_Num7 = new GridBagConstraints();
		gbc_button_Num7.fill = GridBagConstraints.BOTH;
		gbc_button_Num7.insets = new Insets(0, 6, 5, 5);
		gbc_button_Num7.gridx = 0;
		gbc_button_Num7.gridy = 2;
		panel_Centro_Centro.add(button_Num7, gbc_button_Num7);
		
		JButton button_Num8 = new JButton("8");
		GridBagConstraints gbc_button_Num8 = new GridBagConstraints();
		gbc_button_Num8.fill = GridBagConstraints.BOTH;
		gbc_button_Num8.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num8.gridx = 1;
		gbc_button_Num8.gridy = 2;
		panel_Centro_Centro.add(button_Num8, gbc_button_Num8);
		
		JButton button_Num9 = new JButton("9");
		GridBagConstraints gbc_button_Num9 = new GridBagConstraints();
		gbc_button_Num9.fill = GridBagConstraints.BOTH;
		gbc_button_Num9.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num9.gridx = 2;
		gbc_button_Num9.gridy = 2;
		panel_Centro_Centro.add(button_Num9, gbc_button_Num9);
		
		JButton button_Dividir = new JButton("/");
		GridBagConstraints gbc_button_Dividir = new GridBagConstraints();
		gbc_button_Dividir.fill = GridBagConstraints.BOTH;
		gbc_button_Dividir.insets = new Insets(0, 0, 5, 5);
		gbc_button_Dividir.gridx = 3;
		gbc_button_Dividir.gridy = 2;
		panel_Centro_Centro.add(button_Dividir, gbc_button_Dividir);
		
		JButton button_Porcentaje = new JButton("%");
		GridBagConstraints gbc_button_Porcentaje = new GridBagConstraints();
		gbc_button_Porcentaje.fill = GridBagConstraints.BOTH;
		gbc_button_Porcentaje.insets = new Insets(0, 0, 5, 5);
		gbc_button_Porcentaje.gridx = 4;
		gbc_button_Porcentaje.gridy = 2;
		panel_Centro_Centro.add(button_Porcentaje, gbc_button_Porcentaje);
		
		JButton button_Num4 = new JButton("4");
		GridBagConstraints gbc_button_Num4 = new GridBagConstraints();
		gbc_button_Num4.fill = GridBagConstraints.BOTH;
		gbc_button_Num4.insets = new Insets(0, 6, 5, 5);
		gbc_button_Num4.gridx = 0;
		gbc_button_Num4.gridy = 3;
		panel_Centro_Centro.add(button_Num4, gbc_button_Num4);
		
		JButton button_Num5 = new JButton("5");
		GridBagConstraints gbc_button_Num5 = new GridBagConstraints();
		gbc_button_Num5.fill = GridBagConstraints.BOTH;
		gbc_button_Num5.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num5.gridx = 1;
		gbc_button_Num5.gridy = 3;
		panel_Centro_Centro.add(button_Num5, gbc_button_Num5);
		
		JButton button_Num6 = new JButton("6");
		GridBagConstraints gbc_button_Num6 = new GridBagConstraints();
		gbc_button_Num6.fill = GridBagConstraints.BOTH;
		gbc_button_Num6.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num6.gridx = 2;
		gbc_button_Num6.gridy = 3;
		panel_Centro_Centro.add(button_Num6, gbc_button_Num6);
		
		JButton button_Multiplicar = new JButton("*");
		GridBagConstraints gbc_button_Multiplicar = new GridBagConstraints();
		gbc_button_Multiplicar.fill = GridBagConstraints.BOTH;
		gbc_button_Multiplicar.insets = new Insets(0, 0, 5, 5);
		gbc_button_Multiplicar.gridx = 3;
		gbc_button_Multiplicar.gridy = 3;
		panel_Centro_Centro.add(button_Multiplicar, gbc_button_Multiplicar);
		
		JButton button_DividirPorX = new JButton("1/x");
		GridBagConstraints gbc_button_DividirPorX = new GridBagConstraints();
		gbc_button_DividirPorX.fill = GridBagConstraints.BOTH;
		gbc_button_DividirPorX.insets = new Insets(0, 0, 5, 5);
		gbc_button_DividirPorX.gridx = 4;
		gbc_button_DividirPorX.gridy = 3;
		panel_Centro_Centro.add(button_DividirPorX, gbc_button_DividirPorX);
		
		JButton button_Num1 = new JButton("1");
		GridBagConstraints gbc_button_Num1 = new GridBagConstraints();
		gbc_button_Num1.fill = GridBagConstraints.BOTH;
		gbc_button_Num1.insets = new Insets(0, 6, 5, 5);
		gbc_button_Num1.gridx = 0;
		gbc_button_Num1.gridy = 4;
		panel_Centro_Centro.add(button_Num1, gbc_button_Num1);
		
		JButton button_Num2 = new JButton("2");
		GridBagConstraints gbc_button_Num2 = new GridBagConstraints();
		gbc_button_Num2.fill = GridBagConstraints.BOTH;
		gbc_button_Num2.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num2.gridx = 1;
		gbc_button_Num2.gridy = 4;
		panel_Centro_Centro.add(button_Num2, gbc_button_Num2);
		
		JButton button_Num3 = new JButton("3");
		GridBagConstraints gbc_button_Num3 = new GridBagConstraints();
		gbc_button_Num3.fill = GridBagConstraints.BOTH;
		gbc_button_Num3.insets = new Insets(0, 0, 5, 5);
		gbc_button_Num3.gridx = 2;
		gbc_button_Num3.gridy = 4;
		panel_Centro_Centro.add(button_Num3, gbc_button_Num3);
		
		JButton button_Restar = new JButton("-");
		GridBagConstraints gbc_button_Restar = new GridBagConstraints();
		gbc_button_Restar.fill = GridBagConstraints.BOTH;
		gbc_button_Restar.insets = new Insets(0, 0, 5, 5);
		gbc_button_Restar.gridx = 3;
		gbc_button_Restar.gridy = 4;
		panel_Centro_Centro.add(button_Restar, gbc_button_Restar);
		
		JButton button_Resultado = new JButton("=");
		GridBagConstraints gbc_button_Resultado = new GridBagConstraints();
		gbc_button_Resultado.fill = GridBagConstraints.BOTH;
		gbc_button_Resultado.gridheight = 2;
		gbc_button_Resultado.insets = new Insets(0, 0, 5, 5);
		gbc_button_Resultado.gridx = 4;
		gbc_button_Resultado.gridy = 4;
		panel_Centro_Centro.add(button_Resultado, gbc_button_Resultado);
		
		JButton button_Num0 = new JButton("0");
		GridBagConstraints gbc_button_Num0 = new GridBagConstraints();
		gbc_button_Num0.fill = GridBagConstraints.BOTH;
		gbc_button_Num0.gridwidth = 2;
		gbc_button_Num0.insets = new Insets(0, 6, 5, 5);
		gbc_button_Num0.gridx = 0;
		gbc_button_Num0.gridy = 5;
		panel_Centro_Centro.add(button_Num0, gbc_button_Num0);
		
		JButton button_Coma = new JButton(",");
		GridBagConstraints gbc_button_Coma = new GridBagConstraints();
		gbc_button_Coma.fill = GridBagConstraints.BOTH;
		gbc_button_Coma.insets = new Insets(0, 0, 5, 5);
		gbc_button_Coma.gridx = 2;
		gbc_button_Coma.gridy = 5;
		panel_Centro_Centro.add(button_Coma, gbc_button_Coma);
		
		JButton button_Sumar = new JButton("+");
		GridBagConstraints gbc_button_Sumar = new GridBagConstraints();
		gbc_button_Sumar.fill = GridBagConstraints.BOTH;
		gbc_button_Sumar.insets = new Insets(0, 0, 5, 5);
		gbc_button_Sumar.gridx = 3;
		gbc_button_Sumar.gridy = 5;
		panel_Centro_Centro.add(button_Sumar, gbc_button_Sumar);
		
		JPanel panel_Bot = new JPanel();
		contentPane.add(panel_Bot, BorderLayout.SOUTH);
		
		JLabel labelInformación1 = new JLabel("Fecha entrega:");
		
		JLabel labelInformacion2 = new JLabel("martes, 30 de mayo");
		GroupLayout gl_panel_Bot = new GroupLayout(panel_Bot);
		gl_panel_Bot.setHorizontalGroup(
			gl_panel_Bot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Bot.createSequentialGroup()
					.addGap(47)
					.addComponent(labelInformación1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(labelInformacion2)
					.addGap(54))
		);
		gl_panel_Bot.setVerticalGroup(
			gl_panel_Bot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Bot.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_Bot.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelInformación1)
						.addComponent(labelInformacion2)))
		);
		panel_Bot.setLayout(gl_panel_Bot);
		
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
