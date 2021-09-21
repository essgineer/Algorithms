# -*- coding: utf-8 -*-
"""
Created on Thu Dec 03 02:03:27 2015

@author: Me
"""
#import pylab 
import matplotlib.pyplot as pyp

#mergesort
x = [0, 1, 5, 10, 50,100, 1000, 1e4, 1e5,1e6 ]
y = [19850e-9, 17959e-9, 27412e-9, 34029e-9, 93578e-9, 189991e-9,
     1e-3, 6e-3, 30e-3, 198e-3]
pyp.plot(x, y,'b')

pyp.xlabel('nbr of Data')
pyp.ylabel('time (sec)')
pyp.title('Sort of Integers')
pyp.grid(True)

pyp.savefig("MergeSort.png")

# show the plot on the screen
pyp.show()

#pyp.savefig("insertionsort.png")
