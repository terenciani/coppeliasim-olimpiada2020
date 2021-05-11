# Curso de Robôs Seguidores de Linha para Olimpíada de Robótica do Campus Paranavaí

Curso de Programação de Robôs Seguidores de Linha utilizando o software CoppelaSim Edu e a linguagem Java. Desenvolvido como atividade da Olimpíada de Robótica do IFPR campus Paranavaí, referente ao ano de 2020.

Este curso é um preparatório para a competição de robótica de seguidores de linha prevista para o dia 27/05/2021.

Ministrado pelos professores Ayslan Possebom e Marcelo Terenciani.

## Para executar este código você precisará instalar o:

- **CoppeliaSim EDU** - Anteriormente conhecido como V-REP, é um simulador de robô usado na indústria, educação e pesquisa ([Clique aqui para fazer download do CoppeliaSim](https://www.coppeliarobotics.com/files/CoppeliaSim_Edu_V4_2_0_Setup.exe)).

- **Ambiente Integrado de Desenvolvimento (IDE)** - Sugere-se a utilização do Eclipse ([Clique aqui para fazer download do Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-03/R/eclipse-inst-jre-win64.exe)) ou do Netbeans ([Clique aqui para fazer download do Netbeans](https://download.oracle.com/otn-pub/java/jdk-nb/8u111-8.2/jdk-8u111-nb-8_2-windows-x64.exe?AuthParam=1620084560_39b376f31037f06dcb25545af713fc59)).

- **Kit de Desenvolvimento Java SE (JDK)** - é o conjunto de recursos necessários para se criar sistemas utilizando a linguagem/plataforma Java ([Clique aqui para fazer download do JDK](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)).

- **MeuRoboCoppeliaSim.jar** - Biblioteca de adaptação do código para simplificação da implementação dos robôs seguidores de linha. Disponível na pasta lib deste repositório.

- **remoteApiJava.dll** - Biblioteca utilizada para conexão da linguagem Java com o simulador CoppeliaSim Edu. Disponível na pasta lib deste repositório.

## Configurando o projeto

1. Faça o clone deste repositório ou o download do ZIP para um diretório de sua escolha.

2. Na IDE de sua preferência:

   1. Abra o projeto que foi clonado/baixado.
   2. Adicione a bliblioteca **MeuRoboCoppeliaSim.jar** no Build Path do projeto.
      - No Eclipse IDE: Clique com o botão direito sobre o projeto, escolha a opção "_Properties_". No item "_Java Build Path_", na guia "_Libraries_", clique sobre o item "_Classpath_", vá até o botão "_Add External JARs_". Abrirá uma caixa de diálogo, selecione a "_MeuRoboCoppeliaSim.jar_" que está dentro da pasta lib (no diretório onde fez o download).
   3. Adicione a ddl **remoteApiJava.dll** no Build Path do projeto.
      - No Eclipse IDE: Clique com o botão direito sobre o projeto, escolha a opção "_Properties_". No item "_Java Build Path_", na guia "_Source_", duplo clique sobre o item "_Native library location_", vá até o botão "_External Folder_". Abrirá uma caixa de diálogo, selecione a "_remoteApiJava.dll_" que está dentro da pasta lib (no diretório onde fez o download).
        > **NOTA:** Opcionalmente a dll pode ser adicionada diretamente à pasta system32 do windows, eliminando este passo.

3. No CoppeliaSim Edu:
   1. Abra o CoppeliaSim Edu.
   2. Abra uma das cenas disponíveis dentro da pasta **cenas** deste repositório.
      - Para cada aula (organizadas de acordo com os pacotes do projeto), existe uma respectiva cena disponível seguindo o padrão de nome **CenaCoppeliaSim-Aula** + **Número da Aula**.
      - Para abrir a cena, vá na opção "_File_" no menu superior, selecione a opção "_Open Scene..._". Abrirá uma caixa de diálogo, selecione a cena desejada, que está dentro da pasta cenas (no diretório onde fez o download).

## Executando o projeto

> **NOTA:** Certifique-se que o projeto não esteja sendo executados em ambos os softwares, IDE e CoppeliaSim Edu.

1. No CoppeliaSim Edu:

   1. Abra a cena da aula que deseja executar.

2. Na IDE de sua preferência:

   1. Escolha um dos pacotes de aulas.
      > **NOTA:** Deve ser o mesmo que a cena aberta no CoppeliaSim Edu.
   2. Execute a classe chamada "_MeuRobo.java_", disponível dentro do pacote.

3. Verifique o resultado no CoppeliaSim Edu.

> **NOTA:** Para recompilar o projeto, você deverá encerrar a execução tanto no CoppeliaSim Edu quanto na IDE onde está programando.
