class Solution {
int a1 = 1000000007;
int[][][] b2;
int[] c3 = new int[10], d4 = new int[10], e5 = new int[10];
long[] f6 = new long[11];
int[][] g7 = new int[81][81];

void h8() {
        for (int i = 0; i <= 80; i++) {
    g7[i][0] = g7[i][i] = 1;
  for (int j0 = 1; j0 < i; j0++)
                g7[i][j0] = (g7[i- 1][j0 - 1] + g7[i - 1][j0]) % a1;
        }
    }

long i1(int j2, int k3, int l4) {
    if (k3 == 0 && l4 == 0) return f6[j2];
  if (j2 == 10 || k3 > d4[j2] || l4 > e5[j2]) return 0;
        if (b2[j2][k3][l4] != -1) return b2[j2][k3][l4];
long m5 = 0;
int n6 = k3;

for (int o7 = 0, p8 = c3[j2]; o7 <= c3[j2] && n6 >= 0 && l4 >= o7; o7++, p8--, n6 -= j2) {
        if (p8 > e5[j2] - l4) continue;
long q9 = i1(j2 + 1, n6, l4 - o7) * g7[l4][o7] % a1;
m5 = (m5 + q9 * g7[e5[j2] - l4][p8]) % a1;
    }

    return b2[j2][k3][l4] = (int) m5;
}

    public int countBalancedPermutations(String r0) {
int s1 = r0.length(), t2 = 0, u3 = 0, v4 = 0;
        for (char w5 : r0.toCharArray()) {
    c3[w5 - '0']++;
            t2 += w5 - '0';
}
if ((t2 & 1) != 0) return 0;
h8();
    f6[10] = 1;

        for (int x6 = 9; x6 >= 0; x6--) {
    u3 += x6 * c3[x6];
        v4 += c3[x6];
d4[x6] = u3;
            e5[x6] = v4;
f6[x6] = f6[x6 + 1] * g7[e5[x6]][c3[x6]] % a1;
    }

        b2 = new int[10][361][41];
    for (int[][] y7 : b2)
  for (int[] z8 : y7)
Arrays.fill(z8, -1);

        return (int) i1(0, t2 >> 1, s1 >> 1);
    }
}
