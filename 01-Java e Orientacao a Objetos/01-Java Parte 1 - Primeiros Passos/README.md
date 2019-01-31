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
	