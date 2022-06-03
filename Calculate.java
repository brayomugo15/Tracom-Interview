// Class that calculates the area of a rectangle

Public Class Calculate {

    private int length; // length of rectangle
    private int width;  // width of rectangle
    private int area;  // area of rectangle

    public Calculate(){

    }

    // constructor that takes the parameters length and width of the rectangle
    public Calculate(int length, int width){
        this.length = length;
        this.width = width;
    }

    // function to calculate area of the rectangle
    public void performCalculation(){
        this.area = this.length * this.width;
    }

    // Getter function to get the area of the rectangle
    public int getArea() {
        return this.area;
    }
}
