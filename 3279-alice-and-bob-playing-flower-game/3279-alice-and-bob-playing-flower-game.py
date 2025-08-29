class Solution:
    def flowerGame(self, n: int, m: int) -> int:
        odd_n = 0
        even_n = 0

        odd_m = 0
        even_m = 0

        if n % 2 != 0:
            odd_n = (n//2) + 1
            even_n = n - odd_n
        else:
            odd_n = (n//2)
            even_n = n - odd_n

        if m % 2 != 0:
            odd_m = (m//2) + 1
            even_m = m - odd_m
        else:
            odd_m = (m//2)
            even_m = m - odd_m

        count = (odd_n * even_m) + (odd_m * even_n)
        return count
        