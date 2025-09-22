# 📱 MegaSena

Um app Android simples em **Kotlin** que gera números aleatórios para apostas no estilo Mega-Sena.
Ele permite escolher a quantidade de números desejados (entre **6 e 15**) e salva a última aposta feita utilizando **SharedPreferences**.

---

## 🚀 Funcionalidades

* Sorteio de **números únicos** entre 1 e 60.
* Escolha de quantidade de números (mínimo **6**, máximo **15**).
* Exibição do resultado formatado na tela.
* Salvamento automático da **última aposta**, exibida ao abrir o app novamente.

---

## 🛠️ Tecnologias utilizadas

* **Kotlin** como linguagem principal.
* **Android Studio** para desenvolvimento.
* **View Binding** (`ActivityMainBinding`) para acessar componentes da UI.
* **SharedPreferences** para armazenamento simples de dados.

---

## 📂 Estrutura principal

* `MainActivity.kt`: contém toda a lógica de geração dos números e integração com a interface.
* `SharedPreferences`: usado para salvar e carregar a última aposta feita.
* `activity_main.xml`: layout com campo de input, botão e área de exibição do resultado.

---

## ▶️ Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/megatigrinho.git
   ```
2. Abra no **Android Studio**.
3. Compile e rode no emulador ou em um dispositivo Android físico.

---
