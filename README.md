#uso de mecanismos de sincronização
Para compreender o conceito de programacao paralela e mecanismos de controle de concorrencia, foi proposto o desafio de desenvolver uma aplicacao que simule uma de corrida de grilos em multi-thread, seguindo os criterios:

Cada grilo deve ser implementado em uma thread;
O número de grilos deverá ser variável, definido na aplicação;
Cada grilo pula uma distância randomica a cada iteração;
O sistema deve definir uma linha de chegada (distância total), podendo a mesma ser alterada na aplicação;
Os grilos devem ser agrupados em times (máximo de 3 grilos / time). Ao final, deve-se exibir o total percorrido e o número de pulos de cada time bem como o time vencedor.
 
A execução da aplicação deve imprimir um log de informação, conforme o exemplo abaixo:
 
 
O Grilo_01 pulou 21cm        e já percorreu 21cm
O Grilo_02 pulou 21cm        e já percorreu 21cm
O Grilo_03 pulou 47cm        e já percorreu 47cm
O Grilo_05 pulou 46cm        e já percorreu 46cm
O Grilo_01 pulou 34cm        e já percorreu 55cm
Grilo_03 foi o 1º colocado com 7 pulos
O Grilo_05 pulou 49cm        e já percorreu 200cm
Grilo_05 foi o 2º colocado com 7 pulos
Grilo_02 foi o 3º colocado com 9 pulos
Grilo_01 foi o 4º colocado com 8 pulos
O Grilo_04 pulou 31cm        e já percorreu 200cm
Grilo_04 foi o 5º colocado com 9 pulos
Time 1: Total de Pulos: 35 - Distância Percorrida: 459
Time 2: Total de Pulos: 25 - Distância Percorrida: 110
Time 1 foi o vencedor


Para o funcionamento correto da aplicação, faz se necessário o uso de mecanismos de sincronização!
