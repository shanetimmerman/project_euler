

# 1 Jan 1900 was a Monday.
# Thirty days has September,
# April, June and November.
# All the rest have thirty-one,
# Saving February alone,
# Which has twenty-eight, rain or shine.
# And on leap years, twenty-nine.
# A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

# How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

day =  365 % 7

def get_month_length(month, year):
  if month in (4, 6, 9, 11):
    return 30
  elif month == 2:
    print(year, (year % 100), (year % 400))
    if not year % 4 and ((year % 100) or not (year % 400)):
      return 29
    else:
      return 28
  else:
    return 31

num_sun = 0
for year in range(1901, 2001):
  for month in range(1, 13):
    if day == 6:
      num_sun += 1
    day = (day + get_month_length(month, year)) % 7

print(num_sun)