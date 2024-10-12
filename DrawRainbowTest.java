/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.drawrainbow;

/**
 *
 * @author Monet
 */
// Fig. 7.26: DrawRainbowTest.java
 // Test application to display a rainbow.
import javax.swing.JFrame;

 public class DrawRainbowTest
 {
 public static void main( String[] args )
 {
 DrawRainbow panel = new DrawRainbow();
 JFrame application = new JFrame();

 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 application.add( panel );
  application.setSize( 400, 250 );
  application.setVisible( true );
  } // end main
  } // end class DrawRainbowTest
