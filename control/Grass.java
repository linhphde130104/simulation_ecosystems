/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.*;

/**
 *
 * @author FSC
 */
public class Grass {
    public int nColunms;
    public int nRows;
    private double [][] cells;
    private Random rand;
     
    private static double MAXGROWING_SPEED = 0.1;
    public Grass(int nColunms, int nRows){
        super();
        this.rand = new Random();
        this.nColunms=nColunms;
        this.nRows=nRows;
        this.cells= new double [this.nRows][this.nColunms];
        
        for(int i=0 ; i<nRows ; i++){
            for(int j = 0; j<nColunms ; j++){
                this.cells[i][j]=this.rand.nextDouble();
            }
        }
    }
    public double getcells(int i,int j){
        return cells[i][j];
    }
    public void grow() {
		
		for (int i=0;i<nRows;i++) {
			for(int j=0;j<nColunms;j++) 
			{
				cells[i][j]+=rand.nextDouble()*MAXGROWING_SPEED;				
				cells[i][j]=(cells[i][j])>1? 1 : cells[i][j]; 
				
			}
		}
		
	}
   
}

