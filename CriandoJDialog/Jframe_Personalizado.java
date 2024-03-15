package CriandoJDialog;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class Jframe_Personalizado extends JFrame{

    public Jframe_Personalizado(String tittle){
        super(tittle);
        //Setandoo tamanho do meu Jframe
        this.setBounds(100, 100, 350, 200);
        //Pega o quadrado em branco do JFrame
        Container controlHost = this.getContentPane();
        //Setando uma borda para meu JDialog
        controlHost.setLayout(new FlowLayout());
    }
}
