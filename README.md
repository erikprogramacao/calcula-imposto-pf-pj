# 🏛️ Calculadora de Imposto (Exercício de POO)

Criei este projeto em Java para colocar em prática alguns conceitos fundamentais de Programação Orientada a Objetos que eu estava estudando, como herança, classes abstratas e polimorfismo.

O objetivo do programa é ler os dados de vários contribuintes (que podem ser pessoas físicas ou empresas), calcular o imposto de cada um baseado em regras específicas e, no final, mostrar o relatório com o total arrecadado.

---

## 🛠️ O que apliquei no código

* **Classes Abstratas:** Usei para criar a base comum dos contribuintes (`Contribuinte`), servindo apenas como um molde para as outras classes.
* **Polimorfismo:** Criei uma lista única que aceita tanto pessoa física quanto jurídica, deixando o código limpo e dinâmico na hora de rodar os cálculos.
* **Herança:** Para reaproveitar atributos como nome e renda anual de forma inteligente, sem precisar repetir código.

---

## 📊 Regras de negócio do sistema

* **Pessoa Física:** Se a renda for menor que 20k, paga 15% de imposto. Se for maior ou igual, paga 25%. Se tiver gastos com saúde, metade desse valor é abatido no imposto final.
* **Pessoa Jurídica (Empresa):** Se a empresa tiver até 10 funcionários, paga 16%. Se tiver mais de 10, a taxa cai para 14%.

---
Feito com ☕ por [Erik](https://github.com)
