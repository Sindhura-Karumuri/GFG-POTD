Permutations of a String
Difficulty: MediumAccuracy: 34.65%Submissions: 289K+Points: 4
Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order.

from itertools import permutations

class Solution:
    def findPermutation(self, s):
        return list(set("".join(i) for i in permutations(s)))
