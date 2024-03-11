from tkinter import *
from time import *
from tkinter.font import *

def update():
    timeString = strftime("%I:%M:%S %p")
    timeLabel.config(text = timeString)

    dayString = strftime("%A")
    dayLabel.config(text = dayString)

    dateString = strftime("%B %d, %Y")
    dateLabel.config(text = dateString)

    window.after(1000, update)

window = Tk()

timeLabel = Label(window, font = ("Arial", 50), fg = "#6757FA", bg = "black")
timeLabel.pack()

dayLabel = Label(window, font = ("Arial", 25, ITALIC))
dayLabel.pack()

dateLabel = Label(window, font = ("Arial", 30, ITALIC))
dateLabel.pack()

update()

window.mainloop()