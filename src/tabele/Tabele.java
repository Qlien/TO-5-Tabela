/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabele;

/**
 *
 * @author Michał
 */
public class Tabele {
    
    public int numberOfCells(double numberOfRows, double numberOfColumns)
    {
        int rows = (int)Math.round(numberOfRows);
        int columns = (int)Math.round(numberOfColumns);
        
        if(rows<1) rows = 1;
        if(rows>75) rows = 75;
        if(columns<1) columns = 1;
        if(columns>75) columns = 75;
        
        while(rows*columns>4096)
        {
            columns--;
        }
        
        return rows*columns;
    }
    
}
