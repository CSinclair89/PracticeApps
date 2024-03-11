from tkinter import *
import time

WIDTH, HEIGHT = 500, 500
xVelocity, yVelocity = 2, 2

window = Tk()

canvas = Canvas(window, width = WIDTH, height = HEIGHT)
canvas.pack()

backgroundImage = PhotoImage(file = "background.png")
background = canvas.create_image(0, 0, image = backgroundImage, anchor = NW)

photoImage = PhotoImage(file = "ufo.png")
myImage = canvas.create_image(0, 0, image = photoImage, anchor = NW)



imageWidth, imageHeight = photoImage.width(), photoImage.height()

while (True):
    coordinates = canvas.coords(myImage)
    print(coordinates)

    if ((coordinates[0] >= WIDTH - imageWidth) or coordinates[0] < 0):
        xVelocity = -xVelocity

    if ((coordinates[1] >= HEIGHT - imageHeight) or coordinates[1] < 0):
        yVelocity = -yVelocity

    canvas.move(myImage, xVelocity, yVelocity)
    window.update()
    time.sleep(0.01)
