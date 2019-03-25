package com.rashid.hackersolution;   


class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}


