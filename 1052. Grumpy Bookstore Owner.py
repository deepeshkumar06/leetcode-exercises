class Solution(object):
    def maxSatisfied(self, customers, grumpy, minutes):
        n = len(customers)
        satisfied = 0
        for i in range(n):
            if grumpy[i] == 0:
                satisfied += customers[i]
        max_additional = 0
        current_additional = 0
        for i in range(minutes):
            if grumpy[i] == 1:
                current_additional += customers[i]
        max_additional = current_additional
        for i in range(minutes, n):
            if grumpy[i] == 1:
                current_additional += customers[i]
            if grumpy[i - minutes] == 1:
                current_additional -= customers[i - minutes]
            if current_additional > max_additional:
                max_additional = current_additional
        return satisfied + max_additional
