import math
import os
import random
import re
import sys

test = int(input())

while test>0:
    input_string = input()
    len_input = len(input_string)
    c = 0
    for i in range(len_input):
        if i == len_input-1:
            break
        if input_string[i] == input_string[i+1]:
            c= c+1
    print(c)
    test-=1
