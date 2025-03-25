
import java.util.ArrayList;
import java.util.Random;

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

    private int rows = 6;
    private int columns = 6;

    private ArrayList<Cell> adjacentCells = new ArrayList<>();

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Game(int rows, int columns, int mines) {
        this.cells = new Cell[rows][columns];
        this.rows = rows;
        this.columns = columns;

        fillMines(mines);
    }

    public Cell getCell(int row, int column) {
        return cells[row][column];
    }

    private ArrayList<Cell> getAdjacentCells(Cell cell) {
        //Recorremos as filas e columas dende unha posición anterior á dada ata unha posterior
        for (int i = cell.getRow() - 1; i <= cell.getRow() + 1; i++) {
            for (int j = cell.getColumn() - 1; j <= cell.getColumn() + 1; j++) {
                //Engadimos todas as celas do noso percorrido e engadimos ao array aquelas que non sexan a do parámetro
                if (i != cell.getRow() || j != cell.getColumn()) {
                    adjacentCells.add(cells[i][j]);
                }
            }
        }
        return adjacentCells;
    }

    public int getAdjacentMines(Cell cell) {
        int adjacentMines = 0;
        getAdjacentCells(cell);
        //Recorremos con un bucle for a lista de celdas adxacentes e se hai minas nelas sumamos un ao contador
        for (Cell adjacentCell : adjacentCells) {
            if (adjacentCell.isMined()) {
                adjacentMines++;
            }
        }
        return adjacentMines;
    }

    public void openCell(Cell cell) {

    }

    public void openAllMines() {

    }

    public boolean checkCellsToOpen() {
        for (int i=0; i<cells.length;i++){
            for(int j=0; j<cells[i].length;j++){
                if(!cells[i][j].isMined() && cells[i][j].getState()!=Cell.DESTAPADA){
                    return false;
                }
            }
        }
        return true;
    }

    private void fillMines(int mines) {
        Random random = new Random();
        //Iniciamos unha variable que comproba o número de minas colocadas
        int placedMines = 0;

        //Repetimos un bucle no que se selecciona un número de fila e de columna aleatoria e, se non hai xa unha mina, coloca unha nesa posición. Facemos isto mentres o número de minas colocadas sexa menor ao de minas desexhado.
        do {

            int i = random.nextInt(rows);
            int j = random.nextInt(columns);

            if (!cells[i][j].isMined()) {
                cells[i][j].setMined(true);
                placedMines++;
            }
        } while (placedMines < mines);

    }
}
