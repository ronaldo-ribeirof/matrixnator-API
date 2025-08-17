# Matrixnator: A Simple Java Matrix Printing API

[![Licença: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Uma biblioteca Java simples e leve para imprimir matrizes de forma elegante e formatada no console. O objetivo do **Matrixnator** é fornecer uma API reutilizável e DRY (Don't Repeat Yourself) para visualizar dados de matrizes de forma clara, ajudando no desenvolvimento e depuração de aplicações que lidam com estruturas de dados bidimensionais.

---

### Funcionalidades 🚀

-   **Impressão de Matrizes:** Suporte nativo para matrizes de `float`, `double` e `int`.
-   **Alinhamento Centralizado:** Todos os valores são automaticamente centralizados em suas respectivas células para uma estética profissional.
-   **Estrutura de Grade:** Utiliza caracteres Unicode para desenhar bordas e grades, fornecendo uma representação visual clara da estrutura da matriz.
-   **API Simples:** A interface da API é intuitiva e direta, consistindo em métodos estáticos que não exigem instâncias.
-   **Tratamento de Exceções:** Lida de forma robusta com matrizes nulas ou vazias, evitando `NullPointerException` e fornecendo mensagens informativas.

---

### Como Usar a API 🧑‍💻

Para usar o `Matrixnator` em seu projeto, basta incluir o arquivo JAR da biblioteca como uma dependência ou copiar a classe `Matrixnator.java` diretamente em seu projeto.

#### Adicionando como Dependência (Maven)

Se você estiver usando Maven, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>ronaldo.matrix</groupId>
    <artifactId>matrixnator</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
