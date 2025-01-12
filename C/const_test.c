#include <stdio.h>

int main() {

    const int digit = 6;
    int *p = (int *)&digit;

    printf("Digit before pointer value change: %d\n", digit);

    *p = 5;

    printf("Digit after pointer value change: %d\n", digit);

    *p = 4;

    printf("Digit after pointer value change: %d\n", digit);

}