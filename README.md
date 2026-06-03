# Harc GUI játék

**Varázsló vs Harcos** egy egyszerű Java Swing alapú nyári projektmunka.

A játékban két karakter, egy Varázsló és egy Harcos versenyez egymással. A projekt célja az objektumorientált programozás gyakorlása, valamint egy egyszerű grafikus felületű játék elkészítése NetBeans Java Ant projektben.

---

## Tartalomjegyzék

- [Projekt rövid leírása](#projekt-rövid-leírása)
- [Főbb funkciók](#főbb-funkciók)
- [Technológiák](#technológiák)
- [Tervezett package-struktúra](#tervezett-package-struktúra)
- [Főbb osztályok](#főbb-osztályok)
- [A játék működése](#a-játék-működése)
- [Grafikus felület](#grafikus-felület)
- [Projekt célja](#projekt-célja)
- [Továbbfejlesztési lehetőségek](#továbbfejlesztési-lehetőségek)
- [Készítette](#készítette)

---

## Projekt rövid leírása

A Harc GUI játék egy egyszerű, grafikus felületű Java alkalmazás, amelyben két karakter, egy **Harcos** és egy **Varázsló** kerül szembe egymással.

A játék során a karakterek dobókocka segítségével haladnak vagy eseményeket hajtanak végre. A játék célja, hogy a karakterek közötti verseny vagy harc végén eldőljön, ki lesz a győztes.

A projekt NetBeans IDE-ben, Java Ant projektként készül, a grafikus felület pedig Swing GUI Builder segítségével van kialakítva.

---

## Főbb funkciók

- **Két karakter versenyez egymással** — a Harcos és a Varázsló egymás ellen játszik.
- **Egyedül is játszható** — a játékos a program működését egyedül is ki tudja próbálni.
- **Dobókocka alapú működés** — a játék menetét véletlenszerű dobások befolyásolják.
- **Életerő kezelése** — a karakterek életereje csökkenhet a játék során.
- **Speciális képességek** — a Harcos és a Varázsló eltérő tulajdonságokkal rendelkezik.
- **Grafikus felület** — a játék Java Swing felületen keresztül használható.
- **Játékállapot megjelenítése** — a felület szövegesen mutatja az aktuális eseményeket és állapotokat.
- **Körönkénti működés** — a játék lépésenként halad előre.

---

## Technológiák

| Réteg | Technológia |
| :--- | :--- |
| Projekt típusa | Java Ant |
| Fejlesztői környezet | NetBeans IDE |
| Programozási nyelv | Java |
| Grafikus felület | Java Swing |
| Felület készítése | NetBeans Swing GUI Builder |
| Tervezés | UML osztálydiagram |

---

## Tervezett package-struktúra

```text
Source Packages
├── app
│   └── Program.java
│
└── app.modell
    ├── Jatekos.java
    ├── Harcos.java
    ├── Varazslo.java
    ├── Kocka.java
    └── JatekTer.java
```

---

## Főbb osztályok

### Program

A grafikus felületet tartalmazó osztály.

Ebben találhatóak a Swing komponensek, például:

- gombok
- feliratok
- panelek
- eseménykezelők
- felületfrissítő metódusok

A `Program` osztály feladata, hogy a felhasználó számára megjelenítse a játék állapotát, és kezelje a gombnyomásokat.

---

### Jatekos

A `Jatekos` osztály a Harcos és a Varázsló közös ősosztálya.

Ez az osztály tartalmazza azokat az adatokat és metódusokat, amelyek mindkét karakterre jellemzőek.

Főbb adattagok:

- `eletero`
- `ero`
- `aktualisMezo`

Főbb metódusok:

- `sebestKap()`
- `specialisKepesseg()`
- `isElo()`

---

### Harcos

A `Harcos` osztály a `Jatekos` osztályból származik.

A Harcos saját tulajdonsága a pajzs, amely a védekezéshez kapcsolódik. A Harcos a játék egyik fő karaktere.

Főbb adattag:

- `pajzs`

Főbb metódus:

- `specialisKepesseg()`

---

### Varazslo

A `Varazslo` osztály szintén a `Jatekos` osztályból származik.

A Varázsló saját tulajdonsága a varázserő, amely a speciális képességéhez kapcsolódik.

Főbb adattag:

- `varazsEro`

Főbb metódus:

- `specialisKepesseg()`

---

### Kocka

A `Kocka` osztály a dobásokért felelős.

A játék során véletlenszerű értéket ad vissza, amely befolyásolja a karakterek mozgását vagy az eseményeket.

Főbb metódus:

- `dobas()`

---

### JatekTer

A `JatekTer` osztály tartalmazza a játék fő logikáját.

Feladata, hogy kezelje:

- a Harcost
- a Varázslót
- a dobókockát
- az aktuális játékost
- a körök működését
- a harc logikáját

Főbb metódusok:

- `korLejatszasa()`
- `harc()`

---

## A játék működése

A játékban két karakter szerepel:

- Harcos
- Varázsló

A karakterek körönként lépnek vagy harcolnak. A dobókocka véletlenszerű értéket ad, amely hatással van a játék menetére.

A játék során a karakterek életereje csökkenhet. A játék akkor ér véget, ha az egyik karakter életereje elfogy, vagy a játék szabályai alapján valamelyik karakter győz.

---

## Grafikus felület

A grafikus felület Java Swing segítségével készül.

A felület célja, hogy a felhasználó könnyen tudja követni a játék állapotát. A GUI-ban megjelenhetnek például:

- karakterek adatai
- aktuális kör információi
- dobás eredménye
- életerő értékek
- játék végeredménye
- vezérlő gombok

A grafikus felület NetBeans Swing GUI Builder segítségével készül, ezért a komponensek nagy része kattintással, Design nézetben kerül elhelyezésre.

---

## Projekt célja

A projekt célja egy egyszerű, grafikus felületű Java játék elkészítése.

A feladat során gyakorolható:

- az objektumorientált programozás
- az öröklés
- az egységbezárás
- az osztályok közötti kapcsolat
- az UML diagram alapján történő tervezés
- a Java Swing használata
- a NetBeans GUI Builder kezelése

---

## Továbbfejlesztési lehetőségek

- **Irány választása dobás előtt** — a játékos eldönthetné, merre szeretne lépni.
- **Fogadás a győztesre** — a játék elején lehetne tippelni, hogy ki fog nyerni.
- **Scoreboard** — a játék eltárolhatná a győzelmek számát.
- **Egyedi játékosnév** — a felhasználó megadhatná a karakterek nevét.
- **Egyedi karakterkép** — a Harcoshoz és a Varázslóhoz saját kép is tartozhatna.
- **Új játék gomb** — a játék vége után újra lehetne indítani a meccset.
- **Részletesebb eseménynapló** — a program pontosabban kiírhatná, mi történt az adott körben.
- **Nehézségi szintek** — különböző játékmódok kerülhetnének bele.
- **Mentés és betöltés** — a játékállást később is lehetne folytatni.

---

## Készítette

**Huszár Fruzsina Anna**
**Horváth Levente Roland**

Nyári projektmunka
