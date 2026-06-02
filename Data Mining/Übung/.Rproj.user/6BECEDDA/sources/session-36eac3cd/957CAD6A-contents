library(tidyverse)


data_attrition_filtered <- tibble(
  job_level         = c(2, 2, 1, 1, 1, 1, 3, 2, 1, 2, 1, 3),
  job_role          = factor(c("Sales_Executive", "Research_Scientist", 
                               "Laboratory_Technician", "Sales_Executive",
                               "Research_Scientist", "Laboratory_Technician",
                               "Sales_Executive", "Research_Scientist",
                               "Laboratory_Technician", "Sales_Executive",
                               "Research_Scientist", "Sales_Executive")),
  total_working_years = c(8, 10, 7, 8, 6, 8, 12, 1, 10, 17, 6, 10),
  attrition = factor(c("Yes", "No", "Yes", "No", "No", "No",
                       "No", "No", "No", "Yes", "No", "No")),
  monthly_income      = c(5993, 5130, 2090, 2909, 3468, 3068, 
                          7670, 4283, 2200, 6500, 4100, 8200)
)

# Aufgabe 1.1

data_attrition_filtered %>%
  group_by(job_role) %>%
  summarise(n = n(),
      mean_inc = mean(monthly_income)) %>%
  arrange(desc(mean_inc))

# ohnne group_by

data_attrition_filtered %>%

  summarise(n = n(),
            mean_inc = mean(monthly_income)) %>%
  arrange(desc(mean_inc))

# zusätzliches group_by attrition 

data_attrition_filtered %>%
  group_by(job_role, attrition) %>%
  summarise(n = n(),
            mean_inc = mean(monthly_income)) %>%
  arrange(desc(mean_inc))


names(data_attrition_filtered)


data_attrition_filtered

data_attrition_filtered %>%
  group_by(job_role)


# summarise: Was passiert mit den Zeilen?
data_attrition_filtered %>%
  group_by(job_role) %>%
  summarise(mean_inc = mean(monthly_income))

# mutate: Was passiert mit den Zeilen?
data_attrition_filtered %>%
  group_by(job_role) %>%
  mutate(mean_inc = mean(monthly_income))


# Aufgabe 1.2
library(tidymodels)

# Modell schätzen
data_num <- data_attrition_filtered %>%
  select_if(is.numeric)

lm_fit <- linear_reg() %>%
  fit(data = data_num,
      formula = monthly_income ~ .)

# Residuen und gefittete Werte berechnen
lm_augment <- augment(lm_fit, new_data = data_num)

# Plot
ggplot(lm_augment, aes(x = .pred, y = .resid)) +
  geom_point() +
  geom_hline(yintercept = 0, color = "red") +
  labs(x = "Gefittete Werte", 
       y = "Residuen",
       title = "Residuen vs. gefittete Werte")


# anderer Plot

plot(lm_fit)


# Zwei perfekt korrelierende Variablen
x1 <- c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
x2 <- x1 * 2  # perfekte Korrelation!

data_korr <- tibble(x1 = x1, x2 = x2)

ggplot(data_korr, aes(x = x1, y = x2)) +
  geom_point() +
  geom_smooth(method = "lm", se = FALSE, color = "red") +
  labs(title = "Perfekte Korrelation zwischen X1 und X2",
       x = "X1", y = "X2")