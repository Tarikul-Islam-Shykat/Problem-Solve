
import math
import os
import random
import re
import sys

alphabet = "abcdefghijklmnopqrstuvwxyz"

string = input()

counter = 0
for char in alphabet:
    if char not in string.lower():
        counter=+1
        break

if(counter==0):
    print("pangram")
else:
    print("not pangram")
