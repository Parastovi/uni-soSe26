# zweite Data Mining Übung

library(tidyverse)
install.packages("palmerpenguins")
data_penguin<-palmerpenguins::penguins

data_penguin %>% glimpse()

summary(data_penguin)

data_penguin %>%
  na.omit() %>%
  group_by(species) %>%
  summarise(n = n(),
            "1st Qu." = quantile(bill_length_mm, 0.25),
            "Median" = median(bill_length_mm),
            "Mean" = mean(bill_length_mm),
            "3rd Qu." = quantile(bill_length_mm, 0.25),
  )


data_penguin %>%
  na.omit() %>%
  ggplot(aes(x=species,y=bill_length_mm, fill = species))+
  geom_boxplot()+
  scale_fill_manual(values = c("darkorange","purple","cyan4"))+
  labs(
    x = "Pinguin Spezies",
    y = "Schnabellänge in mm"
  )+
  theme_minimal(base_size=14)+
  theme(
    legend.position = "none"
  )

# Den Datensatz manuell erstellen
data_example <- data.frame(
  x = c(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
  y = c(0.56, 0.73, -0.56, 1.43, 1.87, 0.78, 2.54, 4.77, 4.69, 4.95, 3.78)
)

# Kurzer Check der Daten
print(data_example)


#lineare Rekursion

data_example %>% ggplot(aes(x=x,y=y))+
  geom_point(color="darkorange",
             size = 3)+
  geom_abline(slope = 0.5098,
              intercept = -0.2273,
              linewidth = 1,
              color = "cyan4")+
  theme_minimal(base_size=14)


install.packages("ggplot2")

install.packages("tidymodels", dependencies = TRUE)
library(tidymodels)

lm_spec <- linear_reg()

lm_fit <- lm_spec %>% fit(
  data = data_example,
  formula = y ~ x
)
