# Exercicio Caixa Branca
<h2>Descrição</h2>
<p>
  O código fornecido é uma classe Java chamada TesteCaixaBranca, que tem o objetivo de verificar um usuário em um banco de dados utilizando JDBC (Java Database Connectivity) para se conectar a um banco de dados MySQL
</p>
<h2>Tecnologias Usada</h2>
<ol>
  <li> <strong>Java:</strong> A linguagem de programação utilizada para escrever o código. Java é uma linguagem orientada a objetos amplamente utilizada para o desenvolvimento de aplicativos em diversas plataformas. </li>
  <li><strong>MySQL: </strong>Um sistema de gerenciamento de banco de dados relacional de código aberto amplamente utilizado. O código se conecta a um banco de dados MySQL localmente hospedado (127.0.0.1) e realiza uma consulta para verificar um usuário com um determinado login e senha.</li>
  <li><strong>DriverManager: </strong> Uma classe em JDBC que gerencia uma lista de drivers de banco de dados. É utilizada para carregar e selecionar o driver JDBC apropriado para a conexão com o banco de dados.</li>
</ol>
<h2>Erros no Codígo</h2>
<ol>
  <li><strong>Carregamento incorreto do driver JDBC: </strong> "com.mysql.Driver.Manager" deve ser substituído por "com.mysql.jdbc.Driver".</li>
  <li><strong>Concatenação inadequada de strings SQL: </strong> faltam espaços entre as cláusulas SQL.</li>
  <li><strong>Gerenciamento inadequado de recursos: </strong> os recursos como Connection, Statement e ResultSet não estão sendo fechados corretamente após o uso.</li>
  <li><strong>Tratamento vazio de exceções: </strong> as exceções capturadas não estão sendo tratadas ou registradas de forma adequada.</li>
</ol>
<h2>Planilha de Teste Estático</h2>

![TesteEstatico](https://github.com/motielk/ExercicioCaixaBranca/assets/49123696/e03cd69d-4ad9-41b1-8f54-54896b66c831)
