# 🐾 PetMachine - Simulador de Máquina de Lavar Pets

![Linguagem](https://img.shields.io/badge/Linguagem-Java-blue.svg)

## 📄 Sobre o Projeto

PetMachine é um simples projeto de console em Java, criado para praticar e demonstrar conceitos de **Programação Orientada a Objetos (POO)**.

O programa simula uma máquina de lavar pets, onde o usuário pode gerenciar recursos (água, shampoo), adicionar e remover pets, e executar a lavagem, tudo através de um menu interativo.

Exercício é parte do **Bootcamp DIO em parceria com NTT Data**. 

---

## ✨ Funcionalidades

* 🔹 **Dar Banho:** Lava o pet que está na máquina, consumindo água e shampoo e alterando seu estado para "limpo".
* 🔹 **Abastecer:** Permite reabastecer os níveis de água e shampoo da máquina até sua capacidade máxima.
* 🔹 **Gerenciar Pet:** Adiciona um pet à máquina (somente se ela estiver limpa e vazia) e o remove após o uso.
* 🔹 **Manutenção:** Realiza a limpeza da própria máquina, consumindo recursos.
* 🔹 **Verificar Status:** Consulta os níveis de água e shampoo e verifica se a máquina está ocupada por um pet.

---

## 🛠️ Conceitos Praticados

* **Programação Orientada a Objetos:** Demonstração da interação entre as classes `Pet`, `PetMachine` e `Main`.
* **Encapsulamento:** Proteção dos atributos das classes com modificadores `private` e acesso controlado através de métodos.
* **Composição:** A classe `PetMachine` "tem um" (`has-a`) objeto `Pet`, representando uma relação fundamental da POO.
* **Lógica de Estado:** Gerenciamento do estado da máquina (limpa/suja, níveis de insumos, pet presente/ausente) e do pet (limpo/sujo).
* **Interação com Usuário:** Uso da classe `Scanner` para criar um menu de console funcional e interativo.

---

## 🚀 Como Executar

1.  **Pré-requisito:** É necessário ter o **JDK (Java Development Kit) 11 ou superior** instalado.
2.  **Clone o repositório:**
    ```bash
    git clone https://github.com/beka-szk/exercicio-3-classes-e-encapsulamento
    ```
3.  **Abra em uma IDE:** Importe o projeto na sua IDE Java de preferência (IntelliJ, Eclipse, VS Code).
4.  **Execute:** Encontre o arquivo `Main.java` e execute o método `main`. Siga as instruções no console.

---

## ✒️ Autora

Feito por **[Seu Nome Aqui]**

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/beka-szk/)
