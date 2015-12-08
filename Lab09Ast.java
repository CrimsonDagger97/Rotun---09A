// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        PineTree myTree = new PineTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);
        myTree.drawStar(g);
		myTree.drawPresents(g);

    }
}

class Tree
{
    // Do NOT alter this Tree class in any way!

    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }

    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillPolygon(g,500,250,350,425,650,425);
        Expo.fillPolygon(g,500,150,400,275,600,275);
        Expo.fillPolygon(g,500,200,375,350,625,350);
    }
    
    public void drawOrnaments(Graphics g)
    {
       Expo.setColor(g,Expo.red);
       Expo.fillCircle(g,500,200,15);
       Expo.fillCircle(g,450,345,15);
       Expo.fillCircle(g,520,260,15);
       Expo.fillCircle(g,465,300,15);
       Expo.fillCircle(g,500,300,15);
       Expo.fillCircle(g,500,400,15);
       Expo.fillCircle(g,550,250,15);
       Expo.fillCircle(g,475,380,15);
       Expo.fillCircle(g,545,360,15);
       Expo.fillCircle(g,520,340,15);
    }
    public void drawStar(Graphics g)
    {
        Expo.setColor(g,Expo.yellow);
        Expo.fillStar(g,500,135,35,5); 
    }
    public void drawPresents(Graphics g)
    {
        Expo.setColor(g,Expo.blue);
        Expo.fillRectangle(g,425,500,275,600); 
    }
}
