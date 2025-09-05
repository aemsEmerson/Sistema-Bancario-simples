

# 🏦 Sistema Bancário em Java

Um projetinho simples em **Java puro**, feito para praticar conceitos de **Programação Orientada a Objetos (POO)** como:  
- Encapsulamento  
- Sobrecarga de construtores  
- Métodos de negócio (`deposito`, `saque`)  
- `toString` customizado  

O programa simula a criação de uma conta bancária, permitindo **cadastro, depósito e saque** com uma taxa fixa de R$ 5,00 por operação de saque.

---

## 🚀 Funcionalidades
✔️ Criar conta com ou sem depósito inicial  
✔️ Realizar depósitos  
✔️ Realizar saques (com taxa de R$ 5,00)  
✔️ Exibir os dados atualizados da conta  

---

## 📂 Estrutura do Projeto
Bancario/\
├── src/\
│   ├── Conta.java         # Classe que representa a conta bancária\
│   └── Application.java   # Classe principal (executável)

---

## 💻 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/aemsEmerson/Sistema-Bancario-simples.git

2. Entre no diretório do Projeto:
   ```bash
   cd sistema-bancario/src

4. Compile os arquivos:
   ```bash
   javac Conta.java Application.java

6. Execute o programa:
   ```bash
   java Application

🖥️ Exemplo de uso

      Digite o Numero da conta: 1212
      Digite o nome do Cliente: Antonio Silva
      Deseja fazer um deposito inicial? (s/n): s
      Digite o valor do deposito: 20000
      
      Dados da Conta:
      Conta: 1212, Nome: Antonio Silva, Saldo: R$20000.00
      
      Digite um valor para fazer um deposito: 5
      Atualizando...
      Conta: 1212, Nome: Antonio Silva, Saldo: R$20005.00
      
      Agora faça um saque: 30000
      Atualizando...
      Saldo insuficiente ou valor inválido.
      
      Conta: 1212, Nome: Antonio Silva, Saldo: R$20005.00

⸻

📚 Aprendizados

Este projeto foi desenvolvido para reforçar:\
	•	Criação de classes em Java\
	•	Encapsulamento de atributos\
	•	Uso de construtores sobrecarregados\
	•	Operações básicas de entrada e saída

⸻

📄 Licença

Este projeto é apenas para estudo e prática, sem fins comerciais.\
Sinta-se à vontade para clonar, usar e melhorar! 🚀
