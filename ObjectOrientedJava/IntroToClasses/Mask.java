public class Mask {

    //these variables describe the mask
    String color = "Black";
    String material = "Cotton";
    int size = 12;

    boolean isOnFace = false;

    //these methods are how we interact with the mask
    void setOnFace() {
        isOnFace = true;
    }

    void setOffFace() {
        isOnFace = false;
    }
    
}
