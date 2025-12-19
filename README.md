# SistemaUsuarios

Este projeto foi desenvolvido como exercício de estudo em Java, com o objetivo de praticar **herança de classes**, **métodos comuns e específicos**, e **controle de atributos** em um sistema de usuários.

##  Objetivo
Criar uma hierarquia de classes que represente diferentes tipos de usuários de um sistema:
- **Gerente**
- **Vendedor**
- **Atendente**

Cada classe possui atributos e métodos específicos, além de herdar funcionalidades da classe base `Usuario`.

---

##  Estrutura das Classes

### Classe `Usuario`
- **Atributos**: `name`, `email`, `password`, `admin`, `logado`
- **Métodos**:
  - `realizarLogin(email, senha)`
  - `realizarLogoff()`
  - `alterarDados(novoNome, novoEmail)`
  - `alterarSenha(senhaAntiga, novaSenha)`

### Classe `Gerente` (extends `Usuario`)
- **Atributos**: herda de `Usuario`, `admin = true`
- **Métodos específicos**:
  - `gerarRelatorioFinanceiro()`
  - `consultarVendas()`

### Classe `Vendedor` (extends `Usuario`)
- **Atributos**: herda de `Usuario`, `admin = false`, `quantidadeVendas`
- **Métodos específicos**:
  - `realizarVenda()` → incrementa `quantidadeVendas`
  - `consultarVendas()`

### Classe `Atendente` (extends `Usuario`)
- **Atributos**: herda de `Usuario`, `admin = false`, `valorCaixa`
- **Métodos específicos**:
  - `receberPagamento(valor)` → soma ao `valorCaixa`
  - `fecharCaixa()` → mostra total e zera o caixa

---

##  Como executar
1. Compile as classes:
   ```bash
   javac Usuario.java Gerente.java Vendedor.java Atendente.java Main.java
2. Execute o programa:
   ```
   java Main
   ```
##  Aprendizados:
- Uso de herança para reaproveitar código.
- Diferença entre métodos comuns (na classe base) e específicos (nas subclasses).
- Controle de atributos fixos (admin = true para gerente, false para vendedor e atendente).
- Criação de um menu interativo para testar funcionalidades.
