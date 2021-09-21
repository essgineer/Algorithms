# -*- coding: utf-8 -*-
"""
Created on Fri Dec 04 15:47:11 2015

@author: Me
"""

#import pylab 
import matplotlib.pyplot as pyp

#Insertionsort data
x = [0, 1, 5, 10, 50,100, 1000, 1e4, 1e5,1e6 ]
y = [472e-9/60, 945e-9/60, 2836e-9/60, 5671e-9/60, 73255e-9/60, 296803e-9/60 ,12e-3/60, 62e-3/60, 
      5289e-3/60, 1016168e-3/60]
pyp.plot(x, y,'r')

pyp.xlabel('nbr of Data')
pyp.ylabel('time (min)')
pyp.title('Sort of Integers')
pyp.grid(True)

# make legend
pyp.legend()
#save the graph as a png picture
pyp.savefig("InsertionSort.png")

# show the plot on the screen
pyp.show() 
