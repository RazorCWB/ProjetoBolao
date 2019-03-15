# ProjetoBolao

Motivo do projeto
Em uma empresa, é realizado todo ano o Bolão do Brasileirão, onde todos os funcionários participam dando suas previsões para cada partida em cada rodada do campeonato. Atualmente, é utilizado de planilhas de excel para realizar esses procedimentos, porém acaba sendo bem custoso em questão de tempo utilizar esse processo. Para isso, tem essa ideia de realizar esse projeto, onde entraria na questão de diminuição do tempo necessário para fazer esses procedimentos, facilitando a vida tanto do funcionário quanto de quem realizará a administração desse processo 

Funções que estarão no projeto

#Implementar as previsões : Terá uma página a qual o usuário poderá implementar as previsões para cada rodada do campeonato, tendo uma opção para salvar 

#Observação do resultado da partida: página onde terá o resultado real das partidas durante cada rodada do campeonato

#Acesso à pontuação total da rodada : local onde o usuário poderá verificar o seu resultado de acordo com o resultado das partidas reais, mostrando a pontuação de cada partida e sua pontuação total

#Acesso à pontuação acumulada : local onde o usuário poderá enxergar como está sua pontuação até o dado momento do campeonato

#Acesso ao resumo geral: pontuação de todos os participantes até a dada rodada, mostrando quem fez a maior pontuação na rodada,  pontuação acumulada

VERSÃO 1

#Acesso ao banco de dados: página onde o administrador pode acessar o banco de dados, insere os resultados de cada rodada, pode mudar alguma rodada se necessário, e trocar os times para um futuro bolão

#Acesso ao histórico de campeonatos anteriores: página onde o usuário poderá acessar um histórico de campeonatos anteriores.

#Possível expansão para outros formatos de campeonatos, como copa do brasil ou libertadores

ESTRUTURA INICIAL DO BANCO DE DADOS

TB – ADMINISTRADOR
ID / NOME / EMAIL  / SENHA 

TB – USUARIO
ID / NOME / EMAIL / SENHA 

TB – TIME
ID / NOME

TB – PARTIDA
ID / FK_TIME1 / FK_TIME2 / GOL_TIME1 / GOL_TIME2 

TB – RODADA
ID / FK_PARTIDA – (20 PARTIDAS)

TB – PARTIDA – USUÁRIO
ID / FK_USUARIO / FK_TIME1 / FK_TIME2 / GOL_TIME1 / GOL_TIME2 / PONTUAÇÃO

TB – RODADA – USUÁRIO
ID / FK_USUARIO / FK_PARTIDA

 
