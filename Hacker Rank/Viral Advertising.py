#!/bin/python3

import math
import os
import random
import re
import sys

test = int(input())

intial_people = 5
total = 0
new_people = 0

while test>0:
    intial_people = int(intial_people/2)
    total = total + intial_people
    new_people = intial_people * 3
    intial_people = new_people
    test-=1

print(total)
