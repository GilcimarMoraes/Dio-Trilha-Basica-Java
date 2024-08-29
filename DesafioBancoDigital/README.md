# Desafio Banco Digital

Este projeto é um desafio prático para reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java. O objetivo é implementar um banco digital utilizando conceitos de POO, criando um sistema que gerencie contas bancárias e permita operações como depósitos, saques, transferências e emissão de extratos.

## Objetivo

O objetivo do projeto é praticar e aprofundar os conhecimentos em Programação Orientada a Objetos em Java, através da implementação de um banco digital. Você irá criar um sistema que utiliza os pilares da orientação a objetos, como encapsulamento, herança e polimorfismo, em um contexto bancário.

## Requisitos Técnicos

- Conhecimentos básicos de Programação Orientada a Objetos em Java.
- Ambiente de desenvolvimento Java configurado.
- Acesso à internet para acesso ao projeto de referência no GitHub.
- Familiaridade com o uso de repositórios Git (opcional, mas recomendado).
- Capacidade de abstração para reproduzir a solução proposta e implementar melhorias.

## Estrutura do Projeto

O projeto é composto por diversas classes que representam o sistema bancário. As principais classes são:

- **`Conta`**: Classe base para contas bancárias, contendo atributos e métodos comuns a todas as contas, como número da conta, saldo, e extrato.

- **`ContaCorrente`**: Classe derivada de `Conta`, representando uma conta corrente. Inclui funcionalidades específicas como limite de cheque especial e a implementação de operações como transferência e saque considerando o limite de cheque especial.

- **`ContaPoupanca`**: Classe derivada de `Conta`, representando uma conta poupança. Inclui funcionalidades específicas como a aplicação da taxa de juros de 0,5% ao mês.

- **`Banco`**: Classe principal que gerencia o sistema bancário. Inclui métodos para abrir contas, depositar, sacar, transferir, emitir extratos e gerar relatórios de contas existentes.

## Funcionalidades

- **Abrir Conta Corrente**: Cria uma nova conta corrente com um limite de cheque especial definido.
- **Abrir Conta Poupança**: Cria uma nova conta poupança com uma taxa de juros aplicada mensalmente.
- **Depositar**: Adiciona um valor ao saldo de uma conta específica.
- **Sacar**: Retira um valor do saldo de uma conta, considerando o limite de cheque especial na conta corrente.
- **Transferir**: Move um valor de uma conta para outra, considerando o limite de cheque especial na conta corrente.
- **Emitir Extrato**: Mostra o histórico de transações de uma conta.
- **Emitir Relatório de Contas**: Gera um relatório com o número de contas, tipo, titular e saldo.

## Instruções de Uso

1. **Clonar o Repositório**

   Clone o repositório para o seu ambiente local:
   ```bash
   git clone https://github.com/usuario/repo-desafio-banco-digital.git
