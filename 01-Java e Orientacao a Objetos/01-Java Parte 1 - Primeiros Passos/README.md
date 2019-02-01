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

<h2>Sobre IDEs e editores</h2>

* Podemos programar em Java utilizando editores de textos e IDEs. Nesse contexto, temos as seguintes afirmativas:

	* a) Um IDE � um ambiente integrado de desenvolvimento que centraliza em um �nico lugar o compilador da linguagem utilizada, editor de texto, documenta��o, banco de dados e tudo que gira em torno da cria��o de aplica��es.

	* b) Para quem est� come�ando, o Eclipse IDE for Java EE Developers � o mais recomendado.

	* c) NetBeans e Intellij s�o outros IDEs famosos do mundo Java.

	* d) Um editor de texto possui tudo o que um IDE oferece.

* Marque a op��o verdadeira a respeito das afirma��es anteriores:

* R: A, C s�o verdadeiras. Um IDE � um ambiente integrado de desenvolvimento que centraliza em um �nico lugar, e NetBeans e Intellij s�o outros exemplos famosos de IDEs Java.

<h2>Dentro do Eclipse IDE</h2>

* Marque as alternativas verdadeiras:
* R: 
	* Um workspace � a pasta padr�o que ser� utilizado para armazenar todos os projetos criados com a IDE Eclipse.

	* Cada projeto do Eclipse � uma pasta dentro de um workspace.

	* O conjunto de janelas exibidas pelo Eclipse IDE � denominado perspectiva.

<h2>Nosso programa rodando no Eclipse</h2>
* Vamos colocar o c�digo do programa no Eclipse, utilizando o editor mais poderoso, o IDE. Para isto, h� v�rias op��es: acessando "File > New > Class", ou clicando com o lado direito do mouse em "src" e selecionando "New > Class", o que abrir� um wizard mas, como dito anteriormente, focaremos mais no c�digo em si do que nas "m�gicas" que os editores fazem para n�s.

* O nome desta classe ser� "Programa", por�m n�o se preocupe ainda com as diversas op��es que aparecem nesta janela. H� at� um checkbox para o caso de querermos public static void main(String[] args), o que n�o � o caso, pois por ora queremos praticar bastante e escrever um c�digo b�sico.

* Clicando-se em "Finish", teremos o programa simples que escrevemos antes:

```java
public class Programa {

    public static void main(String[] args){

        System.out.println("ola mundo");
    }
}
```
* Conforme vamos digitando o c�digo, o programa vai tentando completar, para nos ajudar. Na lateral esquerda, a bolinha vermelha com "x" indica erro de compila��o em determinadas linhas.

* O asterisco (*) ao lado do nome do arquivo indica que ele n�o foi salvo!

* Para executarmos o c�digo, basta acessarmos "Run > Run As > Java Application", o que abre uma view para Console, que abre e executa, no caso, o javaw.exe, uma vers�o do Java que n�o abre no Prompt do MS-DOS, utilizado internamente pelo Eclipse para chamar o nosso programa, que � o que gostar�amos de fazer neste ambiente.

* Por enquanto, n�o h� tantas vantagens em rela��o ao Notepad, e n�o � � toa que a Microsoft, quando lan�ou o Visual Studio, foi atr�s dos recursos apresentados pelo Eclipse, com o ReSharper, contratando o Erich Gamma, autor de Design Patterns: Elements of Reusable Object-Oriented Software, para trabalhar com o IDE deles. O Eclipse foi uma inspira��o para muitos, e � considerado uma ferramenta incr�vel.

* Mas onde se encontra o "Programa.class", o bytecode que a virtual machine entende?

* O "Package Explorer", que � uma view, esconde arquivos e diret�rios que julga n�o serem relevantes. E faz sentido, pois no momento estamos focados no programa Java. Acessando-se "Window > Show View > Navigator", ele ir� mostrar o File System.

* Clicando em "sintaxe-basica" para abri-lo, al�m do "src", existem outros diret�rios e arquivos, dentre os quais "Programa.class" na pasta "bin". ".classpath" e ".project" s�o arquivos de configura��o utilizados pelo Eclipse para obter informa��es sobre seu projeto. Eles n�o devem ser editados diretamente e, clicando-se na aba "Source" na parte inferior da interface, voc� ver� que trata-se de um .xml.

* N�o precisaremos nos preocupar com estes arquivos, pois � muito raro termos que mexer neles. H� muito tempo, s� existia esta view, o "Navigator" (similar ao Windows Explorer). O "Package Explorer" surgiu para ajudar quem trabalha com Java, e o "Navigator", para quem trabalha com tudo, de forma geral. Na maioria das vezes, usaremos o "Package Explorer".

* Se clicarmos em "src > Programa.java" com o lado direito do mouse, e em seguida em "Properties", veremos a localiza��o exata do arquivo, poss�vel de ser confirmado por meio do Prompt de Comando.

* A partir de agora deixaremos de utilizar o prompt, pois faremos tudo no Eclipse. De qualquer forma, � importante lembrarmos que o Java pode ser usado por linhas de comando, se voc� preferir, o que acaba sendo at� necess�rio em alguns casos.

<h2>Projeto Java</h2>

* Marque as alternativas verdadeiras:
* R:
	* Executamos nosso programa no Eclipse atrav�s do menu Run -> Run as -> Java Application.  Inclusive h� uma tecla de atalho, exibida durante a op��o que varia de acordo com seu sistema operacional.
	*Dentro de um projeto Java, criamos uma nova classe atrav�s da op��o do menu File -> New -> Class. Caso o projeto n�o seja um projeto Java, a op��o Class n�o estar� dispon�vel, fique atento!
	* A sa�da do nosso programa executado pelo Eclipse � feita atrav�s da view console. A view console mostra a sa�da do programa.

<h2>Sobre a View Navigator</h2>

* Marque a alternativa correta a respeito da View Navigator:

* R: � parecida com o Windows Explorer do Windows ou o Finder do MAC.  Ela nos permite ver o diret�rio do projeto com seus arquivos na integra.

-------------------------------------------------------------------------
<h1>Aula 04 - Tipos e vari�veis</h1>

<h2>Tipo inteiro: int</h2>

* Trabalharemos com sintaxes de vari�veis e controles de fluxo - la�os e condicionais - pela cria��o de um novo projeto acessando-se "New > Java Project". Poder�amos fazer tudo isto no mesmo arquivo, mas o intuito aqui � de treinar a codar e perder o medo das janelas e suas diversas op��es.

* Criaremos o "sintaxe-variaveis-e-fluxo", os dois t�picos que come�aremos a ver. O novo projeto contendo o diret�rio "src" estar� vis�vel na view de "Package Explorer". No prompt, h� um diret�rio "bin" escondido, pois o programa n�o quer mostrar o .class, e sim o c�digo fonte Java. Reparem que no momento estou usando Mac, o que pouco importa, j� que o Eclipse funciona da mesma maneira em todos os sistemas operacionais.

* Criaremos nossa classe para come�ar a trabalhar com vari�veis. Clicaremos com o lado direito do mouse em "src" e depois em "New > Class", e a classe se chamar� "TestaVariaveis". No Java, um statement (ou instru��o) n�o funciona fora dos m�todos, portanto precisaremos do ponto inicial, do public static void main(String[] args), ap�s o qual salvaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {

    }
}
```

* Poder�amos rodar a aplica��o assim como est�, mas n�o aconteceria nada. Ent�o, digitaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");
    }
}
```

* Salvaremos novamente e rodaremos a aplica��o indo � "Run > Run As > Java Application", ou clicando com o lado direito do mouse na classe com main, e em "Run As > Java Application". Tamb�m h� o atalho "Ctrl + S". O Console mostrar� o print, e com isto repetimos o mesmo teste do "ola mundo" feito anteriormente.

* As palavras que aparecem em roxo no editor s�o as palavras chave, reservadas, e dever�o estar sempre em caixa baixa. Agora, para criarmos uma vari�vel denominada idade, que armazenar� nossas idades, digitaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");

        idade = 37;
    }
}
```
* No Java, como o Eclipse j� est� dando a entender sublinhando idade com vermelho, n�o compila isto, pois trata-se de uma linguagem estaticamente ou fortemente tipada, ou seja, que necessita da declara��o de todas as vari�veis e tipos a serem utilizados. Passando o mouse sobre a palavra sublinhada, l�-se a mensagem de erro "idade cannot be resolved to a variable".

* Significa que "idade n�o pode ser entendida como uma vari�vel", pois n�o foi declarada. O Eclipse inclusive dar� algumas op��es de "r�pido conserto", ou quick fix, para a cria��o local da vari�vel, ou remo��o da linha, por exemplo. idade = 37 � uma atribui��o, em que 37 se encontra dentro de idade.

* Precisaremos declar�-la informando que ela � do tipo num�rico e que guarda um valor inteiro, sem decimais ou pontos flutuantes. int vem de Integer:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");

        int idade;
        idade = 37;
    }
}
```
* Salvaremos e rodaremos este c�digo. Clicando-se na setinha ao lado do �cone verde que indica play na barra de ferramentas superior, v�-se os �ltimos programas que foram rodados no programa. E clicando no �cone verde, roda-se o �ltimo deles.

* O valor foi guardado, mas parece que nada aconteceu de fato. Al�m de atribuirmos uma vari�vel, pode-se usar o valor, mostrando-o na tela. Para isto, utilizaremos o System.out.println de novo, desta vez sem as aspas, pois queremos a evaluation, o resultado daquela express�o, e n�o uma cadeia de caracteres, uma string:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");

        int idade;
        idade = 37;

        System.out.println(idade);
    }
}
```
* Inclusive, � poss�vel ver que todas as men��es � vari�vel idade ficam em highlight, destacadas para mostrar que tratam-se da mesma vari�vel. Vamos rodar o c�digo acima para imprimirmos o valor de idade! No "Console", obteremos:

* ola novo teste
* 37
* Poderemos trabalhar com os operadores aritm�ticos junto a estas vari�veis, tamb�m:

* idade = 30 + 10;
* idade = 7 * 5 + 2;
* Como na maioria das linguagens, no Java tamb�m h� preced�ncia, ent�o as opera��es matem�ticas seguem uma determinada ordem de prioridade, mas poderemos usar par�nteses, desta forma:

* idade = (7 * 5) + 2;
* E assim por diante. Imprimiremos a idade tr�s vezes:

* int idade;
* idade = 37;

* System.out.println(idade);

* idade = 30 + 10;

* System.out.println(idade);

* idade = (7 * 5) +  2;

* System.out.println(idade);
* E obteremos o resultado esperado, na aba "Console":

* 37
* 40
* 37
* No c�digo, usamos algumas conven��es: ao criarmos a classe TestaVariaveis, cuja funcionalidade ainda desconhecemos, usamos a primeira letra em mai�scula e, ao acrescentarmos a segunda palavra, n�o utilizamos underscore ou algo do tipo, e sim a primeira letra em caixa alta de novo. Isto se chama Camel Case, e aparece com frequ�ncia no Java e em muitas outras linguagens - � uma conven��o de c�digo, e seu uso n�o � obrigat�rio.

* Da mesma forma, a vari�vel iniciando-se com "i" min�sculo � o padr�o, bem como n�o h� o costume de se abreviar palavras. No Java, voc�s ver�o nomes gigantescos de vari�veis! � legal nos atentarmos a estas pr�ticas para come�armos a nos acostumar com estes h�bitos essenciais para quando formos trabalhar com grandes equipes.

* Para mostrarmos uma frase antes de um n�mero, basta imprimirmos uma string, como "a idade �", juntamente com a vari�vel idade, assim:

* System.out.println("a idade � " + idade);
* O operador +, na maioria das vezes, tem a fun��o de somar vari�veis de tipo num�rico, sendo a �nica exce��o estes casos em que acompanham strings, com os n�meros sendo convertidos em letras e tudo sendo concatenado. Este operador, portanto, tamb�m serve para concatenar algo com uma palavra ou frase (uma string).

* Salvando e rodando a aplica��o, teremos:

* A idade � 37
* Pode-se acrescentar mais strings ap�s a vari�vel usando-se o operador.

* H� outra vers�o do System.out.println(), o System.out.print(), sem o ln, isto �, sem o line, que pula a linha, que poder� ser utilizado de acordo com sua prefer�ncia.

<h2>Criando uma vari�vel num�rica</h2>

* Selecione a op��o que mostra como podemos criar e definir o valor de uma vari�vel para representar a quantidade de dias de um m�s?

* R:

```java
int diasDoMes;

diasDoMes = 30;
```

<h2>Tipo flutuante: double</h2>

* Tamb�m queremos trabalhar com outros tipos de vari�veis, pois se tentarmos colocar no lugar da idade, em idade = 37;, um valor como 37.5, a compila��o n�o ir� ocorrer. O erro que se l� ao passarmos o mouse em cima, � "Type mismatch: cannot convert from double to int", isto �, a convers�o n�o � poss�vel. Lembrando que no Java nunca usaremos a v�rgula para separar o decimal no c�digo fonte.

* Vamos criar uma nova classe para testar os n�meros com ponto flutuante, clicando em "(default package)" com o lado direito do mouse e em "New > Class", nomeando-a de "TestaPontoFlutuante". Teremos, ent�o:

```java
public class TestaPontoFlutuante {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;
        System.out.println("meu sal�rio � " + salario);
    }
}
```

* H� dois tipos de vari�veis em que cabem o tal de ponto flutuante, sendo que a mais utilizada � o double, como visto acima. Salvaremos o c�digo e o rodaremos! Na aba "Console", obteremos o resultado:

* meu sal�rio � 1250.7
* Dica: as views podem ser customizadas de acordo com sua necessidade, sendo poss�vel fechar aquelas que n�o est�o em uso, por exemplo.

* O 0 (zero) referente aos centavos n�o apareceram porque � assim que a vari�vel double � convertida para se juntar � string. Poderemos formatar para aparecerem duas, tr�s casas decimais, ou apenas uma, por meio dos formatters do Java, inclusos na biblioteca. N�o veremos isto neste curso, por�m h� diversos recursos dispon�veis, como o printf, da linguagem C, para colocarmos porcentagens e afins.

* No double cabem vari�veis do tipo inteiro, isto �, poderemos fazer o caminho inverso, indicando que temos uma vari�vel que guarda idade, com n�mero 37. Reparem que este valor n�o possui decimal. N�o tem problema, um n�mero de tipo inteiro cabe em um tipo double. O inverso, um decimal em um int, � que n�o � compat�vel.

* O Java tem regras um tanto r�gidas, portanto n�o aceitar� 3.0 como int, j� que n�o aceita pontos flutuantes. Ele � uma linguagem com peculiaridades que algumas pessoas podem estranhar, sendo vantajoso para se trabalhar em equipe pois refor�a uma padroniza��o, e as pessoas trabalham de formas parecidas.

* Para enxergarmos a forma como o double funciona, podemos fazer uma conta de divis�o, por exemplo:

* double divisao = 3.14 / 2;
* System.out.println(divisao);
* Rodando o c�digo acima, teremos:

* 1.57
* Parece b�sico para quem j� conhece linguagem estaticamente tipadas, mas mesmo nessa parte mais b�sica da linguagem, nos aprofundaremos mais, para sentirmos algumas das caracter�sticas do Java.

* O que aconteceria no caso de digitarmos int outraDivisao = 5 / 2;? Alguns podem pensar que isso n�o � compilado, que dar� erro, pois o resultado � 2.5, o que n�o cabe em int.

* No Java, entretanto, h� uma regra: quando h� uma divis�o entre dois n�meros inteiros, ele "for�ar�" um n�mero inteiro como resultado. Se printarmos esta divis�o, obteremos como resultado o valor 2. Estranho, n�o?

* E se quis�ssemos que o resultado fosse 2.5 de fato, poder�amos tentar double novaTentativa = 5 / 2;, e pedir�amos sua impress�o, que traria 2.0. Piorou! O Java ir� ler apenas o lado que vem antes da atribui��o na linha de c�digo relativa ao double. Ou seja, primeiro, ele ir� executar a divis�o 5 / 2, e depois ele tentar� colocar o resultado em um double.

* Na verdade, o que gostar�amos � que a conta tivesse sido feita partindo-se do double e, neste caso, bastaria que um dos valores da divis�o fosse deste tipo, como em 5.0 / 2. Desta forma, como trata-se de um double dividido por um int, a conta � feita levando-se em considera��o o ponto flutuante.

* Esta divis�o, sim, trar� 2.5 como resultado. Parece pegadinha, mas s�o caracter�sticas de linguagem que v�o te deixar mais a par de como o Java funciona.

* Fizemos um truque: est�vamos sempre declarando a vari�vel primeiro, e na linha seguinte, fazendo a atribui��o. Depois, fizemos double idade = 37;. Ao declararmos vari�veis, � muito comum inicializ�-las, porque � estranho declararmos uma vari�vel, digitarmos um monte de c�digo e s� depois inicializarmos um valor.

* O comum � fazermos tudo na mesma linha. Desse modo, as linhas abaixo,

* double salario;
* salario = 1250.70;
* pela proximidade, equivalem a escrevermos isto:

* double salario = 1250.70;
* Declaramos a vari�vel informando seu tipo, e a atualizamos, isto �, inicializamos ela, fazendo uma atribui��o.

* Vamos salvar o c�digo!

<h2>Opera��es entre numeros</h2>

* Aprendemos que � poss�vel fazer opera��es entre n�meros, podemos at� fazer opera��es aritm�ticas com vari�veis de tipos diferentes como multiplicar um inteiro por um n�mero de ponto flutuante (int e double).

* Verificando cada instru��o abaixo diga qual das op��es est� errada. 

* R: 
	* int brindes = 15;
	* int pessoas = 2;
	* System.out.println(brindes / pessoas);
	* Deve imprimir 7.5

 
	* Este c�digo � o errado. Pois quando fazemos opera��es entre inteiros o resultado sempre ser� inteiro e n�o de ponto flutuante. O resultado na verdade seria 7.

<h2>Convers�es e outros tipos</h2>

* Haver� momentos em que queremos misturar os tipos de vari�veis, como o double e o int. Vimos que um int cabe no double, mas o caminho inverso n�o funciona. Vamos, ent�o, criar uma classe denominada "TestaConversao".

* Incluiremos uma vari�vel do tipo salario com os 1270.50, que por algum motivo queremos que esteja em uma vari�vel do tipo inteiro. E ent�o guardaremos salario em valor:

```java
public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = salario;
    }
}
```
* J� vimos que isto n�o funciona, pois o compilador do Java � r�gido e n�o deixa que isto ocorra sem que afirmemos com total seguran�a de estarmos cientes de que perderemos o .50. Por conta disso, deixaremos as duas linhas comentadas, e mostraremos que o caminho inverso � poss�vel:

```java
public class TestaConversao {

    public static void main(String[] args) {
        // double salario = 1270.50;
        // int valor = salario;

        double valor = 3;
    }
}
```
* Ou seja, a convers�o de um valor inteiro para um tipo double � poss�vel, academicamente chamada de promo��o, ou "ser promovido a um double", e acontece de maneira autom�tica.

* Para tentarmos fazer com que a parte do c�digo comentada acima funcione, poderemos for�ar a convers�o, moldando um double para que ele se encaixe em um int.

* � claro que n�o haver� encaixe perfeito, resultando em arestas que provavelmente ser�o perdidas. Faremos isso utilizando uma sintaxe comum a outras linguagens, o casting, para que o double seja transformado em um int.

```java
public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
    }
}
```
* Se printarmos valor, ser� mostrada apenas a parte inteira daquele n�mero: 1270. � isso que chamamos de casting que, nestas vari�veis que guardam n�meros, n�o � algo muito complexo.

* Mais adiante, veremos o casting de vari�veis que s�o refer�ncia, e t�m a ver com orienta��o a objetos, se s�o compilados ou n�o, se dar�o exceptions; � um mundo � parte.

* Basicamente, para os tipos chamados primitivos, as vari�veis b�sicas que estamos vendo aqui e s�o double com "d" min�sculo, e na cor roxa, possuem funcionamento mais simples. O casting faz a convers�o quando ela n�o � poss�vel de forma autom�tica.

* Neste caso, sem o (int), assim, entre par�nteses, a compila��o n�o ocorre, e a aplica��o n�o rodar�.

* Como saberemos quais valores se encaixam em qu�, e outros tipos num�ricos?

* No Java, o int e o double s�o os tipos mais usados, os outros aparecem de maneira muito espor�dica. A n�vel de curiosidade, em int cabem 32bits com sinais, isto �, n�meros positivos e negativos. Mais especificamente, cabem de 2 elevado a 31 negativos, a 2 elevado a 31 positivos menos 1, por conta do 0 (zero), o que d� uma quantidade de cerca de 2 bilh�es.

* O int pode guardar at� 2 bilh�es e, passando dessa quantidade, ocorrer� um overflow. Caso se queira guardar um n�mero maior ou menor que este, ser� preciso um n�mero com 64bits, que no Java � o long, e guarda um n�mero de at� 2 elevado a 63 menos 1. � um n�mero absurdo, que inclusive precisa de um L no fim, em caixa alta ou baixa, para indicar que estouramos os 2 bilh�es!

* long numeroGrande = 32432423523L;
* Por padr�o, quando n�o � um double, um n�mero no Java � considerado um int. O L indica "literal", um valor espec�fico, como um long. Em contrapartida, h� n�meros menores: o short, que guarda um n�mero de 16bits menos 1, e o byte, que � menor ainda, de at� 2 elevado a 8, que d� 256 com 128 negativos, a 127 com 1 a menos:

* short valorPequeno = 2131;
* byte b = 127;
* E se o n�mero for maior do que 64bits, um n�mero gigantesco? Da�, n�o ser�o usados tipos primitivos, ou estas vari�veis. Podem ser objetos, e ent�o usaremos bibliotecas.

* Nesse caso, usaremos este exemplo:

```java
double valor1 = 0.2;
double valor2 = 0.1;
double total = valor1+valor2;
```
* Esta opera��o deveria resultar em 0.3, certo? Ao acrescentarmos System.out.println(total); e rodarmos o c�digo, por�m, obteremos 0.30000000000000004. Que n�mero maluco � esse?

* H� v�rias quest�es matem�ticas por tr�s dele. Se pesquisarmos o valor no Google, encontramos diversos resultados de pessoas buscando uma explica��o. Existe at� o site 0.30000000000000004.com, com a explica��o matem�tica para esse floating point, do porqu�, em muitas linguagens, essa soma dar exatamente esse valor.

* N�o � � toa - como uma representa��o de decimal do inteiro � utilizada para se obter um ponto flutuante, fica complicado fazer uma opera��o aritm�tica deste tipo e guardar o resultado internamente. Por isto, o Java, como muitas outras linguagens, segue a especifica��o IEEE 754, de leitura complexa, que remete � Engenharia. De qualquer forma, � normal que este resultado apare�a quando utilizamos o double.

* Para lidarmos com dinheiro sem que apare�am centavos, por exemplo, usar�amos o BigDecimal, de que falaremos mais para a frente. Por ora continuaremos com o double pois ainda estamos iniciando na linguagem, e queremos usar vari�veis que s�o palavras chave do Java.

* Os quatro tipos de tipo primitivo s�o: int, long, byte e short. Quanto aos tipos flutuantes, al�m do double, h� o float e, se tentarmos definir a vari�vel como recebendo 3.14, ocorre o mesmo problema do long, mesmo se tratando de ponto flutuante.

* Para o Java, 3.14 � um double com 64bits. � um valor que cabe em um tipo flutuante com 32bits? N�o, e informa��es podem ser perdidas. Neste caso, usa-se o casting, o que seria estranho, ou se indica que este literal, o valor 3.14, � um float, colocando-se "f" no fim:

* float pontoFlutuante = 3.14f;
* Mais uma vez, o mais importante � o enfoque no double e no int, que aparecem com muito mais frequ�ncia. E no long em alguns casos, o qual ser� visto em alguns exerc�cios.


<h2>Imprimindo texto e n�meros</h2>

* Agora que j� sabemos fazer opera��es com vari�veis e tamb�m concatenar texto com n�meros, use o que aprendeu para indicar todas as alternativas abaixo que mostrem o resultado "A idade de Marcos � 30!".

* R:

	* int idade = 20;
	* System.out.println("A idade de Marcos � 30!");
 
	* Op��o correta! Neste caso n�o estamos usando a vari�vel idade que recebe 20.

	* double idade = 30.0;
	* System.out.println("A idade de Marcos � " + (int) idade + "!");
 
	* Op��o correta! Estamos fazendo o type cast no double que tem seu valor convertido para int. Desta forma n�o aparece a casa decimal.

	* int idade = 30;
	* System.out.println("A idade de Marcos � " + idade + "!");
 
	* Op��o correta!

<h2>Para saber mais: Type Casting</h2>

* Como foi visto nos v�deos, quando tentamos colocar um valor inteiro em uma vari�vel do tipo double o Java n�o mostra erro. Quando tentamos, por�m, colocar um double numa vari�vel do tipo inteiro temos um erro de compila��o.

* Esta propriedade se d� porque o Java faz convers�o impl�cita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.

* O contr�rio n�o � verdade por que existe perda de dados quando � feita a convers�o. Acarretando em um "type mismatch" mostrando que esta instru��o � de tipos incompat�veis.

* Para fazer uma convers�o onde pode haver perda de informa��es � necess�rio fazer um type casting. Veja a instru��o abaixo.

* int idade = (int) 30.0;
* No caso acima, est� expl�cito que ser� feito o cast de double para inteiro. Veja como funciona o cast impl�cito e expl�cito na tabela abaixo.
|PARA / DE	|byte	|short	|char	|int	|long	|float	|double	|
|---		|---	|---	|---	|---	|---	|---	|---	|	
|byte		|----	|Impl.	|(char)	|Impl. 	|Impl.	|Impl.	|Impl.	|
|short		|(byte)	|----	|(char)	|Impl. 	|Impl.	|Impl.	|Impl.	|
|char		|(byte)	|(short)|----  	|Impl.	|Impl.	|Impl.	|Impl.	|
|int		|(byte)	|(short)|(char)	|----	|Impl.	|Impl.	|Impl.	|
|long		|(byte)	|(short)|(char)	|(int)	|----	|Impl.	|Impl.	|
|float		|(byte)	|(short)|(char)	|(int)	|(long)	|----	|Impl.	|
|double		|(byte)	|(short)|(char)	|(int)	|(long)	|(float)|----	|

* Para comparar cada tipo primitivo de forma mais clara, a tabela abaixo mostra qual o tamanho de cada um.

|TIPO |TAMANHO|
|---|---|
|boolean|1 bit|
|boolean|1 bit|
|byte	|1 byte|
|short	|2 bytes|
|char	|2 bytes|
|int	|4 bytes|
|float	|4 bytes|
|long	|8 bytes|
|double	|8 bytes|

	

-----------------------------------------------------------------
<h1>Aula 05 - Trabalhando com caracteres</h1>

