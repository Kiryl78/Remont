public class Worker {
    String name;
    private int min = 100; // min ставка
    private int max = 750; // max ставка
    int stavka;

    public Worker(String name) {
        this.name = name;
        this.stavka = rnd(min,max);
     }

    public void intro (){
        System.out.println("Привет, командир! Меня Зовут "+name+", моя ставка: "+stavka +" в день");
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void workAndLeave () {
        System.out.println("С вас: "+stavka+"... Работа кипит... ");
    }

    public int getStavka() {
        return stavka;
    }
}

