package Lesson_3.Exp001;

//import java.util.Random;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.number),
                Priest.r.nextInt(100, 200));
        this.maxElixir = Priest.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }

    @Override
    public void die() {
    
    }

}