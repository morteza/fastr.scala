# Sample code to generate a plot out of 50 random integers

if (!require("ggplot2", character.only = TRUE)) {
  install.packages("ggplot2", dependencies = TRUE)
  library(ggplot2)
}


# Use FastR grDevices:: to generate svg output. Not valid in standard R.
svg()
data = floor(runif(50, min=0, max=100))

plot = ggplot(data = data.frame(randomNums = data, time = 0:49), aes(x=time, y=randomNums, group=1)) +
       geom_line(color="blue") +
       expand_limits(x=0, y=0)

print(plot)
svg.off()
