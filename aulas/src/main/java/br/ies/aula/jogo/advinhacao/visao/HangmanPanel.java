package br.ies.aula.jogo.advinhacao.visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class HangmanPanel extends JPanel{

	
	private static final long serialVersionUID = 1L;
	private int x = 0;
	private int y = 0;
	private int width = 250;
	private int height = 65;
	
	private int badGuesses;
	
	public HangmanPanel(int xcoord, int ycoord){
		x = xcoord;
		y = ycoord;
		badGuesses = 0;
	}
	
	//
	public void reset(){
		badGuesses=0;
	}
	
	//
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawRect(x,y,width,height);
		drawVertLine(-height*4,x+width/4,y,g);

		drawHorizLine(5*width/12,x+width/4,y-height*4,g);

		drawVertLine(width/6,x+2*width/3,y-height*4,g);

		if(badGuesses>0){
			drawbody(g);
		}
	}
	
	//
	private void drawVertLine(int length, int xcoord, int ycoord, Graphics g){
		g.drawLine(xcoord, ycoord, xcoord, ycoord+length);
	}
	
	//
	private void drawHorizLine(int length, int xcoord,int ycoord, Graphics g){
		g.drawLine(xcoord, ycoord, xcoord+length, ycoord);
	}
	
	//
	private void drawbody(Graphics g){
		drawsHeadInGraphic(g);
		if(badGuesses>1){
			drawVertLine(height,x+2*width/3,y-height*4+width/6+3*height/4,g);
			if(badGuesses>2){
				drawHorizLine(-width/10,x+2*width/3,y-height*4+width/6+5*height/4,g);
				if(badGuesses>3){
					drawHorizLine(width/10,x+2*width/3,y-height*4+width/6+5*height/4,g);
					if(badGuesses>4){
						g.drawLine(x+2*width/3, y-height*3+width/6+3*height/4, (int)Math.round((x+2*width/3)+height/2*Math.sin(Math.PI/6)), (int)Math.round((y-height*3+width/6+3*height/4)+height/2*Math.cos(Math.PI/6)));
						if(badGuesses>5){
							g.drawLine(x+2*width/3, y-height*3+width/6+3*height/4, (int)Math.round((x+2*width/3)+height/2*Math.sin(-Math.PI/6)), (int)Math.round((y-height*3+width/6+3*height/4)+height/2*Math.cos(-Math.PI/6)));
						}
					}
				}
			}
		}
	}

	private void drawsHeadInGraphic(Graphics g) {
		int xPointBeginHeadDrawing = x+2*(width/3)-3*(height/8);
		int yPointBeginHeadDrawing = y-height*4+width/6;
		int shifting = 3;
		int widthOfHead = shifting*height/4;
		int heightOfHead = shifting*height/4;
		int startAngle = 90;
		int arcAngle = 360;
		g.drawArc(xPointBeginHeadDrawing, yPointBeginHeadDrawing, widthOfHead, heightOfHead, startAngle, arcAngle);
	}


	//
	public void badGuess() {
		badGuesses++;
		repaint();
	}
	
}
