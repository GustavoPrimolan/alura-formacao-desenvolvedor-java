<h1>Aula 01 - O que é Java?</h1>

<h2>Introdução</h2>

* Meu nome é Paulo Silveira, e serei o instrutor destes cursos de Java! Se você está procurando várias linguagens para começar a estudar, não tem jeito, uma das que mais costumam chamar a atenção é o Java!

* Seja na Alura ou em qualquer outro lugar que ensine programação, esta linguagem tem atraído muito as pessoas, porque se você quiser desenvolver um site web, ou lidar com a parte do servidor, de back-end, de uma aplicação complicada, ou mesmo desenvolver uma aplicação para um dispositivo móvel, será preciso entender e conhecer não só sua sintaxe básica - que é o que veremos neste primeiro curso, entendendo as estruturas do if, for, conhecendo algumas das "pegadinhas" que aparecem com frequência. É necessário entender muito bem o conceito de orientação a objetos, polimorfismo, classe abstrata, interface, e as principais classes do Java.

* Na documentação do Java - o Javadoc -, você verá todas as classes da biblioteca. São mais de dez mil! Então, dominar a linguagem, conhecer à fundo esta API, é algo que beira o impossível.

* No entanto, no decorrer destes primeiros cursos de Java, conheceremos bibliotecas muito importantes a serem utilizadas no dia a dia, independentemente do uso, se para web ou desenvolvimento de aplicativo móvel.

* Espero que esteja preparado para vir conosco nesta jornada, pois o Java, por ser uma linguagem estatisticamente fortemente tipada, requer muito código, mesmo para criar programas simples. Mas ela é incrível!

* E se você ainda não domina orientação a objetos, garanto que estudando aqui, você enxergará o que há de muito legal e interessante nisso, e por quê devemos focar nestes conceitos de encapsulamento, responsabilidades, que têm muita vantagem em relação à tal da programação procedural.

* Vamos começar a entender um pouco sobre o Java para conseguirmos passar à instalação e compilação do nosso primeiro programa!

<h2>A Plataforma Java</h2>

* Antes de mais nada, vamos ver um pouco do que é o Java, o qual te trouxe até aqui: há cerca de vinte anos, quando a linguagem Java nasceu, ela chamava a atenção por conta das seguintes características:

* Orientado a Objeto (O.O.)
* Muitas bibliotecas
* Parece com C++ (hoje em dia isso pode até ser uma desvantagem)
* Roda em vários sistemas operacionais
* Você pode estar pensando "poxa, mas a linguagem que uso no dia a dia, atualmente, já possui estas características!". É verdade. É por isto que queremos focar na plataforma Java, e não especificamente na linguagem em si, algo que ficará mais claro no decorrer do curso, e até mesmo nesta aula!

* A plataforma Java traz:

	* Portabilidade
	* Fácil acesso e desenvolvimento
	* Segurança
	* Onipresença
	* Você pode dar uma olhada no site oficial, porém ele ajuda mais o usuário do Java, do que aqueles que irão compilar e escrever programas.

* Falando sobre a história da linguagem: James Gosling é considerado um dos "gênios da computação", sendo considerado o "pai do Java", apesar da linguagem ter sido criada por um grupo, normalmente considerado de quatro pessoas.

* Em 1992, o James Gosling trabalhava em uma empresa atualmente inexistente chamada Sun Microsystems (sendo que Sun é acrônimo para Stanford University Network), uma dessas startups da década de 60, 70, para lidar mais com hardware, que é o que estava dando mais dinheiro.

* Eles possuíam um microcomputador, o Sun Microsystems SPARC, que hoje em dia já não aparecem em lugar algum, grandes servidores denominados "micro".



* Sendo a Sun uma empresa mais focada em hardware, naquela época, a IBM e a Microsoft começaram a crescer vendendo softwares. Os softwares que a Sun utilizava no sistema deles, o UNIX (o tal de Solaris), eram disponibilizados gratuitamente.

* Um dia, esses executivos, dentre os quais o próprio James Gosling, se perguntaram como poderiam lucrar com softwares, já que eles o disponibilizavam de graça, e fizeram um retiro de um mês para tentarem chegar a uma conclusão.

* A ideia que eles tiveram envolvia um problema de eletrônicos da década de 90: havia muitos deles sendo criados naquela época, como o VHS que, para quem não sabe, é o videocassete. Era a época de surgimento de TVs, videogames, liquidificadores e geladeira.

* Cada um deles possui seu código fonte, necessitando de uma linguagem própria para funcionar, e escrever o código para cada um, reescrevendo-o quando tivessem que passar por uma troca de chip, por exemplo, não fazia muito sentido! A linguagem utilizada neles, Assembly, que hoje em dia é raramente usada, precisava ser reescrito várias vezes, imagine o trabalho!

* O James Gosling e sua equipe pensaram em escrever um único código que gerasse um "executável" - entre aspas porque após a compilação ele estará em um formato não exatamente compreensível pelo aparelho em si, mas por um intermediário, no caso, um processador ou uma placa de hardware, para que, aí sim, passe o código aos aparelhos.

* Trata-se de algo que realmente simula um computador bem simples e traduz esta linguagem "executável" de acordo com o aparelho em questão. Isto é, esta "máquina de mentira" traduzirá tudo, como se fosse um sistema operacional.

* É por isto que surgiu o nome máquina virtual, pois veio da virtual machine!

* A ideia deles foi, então, criar uma placa pequena, um hardware, que é uma máquina real e compõe todo liquidificador, computador, videocassete, e por aí vai. Desta forma, as pessoas poderão escrever em apenas uma linguagem, que na época se chamava Oak e depois se tornou Java.

* Isso pareceu muito bom, mas acabou fracassando de maneira retumbante, pois era muito caro produzir chips distintos para cada aparelho, cada qual adaptado a uma determinada linguagem.

* Então, em 1995, com o boom da Web e o surgimento de mais navegadores, como Mosaic, Netscape e posteriormente Internet Explorer, a ideia de máquina virtual foi visualizada como um problema interessante pelo Gosling.

* Assim como na atualidade, existia uma variedade relevante de navegadores e sistemas operacionais. E, para escrever um código para Windows, utilizava-se a linguagem no Microsoft Visual Basic, que por sua vez era compilado por um executável (um EXE, no caso do Windows).

* Isto é, ele só funciona neste sistema operacional, com determinadas DLLs na máquina, e assim por diante. O executável e o código fonte ficavam atrelados a uma plataforma específica, um conjunto de sistema operacional, hardware e outros detalhes.

* Para tentar resolver este problema, que geraria um código e um executável diferentes para cada sistema operacional existente, o Gosling desengavetou a ideia da máquina de verdade, do chip, que eles haviam criado anteriormente.

* Com um código fonte único, teríamos um intermediário que soubesse traduzir ou instruir o sistema operacional acerca dos comandos a serem enviados e recebidos. Este meio de campo seria realizado pela Máquina Virtual Java (JVM), que não é meramente um interpretador por conta de alguns detalhes internos que vão além da interpretação.

* O código, então, seria a linguagem Java, e o código "executável", quando compilado, não geraria um .exe (pois este seria lido apenas pelo Windows), e sim um formato chamado bytecode Java, de extensão .class, lido pela Máquina Virtual Java, que passaria a informação aos sistemas operacionais.

* Um exemplo deste formato entendido pela virtual machine (JVM), o bytecode, é o seguinte:

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

* Quem conhece a linguagem de Assembly talvez identifique a semelhança, mas este código não parece ser de fácil leitura e compreensão. Para meios de comparação, segue um exemplo de um arquivo .java, a ser compilado e traduzido para .class, o tal do bytecode:

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

* Então, em 1995 surgiu o Java, capaz de rodar em vários dispositivos e sistemas operacionais, com foco de criar applets, quando ainda tínhamos que instalar o Java para rodá-lo dentro do navegador.

* O Java nasceu com um propósito, mas acabou se fortalecendo em server-side, pois quando escrevemos uma aplicação, um site web ou sistema grande, não queremos ficar dependendo de diferentes sistemas operacionais, em implantações e deploys.

* O Java traz liberdade, quebrando nossa dependência em relação às versões de sistema operacional e navegadores. Empresas grandes, como bancos e o governo, não querem ficar engessados - o que é conhecido por Vendor lock-in.

* As principais características do conceito de Máquina Virtual Java são:

	* Multiplataforma
	* Gerenciamento de memória
	* Segurança
	* Sandbox
	* Otimizações
	* JIT Compiler

* Hoje, mais do que na linguagem Java em si, o enfoque está na plataforma, no ecossistema Java! A virtual machine é interessante para as empresas pois elas não dependem do que se encontra abaixo da sua stack, ou pilha de tecnologia, além do acesso a uma grande variedade de bibliotecas, e as linguagens Java que rodam nesta plataforma.

* Não é à toa que há programas que lidam com linguagens Ruby, Clojure ou Scala, por exemplo, e geram o bytecode Java. Depois, basta a Máquina Virtual Java, JVM, trabalhar de acordo com o sistema operacional desejado.

<h2>Benefício da JVM</h2>
* Qual é o grande benefício de uma Máquina Virtual Java (JVM)?
* R: Executar o código independente do sistema operacional. No mundo Java você terá sempre o mesmo "executável" ou Bytecode que será executado pela Maquina Virtual Java, totalmente independente do sistema operacional. Assim não é preciso rescrever ou adaptar o código para rodar em um outro sistema operacional. Temos um único executável para todos os sistemas!

<h2>Quais características?</h2>

* A linguagem Java nasceu com algumas características que são mantidas até hoje.
* R:
	* Parecido com C++.Java nasceu sendo parecido com C++ que era a linguagem mais popular na época.
	* Muitas bibliotecas. desde o início o Java possui muitas bibliotecas que ainda muito aumentaram devido as milhares de contribuições da comunidade open source.
	* Multiplataforma. Java é multiplataforma, roda em qualquer sistema operacional desde que exista a máquina virtual Java.

<h2>Quais sistemas?</h2>

* Dependendo da linguagem de programação existem vários tipos de sistemas que você pode desenvolver, como por exemplo:

	* a) Sistemas para Web (Web Sites ou Web Apps)

	* b) Sistemas puramente "Server-Side"

	* c) Aplicativos para Android

	* d) Applets que rodam no navegador

* Quais tipos de sistemas você pode criar com a linguagem Java?

* R: Todos. Seja web ou puramente server-side, aplicativo Android ou um antigo applet, Java atende todas essas áreas! No entanto, os sistemas web e Android são os que mais fizeram sucesso no mundo Java e mais empregam desenvolvedores.

<h2>Bytecode vs EXE?</h2>

* Qual é a diferença entre o executável do Windows (exe) e o executável do mundo Java (Bytecode)?

* R:
	* Os executáveis do mundo Java são portáveis, os do mundo Windows não. Lembrando portável significa que podem ser executados em vários sistemas operacionais diferentes (Windows, Linux, Mac, etc).
	* Os executáveis do mundo Windows podem ser executados diretamente no sistema operacional, os do mundo Java precisam da máquina virtual. Os executáveis Java precisam da máquina virtual Java.

<h2>Sobre o Bytecode</h2>

* Todas as afirmações abaixo sobre o Bytecode são verdadeiras, exceto:

* R: Todas as afirmações abaixo sobre o Bytecode são verdadeiras, exceto: A afirmação "O Bytecode é o código fonte" não é verdadeira. O código fonte é para o desenvolvedor entender, o Bytecode foi criado e otimizado para a máquina virtual.

<h2>Para saber mais: o nome Bytecode</h2>

* Já falamos um pouco sobre o Bytecode que é um código de máquina parecido com o Assembly. Talvez você (como eu!) estranhou o nome Bytecode, no entanto, tem uma explicação bem simples para tal. Existe um conjunto de comandos que a máquina virtual Java entende. Esses comandos também são chamados de opcodes (operation code), e cada opcode possui o tamanho de exatamente 1 Byte! E aí temos um opcode de 1 Byte ou, mais simples, Bytecode. :)


----------------------------------------------------------------------------------------------
<h1>Aula 02 - Instalação e o primeiro programa</h1>

<h2>Versões</h2>

* Você deve estar muito ansioso para instalar o Java e o ambiente de programação para compilar e executar seu primeiro programa!

* Mas antes de todo este processo de instalação e configuração, gostaria de falar sobre versões, uma vez que é comum encontrarmos vários números e versões e ficarmos perdidos sem saber por onde iniciar no Java.

* Apesar da última versão lançada ser o 9, lançada em 2017, a linguagem, surgida em 1995, teve mudanças consideráveis na versão 5, que saiu em 2004, e na 8, de 2014. Nelas, apareceram muitos recursos na linguagem, novos comandos, palavras-chave e conceitos.

* Estes tais de Streams, de Templates Generics, serão vistos durante o curso - há até um curso específico sobre estes novos recursos do Java 8. Nas versões 9 e 7, houve mudanças pequenas e pontuais, além de bibliotecas.

* Então, não se preocupe, você pode, sim, focar na versão 8, pois você verá que muitas empresas grandes inclusive ainda não alcançaram esta versão (o que é uma pena).

* Aqui, usaremos a versão Neon do Eclipse, mas existe uma versão mais recente, Oxygen, que está sendo trabalhada para dar suporte ao Java 9. Até o momento, não há versão oficial do Eclipse que dê suporte para a última versão disponível do Java.

* Todos os conceitos focados neste curso, que envolvem Orientação a Objeto, uso da herança, polimorfismo e as principais bibliotecas, são os mesmos para muitas versões da linguagem.

* Ou seja, a dica é focar naquilo que é importante, que é o que passaremos aqui, e não nas versões mais recentes. A versão 10, provavelmente virá com muito menos novidades, já que as versões seguirão a tendência de serem lançadas mais rapidamente, não de 3 em 3 anos, e sim de 6 em 6 meses.

* Minha recomendação é a de que você siga os passos feitos neste curso, respeitando a instalação do Java 8 e do Eclipse Neon. No entanto, se você realmente quiser utilizar a versão mais recente de cada um deles, por sua própria conta e risco, vá em frente. É bem provável que você não encontre problemas!

* Porém, se você é iniciante em programação e nunca viu Java antes, indica-se a utilização das versões citadas neste curso.

<h2>Instalação do JDK no Windows</h2>

* Vamos instalar o Java e tudo aquilo de que precisamos para começarmos a trabalhar! Usando o Windows, iremos fazer uma busca no Google por "Java" para ver as opções fornecidas para download.

* Um dos primeiros resultados mostrados é o java.com, com uma aparência um tanto ultrapassada, e o botão "Download Gratuito do Java", em português ou inglês. Indo por este caminho, você perceberá que baixará uma versão que costumamos usar para rodar uma aplicação Java.

* Para nós, desenvolvedores, baixar isto não é o suficiente. A versão recomendada que aparece na página de download, no caso "Version 8 Update 121", é o que chamamos de Java Runtime Environment, ou "ambiente de execução Java", que é necessário para executar uma aplicação Java.

* Lembra da época dos applets, em que precisávamos instalar plugins e similares para serem rodados no browser, ou em aplicativos? É para estes casos que a instalação desse ambiente de execução serve, o tal do JRE, que vem com a virtual machine e as bibliotecas.

* Como desenvolvedores, precisaremos do JDK, ou Java Development Kits, o "kit para desenvolver aplicações Java".

* Pesquisando no Google por "download java jdk" ou simplesmente "jdk", aí sim, cairemos em um link mais específico, como no da Oracle, com diversas opções. Queremos a versão 8, ou outra mais recente.

* Na descrição, lê-se "8u112", por exemplo, em que "u" indica "update", ou "atualização" em português, que tem a ver com correção de bugs. Nesta página, estão disponíveis para download o JDK, bem como o JRE, visto no link anterior.

* A opção que queremos baixar trará, além da virtual machine e das bibliotecas, o compilador, que pegará o código Java e o transformará em um formato que ele entenderá. Vamos fazer o download do JDK de acordo com o sistema operacional - no Mac ou no Linux pode ser que já venha instalado, ou seja mais fácil de se baixar.

* Neste caso, optaremos por jdk-8u121-windows-x64.exe, não esquecendo de aceitar os termos da Oracle. Terminado o download, abriremos o arquivo executável, a ser salvo em um diretório apropriado seguindo os passos de instalação no modo default.

* O JDK, o compilador, nada mais é do que uma versão menor daquilo que existe no site java.com, mais as ferramentas para o desenvolvimento de aplicações Java. Em seguida, continuaremos instalando o JRE, com a virtual machine e tudo o mais que é necessário para rodar esta aplicação.

* Confirmaremos a instalação acessando o prompt do MS-DOS, que é algo muito similar ao terminal do Linux, Bash, Shell, e do Mac. O PowerShell da Microsoft hoje em dia é mais raro, mas ainda existe. Não se preocupe, muito em breve estaremos utilizando uma IDE, o Eclipse. Neste momento, porém, queremos enxergar o que está "por trás".

* Pode-se pesquisar por "cmd" para acessar o prompt, uma tela preta em que digitaremos comandos, sendo o primeiro deles aquele que chamará o Java, java, seguido da tecla "Enter". Ele retorna uma mensagem dizendo para usarmos um class, porém ainda veremos sobre.

* O comando que usaremos em seguida será javac, de java compiler, o compilador que pegará o código em Java e "traduzirá" para o que a virtual machine entende. Porém, ao digitarmos isso, obteremos o seguinte:

* 'javac' não é reconhecido como um comando interno ou externo, um programa operável ou um arquivo em lotes.
Você deve estar se perguntando o que aconteceu, já que o JDK foi instalado, e é verdade, ele deveria ser executável. O que acontece é que ele está em outro local, e por isto não está sendo encontrado.

* Abrindo o explorador de arquivos, em C:, "Arquivos de Programas" contém a pasta "Java", que por sua vez possui dois diretórios referentes a JRE (onde se encontra a virtual machine) e JDK (onde está o compilador). Por default de instalação, a Oracle modifica os arquivos de configuração do Windows e deixa apenas o Java do JRE pronto para ser chamado em linha de comando.

* Se você for usar o Java em linha de comando, como não é tão raro de acontecer, precisaremos do "jdk1.8.0_121", dentro do qual há, em "bin" (de "binário"), o arquivo javac.exe. Vamos selecionar o caminho do diretório onde se encontra este executável, e copiá-lo por meio do atalho "Ctrl + C" e, no Painel de Controle, informaremos ao Windows para que toda vez que inserirmos algum comando, o caminho abaixo seja consultado também:

* C:\Program Files\Java\jdk1.8.0_121\bin
* No Painel de Controle, portanto, selecionaremos "Sistema > Configurações avançadas do sistema" e, na nova janela, clicaremos em "Variáveis de Ambiente...", utilizável por programas como se fossem variáveis globais do Windows.

* Veremos no box abaixo de "Variáveis do sistema" o "Path". Clicaremos em "Editar..." e observaremos todos os seus componentes. Queremos incluir mais um diretório nele, portanto clicaremos em "Novo" e usaremos o atalho "Ctrl + V" para colar o caminho que copiamos anteriormente. Selecionaremos "OK" em todas as janelas que ficaram abertas.

* Teremos que reabrir o Prompt de Comando, após o qual digitaremos javac, que desta vez funcionará corretamente! Quando se instala uma nova linguagem de programação, é comum que a variável de ambiente seja alterada para que não haja necessidade de criarmos arquivos ou entrarmos em diretórios específicos para trabalhar.

* A partir deste momento, então, temos não só o Java, mas o JDK, o Kit de Desenvolvimento do Java, instalado e configurado no Windows, tanto para execução quanto para compilação de uma aplicação Java!

<h2>JRE e JDK</h2>

* Quais das afirmações abaixo são verdadeiras referente a JDK e JRE?

* R: 
	* O JRE é o ambiente para executar uma aplicação Java. Caso queira executar uma aplicação Java apenas, baste o JRE (Java Runtime Environment).
	* O JDK é o ambiente para executar uma aplicação Java SE e possui várias ferramentas de desenvolvimento. O JDK são as ferramentas de desenvolvimento (como o compilador) mas também tem JRE embutido!

<h2>Para saber mais: JVM vs JRE vs JDK</h2>

* O mundo Java é cheio de siglas com 3 ou 4 letras começando com J. Você já conhece duas famosas: o JRE e JDK. O primeiro é o ambiente de execução, o segundo são as ferramentas de desenvolvimento junto com o ambiente de execução. Simplificando podemos dizer:

* JDK = JRE + ferramentas desenvolvimento
* Existe uma terceira sigla, JVM (Java Virtual Machine), que também já usamos durante o curso. A responsabilidade da Java Virtual Machine é executar o Bytecode! Então qual é diferença entre JVM e JRE? Ambos executam o Bytecode, certo?

* A resposta é simples: O JRE (o nosso ambiente de execução) contém a JVM, mas também possui um monte de bibliotecas embutidas. Ou seja, para rodar uma aplicação Java não basta ter apenas a JVM, também é preciso ter as bibliotecas.

* Assim podemos simplificar e dizer:

* JRE = JVM + bibliotecas
* É importante entender que você não pode baixar a JVM apenas. Você sempre baixa o JRE que tem a JVM e as bibliotecas em conjunto. Tudo bem?

<h2>Compile e rode seu primeiro programa Java</h2>

* Como falamos no início, em um primeiro contato, o código em Java pode ser complicado de ser escrito e compreendido. Às vezes precisamos escrever um pouco mais do que gostaríamos para fazer algo.

* Antes de usarmos um IDE para lidarmos com o código, é legal que você o faça em um sistema bem simples, como o bloco de notas - outras opções são o TextPad, Atom, Visual Studio Code, Sublime, ou qualquer outro.

* Nosso primeiro código Java será feito no editor de texto mais simples possível, em plain text. Faremos o "Olá mundo" para testarmos e vermos como funciona a compilação e execução de programas Java.

* O Java veio da linguagem C na década de 90, então, não é tão simples quanto digitarmos print("olá mundo"). A linha que faz um print na tela, por exemplo, é

* System.out.println("olá mundo");
* Nesta linguagem, toda instrução que damos sem as chaves necessita do ponto e vírgula (;). Todo código Java também precisa estar dentro de uma classe, que pode ser uma interface, um Enum. Neste caso, ele se insere na classe Programa.

* Uma instrução como esta, com System.out.println(), precisa estar dentro de um método chamado main, que ainda não vimos, acompanhado de outros termos que também aprenderemos depois.

* É muito comum o uso de public antes de class Programa, e embora isto não seja estritamente necessário no nosso caso, vamos colocá-lo para quando formos ler códigos de outros programadores e IDEs.

```java
public class Programa {

    public static void main(String[] args) {
        System.out.println("olá mundo");
    }
}
```

* No momento, focaremos na linha System.out.println("olá mundo");, que poderá ser considerado um comando apesar de não ser um, e mostrará algo na saída padrão, no caso o prompt do MS-DOS.

* O menor programa Java seria similar ao código acima. Vamos tentar ver como funciona sua compilação e execução? Antes disso, salvaremos o arquivo nomeando-o com "Programa.java", em uma nova pasta denominada "java-codigo".

* O nome do arquivo é muito importante - entenderemos melhor o motivo mais adiante, mas ele precisa ser o mesmo da class inserida no código.

* No Prompt de Comando, digitaremos cd .. duas vezes, seguidos de "Enter", e dir, para a listagem de todos os diretórios. Depois, usaremos cd java-codigo para acessar o diretório, e em seguida digitaremos dir novamente.

* Dica: é possível usar a tecla TAB para autocompletar palavras!

* Ali, é listado um arquivo "Programa.java"! No Windows, há um comando chamado type (equivalente ao cat do terminal do Linux), o qual permite a visualização do conteúdo do arquivo. Neste caso, usaríamos type Programa.java.

* A extensão .java não é entendida pela virtual machine, que entende o formato "meio máquina" de Virtual Machine Java, o bytecode, um arquivo com extensão .class.

* A seguir, usaremos o comando javac Programa.java, e daremos um "Enter", com o qual serão mostradas as mensagens de erro de compilação, fundamentais para o aprendizado.

* Apesar de não entendermos o que é public class ou static void main ainda, sabemos que System.out.println() seguido de aspas e o conteúdo, irá mostrar uma mensagem.

* Por meio de dir no prompt, você verá que há dois arquivos: "Programa.java" e "Programa.class", este último no formato binário, em bytecode. E para chamarmos a virtual machine, usaremos o comando java Programa, e veremos a impressão de "olá mundo". Trata-se da primeira execução do nosso programa Java!

* Agora, veremos os principais erros e características deste código. O primeiro surge ao digitarmos java Programa.class, o que traz a seguinte mensagem de erro na execução do programa:

* Erro: Não foi possível localizar nem carregar a classe principal Programa.class
* Isto acontece porque o programa não se chama "Programa.class", e sim simplesmente "Programa", apesar de estar contido no arquivo "Programa.class".

* Outros erros mais comuns são os de compilação, como quando esquecemos de colocar o ponto e vírgula no fim da linha. Além disso, o Java possui palavras chave (keywords, ou palavras reservadas), dentre os quais utilizamos "public", "class", "static" e "void", que devem estar em letra minúscula, uma vez que o Java é case sensitive (reconhece o uso de letras maiúsculas ou minúsculas).

* Em um ambiente mais complexo, veremos que isto ficará mais claro e fácil de ser trabalhado. É importante praticar e não ter medo das mensagens de erro de compilação.

* As chaves abrem e fecham os blocos de códigos, indicando por exemplo que tudo aquilo que se encontra em public static void main pertence ao public class Programa, da mesma forma que System.out.println() pertence ao public static void mainvisível também por meio das indentações.

* O Java possui outras particularidades, como o "Enter" e a barra de espaço serem opcionais; são convenções do código. Agora, o importante é escrever, entendendo o que está por trás do código, errar e fazer vários testes!

<h2>Entrada da aplicação</h2>

* A Ana está começando com desenvolvimento Java e já aprendeu que a entrada de uma aplicação é sempre a função (ou método) main. Porém, ela não se lembra qual era a definição correta (palavras chaves e parâmetros) dessa função/método:

```java
class Programa {

    ??? main ???{
        System.out.println("Você pode ajudar a Ana?");
    }
}
```

* Qual é a definição correta?

* R: public static void main(String[] args)  Ainda não sabemos o que significam todas essas palavras, mas fique tranquilo pois vai ficar claro para você. Nesse momento basta saber que a entrada de uma aplicação Java é sempre uma função/método public static void main(String[] args).

<h2>Sobre a compilação e execução</h2>

* Veja as afirmações abaixo sobre a compilação e execução de código Java:

	* 1 - Durante a compilação acontece uma verificação sintática do código fonte.

	* 2 - Na compilação e execução podem aparecer erros.

	* 3 - A JVM lê e executa o Bytecode.

	* 4 - O compilador gera o Bytecode caso não tenha nenhum erro sintático no código fonte.

* Quais afirmações são verdadeiras?

* R: Todas as afirmações são verdadeiras.

<h2>Compilar e executar</h2>

* O Pedro está trabalhando pela primeira vez com o sistema operacional Linux, mas está estranhando, pois, o computador não possui uma interface gráfica (só funciona na linha de comando!).

* Ou seja, ele precisa compilar e executar um código Java abaixo na linha de comando, no entanto esqueceu os comandos :(

```java
Arquivo Programa.java:

class Programa {

    public static void main(String[] args) {
        System.out.println("Funcionou!!");
    }
}
```
* Quais comandos ele deve usar para compilar e rodar esse código Java?

* R: 
	* javac Programa.java
	* java Programa
 
	* Correto! Repare que passamos a extensão do arquivo (.java) para o comando javac:

	* javac Programa.java
	* E para chamar a JVM usamos apenas o nome da classe (sem extensão):
	* java Programa


<h2>O que aprendemos?</h2>

* Nessa aula você escreveu o seu primeiro código Java e aprendemos:

	* qual é a diferença entre JRE e JDK
	* como compilar um código fonte Java na linha de comando (javac)
	* como executar o Bytecode na linha de comando (java)
	* um programa Java deve estar escrito dentro de uma classe (class)
	* toda instrução Java deve ser finalizada com ;
	* para abrir e fechar um bloco usaremos as chaves {}
	* um programa Java possui uma entrada que é uma função (método) main
	* para imprimir algo no console usamos a instrução System.out.println()

-----------------------------------------------------------------------------
<h1>Aula 03 - Começando com Eclipse</h1>

<h2>Instalando o Eclipse</h2>

* Por enquanto, temos o nosso primeiro programa Java escrito, e agora passaremos a entender como declarar variáveis, fazer if, laços e afins. Queremos um editor um pouco melhor do que o bloco de notas, de acordo com sua preferência.

* A comunidade geral do Java costuma usar não um editor, mas um IDE (Integrated Development Environment, que em português seria algo como "Ambiente Integrado de Desenvolvimento"). Um IDE não é simplesmente um editor pois integra em um único local a linguagem, o editor, o compilador, a biblioteca e a documentação.

* Os principais IDEs utilizados por quem programa em Java são: o NetBeans, da própria Oracle, o IntelliJ IDEA, usado como base para Android, e também conhecido por Android Studio, e o Eclipse, projeto em código aberto absorvido pela IBM e, hoje em dia, um consórcio de muitas empresas que tomam conta do programa, que você pode baixar aqui.

* O Eclipse quer te ajudar na hora de codificar, muito mais do que focar em wizards e na grande quantidade de opções de menu. À primeira vista, o IDE pode parecer pequeno demais (pelo peso que possui), mas é porque há muitos plugins instaláveis para se facilitar o desenvolvimento de features e recursos.

* Quando formos instalá-lo, aparecerá uma janela perguntando o que queremos, e escolheremos "Eclipse IDE for Java Developers". A opção "Eclipse IDE for Java EE Developers" requer um conhecimento maior, e serve para desenvolvimento de aplicativos web e softwares, e poderá ser explorada futuramente.

* Após instalação e durante a execução, a primeira pergunta que o Eclipse fará tem a ver com o workspace, o diretório a ser utilizado para guardar todos os projetos Java. Isto pode ficar a seu critério, lembrando que iremos trabalhar sempre no Eclipse, então isso acabará não sendo tão relevante, pois você não precisará mais do Prompt de Comando para acessá-lo.

* É possível ter mais do que um workspace, um só para exercícios da Alura e outros para projetos da empresa, por exemplo.

* A primeira execução trará muitas janelas diferentes, mesmo se fecharmos o "Help". Vamos maximizar o Eclipse e fechar a aba "Welcome".

* O IDE, ao ser aberto, pode te assustar um pouco, mas você verá que assusta menos do que outros com muito mais janelas e perguntas de wizards. No centro, ficam os arquivos que queremos editar, do lado direito estão os "Task List" (Lista de Tarefas), embaixo, "Problems" (Problemas). À esquerda, há "Package Explorer" (Explorador de pacotes).

* O Eclipse denomina este conjunto de janelas de perspectiva, e cada uma delas é uma view. Então, veremos diversas views que irão nos ajudar em diferentes situações, tanto que se clicarmos em "Window > Show View" no menu superior, há várias opções. Não nos preocuparemos com isso agora.

* No momento, queremos criar um projeto Java, e veremos poucos wizards! Para criarmos um projeto e uma classe Java, clicaremos em "File > New > Java Project" e, na nova janela, definiremos o projeto como "sintaxe-basica".

* Provavelmente o Java já está instalado em seu computador; verifique sua versão, se é 8 ou posterior, pois utilizaremos recursos desta versão. Clicando em "Finish", o projeto é criado e aparecerá em "Package Explorer", contendo um diretório "src" (onde deve estar nosso código fonte), e "JRE System Library", uma biblioteca com tudo que temos e acessível pelo Java. Todos os comandos que utilizaremos estará nestes arquivos .jar.

* Agora, queremos colocar nosso arquivo Java, o "Programa.class", no diretório de código fonte.

