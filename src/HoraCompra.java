public class HoraCompra{
    private int hours, min, seg;

    public HoraCompra(int hours, int min, int seg){
        if(hours >= 0 && hours < 24){
            this.hours = hours;
        }
        else{
            throw new IllegalArgumentException("Hora Invalida!");
        }

        if(min >= 0 && min < 60){
            this.min=min;
        }
        else{
            throw new IllegalArgumentException("Minutos Invalidos!");
        }

        if(seg >= 0 && seg < 60){
            this.seg=seg;
        }
        else{
            throw new IllegalArgumentException("Segundos Invalidos!");
        }
    }

    public String toString(){
        return String.format("%s:%s:%s", gethours(), getMin(), getSeg());
    }

    public int gethours(){
        return this.hours;
    }

    public int getMin(){
        return this.min;
    }

    public int getSeg(){
        return this.seg;
    }
}
