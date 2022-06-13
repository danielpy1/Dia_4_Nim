public class Tablero {
    int columna_1;
    int columna_2;
    int columna_3;

    public Tablero(int columna_1, int columna_2, int columna_3) {
        this.columna_1 = columna_1;
        this.columna_2 = columna_2;
        this.columna_3 = columna_3;
    }

    public int getColumna_1() {
        return columna_1;
    }

    public int getColumna_2() {
        return columna_2;
    }

    public int getColumna_3() {
        return columna_3;
    }

    public void setColumna_1(int columna_1) {
        this.columna_1 = this.columna_1-columna_1;
    }

    public void setColumna_2(int columna_2) {
        this.columna_2 = this.columna_2-columna_2;
    }

    public void setColumna_3(int columna_3) {
        this.columna_3 = this.columna_3-columna_3;
    }
}
