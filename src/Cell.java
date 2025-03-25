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
    
    public final static int TAPADA=1;
    public final static int MARCADA=2;
    public final static int DESTAPADA=3;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.mined=false;
        this.state=TAPADA;
    }

    public boolean isMined() {
        return mined;
    }

    public void setMined(boolean mined) {
        this.mined = mined;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    
}
