package Lesson_3.Exp001;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number), Druid.r.nextInt(100, 200));
        this.maxHarmony = Druid.r.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    @Override
    public void die() {
        
    }

}
