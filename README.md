# LeiloesTDSat
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

Sistema simples de gerenciamento de produtos para leilões, desenvolvido em **Java** com integração a **MySQL**.

Este projeto foi criado com fins educacionais para prática de **programação Java**, **banco de dados** e **versionamento com Git e GitHub**.

---

## 📌 Sobre o Projeto

O **LeiloesTDSat** é uma aplicação desktop que permite gerenciar produtos em um sistema de leilões.

O sistema possibilita:

* Cadastrar produtos
* Listar produtos cadastrados
* Registrar vendas de produtos
* Visualizar produtos vendidos

Durante o desenvolvimento foram aplicados conceitos importantes como:

* Programação orientada a objetos
* Padrão **DAO (Data Access Object)**
* Integração com banco de dados
* Versionamento com **Git**
* Uso de **branches** para desenvolvimento

---

## 🚀 Funcionalidades

Atualmente o sistema possui as seguintes funcionalidades:

* 📦 Cadastro de produtos
* 📋 Listagem de produtos
* 💰 Registro de venda de produtos
* 📊 Listagem de produtos vendidos
* 🔗 Conexão com banco de dados MySQL

---

## 🛠 Tecnologias Utilizadas

* **Java**
* **Java Swing**
* **MySQL**
* **JDBC**
* **Git**
* **GitHub**

---

## 🗂 Estrutura do Projeto

```text
src/
 ├── cadastroVIEW.java
 ├── listagemVIEW.java
 ├── vendasVIEW.java
 ├── ProdutosDAO.java
 └── conectaDAO.java
```

**Descrição dos principais arquivos:**

* `cadastroVIEW.java` → Tela de cadastro de produtos
* `listagemVIEW.java` → Tela de listagem de produtos
* `vendasVIEW.java` → Tela de visualização de produtos vendidos
* `ProdutosDAO.java` → Classe responsável pelas operações no banco de dados
* `conectaDAO.java` → Classe responsável pela conexão com o banco

---

## 🗄 Banco de Dados

O sistema utiliza **MySQL** para armazenamento das informações.

Exemplo de estrutura da tabela de produtos:

| Campo  | Descrição                                  |
| ------ | ------------------------------------------ |
| id     | Identificador do produto                   |
| nome   | Nome do produto                            |
| valor  | Valor do produto                           |
| status | Situação do produto (Disponível / Vendido) |

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/Cipheri1/LeiloesTDSat.git
```

### 2️⃣ Abrir o projeto

Abra o projeto em uma IDE Java como:

* NetBeans
* IntelliJ
* Eclipse

### 3️⃣ Criar o banco de dados

Execute o **script SQL** presente no projeto para criar o banco de dados.

### 4️⃣ Configurar conexão

Configure as credenciais do banco na classe de conexão (`conectaDAO.java`).

### 5️⃣ Executar o projeto

Execute a classe principal do sistema.

---

## 📚 Objetivo Educacional

Este projeto foi desenvolvido para praticar:

* Desenvolvimento de aplicações em **Java**
* Integração com **MySQL**
* Organização de código utilizando **DAO**
* Uso de **Git e GitHub** para controle de versão

---

## 👨‍💻 Autor

**Matheus Paim Calheiros**

Estudante de **Análise e Desenvolvimento de Sistemas**
