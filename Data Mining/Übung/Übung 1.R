x1 <- c(1,2,3,4,5)
x2 <- 1:5
x3 <- seq(1,5)

seq(from = 1,to = 5,by = 0.5)

x1[1]


data<- data.frame(
  x = seq(1,10,length.out = 18),
  y = letters[1:18],
  z = unlist(
    rep(
      strsplit("The quick brown fox jumps over the lazy dog",
               split = " "),
      2)
  )
)

# Importieren von Datensätzen

data_ramen <- read.csv(file = "data.ramen-ratings.csv") #falsch, weil "."
data_ramen <- read.csv(file = "data/ramen-ratings.csv")

# 1. Eine Liste erstellen
meine_liste <- list(a = 1:3, b = 10)
print(meine_liste) 
# Output: Zwei getrennte Abschnitte ($a und $b)

# 2. Die Liste "platt machen"
mein_vektor <- unlist(meine_liste)
print(mein_vektor)
# Output: 1 2 3 10 (Alles in einer Reihe)


# Für die reine Berechnung:
cos(seq(0, pi, length.out = 100))

# Für den Plot (Grafik):
plot(cos(seq(0, pi, length.out = 100)), type = "l")


data_ramen <- read.csv(file ="data/ramen-ratings.csv")
# Zugriff auf Packete erhalten
library("tidyverse")


# Die glimpse() Funktion gibt einen kompakten überblick über den Inhalt und die beinhaltenden Datentypen des unterliegenden Datensatzes.
glimpse(data_ramen)


#Spaltennamen cleanen
data_ramen <- janitor::clean_names(dat = data_ramen)

# Die mutate Funktion kann entweder neue Spalten generieren, oder vorhandene Spalten modifizieren. 
# Im folgenden Beispiel wird die mutate Funktion dafür verwendet die Variable stars vom Datentyp <chr> 
# in <dbl> umzuwandeln und die Variable top_ten zu entfernen.
data_ramen <- data_ramen %>% 
  mutate(
    stars = as.double(stars),
    top_ten = NULL
  )


# 1. Sicherstellen, dass der Pfad stimmt und die Datei geladen wird
# Nutze ggf. den vollen Pfad aus der ersten Nachricht!
data_ramen <- read.csv("data/ramen-ratings.csv")

# 2. Kurzer Check: Was ist das überhaupt?
class(data_ramen) # Sollte "data.frame" ausgeben
head(data_ramen)  # Zeigt die ersten Zeilen

# 3. Jetzt die Umwandlung
data_ramen <- data_ramen %>% 
  mutate(
    stars = as.double(stars),
    top_ten = NULL
  )


data_ramen <- data_ramen %>% 
  mutate(
    stars = as.double(stars),
    top_ten = NULL
  ) %>%
  na.omit()


data_ramen %>%
  group_by(brand) %>%
  summarise(num_var = n()) %>%
  filter(num_var > 30)

data_example <- tibble(
  names = c("Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace"),
  age_groups = c("18-25", "<18", "26-35", "36-45", "18-25", "60+", "26-35"),
  eye_color = c("Blue", "Brown", "Green", "Hazel", "Brown", "Blue", "Green")
)

data_example 

data_example <- data_example %>%
  mutate( 
    age_groups = factor(
      age_groups,
      levels = c("<18", "18-25", "26-35", "36-45", "60+"),
      ordered = TRUE,
      labels = c("child","adult","adult","adult","senior")
    )
  )

data_example <- data_example %>%
  mutate(
    eye_color = factor(eye_color)
  )

data_ramen_ratings <- data_ramen %>%
  group_by(stars) %>%
  summarise(count=n())

data_ramen_ratings %>% head()

ggplot(data = data_ramen_ratings)

ggplot(aes(x=stars,y=count), data = data_ramen_ratings)

ggplot(aes(x=stars, y=count), data = data_ramen_ratings)+
  geom_col()

data_ramen_ratings