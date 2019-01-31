<h1>Aula 01 - O que � Java?</h1>

<h2>Introdu��o</h2>

* Meu nome � Paulo Silveira, e serei o instrutor destes cursos de Java! Se voc� est� procurando v�rias linguagens para come�ar a estudar, n�o tem jeito, uma das que mais costumam chamar a aten��o � o Java!

* Seja na Alura ou em qualquer outro lugar que ensine programa��o, esta linguagem tem atra�do muito as pessoas, porque se voc� quiser desenvolver um site web, ou lidar com a parte do servidor, de back-end, de uma aplica��o complicada, ou mesmo desenvolver uma aplica��o para um dispositivo m�vel, ser� preciso entender e conhecer n�o s� sua sintaxe b�sica - que � o que veremos neste primeiro curso, entendendo as estruturas do if, for, conhecendo algumas das "pegadinhas" que aparecem com frequ�ncia. � necess�rio entender muito bem o conceito de orienta��o a objetos, polimorfismo, classe abstrata, interface, e as principais classes do Java.

* Na documenta��o do Java - o Javadoc -, voc� ver� todas as classes da biblioteca. S�o mais de dez mil! Ent�o, dominar a linguagem, conhecer � fundo esta API, � algo que beira o imposs�vel.

* No entanto, no decorrer destes primeiros cursos de Java, conheceremos bibliotecas muito importantes a serem utilizadas no dia a dia, independentemente do uso, se para web ou desenvolvimento de aplicativo m�vel.

* Espero que esteja preparado para vir conosco nesta jornada, pois o Java, por ser uma linguagem estatisticamente fortemente tipada, requer muito c�digo, mesmo para criar programas simples. Mas ela � incr�vel!

* E se voc� ainda n�o domina orienta��o a objetos, garanto que estudando aqui, voc� enxergar� o que h� de muito legal e interessante nisso, e por qu� devemos focar nestes conceitos de encapsulamento, responsabilidades, que t�m muita vantagem em rela��o � tal da programa��o procedural.

* Vamos come�ar a entender um pouco sobre o Java para conseguirmos passar � instala��o e compila��o do nosso primeiro programa!

<h2>A Plataforma Java</h2>

* Antes de mais nada, vamos ver um pouco do que � o Java, o qual te trouxe at� aqui: h� cerca de vinte anos, quando a linguagem Java nasceu, ela chamava a aten��o por conta das seguintes caracter�sticas:

* Orientado a Objeto (O.O.)
* Muitas bibliotecas
* Parece com C++ (hoje em dia isso pode at� ser uma desvantagem)
* Roda em v�rios sistemas operacionais
* Voc� pode estar pensando "poxa, mas a linguagem que uso no dia a dia, atualmente, j� possui estas caracter�sticas!". � verdade. � por isto que queremos focar na plataforma Java, e n�o especificamente na linguagem em si, algo que ficar� mais claro no decorrer do curso, e at� mesmo nesta aula!

* A plataforma Java traz:

	* Portabilidade
	* F�cil acesso e desenvolvimento
	* Seguran�a
	* Onipresen�a
	* Voc� pode dar uma olhada no site oficial, por�m ele ajuda mais o usu�rio do Java, do que aqueles que ir�o compilar e escrever programas.

* Falando sobre a hist�ria da linguagem: James Gosling � considerado um dos "g�nios da computa��o", sendo considerado o "pai do Java", apesar da linguagem ter sido criada por um grupo, normalmente considerado de quatro pessoas.

* Em 1992, o James Gosling trabalhava em uma empresa atualmente inexistente chamada Sun Microsystems (sendo que Sun � acr�nimo para Stanford University Network), uma dessas startups da d�cada de 60, 70, para lidar mais com hardware, que � o que estava dando mais dinheiro.

* Eles possu�am um microcomputador, o Sun Microsystems SPARC, que hoje em dia j� n�o aparecem em lugar algum, grandes servidores denominados "micro".



* Sendo a Sun uma empresa mais focada em hardware, naquela �poca, a IBM e a Microsoft come�aram a crescer vendendo softwares. Os softwares que a Sun utilizava no sistema deles, o UNIX (o tal de Solaris), eram disponibilizados gratuitamente.

* Um dia, esses executivos, dentre os quais o pr�prio James Gosling, se perguntaram como poderiam lucrar com softwares, j� que eles o disponibilizavam de gra�a, e fizeram um retiro de um m�s para tentarem chegar a uma conclus�o.

* A ideia que eles tiveram envolvia um problema de eletr�nicos da d�cada de 90: havia muitos deles sendo criados naquela �poca, como o VHS que, para quem n�o sabe, � o videocassete. Era a �poca de surgimento de TVs, videogames, liquidificadores e geladeira.

* Cada um deles possui seu c�digo fonte, necessitando de uma linguagem pr�pria para funcionar, e escrever o c�digo para cada um, reescrevendo-o quando tivessem que passar por uma troca de chip, por exemplo, n�o fazia muito sentido! A linguagem utilizada neles, Assembly, que hoje em dia � raramente usada, precisava ser reescrito v�rias vezes, imagine o trabalho!

* O James Gosling e sua equipe pensaram em escrever um �nico c�digo que gerasse um "execut�vel" - entre aspas porque ap�s a compila��o ele estar� em um formato n�o exatamente compreens�vel pelo aparelho em si, mas por um intermedi�rio, no caso, um processador ou uma placa de hardware, para que, a� sim, passe o c�digo aos aparelhos.

* Trata-se de algo que realmente simula um computador bem simples e traduz esta linguagem "execut�vel" de acordo com o aparelho em quest�o. Isto �, esta "m�quina de mentira" traduzir� tudo, como se fosse um sistema operacional.

* � por isto que surgiu o nome m�quina virtual, pois veio da virtual machine!

* A ideia deles foi, ent�o, criar uma placa pequena, um hardware, que � uma m�quina real e comp�e todo liquidificador, computador, videocassete, e por a� vai. Desta forma, as pessoas poder�o escrever em apenas uma linguagem, que na �poca se chamava Oak e depois se tornou Java.

* Isso pareceu muito bom, mas acabou fracassando de maneira retumbante, pois era muito caro produzir chips distintos para cada aparelho, cada qual adaptado a uma determinada linguagem.

* Ent�o, em 1995, com o boom da Web e o surgimento de mais navegadores, como Mosaic, Netscape e posteriormente Internet Explorer, a ideia de m�quina virtual foi visualizada como um problema interessante pelo Gosling.

* Assim como na atualidade, existia uma variedade relevante de navegadores e sistemas operacionais. E, para escrever um c�digo para Windows, utilizava-se a linguagem no Microsoft Visual Basic, que por sua vez era compilado por um execut�vel (um EXE, no caso do Windows).

* Isto �, ele s� funciona neste sistema operacional, com determinadas DLLs na m�quina, e assim por diante. O execut�vel e o c�digo fonte ficavam atrelados a uma plataforma espec�fica, um conjunto de sistema operacional, hardware e outros detalhes.

* Para tentar resolver este problema, que geraria um c�digo e um execut�vel diferentes para cada sistema operacional existente, o Gosling desengavetou a ideia da m�quina de verdade, do chip, que eles haviam criado anteriormente.

* Com um c�digo fonte �nico, ter�amos um intermedi�rio que soubesse traduzir ou instruir o sistema operacional acerca dos comandos a serem enviados e recebidos. Este meio de campo seria realizado pela M�quina Virtual Java (JVM), que n�o � meramente um interpretador por conta de alguns detalhes internos que v�o al�m da interpreta��o.

* O c�digo, ent�o, seria a linguagem Java, e o c�digo "execut�vel", quando compilado, n�o geraria um .exe (pois este seria lido apenas pelo Windows), e sim um formato chamado bytecode Java, de extens�o .class, lido pela M�quina Virtual Java, que passaria a informa��o aos sistemas operacionais.

* Um exemplo deste formato entendido pela virtual machine (JVM), o bytecode, � o seguinte:

```java
Compiled from "Onibus.java"
class Teste {

    public static void main(java.lang.String);
      Code:
      0: new              #2  // class Onibus
      3: dup
      4: invokespecial    #3 Onibus."<init>":()V
      7: astore_1
      8: aload_1
      9: ldc              #4 // String Jabaquara...
     11: putfield         #5
       // Field Onibus.linha:Ljava/lang/String;
     14: return 
}
```

* Quem conhece a linguagem de Assembly talvez identifique a semelhan�a, mas este c�digo n�o parece ser de f�cil leitura e compreens�o. Para meios de compara��o, segue um exemplo de um arquivo .java, a ser compilado e traduzido para .class, o tal do bytecode:

```java
public class Onibus {
  String nome;
  String linha;
}

class Teste {
  public static void main(String args) {
    Onibus o = new Onibus();
    o.linha = "Jabaquara-Liberdade";
  }
}
```

* Ent�o, em 1995 surgiu o Java, capaz de rodar em v�rios dispositivos e sistemas operacionais, com foco de criar applets, quando ainda t�nhamos que instalar o Java para rod�-lo dentro do navegador.

* O Java nasceu com um prop�sito, mas acabou se fortalecendo em server-side, pois quando escrevemos uma aplica��o, um site web ou sistema grande, n�o queremos ficar dependendo de diferentes sistemas operacionais, em implanta��es e deploys.

* O Java traz liberdade, quebrando nossa depend�ncia em rela��o �s vers�es de sistema operacional e navegadores. Empresas grandes, como bancos e o governo, n�o querem ficar engessados - o que � conhecido por Vendor lock-in.

* As principais caracter�sticas do conceito de M�quina Virtual Java s�o:

	* Multiplataforma
	* Gerenciamento de mem�ria
	* Seguran�a
	* Sandbox
	* Otimiza��es
	* JIT Compiler

* Hoje, mais do que na linguagem Java em si, o enfoque est� na plataforma, no ecossistema Java! A virtual machine � interessante para as empresas pois elas n�o dependem do que se encontra abaixo da sua stack, ou pilha de tecnologia, al�m do acesso a uma grande variedade de bibliotecas, e as linguagens Java que rodam nesta plataforma.

* N�o � � toa que h� programas que lidam com linguagens Ruby, Clojure ou Scala, por exemplo, e geram o bytecode Java. Depois, basta a M�quina Virtual Java, JVM, trabalhar de acordo com o sistema operacional desejado.

<h2>Benef�cio da JVM</h2>
* Qual � o grande benef�cio de uma M�quina Virtual Java (JVM)?
* R: Executar o c�digo independente do sistema operacional. No mundo Java voc� ter� sempre o mesmo "execut�vel" ou Bytecode que ser� executado pela Maquina Virtual Java, totalmente independente do sistema operacional. Assim n�o � preciso rescrever ou adaptar o c�digo para rodar em um outro sistema operacional. Temos um �nico execut�vel para todos os sistemas!

<h2>Quais caracter�sticas?</h2>

* A linguagem Java nasceu com algumas caracter�sticas que s�o mantidas at� hoje.
* R:
	* Parecido com C++.Java nasceu sendo parecido com C++ que era a linguagem mais popular na �poca.
	* Muitas bibliotecas. desde o in�cio o Java possui muitas bibliotecas que ainda muito aumentaram devido as milhares de contribui��es da comunidade open source.
	* Multiplataforma. Java � multiplataforma, roda em qualquer sistema operacional desde que exista a m�quina virtual Java.

<h2>Quais sistemas?</h2>

* Dependendo da linguagem de programa��o existem v�rios tipos de sistemas que voc� pode desenvolver, como por exemplo:

	* a) Sistemas para Web (Web Sites ou Web Apps)

	* b) Sistemas puramente "Server-Side"

	* c) Aplicativos para Android

	* d) Applets que rodam no navegador

* Quais tipos de sistemas voc� pode criar com a linguagem Java?

* R: Todos. Seja web ou puramente server-side, aplicativo Android ou um antigo applet, Java atende todas essas �reas! No entanto, os sistemas web e Android s�o os que mais fizeram sucesso no mundo Java e mais empregam desenvolvedores.

<h2>Bytecode vs EXE?</h2>

* Qual � a diferen�a entre o execut�vel do Windows (exe) e o execut�vel do mundo Java (Bytecode)?

* R:
	* Os execut�veis do mundo Java s�o port�veis, os do mundo Windows n�o. Lembrando port�vel significa que podem ser executados em v�rios sistemas operacionais diferentes (Windows, Linux, Mac, etc).
	* Os execut�veis do mundo Windows podem ser executados diretamente no sistema operacional, os do mundo Java precisam da m�quina virtual. Os execut�veis Java precisam da m�quina virtual Java.

<h2>Sobre o Bytecode</h2>

* Todas as afirma��es abaixo sobre o Bytecode s�o verdadeiras, exceto:

* R: Todas as afirma��es abaixo sobre o Bytecode s�o verdadeiras, exceto: A afirma��o "O Bytecode � o c�digo fonte" n�o � verdadeira. O c�digo fonte � para o desenvolvedor entender, o Bytecode foi criado e otimizado para a m�quina virtual.

<h2>Para saber mais: o nome Bytecode</h2>

* J� falamos um pouco sobre o Bytecode que � um c�digo de m�quina parecido com o Assembly. Talvez voc� (como eu!) estranhou o nome Bytecode, no entanto, tem uma explica��o bem simples para tal. Existe um conjunto de comandos que a m�quina virtual Java entende. Esses comandos tamb�m s�o chamados de opcodes (operation code), e cada opcode possui o tamanho de exatamente 1 Byte! E a� temos um opcode de 1 Byte ou, mais simples, Bytecode. :)


----------------------------------------------------------------------------------------------
<h1>Aula 02 - Instala��o e o primeiro programa</h1>

<h2>Vers�es</h2>

* Voc� deve estar muito ansioso para instalar o Java e o ambiente de programa��o para compilar e executar seu primeiro programa!

* Mas antes de todo este processo de instala��o e configura��o, gostaria de falar sobre vers�es, uma vez que � comum encontrarmos v�rios n�meros e vers�es e ficarmos perdidos sem saber por onde iniciar no Java.

* Apesar da �ltima vers�o lan�ada ser o 9, lan�ada em 2017, a linguagem, surgida em 1995, teve mudan�as consider�veis na vers�o 5, que saiu em 2004, e na 8, de 2014. Nelas, apareceram muitos recursos na linguagem, novos comandos, palavras-chave e conceitos.

* Estes tais de Streams, de Templates Generics, ser�o vistos durante o curso - h� at� um curso espec�fico sobre estes novos recursos do Java 8. Nas vers�es 9 e 7, houve mudan�as pequenas e pontuais, al�m de bibliotecas.

* Ent�o, n�o se preocupe, voc� pode, sim, focar na vers�o 8, pois voc� ver� que muitas empresas grandes inclusive ainda n�o alcan�aram esta vers�o (o que � uma pena).

* Aqui, usaremos a vers�o Neon do Eclipse, mas existe uma vers�o mais recente, Oxygen, que est� sendo trabalhada para dar suporte ao Java 9. At� o momento, n�o h� vers�o oficial do Eclipse que d� suporte para a �ltima vers�o dispon�vel do Java.

* Todos os conceitos focados neste curso, que envolvem Orienta��o a Objeto, uso da heran�a, polimorfismo e as principais bibliotecas, s�o os mesmos para muitas vers�es da linguagem.

* Ou seja, a dica � focar naquilo que � importante, que � o que passaremos aqui, e n�o nas vers�es mais recentes. A vers�o 10, provavelmente vir� com muito menos novidades, j� que as vers�es seguir�o a tend�ncia de serem lan�adas mais rapidamente, n�o de 3 em 3 anos, e sim de 6 em 6 meses.

* Minha recomenda��o � a de que voc� siga os passos feitos neste curso, respeitando a instala��o do Java 8 e do Eclipse Neon. No entanto, se voc� realmente quiser utilizar a vers�o mais recente de cada um deles, por sua pr�pria conta e risco, v� em frente. � bem prov�vel que voc� n�o encontre problemas!

* Por�m, se voc� � iniciante em programa��o e nunca viu Java antes, indica-se a utiliza��o das vers�es citadas neste curso.

<h2>Instala��o do JDK no Windows</h2>

* Vamos instalar o Java e tudo aquilo de que precisamos para come�armos a trabalhar! Usando o Windows, iremos fazer uma busca no Google por "Java" para ver as op��es fornecidas para download.

* Um dos primeiros resultados mostrados � o java.com, com uma apar�ncia um tanto ultrapassada, e o bot�o "Download Gratuito do Java", em portugu�s ou ingl�s. Indo por este caminho, voc� perceber� que baixar� uma vers�o que costumamos usar para rodar uma aplica��o Java.

* Para n�s, desenvolvedores, baixar isto n�o � o suficiente. A vers�o recomendada que aparece na p�gina de download, no caso "Version 8 Update 121", � o que chamamos de Java Runtime Environment, ou "ambiente de execu��o Java", que � necess�rio para executar uma aplica��o Java.

* Lembra da �poca dos applets, em que precis�vamos instalar plugins e similares para serem rodados no browser, ou em aplicativos? � para estes casos que a instala��o desse ambiente de execu��o serve, o tal do JRE, que vem com a virtual machine e as bibliotecas.

* Como desenvolvedores, precisaremos do JDK, ou Java Development Kits, o "kit para desenvolver aplica��es Java".

* Pesquisando no Google por "download java jdk" ou simplesmente "jdk", a� sim, cairemos em um link mais espec�fico, como no da Oracle, com diversas op��es. Queremos a vers�o 8, ou outra mais recente.

* Na descri��o, l�-se "8u112", por exemplo, em que "u" indica "update", ou "atualiza��o" em portugu�s, que tem a ver com corre��o de bugs. Nesta p�gina, est�o dispon�veis para download o JDK, bem como o JRE, visto no link anterior.

* A op��o que queremos baixar trar�, al�m da virtual machine e das bibliotecas, o compilador, que pegar� o c�digo Java e o transformar� em um formato que ele entender�. Vamos fazer o download do JDK de acordo com o sistema operacional - no Mac ou no Linux pode ser que j� venha instalado, ou seja mais f�cil de se baixar.

* Neste caso, optaremos por jdk-8u121-windows-x64.exe, n�o esquecendo de aceitar os termos da Oracle. Terminado o download, abriremos o arquivo execut�vel, a ser salvo em um diret�rio apropriado seguindo os passos de instala��o no modo default.

* O JDK, o compilador, nada mais � do que uma vers�o menor daquilo que existe no site java.com, mais as ferramentas para o desenvolvimento de aplica��es Java. Em seguida, continuaremos instalando o JRE, com a virtual machine e tudo o mais que � necess�rio para rodar esta aplica��o.

* Confirmaremos a instala��o acessando o prompt do MS-DOS, que � algo muito similar ao terminal do Linux, Bash, Shell, e do Mac. O PowerShell da Microsoft hoje em dia � mais raro, mas ainda existe. N�o se preocupe, muito em breve estaremos utilizando uma IDE, o Eclipse. Neste momento, por�m, queremos enxergar o que est� "por tr�s".

* Pode-se pesquisar por "cmd" para acessar o prompt, uma tela preta em que digitaremos comandos, sendo o primeiro deles aquele que chamar� o Java, java, seguido da tecla "Enter". Ele retorna uma mensagem dizendo para usarmos um class, por�m ainda veremos sobre.

* O comando que usaremos em seguida ser� javac, de java compiler, o compilador que pegar� o c�digo em Java e "traduzir�" para o que a virtual machine entende. Por�m, ao digitarmos isso, obteremos o seguinte:

* 'javac' n�o � reconhecido como um comando interno ou externo, um programa oper�vel ou um arquivo em lotes.
Voc� deve estar se perguntando o que aconteceu, j� que o JDK foi instalado, e � verdade, ele deveria ser execut�vel. O que acontece � que ele est� em outro local, e por isto n�o est� sendo encontrado.

* Abrindo o explorador de arquivos, em C:, "Arquivos de Programas" cont�m a pasta "Java", que por sua vez possui dois diret�rios referentes a JRE (onde se encontra a virtual machine) e JDK (onde est� o compilador). Por default de instala��o, a Oracle modifica os arquivos de configura��o do Windows e deixa apenas o Java do JRE pronto para ser chamado em linha de comando.

* Se voc� for usar o Java em linha de comando, como n�o � t�o raro de acontecer, precisaremos do "jdk1.8.0_121", dentro do qual h�, em "bin" (de "bin�rio"), o arquivo javac.exe. Vamos selecionar o caminho do diret�rio onde se encontra este execut�vel, e copi�-lo por meio do atalho "Ctrl + C" e, no Painel de Controle, informaremos ao Windows para que toda vez que inserirmos algum comando, o caminho abaixo seja consultado tamb�m:

* C:\Program Files\Java\jdk1.8.0_121\bin
* No Painel de Controle, portanto, selecionaremos "Sistema > Configura��es avan�adas do sistema" e, na nova janela, clicaremos em "Vari�veis de Ambiente...", utiliz�vel por programas como se fossem vari�veis globais do Windows.

* Veremos no box abaixo de "Vari�veis do sistema" o "Path". Clicaremos em "Editar..." e observaremos todos os seus componentes. Queremos incluir mais um diret�rio nele, portanto clicaremos em "Novo" e usaremos o atalho "Ctrl + V" para colar o caminho que copiamos anteriormente. Selecionaremos "OK" em todas as janelas que ficaram abertas.

* Teremos que reabrir o Prompt de Comando, ap�s o qual digitaremos javac, que desta vez funcionar� corretamente! Quando se instala uma nova linguagem de programa��o, � comum que a vari�vel de ambiente seja alterada para que n�o haja necessidade de criarmos arquivos ou entrarmos em diret�rios espec�ficos para trabalhar.

* A partir deste momento, ent�o, temos n�o s� o Java, mas o JDK, o Kit de Desenvolvimento do Java, instalado e configurado no Windows, tanto para execu��o quanto para compila��o de uma aplica��o Java!

<h2>JRE e JDK</h2>

* Quais das afirma��es abaixo s�o verdadeiras referente a JDK e JRE?

* R: 
	* O JRE � o ambiente para executar uma aplica��o Java. Caso queira executar uma aplica��o Java apenas, baste o JRE (Java Runtime Environment).
	* O JDK � o ambiente para executar uma aplica��o Java SE e possui v�rias ferramentas de desenvolvimento. O JDK s�o as ferramentas de desenvolvimento (como o compilador) mas tamb�m tem JRE embutido!

<h2>Para saber mais: JVM vs JRE vs JDK</h2>

* O mundo Java � cheio de siglas com 3 ou 4 letras come�ando com J. Voc� j� conhece duas famosas: o JRE e JDK. O primeiro � o ambiente de execu��o, o segundo s�o as ferramentas de desenvolvimento junto com o ambiente de execu��o. Simplificando podemos dizer:

* JDK = JRE + ferramentas desenvolvimento
* Existe uma terceira sigla, JVM (Java Virtual Machine), que tamb�m j� usamos durante o curso. A responsabilidade da Java Virtual Machine � executar o Bytecode! Ent�o qual � diferen�a entre JVM e JRE? Ambos executam o Bytecode, certo?

* A resposta � simples: O JRE (o nosso ambiente de execu��o) cont�m a JVM, mas tamb�m possui um monte de bibliotecas embutidas. Ou seja, para rodar uma aplica��o Java n�o basta ter apenas a JVM, tamb�m � preciso ter as bibliotecas.

* Assim podemos simplificar e dizer:

* JRE = JVM + bibliotecas
* � importante entender que voc� n�o pode baixar a JVM apenas. Voc� sempre baixa o JRE que tem a JVM e as bibliotecas em conjunto. Tudo bem?

<h2>Compile e rode seu primeiro programa Java</h2>

* Como falamos no in�cio, em um primeiro contato, o c�digo em Java pode ser complicado de ser escrito e compreendido. �s vezes precisamos escrever um pouco mais do que gostar�amos para fazer algo.

* Antes de usarmos um IDE para lidarmos com o c�digo, � legal que voc� o fa�a em um sistema bem simples, como o bloco de notas - outras op��es s�o o TextPad, Atom, Visual Studio Code, Sublime, ou qualquer outro.

* Nosso primeiro c�digo Java ser� feito no editor de texto mais simples poss�vel, em plain text. Faremos o "Ol� mundo" para testarmos e vermos como funciona a compila��o e execu��o de programas Java.

* O Java veio da linguagem C na d�cada de 90, ent�o, n�o � t�o simples quanto digitarmos print("ol� mundo"). A linha que faz um print na tela, por exemplo, �

* System.out.println("ol� mundo");
* Nesta linguagem, toda instru��o que damos sem as chaves necessita do ponto e v�rgula (;). Todo c�digo Java tamb�m precisa estar dentro de uma classe, que pode ser uma interface, um Enum. Neste caso, ele se insere na classe Programa.

* Uma instru��o como esta, com System.out.println(), precisa estar dentro de um m�todo chamado main, que ainda n�o vimos, acompanhado de outros termos que tamb�m aprenderemos depois.

* � muito comum o uso de public antes de class Programa, e embora isto n�o seja estritamente necess�rio no nosso caso, vamos coloc�-lo para quando formos ler c�digos de outros programadores e IDEs.

```java
public class Programa {

    public static void main(String[] args) {
        System.out.println("ol� mundo");
    }
}
```

* No momento, focaremos na linha System.out.println("ol� mundo");, que poder� ser considerado um comando apesar de n�o ser um, e mostrar� algo na sa�da padr�o, no caso o prompt do MS-DOS.

* O menor programa Java seria similar ao c�digo acima. Vamos tentar ver como funciona sua compila��o e execu��o? Antes disso, salvaremos o arquivo nomeando-o com "Programa.java", em uma nova pasta denominada "java-codigo".

* O nome do arquivo � muito importante - entenderemos melhor o motivo mais adiante, mas ele precisa ser o mesmo da class inserida no c�digo.

* No Prompt de Comando, digitaremos cd .. duas vezes, seguidos de "Enter", e dir, para a listagem de todos os diret�rios. Depois, usaremos cd java-codigo para acessar o diret�rio, e em seguida digitaremos dir novamente.

* Dica: � poss�vel usar a tecla TAB para autocompletar palavras!

* Ali, � listado um arquivo "Programa.java"! No Windows, h� um comando chamado type (equivalente ao cat do terminal do Linux), o qual permite a visualiza��o do conte�do do arquivo. Neste caso, usar�amos type Programa.java.

* A extens�o .java n�o � entendida pela virtual machine, que entende o formato "meio m�quina" de Virtual Machine Java, o bytecode, um arquivo com extens�o .class.

* A seguir, usaremos o comando javac Programa.java, e daremos um "Enter", com o qual ser�o mostradas as mensagens de erro de compila��o, fundamentais para o aprendizado.

* Apesar de n�o entendermos o que � public class ou static void main ainda, sabemos que System.out.println() seguido de aspas e o conte�do, ir� mostrar uma mensagem.

* Por meio de dir no prompt, voc� ver� que h� dois arquivos: "Programa.java" e "Programa.class", este �ltimo no formato bin�rio, em bytecode. E para chamarmos a virtual machine, usaremos o comando java Programa, e veremos a impress�o de "ol� mundo". Trata-se da primeira execu��o do nosso programa Java!

* Agora, veremos os principais erros e caracter�sticas deste c�digo. O primeiro surge ao digitarmos java Programa.class, o que traz a seguinte mensagem de erro na execu��o do programa:

* Erro: N�o foi poss�vel localizar nem carregar a classe principal Programa.class
* Isto acontece porque o programa n�o se chama "Programa.class", e sim simplesmente "Programa", apesar de estar contido no arquivo "Programa.class".

* Outros erros mais comuns s�o os de compila��o, como quando esquecemos de colocar o ponto e v�rgula no fim da linha. Al�m disso, o Java possui palavras chave (keywords, ou palavras reservadas), dentre os quais utilizamos "public", "class", "static" e "void", que devem estar em letra min�scula, uma vez que o Java � case sensitive (reconhece o uso de letras mai�sculas ou min�sculas).

* Em um ambiente mais complexo, veremos que isto ficar� mais claro e f�cil de ser trabalhado. � importante praticar e n�o ter medo das mensagens de erro de compila��o.

* As chaves abrem e fecham os blocos de c�digos, indicando por exemplo que tudo aquilo que se encontra em public static void main pertence ao public class Programa, da mesma forma que System.out.println() pertence ao public static void mainvis�vel tamb�m por meio das indenta��es.

* O Java possui outras particularidades, como o "Enter" e a barra de espa�o serem opcionais; s�o conven��es do c�digo. Agora, o importante � escrever, entendendo o que est� por tr�s do c�digo, errar e fazer v�rios testes!

<h2>Entrada da aplica��o</h2>

* A Ana est� come�ando com desenvolvimento Java e j� aprendeu que a entrada de uma aplica��o � sempre a fun��o (ou m�todo) main. Por�m, ela n�o se lembra qual era a defini��o correta (palavras chaves e par�metros) dessa fun��o/m�todo:

```java
class Programa {

    ??? main ???{
        System.out.println("Voc� pode ajudar a Ana?");
    }
}
```

* Qual � a defini��o correta?

* R: public static void main(String[] args)  Ainda n�o sabemos o que significam todas essas palavras, mas fique tranquilo pois vai ficar claro para voc�. Nesse momento basta saber que a entrada de uma aplica��o Java � sempre uma fun��o/m�todo public static void main(String[] args).

<h2>Sobre a compila��o e execu��o</h2>

* Veja as afirma��es abaixo sobre a compila��o e execu��o de c�digo Java:

	* 1 - Durante a compila��o acontece uma verifica��o sint�tica do c�digo fonte.

	* 2 - Na compila��o e execu��o podem aparecer erros.

	* 3 - A JVM l� e executa o Bytecode.

	* 4 - O compilador gera o Bytecode caso n�o tenha nenhum erro sint�tico no c�digo fonte.

* Quais afirma��es s�o verdadeiras?

* R: Todas as afirma��es s�o verdadeiras.

<h2>Compilar e executar</h2>

* O Pedro est� trabalhando pela primeira vez com o sistema operacional Linux, mas est� estranhando, pois, o computador n�o possui uma interface gr�fica (s� funciona na linha de comando!).

* Ou seja, ele precisa compilar e executar um c�digo Java abaixo na linha de comando, no entanto esqueceu os comandos :(

```java
Arquivo Programa.java:

class Programa {

    public static void main(String[] args) {
        System.out.println("Funcionou!!");
    }
}
```
* Quais comandos ele deve usar para compilar e rodar esse c�digo Java?

* R: 
	* javac Programa.java
	* java Programa
 
	* Correto! Repare que passamos a extens�o do arquivo (.java) para o comando javac:

	* javac Programa.java
	* E para chamar a JVM usamos apenas o nome da classe (sem extens�o):
	* java Programa


<h2>O que aprendemos?</h2>

* Nessa aula voc� escreveu o seu primeiro c�digo Java e aprendemos:

	* qual � a diferen�a entre JRE e JDK
	* como compilar um c�digo fonte Java na linha de comando (javac)
	* como executar o Bytecode na linha de comando (java)
	* um programa Java deve estar escrito dentro de uma classe (class)
	* toda instru��o Java deve ser finalizada com ;
	* para abrir e fechar um bloco usaremos as chaves {}
	* um programa Java possui uma entrada que � uma fun��o (m�todo) main
	* para imprimir algo no console usamos a instru��o System.out.println()

-----------------------------------------------------------------------------
<h1>Aula 03 - Come�ando com Eclipse</h1>

<h2>Instalando o Eclipse</h2>

* Por enquanto, temos o nosso primeiro programa Java escrito, e agora passaremos a entender como declarar vari�veis, fazer if, la�os e afins. Queremos um editor um pouco melhor do que o bloco de notas, de acordo com sua prefer�ncia.

* A comunidade geral do Java costuma usar n�o um editor, mas um IDE (Integrated Development Environment, que em portugu�s seria algo como "Ambiente Integrado de Desenvolvimento"). Um IDE n�o � simplesmente um editor pois integra em um �nico local a linguagem, o editor, o compilador, a biblioteca e a documenta��o.

* Os principais IDEs utilizados por quem programa em Java s�o: o NetBeans, da pr�pria Oracle, o IntelliJ IDEA, usado como base para Android, e tamb�m conhecido por Android Studio, e o Eclipse, projeto em c�digo aberto absorvido pela IBM e, hoje em dia, um cons�rcio de muitas empresas que tomam conta do programa, que voc� pode baixar aqui.

* O Eclipse quer te ajudar na hora de codificar, muito mais do que focar em wizards e na grande quantidade de op��es de menu. � primeira vista, o IDE pode parecer pequeno demais (pelo peso que possui), mas � porque h� muitos plugins instal�veis para se facilitar o desenvolvimento de features e recursos.

* Quando formos instal�-lo, aparecer� uma janela perguntando o que queremos, e escolheremos "Eclipse IDE for Java Developers". A op��o "Eclipse IDE for Java EE Developers" requer um conhecimento maior, e serve para desenvolvimento de aplicativos web e softwares, e poder� ser explorada futuramente.

* Ap�s instala��o e durante a execu��o, a primeira pergunta que o Eclipse far� tem a ver com o workspace, o diret�rio a ser utilizado para guardar todos os projetos Java. Isto pode ficar a seu crit�rio, lembrando que iremos trabalhar sempre no Eclipse, ent�o isso acabar� n�o sendo t�o relevante, pois voc� n�o precisar� mais do Prompt de Comando para acess�-lo.

* � poss�vel ter mais do que um workspace, um s� para exerc�cios da Alura e outros para projetos da empresa, por exemplo.

* A primeira execu��o trar� muitas janelas diferentes, mesmo se fecharmos o "Help". Vamos maximizar o Eclipse e fechar a aba "Welcome".

* O IDE, ao ser aberto, pode te assustar um pouco, mas voc� ver� que assusta menos do que outros com muito mais janelas e perguntas de wizards. No centro, ficam os arquivos que queremos editar, do lado direito est�o os "Task List" (Lista de Tarefas), embaixo, "Problems" (Problemas). � esquerda, h� "Package Explorer" (Explorador de pacotes).

* O Eclipse denomina este conjunto de janelas de perspectiva, e cada uma delas � uma view. Ent�o, veremos diversas views que ir�o nos ajudar em diferentes situa��es, tanto que se clicarmos em "Window > Show View" no menu superior, h� v�rias op��es. N�o nos preocuparemos com isso agora.

* No momento, queremos criar um projeto Java, e veremos poucos wizards! Para criarmos um projeto e uma classe Java, clicaremos em "File > New > Java Project" e, na nova janela, definiremos o projeto como "sintaxe-basica".

* Provavelmente o Java j� est� instalado em seu computador; verifique sua vers�o, se � 8 ou posterior, pois utilizaremos recursos desta vers�o. Clicando em "Finish", o projeto � criado e aparecer� em "Package Explorer", contendo um diret�rio "src" (onde deve estar nosso c�digo fonte), e "JRE System Library", uma biblioteca com tudo que temos e acess�vel pelo Java. Todos os comandos que utilizaremos estar� nestes arquivos .jar.

* Agora, queremos colocar nosso arquivo Java, o "Programa.class", no diret�rio de c�digo fonte.

