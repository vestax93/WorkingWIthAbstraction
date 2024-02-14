package exercise5;

public class Field {
    private int[][] field;

    public Field(int[][] field) {
        this.field = field;
        setField();
    }

    private void setField() { //popunjavanje matrice po odredjenom sablonu od 0 po reedovima
        int value = 0;
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = value++;
            }
        }
    }

    public int getLength(){
        return field.length;
    }

    public int getRowLength(int dimension){
        return field[dimension].length;
    }

    public void setField(int row, int col, int newValue){
        this.field[row][col] = newValue;
    }

    public int getValue(int row, int col){
        return this.field[row][col];
    }
}
