public class Final {
    private double preco;

    public Final(int dia, double preco, HoraCompra COMPRA){

        if(dia==1 || dia==7){
            this.preco=preco * 0.9;
        }
        else if(COMPRA.gethours() >= 20){
            this.preco=preco * 0.9;
        }
        else{
            this.preco=preco;
        }
    }

    public double getPF(){
        return this.preco;
    }
}