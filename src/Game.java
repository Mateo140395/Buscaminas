
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo.alfayafontan
 */
public class Game {
    
    private Cell cells[][];
    
    private int rows=6;
    private int columns=6;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Game(Cell[][] cells, int rows, int columns) {
        this.cells = new Cell[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }
    
    public Cell getCell(int row, int column){
        return null;
    }
    
    private ArrayList<Cell> getAdjacentCells(Cell cell){
                return null;
    }
    
    public int getAdjacentMine(Cell cell){
        return 0;
    }
    
    public void openCell(Cell cell){
        
    }
    
    public void openAllMines(){
        
    }
    
    public boolean checkCellsToOpen(){
        return false;
    }
    
    private void fillMines(int mines){
        
    }
    
    public Game(int rows, int columns, int mines){
        
    }
    
}
