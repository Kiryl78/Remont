public class Electrician extends Worker {
    String profession ;

    public Electrician (String name){
        super(name);
        this.profession = "электрик";
    }

    public void intro() {
      super.intro();

    }
  public void workAndLeave () {
      super.workAndLeave();
      System.out.println(profession + " "+name+": Ай! Это ж была фаза! Я закончил..");
  }
}
