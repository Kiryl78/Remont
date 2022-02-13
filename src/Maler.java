public class Maler extends Worker {
    String profession ;

    public Maler (String name){
        super(name);
        this.profession = "малЁр";
    }

    public void intro() {
        super.intro();
        System.out.println(profession);
    }

    public void workAndLeave () {
        super.workAndLeave();
        System.out.println(profession + " "+name+"): Не тот колор! .. Я закончил..");
    }
}
