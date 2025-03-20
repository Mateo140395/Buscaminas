/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo.alfayafontan
 */
public class Cell {
    
    private boolean mined;
    private int state;
    
    private int row;
    private int column;
    
    public final int TAPED=1;
    public final int MARKED=2;
    public final int UNTAPED=3;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    
}
