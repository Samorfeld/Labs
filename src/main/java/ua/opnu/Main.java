package ua.opnu;

public class Main {

    public static void main(String[] args){
        TimeSpan first = new TimeSpan();
        TimeSpan second = new TimeSpan(150);
        TimeSpan third = new TimeSpan(2, 30);
        TimeSpan copy = new TimeSpan(third);

        third.add(1, 45);
        third.add(30);
        third.add(second);
        third.substract(30);
        third.substract(second);

        double hours = third.getTotalHours();
        int minutes = third.getTotalMinutes();
        third.scale(2);

        System.out.println("Години " + hours);
        System.out.println("Хвилини " + minutes);
        System.out.println("Після scale = годин " + third.getHours() + " Хвилин " + third.getMinutes());
    }

}