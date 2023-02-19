
class Computer {
    public void playMusic() {
        System.out.println("Play Music");
    }

    public String getPEN(int cost) {
        return "pen" + cost;
    }
}

public class Method {

    public static void main(String[] args) {

        Computer Com = new Computer();
        Com.playMusic();
        String str = Com.getPEN(10);
        System.out.println(str);

    }

}