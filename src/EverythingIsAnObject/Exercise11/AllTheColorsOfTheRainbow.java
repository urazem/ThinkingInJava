package EverythingIsAnObject.Exercise11;

public class AllTheColorsOfTheRainbow {
    int colorNumber = 0;
    int hue = 0;

    int changeHue(int h) {
        return hue = h;
    }

    int changeColor(int c) {
        return colorNumber = c;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.printf("ColorNumber = %d",rainbow.colorNumber);
        rainbow.changeColor(34);
        rainbow.changeHue(12);
        System.out.printf("\nColor changed:\nColorNumber = %d\nHue = %d",rainbow.colorNumber,rainbow.hue);
    }
}