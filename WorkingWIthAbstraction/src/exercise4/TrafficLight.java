package exercise4;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //red -> green -> yellow -> red
    public void changeColor(){ //ne trebaju nam parametri jer cemo implementirati logiku koja je data zadatkom, a kojom se yna iz koje boje se prelazi u koju
        switch (color){
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
            case YELLOW:
                color = Color.RED;
                break;
        }
    }


}
