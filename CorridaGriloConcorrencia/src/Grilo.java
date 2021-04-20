import java.util.Random;


public class Grilo {
    private int distanciaRandomica;
    private String nome;
    private int pulos = 0;
    private int totalPercorrido = 0;
    private int timeGrilo = 0;

    public Grilo(String nome){
        this.setNome(nome);
    }

    public void pular(){
        this.setDistanciaRandomica(new Random().nextInt(50));
        //this.getDistanciaRandomica();
    }

    public int getTimeGrilo() {
        return timeGrilo;
    }

    public void setTimeGrilo(int timeGrilo) {
        this.timeGrilo = timeGrilo;
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
