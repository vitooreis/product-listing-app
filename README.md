#  Sistema de Cadastro e Listagem de Produtos

Este projeto foi desenvolvido para criar uma aplicação funcional de cadastro e listagem de produtos, combinando eficiência, organização e uma interface gráfica intuitiva.

🔹 Permite o registro detalhado de produtos, incluindo nome, descrição, preço e disponibilidade.
🔹 Exibe a listagem ordenada dos produtos por valor, facilitando a visualização.
🔹 Construído seguindo princípios de POO e Clean Code, garantindo código limpo, reutilizável e de fácil manutenção.

## 📌 Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

**Linguagem:** Java

**Interface Gráfica:** Swing + WindowBuilder

**Paradigma:** Programação Orientada a Objetos (POO)

**Boas Práticas:** Clean Code


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

Durante o desenvolvimento, alguns desafios foram encontrados:

❌ Atualização dinâmica da interface: Ajustar a listagem em tempo real exigiu melhorias na manipulação dos componentes Swing.
❌ Validação dos dados: Garantir que os campos fossem preenchidos corretamente e evitar registros inválidos exigiu a implementação de verificações robustas.
❌ Melhoria na experiência do usuário: Refinar a interface para torná-la mais intuitiva e responsiva exigiu ajustes no layout.


## ⏭️ Próximos passos

🚀 Melhorar a interface gráfica, tornando-a mais moderna e responsiva.
🚀 Implementar persistência de dados, permitindo que os produtos sejam armazenados permanentemente.
🚀 Adicionar filtros e pesquisa, para facilitar a busca por produtos específicos.











