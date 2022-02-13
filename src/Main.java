public class Main {
    public static void main(String[] args) {
        String [] imena = {"Петя","Вася","Апполонарий","Джамшут","Таня","Маша","Саша"};
        Worker[][] spisok;
        Worker [] brigada;
        int smeta = 0;
        int min,max;
        int cost, i, j = 0;

        spisok = new Worker[5][3]; //разворачиваем газету обьявлений
        // заполняем список обьявлениями с именами и ставками
        for (i=0; i< spisok.length; i++) {
           spisok[i][0] = new Worker(imena[rnd(0,6)]);
           spisok[i][1] = new Electrician(imena[rnd(0,6)]);
           spisok[i][2] = new Maler(imena[rnd(0,6)]);
        }
        // Выбираем трех специалистов
        brigada = new Worker[3];
        brigada[0] = spisok[1][0];
        brigada[1] = spisok[2][1];
        brigada[2] = spisok[5][2];

        // Знакомимся с народом и считаем смету
        for (i=0; i< brigada.length; i++) {
            brigada[i].intro();
            smeta = smeta + brigada[i].getStavka();
        }
        // Делаем ремонт, выслушиваем каждого, следим за деньгами
        for (i=0; i< brigada.length; i++) {
            brigada[i].workAndLeave();
            smeta = smeta - - brigada[i].getStavka();
            System.out.println(" Осталось: "+ smeta);
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
