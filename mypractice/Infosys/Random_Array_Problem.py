MOD = 10**9 + 7

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def inverse_modulo(a, m):
    if gcd(a, m) != 1:
        print("Inverse does not exist")
        return None
    return pow(a, m - 2, m)

def expected_points(S, P):
    N = len(S)
    total_points = 0
    total_probability = 0

    for mask in range(1 << N):
        A, B = [], []
        points_A, points_B = 0, 0
        probability_num = 1
        probability_den = 1

        for i in range(N):
            if (mask >> i) & 1:
                A.append(S[i])
                points_A += 1
                probability_num = (probability_num * P[i]) % MOD
            else:
                B.append(S[i])
                points_B += 1
                probability_num = (probability_num * (100 - P[i])) % MOD
            probability_den = (probability_den * 100) % MOD

        for i in range(points_A - 1):
            if A[i] < A[i + 1]:
                total_points = (total_points + probability_num) % MOD

        for i in range(points_B - 1):
            if B[i] < B[i + 1]:
                total_points = (total_points + probability_num) % MOD

        total_probability = (total_probability + probability_num) % MOD

    p = total_points % MOD
    q = total_probability % MOD

    q_inv = inverse_modulo(q, MOD)
    if q_inv is None:
        return "Inverse does not exist"
    result = (p * q_inv) % MOD
    return result

N = int(input())
S = []
P = []

for i in range(N):
    S.append(int(input()))

for i in range(N):
    P.append(int(input()))

answer = expected_points(S, P)
print(answer)
