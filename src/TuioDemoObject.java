/*
 TUIO Java GUI Demo
 Copyright (c) 2005-2014 Martin Kaltenbrunner <martin@tuio.org>
 
 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files
 (the "Software"), to deal in the Software without restriction,
 including without limitation the rights to use, copy, modify, merge,
 publish, distribute, sublicense, and/or sell copies of the Software,
 and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:
 
 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import TUIO.*;

public class TuioDemoObject extends TuioObject {

	private Shape square;

	public TuioDemoObject(TuioObject tobj) {
		super(tobj);
		int size = TuioDemoComponent.object_size;
		square = new RoundRectangle2D.Float(-size/2,-size/2,size,size, 52, 22);     // form of each fiducial
		AffineTransform transform = new AffineTransform();
		transform.translate(xpos,ypos);
		transform.rotate(angle,xpos,ypos);
		square = transform.createTransformedShape(square);
	}
	
	public void paint(Graphics2D g, int width, int height) {
	
		float Xpos = xpos*width;
		float Ypos = ypos*height;
		float scale = height/(float)TuioDemoComponent.table_size;
		String fiducialName = null;                                  //name written on each fiducial 
			
		AffineTransform trans = new AffineTransform();
		trans.translate(-xpos,-ypos);
		trans.translate(Xpos,Ypos);
		
		if(symbol_id==0) {
		trans.scale(2*scale,2*scale); 
		fiducialName = "Schroten";                                //Name of the fiducial
		g.setPaint(Color.red);
		g.drawLine(0, 100, (int)Xpos, (int)Ypos);                 // Line from left border to fiducial
		g.setPaint(Color.green);
		g.drawString(fiducialName +"",Xpos/2,2*Ypos/3);             //thermal energy flow in kWh
		}
		else if(symbol_id==1) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Maischen";//Name of the fiducial
			g.setPaint(Color.blue);
			}
		else if(symbol_id==2) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Laeutern";//Name of the fiducial
			g.setPaint(Color.red);
			}
		else if(symbol_id==3) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Wuerzekochen";//Name of the fiducial
			g.setPaint(Color.yellow);
			}
		else if(symbol_id==4) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Ausschlagen";//Name of the fiducial
			g.setPaint(Color.cyan);
			}
		else if(symbol_id==5) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Abkuehlen";//Name of the fiducial
			g.setPaint(Color.magenta);
			}
		else if(symbol_id==6) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Gaehrung";//Name of the fiducial
			g.setPaint(Color.white);
			}
		else if(symbol_id==7) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Lagern/Reifen/Kuehlen";//Name of the fiducial
			g.setPaint(Color.orange);
			}
		else if(symbol_id==8) {
			trans.scale(2*scale,2*scale);
			fiducialName = "Abfuellen/Etikettieren ";//Name of the fiducial
			g.setPaint(Color.pink);
			}
		else{
			trans.scale(scale,scale);
			g.setPaint(Color.black);
		}
		System.out.println(symbol_id);
		System.out.println(Xpos +"," + Ypos );
		System.out.println(xpos +"," + ypos );
		Shape s = trans.createTransformedShape(square);
		
		
		g.fill(s);
		g.setPaint(Color.white);
		g.drawString(symbol_id+1 + "." + fiducialName +"",Xpos-10,Ypos-70); // final text and its position for each fiducial
		
		
	}

	public void update(TuioObject tobj) {
		
		float dx = tobj.getX() - xpos;
		float dy = tobj.getY() - ypos;
		float da = tobj.getAngle() - angle;

		if ((dx!=0) || (dy!=0)) {
			AffineTransform trans = AffineTransform.getTranslateInstance(dx,dy);
			square = trans.createTransformedShape(square);
		}
		
		if (da!=0) {
			AffineTransform trans = AffineTransform.getRotateInstance(da,tobj.getX(),tobj.getY());
			square = trans.createTransformedShape(square);
		}

		super.update(tobj);
	}

}
