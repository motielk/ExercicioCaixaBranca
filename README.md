# Exercicio Caixa Branca
<h2>Erros no Codígo</h2>
<ol>
  <li>Carregamento incorreto do driver JDBC: "com.mysql.Driver.Manager" deve ser substituído por "com.mysql.jdbc.Driver".</li>
  <li>Concatenação inadequada de strings SQL: faltam espaços entre as cláusulas SQL.</li>
  <li>Gerenciamento inadequado de recursos: os recursos como Connection, Statement e ResultSet não estão sendo fechados corretamente após o uso.</li>
  <li>Tratamento vazio de exceções: as exceções capturadas não estão sendo tratadas ou registradas de forma adequada.</li>
</ol>
