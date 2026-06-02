library(tidyverse)
library(tidymodels)


data_penguin <- penguins

data_penguin |> glimpse()

summary(data_penguin)

data_penguin |> summary()

data_penguin %>%
  na.omit() %>%
  group_by(species) %>%
  summarise("num_penguins" = n(),
            "1st Qu." = quantile(bill_length_mm, 0.25),
            "Median" = median(bill_length_mm),
            "Mean" = mean(bill_length_mm),
            "3rd Qu." = quantile(bill_length_mm, 0.75),
  )