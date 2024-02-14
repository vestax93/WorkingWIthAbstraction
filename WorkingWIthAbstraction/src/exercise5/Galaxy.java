package exercise5;

public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public int getLength(){
        return field.getLength();
    }

    public int getRowLength(int dimension){
        return field.getRowLength(dimension);
    }

    public void setStar(int row, int col, int newValue){
        field.setField(row,col,newValue);
    }

    public int getStar(int row, int col){
        return field.getValue(row,col);
    }
}
