# Exercicio_Exception
Exercicio Exception para Team Incubations

Exercícios Teóricos:

Diferencie: erros de compilação, erros em tempo de execução e erros lógicos.
Os erros de compilação são os erros ocasionando por erro de digitação ou mal uso da sintaxe da linguagem utilizada.
Erro em tempo de execução é quando a aplicação estoura o tempo de seu processamento, um bom exemplo é quando ocasionamos um loop infinito(While ,for etc).
Os erros lógicos são os mais difíceis de serem localizados, pois não aparecem erros de compilação ou de tempo, pois a sintaxe está correta entretanto a lógica não, vou utilizar o exemplo dado na aula, onde é feita uma função para somar, mas foi aplicado um sinal de subtração. Somente com teste de regras ou com o resultado dado que é possível a sua localização.

2. Assinale nas situações abaixo qual tipo de cenário ocorrerá dentre [erro de compilação], [erro em tempo de execução], [erro lógico] ou [sem erro]:

Realizar um cálculo de informações do usuário da forma errada.
[erro lógico]
b) Tentar acessar dados de um objeto nulo.
[erro em tempo de execução]
c) Tentar acessar uma base de dados que não existe.
[erro lógico]
d) Escrever um método com retorno do tipo int, mas retornando no corpo do método uma String.
[erro de compilação]
e) Tentar acessar o índice 0 de um array que contém apenas 1 elemento.
[erro em tempo de execução]
f) Tentar acessar um arquivo que não existe na máquina.
[erro lógico]
g) Salvar um dado do usuário inválido no banco de dados.
[erro lógico]
h) Não tratar uma exceção checada com try-catch ou não lançá-la na assinatura do método.
[erro de compilação]
i) Tentar chamar um método de outra classe que está com modificador de acesso private.
[erro de compilação]
j) Tentar fazer com que um método chame a si mesmo.
[sem erro]
3) Cite duas diferenças entre uma exceção checada e uma exceção não-checada.
A Checada é requerido o tratamento da sua exceção utilizando o try - catch, apesar de poder ser lançada uma hora ou outra deverá ser tratada com o try catch.
A não checada é quando utiliza a Classe de exceções RuntimeException, onde o seu tratamento não se torna mandatório, e a aplicação não quebra quando utilizado essa forma de trabalhar com as exceções.
--

Exercícios Práticos pra Fixação:

1. Crie uma exceção qualquer que extenda de Exception. Será uma exceção checada.

- Em algum método X, lance essa exception com "throw new SuaException()".
- Verifique que o compilador te obrigará a tratar com try-catch ou lançar na assinatura do método.
- Lance na assinatura do método X, e em um outro método Y, chame o método X.
- Verifique que o compilador novamente te obrigará a tratar a exceção checada.
- Verifique que o compilador identifica a propagação das exceções checadas até que seja tratada com try-catch.

2. Crie uma exceção qualquer que extenda de RuntimeException. Será uma exceção não-checada.

- Em algum método X, lance essa exception com "throw new SuaException()".
- Verifique que o compilador NÃO te obrigará a tratar essa exceção.
- Verifique que o compilador NÃO identifica a propagação das exceções não-checadas.

3. Crie um try-catch-finally (CENÁRIO SEM EXCEPTION)

. No TRY, coloque um print, depois uma instrução que NÃO lança exception, e depois um outro print
. No CATCH e no FINNALY, coloque um print em cada
. Verifique que o TRY e o FINNALY serão executados completamente

4. Crie um try-catch-finally (CENÁRIO COM EXCEPTION)
. No TRY, coloque um print, depois uma instrução que lança exception, e depois um outro print
. No CATCH e no FINNALY, coloque um print em cada
. Verifique que o TRY será executado apenas até a exception, e o CATCH e o FINNALY serão executados completamente

--

Exercícios Práticos no Projeto:

1. Utilize o ResponseStatusException para lançar exceção nos pontos onde a documentação solicita que retorne erros 4xx.


