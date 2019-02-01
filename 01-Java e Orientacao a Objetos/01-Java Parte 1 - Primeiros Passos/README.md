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

<h2>Sobre IDEs e editores</h2>

* Podemos programar em Java utilizando editores de textos e IDEs. Nesse contexto, temos as seguintes afirmativas:

	* a) Um IDE é um ambiente integrado de desenvolvimento que centraliza em um único lugar o compilador da linguagem utilizada, editor de texto, documentação, banco de dados e tudo que gira em torno da criação de aplicações.

	* b) Para quem está começando, o Eclipse IDE for Java EE Developers é o mais recomendado.

	* c) NetBeans e Intellij são outros IDEs famosos do mundo Java.

	* d) Um editor de texto possui tudo o que um IDE oferece.

* Marque a opção verdadeira a respeito das afirmações anteriores:

* R: A, C são verdadeiras. Um IDE é um ambiente integrado de desenvolvimento que centraliza em um único lugar, e NetBeans e Intellij são outros exemplos famosos de IDEs Java.

<h2>Dentro do Eclipse IDE</h2>

* Marque as alternativas verdadeiras:
* R: 
	* Um workspace é a pasta padrão que será utilizado para armazenar todos os projetos criados com a IDE Eclipse.

	* Cada projeto do Eclipse é uma pasta dentro de um workspace.

	* O conjunto de janelas exibidas pelo Eclipse IDE é denominado perspectiva.

<h2>Nosso programa rodando no Eclipse</h2>
* Vamos colocar o código do programa no Eclipse, utilizando o editor mais poderoso, o IDE. Para isto, há várias opções: acessando "File > New > Class", ou clicando com o lado direito do mouse em "src" e selecionando "New > Class", o que abrirá um wizard mas, como dito anteriormente, focaremos mais no código em si do que nas "mágicas" que os editores fazem para nós.

* O nome desta classe será "Programa", porém não se preocupe ainda com as diversas opções que aparecem nesta janela. Há até um checkbox para o caso de querermos public static void main(String[] args), o que não é o caso, pois por ora queremos praticar bastante e escrever um código básico.

* Clicando-se em "Finish", teremos o programa simples que escrevemos antes:

```java
public class Programa {

    public static void main(String[] args){

        System.out.println("ola mundo");
    }
}
```
* Conforme vamos digitando o código, o programa vai tentando completar, para nos ajudar. Na lateral esquerda, a bolinha vermelha com "x" indica erro de compilação em determinadas linhas.

* O asterisco (*) ao lado do nome do arquivo indica que ele não foi salvo!

* Para executarmos o código, basta acessarmos "Run > Run As > Java Application", o que abre uma view para Console, que abre e executa, no caso, o javaw.exe, uma versão do Java que não abre no Prompt do MS-DOS, utilizado internamente pelo Eclipse para chamar o nosso programa, que é o que gostaríamos de fazer neste ambiente.

* Por enquanto, não há tantas vantagens em relação ao Notepad, e não é à toa que a Microsoft, quando lançou o Visual Studio, foi atrás dos recursos apresentados pelo Eclipse, com o ReSharper, contratando o Erich Gamma, autor de Design Patterns: Elements of Reusable Object-Oriented Software, para trabalhar com o IDE deles. O Eclipse foi uma inspiração para muitos, e é considerado uma ferramenta incrível.

* Mas onde se encontra o "Programa.class", o bytecode que a virtual machine entende?

* O "Package Explorer", que é uma view, esconde arquivos e diretórios que julga não serem relevantes. E faz sentido, pois no momento estamos focados no programa Java. Acessando-se "Window > Show View > Navigator", ele irá mostrar o File System.

* Clicando em "sintaxe-basica" para abri-lo, além do "src", existem outros diretórios e arquivos, dentre os quais "Programa.class" na pasta "bin". ".classpath" e ".project" são arquivos de configuração utilizados pelo Eclipse para obter informações sobre seu projeto. Eles não devem ser editados diretamente e, clicando-se na aba "Source" na parte inferior da interface, você verá que trata-se de um .xml.

* Não precisaremos nos preocupar com estes arquivos, pois é muito raro termos que mexer neles. Há muito tempo, só existia esta view, o "Navigator" (similar ao Windows Explorer). O "Package Explorer" surgiu para ajudar quem trabalha com Java, e o "Navigator", para quem trabalha com tudo, de forma geral. Na maioria das vezes, usaremos o "Package Explorer".

* Se clicarmos em "src > Programa.java" com o lado direito do mouse, e em seguida em "Properties", veremos a localização exata do arquivo, possível de ser confirmado por meio do Prompt de Comando.

* A partir de agora deixaremos de utilizar o prompt, pois faremos tudo no Eclipse. De qualquer forma, é importante lembrarmos que o Java pode ser usado por linhas de comando, se você preferir, o que acaba sendo até necessário em alguns casos.

<h2>Projeto Java</h2>

* Marque as alternativas verdadeiras:
* R:
	* Executamos nosso programa no Eclipse através do menu Run -> Run as -> Java Application.  Inclusive há uma tecla de atalho, exibida durante a opção que varia de acordo com seu sistema operacional.
	*Dentro de um projeto Java, criamos uma nova classe através da opção do menu File -> New -> Class. Caso o projeto não seja um projeto Java, a opção Class não estará disponível, fique atento!
	* A saída do nosso programa executado pelo Eclipse é feita através da view console. A view console mostra a saída do programa.

<h2>Sobre a View Navigator</h2>

* Marque a alternativa correta a respeito da View Navigator:

* R: É parecida com o Windows Explorer do Windows ou o Finder do MAC.  Ela nos permite ver o diretório do projeto com seus arquivos na integra.

-------------------------------------------------------------------------
<h1>Aula 04 - Tipos e variáveis</h1>

<h2>Tipo inteiro: int</h2>

* Trabalharemos com sintaxes de variáveis e controles de fluxo - laços e condicionais - pela criação de um novo projeto acessando-se "New > Java Project". Poderíamos fazer tudo isto no mesmo arquivo, mas o intuito aqui é de treinar a codar e perder o medo das janelas e suas diversas opções.

* Criaremos o "sintaxe-variaveis-e-fluxo", os dois tópicos que começaremos a ver. O novo projeto contendo o diretório "src" estará visível na view de "Package Explorer". No prompt, há um diretório "bin" escondido, pois o programa não quer mostrar o .class, e sim o código fonte Java. Reparem que no momento estou usando Mac, o que pouco importa, já que o Eclipse funciona da mesma maneira em todos os sistemas operacionais.

* Criaremos nossa classe para começar a trabalhar com variáveis. Clicaremos com o lado direito do mouse em "src" e depois em "New > Class", e a classe se chamará "TestaVariaveis". No Java, um statement (ou instrução) não funciona fora dos métodos, portanto precisaremos do ponto inicial, do public static void main(String[] args), após o qual salvaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {

    }
}
```

* Poderíamos rodar a aplicação assim como está, mas não aconteceria nada. Então, digitaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");
    }
}
```

* Salvaremos novamente e rodaremos a aplicação indo à "Run > Run As > Java Application", ou clicando com o lado direito do mouse na classe com main, e em "Run As > Java Application". Também há o atalho "Ctrl + S". O Console mostrará o print, e com isto repetimos o mesmo teste do "ola mundo" feito anteriormente.

* As palavras que aparecem em roxo no editor são as palavras chave, reservadas, e deverão estar sempre em caixa baixa. Agora, para criarmos uma variável denominada idade, que armazenará nossas idades, digitaremos:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");

        idade = 37;
    }
}
```
* No Java, como o Eclipse já está dando a entender sublinhando idade com vermelho, não compila isto, pois trata-se de uma linguagem estaticamente ou fortemente tipada, ou seja, que necessita da declaração de todas as variáveis e tipos a serem utilizados. Passando o mouse sobre a palavra sublinhada, lê-se a mensagem de erro "idade cannot be resolved to a variable".

* Significa que "idade não pode ser entendida como uma variável", pois não foi declarada. O Eclipse inclusive dará algumas opções de "rápido conserto", ou quick fix, para a criação local da variável, ou remoção da linha, por exemplo. idade = 37 é uma atribuição, em que 37 se encontra dentro de idade.

* Precisaremos declará-la informando que ela é do tipo numérico e que guarda um valor inteiro, sem decimais ou pontos flutuantes. int vem de Integer:

```java
public class TestaVariaveis {

    public static void main(String[] args) {
        System.out.println("ola novo teste");

        int idade;
        idade = 37;
    }
}
```
* Salvaremos e rodaremos este código. Clicando-se na setinha ao lado do ícone verde que indica play na barra de ferramentas superior, vê-se os últimos programas que foram rodados no programa. E clicando no ícone verde, roda-se o último deles.

* O valor foi guardado, mas parece que nada aconteceu de fato. Além de atribuirmos uma variável, pode-se usar o valor, mostrando-o na tela. Para isto, utilizaremos o System.out.println de novo, desta vez sem as aspas, pois queremos a evaluation, o resultado daquela expressão, e não uma cadeia de caracteres, uma string:

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
* Inclusive, é possível ver que todas as menções à variável idade ficam em highlight, destacadas para mostrar que tratam-se da mesma variável. Vamos rodar o código acima para imprimirmos o valor de idade! No "Console", obteremos:

* ola novo teste
* 37
* Poderemos trabalhar com os operadores aritméticos junto a estas variáveis, também:

* idade = 30 + 10;
* idade = 7 * 5 + 2;
* Como na maioria das linguagens, no Java também há precedência, então as operações matemáticas seguem uma determinada ordem de prioridade, mas poderemos usar parênteses, desta forma:

* idade = (7 * 5) + 2;
* E assim por diante. Imprimiremos a idade três vezes:

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
* No código, usamos algumas convenções: ao criarmos a classe TestaVariaveis, cuja funcionalidade ainda desconhecemos, usamos a primeira letra em maiúscula e, ao acrescentarmos a segunda palavra, não utilizamos underscore ou algo do tipo, e sim a primeira letra em caixa alta de novo. Isto se chama Camel Case, e aparece com frequência no Java e em muitas outras linguagens - é uma convenção de código, e seu uso não é obrigatório.

* Da mesma forma, a variável iniciando-se com "i" minúsculo é o padrão, bem como não há o costume de se abreviar palavras. No Java, vocês verão nomes gigantescos de variáveis! É legal nos atentarmos a estas práticas para começarmos a nos acostumar com estes hábitos essenciais para quando formos trabalhar com grandes equipes.

* Para mostrarmos uma frase antes de um número, basta imprimirmos uma string, como "a idade é", juntamente com a variável idade, assim:

* System.out.println("a idade é " + idade);
* O operador +, na maioria das vezes, tem a função de somar variáveis de tipo numérico, sendo a única exceção estes casos em que acompanham strings, com os números sendo convertidos em letras e tudo sendo concatenado. Este operador, portanto, também serve para concatenar algo com uma palavra ou frase (uma string).

* Salvando e rodando a aplicação, teremos:

* A idade é 37
* Pode-se acrescentar mais strings após a variável usando-se o operador.

* Há outra versão do System.out.println(), o System.out.print(), sem o ln, isto é, sem o line, que pula a linha, que poderá ser utilizado de acordo com sua preferência.

<h2>Criando uma variável numérica</h2>

* Selecione a opção que mostra como podemos criar e definir o valor de uma variável para representar a quantidade de dias de um mês?

* R:

```java
int diasDoMes;

diasDoMes = 30;
```

<h2>Tipo flutuante: double</h2>

* Também queremos trabalhar com outros tipos de variáveis, pois se tentarmos colocar no lugar da idade, em idade = 37;, um valor como 37.5, a compilação não irá ocorrer. O erro que se lê ao passarmos o mouse em cima, é "Type mismatch: cannot convert from double to int", isto é, a conversão não é possível. Lembrando que no Java nunca usaremos a vírgula para separar o decimal no código fonte.

* Vamos criar uma nova classe para testar os números com ponto flutuante, clicando em "(default package)" com o lado direito do mouse e em "New > Class", nomeando-a de "TestaPontoFlutuante". Teremos, então:

```java
public class TestaPontoFlutuante {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;
        System.out.println("meu salário é " + salario);
    }
}
```

* Há dois tipos de variáveis em que cabem o tal de ponto flutuante, sendo que a mais utilizada é o double, como visto acima. Salvaremos o código e o rodaremos! Na aba "Console", obteremos o resultado:

* meu salário é 1250.7
* Dica: as views podem ser customizadas de acordo com sua necessidade, sendo possível fechar aquelas que não estão em uso, por exemplo.

* O 0 (zero) referente aos centavos não apareceram porque é assim que a variável double é convertida para se juntar à string. Poderemos formatar para aparecerem duas, três casas decimais, ou apenas uma, por meio dos formatters do Java, inclusos na biblioteca. Não veremos isto neste curso, porém há diversos recursos disponíveis, como o printf, da linguagem C, para colocarmos porcentagens e afins.

* No double cabem variáveis do tipo inteiro, isto é, poderemos fazer o caminho inverso, indicando que temos uma variável que guarda idade, com número 37. Reparem que este valor não possui decimal. Não tem problema, um número de tipo inteiro cabe em um tipo double. O inverso, um decimal em um int, é que não é compatível.

* O Java tem regras um tanto rígidas, portanto não aceitará 3.0 como int, já que não aceita pontos flutuantes. Ele é uma linguagem com peculiaridades que algumas pessoas podem estranhar, sendo vantajoso para se trabalhar em equipe pois reforça uma padronização, e as pessoas trabalham de formas parecidas.

* Para enxergarmos a forma como o double funciona, podemos fazer uma conta de divisão, por exemplo:

* double divisao = 3.14 / 2;
* System.out.println(divisao);
* Rodando o código acima, teremos:

* 1.57
* Parece básico para quem já conhece linguagem estaticamente tipadas, mas mesmo nessa parte mais básica da linguagem, nos aprofundaremos mais, para sentirmos algumas das características do Java.

* O que aconteceria no caso de digitarmos int outraDivisao = 5 / 2;? Alguns podem pensar que isso não é compilado, que dará erro, pois o resultado é 2.5, o que não cabe em int.

* No Java, entretanto, há uma regra: quando há uma divisão entre dois números inteiros, ele "forçará" um número inteiro como resultado. Se printarmos esta divisão, obteremos como resultado o valor 2. Estranho, não?

* E se quiséssemos que o resultado fosse 2.5 de fato, poderíamos tentar double novaTentativa = 5 / 2;, e pediríamos sua impressão, que traria 2.0. Piorou! O Java irá ler apenas o lado que vem antes da atribuição na linha de código relativa ao double. Ou seja, primeiro, ele irá executar a divisão 5 / 2, e depois ele tentará colocar o resultado em um double.

* Na verdade, o que gostaríamos é que a conta tivesse sido feita partindo-se do double e, neste caso, bastaria que um dos valores da divisão fosse deste tipo, como em 5.0 / 2. Desta forma, como trata-se de um double dividido por um int, a conta é feita levando-se em consideração o ponto flutuante.

* Esta divisão, sim, trará 2.5 como resultado. Parece pegadinha, mas são características de linguagem que vão te deixar mais a par de como o Java funciona.

* Fizemos um truque: estávamos sempre declarando a variável primeiro, e na linha seguinte, fazendo a atribuição. Depois, fizemos double idade = 37;. Ao declararmos variáveis, é muito comum inicializá-las, porque é estranho declararmos uma variável, digitarmos um monte de código e só depois inicializarmos um valor.

* O comum é fazermos tudo na mesma linha. Desse modo, as linhas abaixo,

* double salario;
* salario = 1250.70;
* pela proximidade, equivalem a escrevermos isto:

* double salario = 1250.70;
* Declaramos a variável informando seu tipo, e a atualizamos, isto é, inicializamos ela, fazendo uma atribuição.

* Vamos salvar o código!

<h2>Operações entre numeros</h2>

* Aprendemos que é possível fazer operações entre números, podemos até fazer operações aritméticas com variáveis de tipos diferentes como multiplicar um inteiro por um número de ponto flutuante (int e double).

* Verificando cada instrução abaixo diga qual das opções está errada. 

* R: 
	* int brindes = 15;
	* int pessoas = 2;
	* System.out.println(brindes / pessoas);
	* Deve imprimir 7.5

 
	* Este código é o errado. Pois quando fazemos operações entre inteiros o resultado sempre será inteiro e não de ponto flutuante. O resultado na verdade seria 7.

<h2>Conversões e outros tipos</h2>

* Haverá momentos em que queremos misturar os tipos de variáveis, como o double e o int. Vimos que um int cabe no double, mas o caminho inverso não funciona. Vamos, então, criar uma classe denominada "TestaConversao".

* Incluiremos uma variável do tipo salario com os 1270.50, que por algum motivo queremos que esteja em uma variável do tipo inteiro. E então guardaremos salario em valor:

```java
public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = salario;
    }
}
```
* Já vimos que isto não funciona, pois o compilador do Java é rígido e não deixa que isto ocorra sem que afirmemos com total segurança de estarmos cientes de que perderemos o .50. Por conta disso, deixaremos as duas linhas comentadas, e mostraremos que o caminho inverso é possível:

```java
public class TestaConversao {

    public static void main(String[] args) {
        // double salario = 1270.50;
        // int valor = salario;

        double valor = 3;
    }
}
```
* Ou seja, a conversão de um valor inteiro para um tipo double é possível, academicamente chamada de promoção, ou "ser promovido a um double", e acontece de maneira automática.

* Para tentarmos fazer com que a parte do código comentada acima funcione, poderemos forçar a conversão, moldando um double para que ele se encaixe em um int.

* É claro que não haverá encaixe perfeito, resultando em arestas que provavelmente serão perdidas. Faremos isso utilizando uma sintaxe comum a outras linguagens, o casting, para que o double seja transformado em um int.

```java
public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
    }
}
```
* Se printarmos valor, será mostrada apenas a parte inteira daquele número: 1270. É isso que chamamos de casting que, nestas variáveis que guardam números, não é algo muito complexo.

* Mais adiante, veremos o casting de variáveis que são referência, e têm a ver com orientação a objetos, se são compilados ou não, se darão exceptions; é um mundo à parte.

* Basicamente, para os tipos chamados primitivos, as variáveis básicas que estamos vendo aqui e são double com "d" minúsculo, e na cor roxa, possuem funcionamento mais simples. O casting faz a conversão quando ela não é possível de forma automática.

* Neste caso, sem o (int), assim, entre parênteses, a compilação não ocorre, e a aplicação não rodará.

* Como saberemos quais valores se encaixam em quê, e outros tipos numéricos?

* No Java, o int e o double são os tipos mais usados, os outros aparecem de maneira muito esporádica. A nível de curiosidade, em int cabem 32bits com sinais, isto é, números positivos e negativos. Mais especificamente, cabem de 2 elevado a 31 negativos, a 2 elevado a 31 positivos menos 1, por conta do 0 (zero), o que dá uma quantidade de cerca de 2 bilhões.

* O int pode guardar até 2 bilhões e, passando dessa quantidade, ocorrerá um overflow. Caso se queira guardar um número maior ou menor que este, será preciso um número com 64bits, que no Java é o long, e guarda um número de até 2 elevado a 63 menos 1. É um número absurdo, que inclusive precisa de um L no fim, em caixa alta ou baixa, para indicar que estouramos os 2 bilhões!

* long numeroGrande = 32432423523L;
* Por padrão, quando não é um double, um número no Java é considerado um int. O L indica "literal", um valor específico, como um long. Em contrapartida, há números menores: o short, que guarda um número de 16bits menos 1, e o byte, que é menor ainda, de até 2 elevado a 8, que dá 256 com 128 negativos, a 127 com 1 a menos:

* short valorPequeno = 2131;
* byte b = 127;
* E se o número for maior do que 64bits, um número gigantesco? Daí, não serão usados tipos primitivos, ou estas variáveis. Podem ser objetos, e então usaremos bibliotecas.

* Nesse caso, usaremos este exemplo:

```java
double valor1 = 0.2;
double valor2 = 0.1;
double total = valor1+valor2;
```
* Esta operação deveria resultar em 0.3, certo? Ao acrescentarmos System.out.println(total); e rodarmos o código, porém, obteremos 0.30000000000000004. Que número maluco é esse?

* Há várias questões matemáticas por trás dele. Se pesquisarmos o valor no Google, encontramos diversos resultados de pessoas buscando uma explicação. Existe até o site 0.30000000000000004.com, com a explicação matemática para esse floating point, do porquê, em muitas linguagens, essa soma dar exatamente esse valor.

* Não é à toa - como uma representação de decimal do inteiro é utilizada para se obter um ponto flutuante, fica complicado fazer uma operação aritmética deste tipo e guardar o resultado internamente. Por isto, o Java, como muitas outras linguagens, segue a especificação IEEE 754, de leitura complexa, que remete à Engenharia. De qualquer forma, é normal que este resultado apareça quando utilizamos o double.

* Para lidarmos com dinheiro sem que apareçam centavos, por exemplo, usaríamos o BigDecimal, de que falaremos mais para a frente. Por ora continuaremos com o double pois ainda estamos iniciando na linguagem, e queremos usar variáveis que são palavras chave do Java.

* Os quatro tipos de tipo primitivo são: int, long, byte e short. Quanto aos tipos flutuantes, além do double, há o float e, se tentarmos definir a variável como recebendo 3.14, ocorre o mesmo problema do long, mesmo se tratando de ponto flutuante.

* Para o Java, 3.14 é um double com 64bits. É um valor que cabe em um tipo flutuante com 32bits? Não, e informações podem ser perdidas. Neste caso, usa-se o casting, o que seria estranho, ou se indica que este literal, o valor 3.14, é um float, colocando-se "f" no fim:

* float pontoFlutuante = 3.14f;
* Mais uma vez, o mais importante é o enfoque no double e no int, que aparecem com muito mais frequência. E no long em alguns casos, o qual será visto em alguns exercícios.


<h2>Imprimindo texto e números</h2>

* Agora que já sabemos fazer operações com variáveis e também concatenar texto com números, use o que aprendeu para indicar todas as alternativas abaixo que mostrem o resultado "A idade de Marcos é 30!".

* R:

	* int idade = 20;
	* System.out.println("A idade de Marcos é 30!");
 
	* Opção correta! Neste caso não estamos usando a variável idade que recebe 20.

	* double idade = 30.0;
	* System.out.println("A idade de Marcos é " + (int) idade + "!");
 
	* Opção correta! Estamos fazendo o type cast no double que tem seu valor convertido para int. Desta forma não aparece a casa decimal.

	* int idade = 30;
	* System.out.println("A idade de Marcos é " + idade + "!");
 
	* Opção correta!

<h2>Para saber mais: Type Casting</h2>

* Como foi visto nos vídeos, quando tentamos colocar um valor inteiro em uma variável do tipo double o Java não mostra erro. Quando tentamos, porém, colocar um double numa variável do tipo inteiro temos um erro de compilação.

* Esta propriedade se dá porque o Java faz conversão implícita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.

* O contrário não é verdade por que existe perda de dados quando é feita a conversão. Acarretando em um "type mismatch" mostrando que esta instrução é de tipos incompatíveis.

* Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting. Veja a instrução abaixo.

* int idade = (int) 30.0;
* No caso acima, está explícito que será feito o cast de double para inteiro. Veja como funciona o cast implícito e explícito na tabela abaixo.
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

