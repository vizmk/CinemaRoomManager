# 🎬 Cinema Room Manager (Java)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue)
![Console App](https://img.shields.io/badge/Application-Console-lightgrey)
![Educational](https://img.shields.io/badge/Project-Educational-success)
![GitHub Repo](https://img.shields.io/badge/GitHub-vizmk%2FCinemaRoomManager-black)
![Profile](https://img.shields.io/badge/Author-vizmk-blueviolet)

---

## 📖 Overview
**Cinema Room Manager** è un progetto console sviluppato in **Java** che simula la gestione di una sala cinematografica.

L’applicazione consente all’utente di:
- visualizzare la disposizione dei posti
- acquistare biglietti con controlli di validità
- consultare statistiche su vendite e incassi

Il progetto è stato realizzato come esercizio pratico per consolidare i **principi della programmazione orientata agli oggetti (OOP)** e la gestione dello stato di un sistema.

---

## 👤 Author
**Vincenzo Cavallaro**  
Studente di Ingegneria Informatica  
GitHub: https://github.com/vizmk  

---

## 🎯 Objectives
- Applicare i concetti fondamentali della programmazione OOP  
- Gestire lo stato di una sala cinema tramite strutture dati  
- Separare input utente e logica applicativa  
- Implementare controlli di validazione sull’input  
- Simulare regole di business reali (pricing e disponibilità)  

---

## 🕹️ Available Actions

Command | Description
--- | ---
Show the seats | Mostra la disposizione attuale dei posti
Buy a ticket | Acquista un biglietto selezionando riga e posto
Statistics | Visualizza statistiche di vendita
Exit | Termina il programma

---

## 🎟️ Seat Representation

Symbol | Meaning
--- | ---
`S` | Seat available
`B` | Seat booked

La sala è gestita internamente tramite una matrice `char[][]`.

---

## 💰 Ticket Pricing Logic
Le regole di prezzo implementate sono:

- **Sale con ≤ 60 posti**
  - tutti i biglietti costano **$10**
- **Sale con > 60 posti**
  - prime `rows / 2` righe → **$10**
  - righe restanti → **$8**

Il prezzo viene calcolato dinamicamente in base alla riga selezionata.

---

## ✅ Input Validation
Durante l’operazione **Buy a ticket**:

- Coordinate fuori dai limiti  
  → `Wrong input!`
- Posto già acquistato  
  → `That ticket has already been purchased!`
- Posto valido  
  → stampa del prezzo e conferma dell’acquisto  

L’utente è costretto a reinserire le coordinate finché non seleziona un posto valido.

---

## 📊 Statistics
La sezione **Statistics** mostra:
- Number of purchased tickets
- Percentage of occupied seats (con 2 cifre decimali)
- Current income
- Total income (incasso massimo teorico)

---

## 🧱 Project Structure

src/
└─ cinema/
├── Cinema.java // Menu, input utente e flusso principale
└── Logic.java // Stato sala, controlli, prezzi e statistiche



### Cinema.java
- Contiene il metodo `main`
- Gestisce il menu testuale
- Legge l’input utente tramite `Scanner`
- Delega la logica alla classe `Logic`

### Logic.java
- Gestisce lo stato della sala
- Controlla validità e disponibilità dei posti
- Calcola prezzi e incassi
- Fornisce statistiche aggregate

---

## 🧠 Concepts Applied
- Object-Oriented Programming (OOP)
- Encapsulation
- State management
- Input validation
- Separation of concerns
- Control flow (`switch`, `loops`)

---

## ▶️ How to Run

```bash
javac -d out src/cinema/*.java
java -cp out cinema.Cinema
In alternativa, eseguire direttamente da IntelliJ IDEA lanciando Cinema.main().

🚀 Possible Extensions
Persistenza dello stato su file

Supporto a più sale cinematografiche

Sconti e categorie di biglietti

Interfaccia grafica (JavaFX / Swing)

Test automatici

📌 Notes
Progetto didattico orientato alla pratica, focalizzato sulla gestione dello stato, sulla validazione dell’input e sulla separazione delle responsabilità.


