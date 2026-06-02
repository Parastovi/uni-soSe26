# System Prompt — Revolut Fallstudie: Slide-Deck-Inhalt

Du baust ein vollständiges Slide-Deck zur **Fallstudie 2: Revolut und die digitale Transformation des Bankwesens** für den Kurs „Digitale Finanzwirtschaft" an der Universität Augsburg (Sommersemester 2026).

**Verwende das Design System aus dem vorherigen Artifact als Grundlage.** Alle Tokens (Farben, Typografie, Spacing, Akzent-Chrome, Footer, Logo) müssen 1:1 übernommen werden. WiWi-Türkis (#28B9D3) als Akzent, Lila (#2D1B5C) für Headlines/Logo.

## OUTPUT-FORMAT

- **Ein einziges HTML-Artifact** mit allen Folien untereinander gestapelt (jede im exakten 1280×720 px Frame).
- Standalone HTML + inline CSS + inline SVG (für Visuals). Tailwind via CDN OK.
- Jede Folie mit korrektem Chrome (Lila-Bar links, Türkis-Chevron, Titel + Hairline-Rule, UniA-Logo + "Fußzeile  |  {N}" unten).
- 23 Folien total (Title + Agenda + 20 Inhaltsfolien + Thank You).

## INHALT PRO FOLIE

Für jede der 10 Fragen werden **2 Folien** erstellt:
- **Folie A (Text):** Argumentation in strukturierter Text-/Bulletform.
- **Folie B (Visual):** Eigenständiges Diagramm/Schema (inline SVG), das die Kernaussage von Folie A visualisiert.

---

### Folie 1 — TITLE

- Layout: Cover Slide (Lila Gradient mit Wellen, weiße Card mittig-links)
- H1: **Revolut und die digitale Transformation des Bankwesens**
- H2 (Untertitel): Fallstudie 2 — Digitale Finanzwirtschaft, Sommersemester 2026
- Body-Block: 
  - Philipp Hofer
  - Universität Augsburg · Lehrstuhl für Financial Data Analytics
  - Augsburg, Mai 2026
- Bottom: 12 px türkiser Streifen

---

### Folie 2 — AGENDA

- Layout: Agenda nummeriert
- H1: **Agenda**
- 10 Punkte (01–10):
  - 01 Revolut als disruptive Innovation
  - 02 Strukturelle Schwächen traditioneller Banken & Mobile-First
  - 03 Plattformstrategie: Vom Fintech zur Super App
  - 04 Netzwerkeffekte, Daten & Automatisierung
  - 05 Nachhaltige vs. imitierbare Wettbewerbsvorteile
  - 06 Risiken der internationalen Expansion
  - 07 Regulatorische Herausforderungen
  - 08 Nachhaltigkeit des Freemium-Modells
  - 09 Strategische Optionen traditioneller Banken
  - 10 Big Tech, Banken & die Kundenschnittstelle

---

## FRAGE 1 — Revolut als disruptive Innovation

### Folie 3 — Q1 Text

- H1: **Revolut als disruptive Innovation**
- H2: Einordnung nach Christensen — Low-End- und New-Market-Disruption kombiniert
- **Lead-Absatz (Body):** Revolut erfüllt mehrere zentrale Kriterien einer disruptiven Innovation nach Christensen: Einstieg über vernachlässigte Kundensegmente, einfacheres und günstigeres Angebot, anschließendes Vordringen in höhere Marktbereiche.
- **Bullets (türkis):**
  - **Low-End-Disruption:** Adressiert preissensible Kunden mit transparenten FX-Konditionen, statt etablierte Bank-Margen zu verteidigen
  - **New-Market-Disruption:** Spricht digital-affine, mobile Zielgruppen an, die klassische Filialbanken bewusst meiden
  - **Innovator's Dilemma:** Banken konzentrieren sich auf profitable Kernkunden und übersehen das untere Segment
  - **Technologietreiber:** Cloud, APIs und Open Banking (PSD2) senken Marktzutrittsbarrieren drastisch
  - **Aufstieg im Markt:** Sukzessive Erweiterung um Trading, Krypto, Kredite und Versicherungen — Bewegung in das Premium-Segment

### Folie 4 — Q1 Visual

- H1: **Disruptions-Pfad nach Christensen**
- H2: Wie Revolut sich vom unteren Segment in den Mainstream bewegt
- **Visual (SVG):** Klassisches Christensen-Diagramm
  - X-Achse: Zeit (2015 → 2026)
  - Y-Achse: Produktleistung / Kundenanforderungen
  - **Gestrichelte Linie** (`--ink-muted`): "Kundenanforderungen — Mainstream"
  - **Gestrichelte Linie** (`--rule`): "Kundenanforderungen — anspruchsvolle Kunden"
  - **Lila Kurve** (`--unia-purple`): "Traditionelle Banken" (startet hoch, wächst langsam linear über beide Anforderungslinien)
  - **Türkise Kurve** (`--wiwi-teal`): "Revolut" (startet sehr niedrig 2015, steigt exponentiell, kreuzt 2020 die untere Anforderungslinie, nähert sich 2026 der oberen)
  - Marker auf Türkis-Kurve: 2015 "FX-Karte", 2018 "Krypto", 2020 "Aktien", 2023 "Kredite", 2026 "Super App"
  - Legende unten

---

## FRAGE 2 — Strukturelle Schwächen & Mobile-First

### Folie 5 — Q2 Text

- H1: **Strukturelle Schwächen traditioneller Banken**
- H2: Mobile-First als strategischer Hebel für asymmetrische Wettbewerbsvorteile
- **Two-Column Layout:**
  - **Linke Spalte — „Schwächen, die Revolut ausnutzt":**
    - Legacy-IT mit jahrzehntealten Kernbankensystemen
    - Hohe Fixkosten durch dichte Filialnetze
    - Langsame Innovationszyklen und komplexe Governance
    - Intransparente FX-Gebühren und versteckte Wechselkursaufschläge
    - Träge Kontoeröffnung mit Medienbruch (Filiale, Postident)
  - **Rechte Spalte — „Warum Mobile-First entscheidend war":**
    - Trifft auf Konsumentenverhalten: Smartphone als primärer Finanz-Touchpoint
    - Echtzeit-UX schafft sofortige Wahrnehmung von Mehrwert
    - Niedrige CAC durch organisches Wachstum & virales Marketing
    - Skalierung ohne physische Infrastruktur → niedrige Grenzkosten
    - Datenrückkanal in Echtzeit ermöglicht schnelle Produktiteration

### Folie 6 — Q2 Visual

- H1: **Banken vs. Revolut im direkten Vergleich**
- **Visual:** Side-by-Side Vergleichstabelle mit 6 Zeilen × 3 Spalten (Dimension | Trad. Bank | Revolut)
- Spalten-Header in `--unia-purple` bg / weiß
- Linke Spalte (Dimension) leicht eingefärbt `--wiwi-teal-30`
- Zeilen:
  | Dimension | Traditionelle Bank | Revolut |
  |---|---|---|
  | Kontoeröffnung | Tage, Filialbesuch | Minuten, App |
  | FX-Gebühr | 1.5–4 % + Spread | 0 % (in Limits) |
  | IT-Architektur | Legacy Mainframe | Cloud-native |
  | Filialnetz | Hundert(e) Filialen | Null Filialen |
  | Innovationszyklus | Quartale/Jahre | Wochen |
  | Hauptkanal | Filiale + Online | Mobile-First |

---

## FRAGE 3 — Plattformstrategie / Super App

### Folie 7 — Q3 Text

- H1: **Von der Neobank zur Super App**
- H2: Plattformlogik als zentrales Wachstumsparadigma
- **Lead-Absatz:** Revoluts Entwicklung zur Super App folgt klassischen Plattformprinzipien: Bündelung heterogener Dienste, Aktivierung von Cross-Side-Effekten und Aufbau hoher Switching Costs durch ein integriertes Erlebnis.
- **Bullets:**
  - **Mehrseitiger Markt:** Nutzer, Drittanbieter (Partnermarken bei eSIM, Reisen) und Investmentprodukt-Anbieter werden auf einer App verbunden
  - **Cross-Selling als Default:** Jede neue Funktion (Krypto, Aktien, Versicherung) erhöht den Umsatz pro bestehendem Nutzer (ARPU) ohne neuen CAC
  - **Daten als Plattform-Asset:** Transaktionsdaten ermöglichen Personalisierung, Risiko-Scoring und Robo-Advisory
  - **Lock-in-Effekte:** Multi-Currency-Wallet, gespeicherte Karten, Verlauf, Steuerexporte erschweren den Wechsel
  - **Erweiterung Finanz → Lifestyle:** eSIM, Reisen, Stays — Annäherung an asiatische Vorbilder (WeChat, Alipay)

### Folie 8 — Q3 Visual

- H1: **Das Revolut-Ökosystem**
- **Visual:** Konzentrisches Hub-and-Spoke-Diagramm
  - Zentrum: Lila Kreis mit "Revolut Super App" (weiß)
  - Innerer Ring (`--wiwi-teal`): Kernbanking — Konto, Karte, P2P, FX
  - Mittlerer Ring (`--wiwi-teal-60`): Wealth — Aktien, Krypto, Sparen, Robo-Advisor
  - Äußerer Ring (`--wiwi-teal-30`): Lifestyle — eSIM, Reisen, Versicherung, Kredite
  - Außen: Datenpfeile, die zwischen den Ringen zirkulieren (zeigen Cross-Selling / Datenfluss)
  - Kleine Pfeile (`--ink-muted`) zwischen Ringen mit Beschriftung "Cross-Sell", "Datenfluss"

---

## FRAGE 4 — Netzwerkeffekte & Datengetriebene Prozesse

### Folie 9 — Q4 Text

- H1: **Netzwerkeffekte und datengetriebene Skalierung**
- H2: Wie Revolut Wachstum bei nahezu konstanten Grenzkosten erreicht
- **Two-Column:**
  - **Linke Spalte — „Netzwerkeffekte":**
    - **Direkte Effekte:** P2P-Zahlungen, Splitting, "Revolut-zu-Revolut" sofort & gebührenfrei
    - **Indirekte Effekte:** Mehr Nutzer → attraktiver für Partner (eSIM, Versicherer, Broker)
    - **Empfehlungsprogramme:** Virales Wachstum durch Ambassador-Modelle, gebrandete Referral-Links
    - **Soziale Layer:** Geteilte Konten, Gruppensparen, Family-Accounts
  - **Rechte Spalte — „Datengetriebene Skalierung":**
    - **Automatisiertes Onboarding:** Vollständig digitales KYC mit OCR & Liveness-Check
    - **ML-gestützte Risikoprüfung:** Echtzeit-AML/Fraud-Detection mit Transaktionsmustern
    - **Personalisierte Cross-Sell-Trigger:** Datenbasierte Produktvorschläge in der App
    - **Niedrige Grenzkosten:** Skalierung ohne Vertriebs- oder Filialstrukturen

### Folie 10 — Q4 Visual

- H1: **Der Wachstums-Flywheel**
- **Visual:** Kreisförmiges Flywheel-Diagramm (4 Stationen, im Uhrzeigersinn)
  - Position oben: "Mehr Nutzer" (`--wiwi-teal` bg)
  - Position rechts: "Mehr Daten & Transaktionen" (`--wiwi-teal-60`)
  - Position unten: "Bessere Personalisierung & Produkte" (`--wiwi-teal-30`)
  - Position links: "Höhere Bindung & Empfehlungen" (`--bg-card`)
  - Pfeile zwischen den Stationen mit kurzen Labels: "Aktivierung", "Insights", "Cross-Sell", "Virales Wachstum"
  - Im Zentrum: Lila Kreis mit "Flywheel"

---

## FRAGE 5 — Wettbewerbsvorteile

### Folie 11 — Q5 Text

- H1: **Nachhaltige vs. imitierbare Wettbewerbsvorteile**
- H2: Wo Revolut verteidigbar ist — und wo Banken weiter punkten
- **Three-Column (kompakter):**
  - **Spalte 1: Nachhaltig (Revolut)**
    - Globale Lizenz- & Cloud-Skalierung
    - Datenvorsprung durch Frequenz
    - UX-DNA: Schnelligkeit der Iteration
    - Marke bei jungen, mobilen Zielgruppen
  - **Spalte 2: Leicht imitierbar (Revolut)**
    - Einzelne Features (Krypto, Aktien, eSIM)
    - Visuelles App-Design
    - Freemium-Tarifstruktur
    - Cashback- und Bonus-Mechaniken
  - **Spalte 3: Bleibende Stärken (Banken)**
    - Vertrauen, Einlagensicherung & jahrzehntelange Brand Equity
    - Regulatorische Reife & Compliance-Erfahrung
    - Komplexe Produkte: Hypothek, Firmenkredit, M&A
    - Bestehende Beziehung zu älteren, vermögenden Kunden

### Folie 12 — Q5 Visual

- H1: **Wettbewerbsvorteile-Matrix**
- **Visual:** 2×2-Matrix
  - X-Achse: "Imitierbarkeit" (links: schwer, rechts: leicht)
  - Y-Achse: "Strategischer Wert" (unten: niedrig, oben: hoch)
  - Quadrant oben-links (hoch & schwer imitierbar — "Burggraben"): Daten/Skalierung, Brand bei jungen Nutzern, UX-Iterationsgeschwindigkeit
  - Quadrant oben-rechts: Premium-Tarife, Cashback-Programme
  - Quadrant unten-links: Lizenz-Patchwork, Cloud-Infrastruktur
  - Quadrant unten-rechts: Einzelne App-Features, Visuelles Design
  - Quadranten farblich: oben-links `--wiwi-teal`, oben-rechts `--wiwi-teal-60`, unten-links `--wiwi-teal-30`, unten-rechts `--bg-card`
  - Punkte für Banken-Stärken am oberen Rand markieren (Lila Punkte): Vertrauen, Komplexe Produkte, Reg-Erfahrung

---

## FRAGE 6 — Risiken Internationale Expansion

### Folie 13 — Q6 Text

- H1: **Risiken aggressiver internationaler Expansion**
- H2: Vier Risikoschichten gleichzeitig
- **Four-Block (2×2):**
  - **Block 1 — Regulatorisch:** Lizenzanforderungen variieren stark zwischen Jurisdiktionen (EU, UK, USA, APAC). Lokale Aufsichten verlangen eigene Compliance-Strukturen.
  - **Block 2 — Operativ:** Komplexität in lokalem Zahlungsverkehr, Sprachen, Kundensupport, Lokalisierung der Produkte (z.B. lokale Steuermodelle).
  - **Block 3 — Wettbewerblich:** Starke lokale Player (N26 in DE, Monzo in UK, Nubank in LATAM) — der First-Mover-Vorteil entfällt regional.
  - **Block 4 — Reputations- & Compliance-Risiken:** AML-Vorfälle in einem Markt können globale Lizenzen gefährden (Bsp. britische Banklizenz-Verzögerungen).

### Folie 14 — Q6 Visual

- H1: **Geografische Risiko-Heatmap**
- **Visual:** Vereinfachte Weltkarten-Darstellung als horizontale Gruppierung in Bändern (kein echtes Kartenmaterial — stilisiertes Diagramm)
  - 4 Regionsbänder (Europa, UK, Nordamerika, APAC)
  - Pro Region 3 Risiko-Dimensionen als Punkte: Regulatorisch | Wettbewerb | Operativ
  - Farbcodierung: `--wiwi-teal-30` = niedrig, `--wiwi-teal` = mittel, `--unia-purple` = hoch
  - Beispiel-Bewertung:
    - EU: niedrig/mittel/niedrig
    - UK: mittel/hoch/mittel
    - USA: hoch/hoch/hoch
    - APAC: hoch/mittel/hoch
  - Legende unten

---

## FRAGE 7 — Regulatorische Herausforderungen

### Folie 15 — Q7 Text

- H1: **Regulatorische Herausforderungen für Fintech-Plattformen**
- H2: Wachsende Komplexität entlang des gesamten Produkt-Stacks
- **Lead-Absatz:** Fintech-Plattformen unterliegen einem stetig wachsenden Regulierungs-Korridor, der weit über klassische Bankaufsicht hinausgeht und mehrere überlappende EU-Rahmenwerke umfasst.
- **Bullets:**
  - **Banklizenz vs. E-Money:** Unterschiedliche Erlaubnistypen mit erheblichen Kapital- & Berichtsanforderungen
  - **AML/KYC:** Verschärfte Anforderungen an Echtzeit-Geldwäscheprävention; Plattformen wachsen oft schneller als Kontrollmechanismen
  - **DSGVO & Datenethik:** Datenschutz wird zum Differenzierungs- und Risikofaktor
  - **DORA (Digital Operational Resilience Act):** Verpflichtende IT-Resilienz, Drittanbieter-Management, Vorfallsmeldungen
  - **MiCA:** Erstmals harmonisierter EU-Rahmen für Krypto-Dienstleistungen
  - **PSD2 / PSD3:** Open Banking Schnittstellen, strenge Authentifizierungs-Standards (SCA)

### Folie 16 — Q7 Visual

- H1: **Regulatorischer Stack**
- **Visual:** Vertikaler Stack (4 horizontale Layer) — von unten nach oben:
  - Layer 1 (Boden, `--unia-purple`): "Lizenzierung — Banklizenz / EMI" (weiß text)
  - Layer 2 (`--wiwi-teal`): "Risiko & Compliance — AML, KYC, Sanktionen" 
  - Layer 3 (`--wiwi-teal-60`): "IT & Daten — DSGVO, DORA, Cybersecurity"
  - Layer 4 (oben, `--wiwi-teal-30`): "Produktspezifisch — MiCA (Krypto), PSD2/3 (Payments), MiFID (Securities)"
  - Rechts daneben kleine Icons/Marker pro Layer (einfache SVG-Shapes)
  - Über dem Stack: Beschriftung „Wachsende regulatorische Tiefe"

---

## FRAGE 8 — Freemium-Modell

### Folie 17 — Q8 Text

- H1: **Ist das Freemium-Modell langfristig nachhaltig?**
- H2: Nachhaltigkeit hängt am Zusammenspiel aus Conversion, Cross-Sell und Kostendisziplin
- **Plus/Minus-Layout (zwei Boxen):**
  - **+ Box — Argumente für Nachhaltigkeit:**
    - Niedrige CAC durch organisches Wachstum & Empfehlungen
    - Funnel: Free → Plus/Premium → Metal verlängert ARPU-Hebel
    - Hohe Querverkaufsrate (Krypto, Trading, Versicherung) finanziert Free-Kosten
    - B2B-Sparte (Revolut Business) verbreitert das Umsatzfundament
  - **− Box — Argumente dagegen:**
    - Conversion zu zahlenden Plänen bleibt strukturell niedrig (oft <10%)
    - Free-Nutzer verursachen reale Kosten (Compliance, Karten, Support)
    - Steigende regulatorische & Compliance-Kosten skalieren mit Nutzerzahl
    - Premium-Features sind imitierbar — Preisdruck durch Wettbewerb (N26, Monzo, Banken-Apps)
  - **Fazit-Zeile unten (volle Breite, türkises Band mit weißem Text):** „Nachhaltig nur bei gleichzeitigem Wachstum von Premium-Conversion, Cross-Sell und B2B-Sparte."

### Folie 18 — Q8 Visual

- H1: **Freemium-Funnel und Monetarisierung**
- **Visual:** Klassischer Funnel (4 Stufen) + Begleit-Tabelle rechts
  - Funnel (links, türkis abgestuft, breit oben → schmal unten):
    - Stufe 1 (`--wiwi-teal-30`): "Free-Nutzer — ~90%"
    - Stufe 2 (`--wiwi-teal-60`): "Plus — ~6%"
    - Stufe 3 (`--wiwi-teal`): "Premium — ~3%"
    - Stufe 4 (`--unia-purple`, weißer Text): "Metal/Ultra — ~1%"
  - Rechts daneben kleines Diagramm: Umsatzquellen als horizontale Balken
    - Interchange Fees
    - Premium-Abos
    - FX-Gebühren über Limit
    - Trading- & Krypto-Gebühren
    - Zinserträge / Kredite
  - Hinweis unten: „Beispielhafte Verteilung — illustrativ"

---

## FRAGE 9 — Strategische Optionen Banken

### Folie 19 — Q9 Text

- H1: **Strategische Optionen für traditionelle Banken**
- H2: Drei Pfade — mit jeweils eigenem Risiko- und Geschwindigkeitsprofil
- **Speech-Bubble-Boxes (3-fach):**
  - **Box 1 — Plattformaufbau (eigene Neobank/Mobile-App)**
    - Pro: Volle Kontrolle, Datenhoheit, Markenstärkung
    - Contra: Sehr lange Time-to-Market, hohe Investitionen, kulturelle Hürden
    - Beispiele: DKB, ING-DiBa, Comdirect
  - **Box 2 — Kooperation (Banking-as-a-Service, Partnerschaften)**
    - Pro: Schnelle Time-to-Market, komplementäre Stärken nutzen, geringere CapEx
    - Contra: Geteilte Marge, Abhängigkeit von Partnern, schwächere Markenkontrolle
    - Beispiele: Solaris, BBVA-API-Plattformen
  - **Box 3 — Übernahme (M&A von Fintechs)**
    - Pro: Sofortiger Tech- und Talent-Erwerb, etablierte Nutzerbasis
    - Contra: Hohe Bewertungen, Integrationsrisiko, Brain-Drain
    - Beispiele: BBVA-Atom (UK), gescheitert: JPMorgan-Frank

### Folie 20 — Q9 Visual

- **Layout:** Image+Text-Variante mit eigenem Visual links — also vollflächiges Diagramm im Stil einer Trade-off-Karte
- H1: **Optionen im Trade-off-Vergleich**
- **Visual:** 2-dimensionales Achsendiagramm
  - X-Achse: "Time-to-Market" (links: lang, rechts: kurz)
  - Y-Achse: "Strategische Kontrolle" (unten: niedrig, oben: hoch)
  - Drei Bubbles platzieren:
    - **Plattformaufbau**: oben-links (hohe Kontrolle, lange TTM) — Bubble in `--unia-purple`
    - **Kooperation**: Mitte-rechts (mittlere Kontrolle, kurze TTM) — Bubble in `--wiwi-teal`
    - **Übernahme**: oben-rechts (hohe Kontrolle, mittlere TTM) — Bubble in `--wiwi-teal-60`
  - Bubble-Größe = Investitionsaufwand (Plattformaufbau & Übernahme groß, Kooperation klein)
  - Kurze Labels in jeder Bubble: Pro-/Contra-Stichworte (1–2 pro Bubble)

---

## FRAGE 10 — Big Tech & Kundenschnittstelle

### Folie 21 — Q10 Text

- H1: **Big Tech und die Kundenschnittstelle**
- H2: Konvergenz statt Verdrängung — eine geschichtete Marktstruktur entsteht
- **Two-Column:**
  - **Linke Spalte — „Big-Tech-Effekte auf den Bankensektor":**
    - **Apple Pay / Google Pay:** Kontrolle des Bezahl-Frontends auf dem Gerät
    - **Apple Savings (mit Goldman):** Direkter Einstieg in Einlagengeschäft
    - **Amazon Lending:** Embedded Finance für Marketplace-Verkäufer
    - **Vorteile:** Massive Distribution, Identitäts-Layer, Trust, Datenökosystem
    - **Risiko für Banken:** Reduzierung auf reines Infrastruktur-Backend
  - **Rechte Spalte — „Wer kontrolliert die Kundenschnittstelle?":**
    - **Konvergenz-These:** Reine „Pure Plays" werden seltener — Fintechs werden zu Banken (Trade Republic, Scalable mit Banklizenz; Revolut mit UK-Banklizenz 2024), Banken werden digitaler
    - **Schichten-Modell:** Banken kontrollieren regulierte Infrastruktur und komplexe Produkte; Plattformen kontrollieren das Erlebnis; Big Tech kontrolliert Identitäts- und Wallet-Layer
    - **Eigene Position:** Langfristig kein einzelner Gewinner — **mehrere Akteure teilen unterschiedliche Schichten**. Die entscheidende Frage ist nicht "wer", sondern "welche Schicht"

### Folie 22 — Q10 Visual

- H1: **Geschichtete Marktstruktur — Finanzdienstleistungen 2030+**
- **Visual:** Horizontaler Layer-Stack (5 Schichten, von unten nach oben)
  - **Layer 1 (unten, `--unia-purple`):** Infrastruktur & Lizenz — "Traditionelle Banken: Bilanz, Einlagensicherung, Settlement, Compliance"
  - **Layer 2 (`--wiwi-teal`):** Produktebene — "Banken + Fintechs: Konto, Karten, Kredit, Anlage"
  - **Layer 3 (`--wiwi-teal-60`):** Plattform & Erlebnis — "Fintechs / Neobanken: Super-App-Erlebnis, Personalisierung"
  - **Layer 4 (`--wiwi-teal-30`):** Wallet & Identität — "Big Tech: Apple/Google Pay, Wallet, biometrische Identität"
  - **Layer 5 (oben, `--bg-card` mit dunkler Schrift):** Customer Touchpoint — "Endkunde — wählt situativ den Layer"
  - Rechts daneben kleine vertikale Beschriftung: „Wertschöpfung" (Pfeil nach oben)
  - Unter dem Stack ein türkises Hervorhebungsband mit Fazit: **„Die Kontrolle der Schnittstelle wird geteilt — Konvergenz, nicht Verdrängung."**

---

### Folie 23 — THANK YOU

- Layout: Thank-You-Slide (Lila Gradient, weiße Schrift)
- H1: "Vielen Dank für Ihre Aufmerksamkeit"
- Body-Block rechts unten:
  - Philipp Hofer
  - Lehrstuhl für Financial Data Analytics
  - Universität Augsburg
  - [E-Mail wird ergänzt]
  - www.uni-augsburg.de
- UniA-Logo oben-links (weiß).

---

## QUALITÄTSCHECKS VOR AUSGABE

1. **23 Folien** total vorhanden?
2. Alle Folien strikt 1280×720 px?
3. Auf jeder Folie konsistentes Chrome (Lila-Bar links, Türkis-Chevron, Hairline unter Titel, UniA-Logo, Seitennummer "Fußzeile  |  {N}")?
4. **Keine** Lila-Bullets — Bullets immer türkis (`--wiwi-teal`)?
5. Titel immer `--unia-purple`, NIE schwarz?
6. Visuals durchgehend inline SVG, keine externen Bilder?
7. Sprache durchgehend Deutsch?
8. Keine Quellenangaben auf den Folien (per Vorgabe)?
9. Keine Sprechernotizen (per Vorgabe)?
10. Keine Emojis?

Liefere das vollständige HTML in einem einzigen Artifact.
