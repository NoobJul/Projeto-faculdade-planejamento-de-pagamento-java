# Sistema de Folha de Pagamento

Projeto introdutório em Java para praticar classes, objetos, encapsulamento, herança e polimorfismo. O código usa recursos básicos de Java e não depende de bibliotecas externas. Requer JDK 17 ou superior.

## Abrir no IntelliJ IDEA

1. Extraia o arquivo ZIP, se estiver usando o pacote compactado.
2. No IntelliJ IDEA, escolha **File > Open** e selecione a pasta `folha-pagamento-java` ou o arquivo `pom.xml`.
3. Selecione um JDK 17 ou superior quando o IntelliJ solicitar.
4. Abra `src/main/java/br/com/exemplo/folha/Main.java` e clique no triângulo verde ao lado do método `main`.

O `pom.xml` só informa ao IntelliJ a versão do Java e a estrutura do projeto. Não foram adicionadas dependências.

## Classes

- `Colaborador`: classe base com matrícula, nome e salário-base. O método `calcularSalarioFinal()` retorna o salário-base.
- `ColaboradorPadrao`: herda os dados e o cálculo sem acrescentar regras.
- `ColaboradorComissionado`: calcula salário-base mais comissão sobre as vendas.
- `ColaboradorProducao`: calcula salário-base mais o valor das peças produzidas.
- `Main`: cria três objetos, coloca-os em um vetor de `Colaborador` e exibe os dados.

## Regras de cálculo

- Padrão: `salário-base`
- Comissionado: `salário-base + (total de vendas × percentual de comissão ÷ 100)`
- Produção: `salário-base + (quantidade de peças × valor por peça)`

Com os exemplos atuais, os salários finais são R$ 2.500,00, R$ 2.400,00 e R$ 2.020,00.

## Onde aparecem os conceitos de orientação a objetos

1. **Classe e objeto:** as classes descrevem os colaboradores; os comandos `new` em `Main` criam objetos.
2. **Encapsulamento:** os atributos estão como `private`; a classe base oferece métodos `get` para consultar os dados usados pelas subclasses.
3. **Herança:** as classes específicas usam `extends Colaborador` e chamam o construtor base com `super(...)`.
4. **Sobrescrita:** cada tipo que tem uma regra própria redefine `calcularSalarioFinal()` com `@Override`.
5. **Polimorfismo:** o vetor tem tipo `Colaborador`, mas guarda objetos de três classes. Ao chamar `calcularSalarioFinal()` durante a exibição, Java usa a versão correspondente ao objeto.

## Como continuar

Faça uma etapa por vez e execute o programa após cada mudança:

1. Acrescente validações simples nos construtores, por exemplo, impedindo salário-base ou quantidade de peças negativos.
2. Inclua novos colaboradores e confira os cálculos à mão.
3. Crie uma opção de menu no console para cadastrar os dados digitados pelo usuário.
4. Guarde os colaboradores em uma coleção e implemente busca pela matrícula.
5. Calcule e exiba a soma dos salários finais.

Os exemplos usam `double` para deixar as fórmulas mais diretas neste exercício. Em sistemas financeiros reais, `BigDecimal` é mais apropriado para valores monetários; pode ser uma melhoria posterior, depois de compreender os cálculos e as classes.
