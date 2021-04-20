public class Corrida {
    private int linhaChegada;
    
    int numTimes = 0;
    TimeGrilos[] time;
    int griloIndex = 0;
    Grilo[] grilos;
    //instanciando threads e definindo a quantidade
    //ThreadGrilo[] threads;
    
    public Corrida(Grilo[] grilos, int linhaChegada){//ThreadGrilo[] grilo, int tamanhoCorrida){
        
        this.grilos = grilos;
        this.linhaChegada = linhaChegada;
        //threads = new ThreadGrilo[grilos.length];
        
        //definindo a quantidade de times
        numTimes = TimeGrilos.calcularTimes(grilos.length);
        //System.out.println(numTimes);
        
            //criando times
        time = new TimeGrilos[numTimes];
        
        
        for(int i = 0; i < numTimes; i++){
            //inicializando times
            System.out.println("------------------------------------");
            time[i] = new TimeGrilos(i, grilos.length, linhaChegada);
            System.out.println("Time " + time[i].nome + " criado");
            
            for(int j = 0; j < 3; j++){
                //System.out.println("Grilo adicionado no time " + time[i].nome);
                if(griloIndex < grilos.length){
                    //adicionando grilos aos times
                    grilos[griloIndex].setTimeGrilo(i);
                    time[i].adicionarGrilo(grilos[griloIndex]);
                    griloIndex++;
                }else{
                    griloIndex = 0;
                    System.out.println("------------------------------------");
                    break;
                }
            }
        }
        
        System.out.println("Corrida iniciada");
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        
        this.iniciarCorrida();
        
        
        

    }
    
    public void iniciarCorrida(){
        
        for(int i = 0; i < numTimes; i++){
              
            for(int j = 0; j < 3; j++){
                //System.out.println("Grilo adicionado no time " + time[i].nome);
                if(griloIndex < grilos.length){
                    //adicionando grilos aos times
                    time[i].threads.get(j).start();
                    //time[i].pulosTime
                    griloIndex++;
                }else{
                    break;
                }
            }
        }
    }

    public int getLinhaChegada() {
        return linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }
    
}

