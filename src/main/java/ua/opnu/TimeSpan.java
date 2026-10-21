package ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;



    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getTotalMinutes(){
        return  (hours * 60) + minutes;
    }

    public double getTotalHours(){
        return hours + (minutes / 60.0);
    }

    private void setTotalMinutes(int totalMinutes){
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void scale(int factor){
        if (factor > 0)
            setTotalMinutes((getTotalMinutes() * factor));
    }

    public TimeSpan(){

        this.hours = 0;
        this.minutes = 0;

    }

    public TimeSpan(int minutes){
        if (minutes >0){
            setTotalMinutes(minutes);
        }
    }

    public TimeSpan(int hours, int minutes){
        if (hours >=0 && minutes >= 0){
            setTotalMinutes((hours * 60) + minutes);
        }
    }

    public TimeSpan(TimeSpan span){
        this.hours = span.getHours();
        this.minutes = span.getMinutes();
    }

    public void add(int hours, int minutes){
        if (hours >= 0 && minutes >= 0){
            
        }
    }

    public void add (int minutes){
        if (minutes >=0 ){
            setTotalMinutes(getTotalMinutes() + minutes);
        }
    }

    public void add (TimeSpan span){
        setTotalMinutes((getTotalMinutes() + span.getTotalMinutes()));
    }

    public void substract(int hours, int minutes){
        if (hours >= 0 && minutes >= 0){
            int subTotal = (hours * 60) + minutes;
            if (getTotalMinutes() >= subTotal){
                setTotalMinutes(getTotalMinutes() - subTotal);
            }
        }
    }

    public void substract(int minutes){
        if (minutes >= 0){
            if (getTotalMinutes() >= minutes){
                setTotalMinutes(getTotalMinutes() - minutes);
            }
        }
    }

    public void substract(TimeSpan span){
        if (getTotalMinutes() >= span.getTotalMinutes()){
            setTotalMinutes(getTotalMinutes() - span.getTotalMinutes());
        }
    }



}
