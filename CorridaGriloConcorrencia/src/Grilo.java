import java.util.Random;


public class Grilo {
    private int distanciaRandomica;
    private String nome;
    private int pulos = 0;
    private int totalPercorrido = 0;
    private int timeGrilo = 0;
    public TimeGrilos meuTime;
    public boolean vencedor = false;

    public Grilo(String nome){
        this.setNome(nome);
    }

    public void pular(){
        this.setDistanciaRandomica(new Random().nextInt(50));
        //this.getDistanciaRandomica();
    }

    public synchronized void pulosTime(int pulos){
        this.meuTime.pulosTime += 1;
        //this.meuTime.totalP = p;
        //System.out.println("Pulos do time atual " + this.meuTime.pulosTime);
    }
    
    public synchronized void totalP(int p){
        this.meuTime.totalP += p;
        //this.meuTime.totalP = p;
        //System.out.println("Pulos do time atual " + this.meuTime.pulosTime);
    }

    public int getTimeGrilo() {
        return timeGrilo;
    }

    public void setTimeGrilo(int timeGrilo, TimeGrilos t) {
        this.timeGrilo = timeGrilo;
        meuTime = t;
    }



    public int getDistanciaRandomica() {
        return distanciaRandomica;
    }

    public void setDistanciaRandomica(int distanciaRandomica) {
        this.distanciaRandomica = distanciaRandomica;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

     public int getTotalPercorrido() {
        return totalPercorrido;
    }

    public void setTotalPercorrido(int totalPercorrido) {
        this.totalPercorrido = totalPercorrido;
    }

    public int getPulos() {
        return pulos;
    }

    public void setPulos(int pulos) {
        this.pulos = pulos;
    }
}
