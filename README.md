#  Sistema de Cadastro e Listagem de Produtos

Este projeto consiste em uma aplicação desktop desenvolvida em Java, que permite o cadastro e gerenciamento de produtos de forma intuitiva e eficiente. O sistema oferece uma interface gráfica amigável, construída com Swing, permitindo que o usuário cadastre, visualize e organize produtos de maneira prática.

## 📌 Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

**Java** - Linguagem principal do projeto.

**Swing + WindowBuilder** - Para criação da interface gráfica.

**Programação Orientada a Objetos (POO)** - Para estruturação do código.

**Clean Code** - Para garantir código limpo e de fácil manutenção.


## ✅ Como rodar o projeto

Opção 1: Usando uma IDE (Recomendado)

1. Clone o repositório para sua máquina:
   ```bash
   git clone https://github.com/vitooreis/product-listing-app.git
   ```
2. Abra o projeto em sua IDE favorita (VS Code, IntelliJ, Eclipse, etc.).
3. Execute a classe principal → Agenda.java.


Opção 2: Pelo terminal (sem IDE)
Se preferir rodar sem uma IDE, siga estes passos:
```bash
git clone https://github.com/vitooreis/product-listing-app.git
cd agenda-contatos
mkdir -p bin  
javac -d bin -sourcepath src src/application/Main.java  
java -cp bin application.Main
```


## ⚠️ Problemas enfrentados

Problema: Atualização dinâmica da interface.

Descrição: Ajustar a listagem de produtos em tempo real exigiu melhorias na manipulação dos componentes Swing.

Solução: Implementação de um modelo de dados para atualizar a interface conforme novas entradas.

---

Problema: Validação dos dados inseridos.

Descrição: Foi necessário garantir que o usuário preencha corretamente os campos, evitando registros inválidos como preços negativos.

Solução: Implementação de verificações de entrada antes de permitir o cadastro.


## ⏭️ Próximos passos

Os próximos passos para evoluir este projeto incluem:

- Melhoria na interface gráfica, tornando-a mais moderna e responsiva.
- Adição de filtros e pesquisa para facilitar a busca por produtos específicos.










