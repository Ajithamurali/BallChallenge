import processing.core.PApplet;

public class FourBallsOOP extends PApplet {
    public static final int HEIGHT = 500;
    public static final int WIDTH = 800;
    public static int ballHorizontalPostion = 0;
    public static final int ellipseWidth = 50;
    public static final int oneFifthOfHeight = HEIGHT / 5;
    public static final int ellipseHeight = 50;
    Ellipse ellipseObj;

    public static void main(String args[]) {
        PApplet.main("FourBallsOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int heightPart = 1; heightPart < 5; heightPart++) {
            ellipseObj = new Ellipse(heightPart);
            ellipseObj.getEllipse();
        }
        ballHorizontalPostion++;
    }

    class Ellipse {
        int height;

        public Ellipse(int height) {
            this.height = height;
        }

        void getEllipse() {
            ellipse(ballHorizontalPostion * height, oneFifthOfHeight * height, ellipseWidth,
                    ellipseHeight);

        }
    }
}



