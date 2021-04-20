public class App {
    public static void main(String[] args) throws Exception {
        
        //numero de grilos
        int numGrilos = 4;
        
        //apagar
        //ArrayList<Grilo> test = new ArrayList<Grilo>();
        
        
        //tamanho da corrida
        int linhaChegada = 200;
        
        //instanciando grilos
        Grilo[] grilos = new Grilo[numGrilos]; 
        
        //instanciando threads e definindo a quantidade
        //ThreadGrilo[] threads = new ThreadGrilo[numGrilos];
        
        //criando a corrida
        Corrida corrida;
        
        //inicializando grilos
        for(int i = 0; i < numGrilos; i++){
            grilos[i] = new Grilo("Grilo_" + i);
            //test.add(grilos[i]);
        }
        

        //System.out.println(grilos[0].getNome());
        //System.out.println(test.get(1).getNome());
        
        corrida = new Corrida(grilos, linhaChegada);
        
        
   
        
    }
    
    
    
}

