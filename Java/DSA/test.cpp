#include <iostream>
#include <vector>
using namespace std;

void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}

void printArray(int arr[], int size) 
{ 
    int i; 
    for (i = 0; i < size; i++) 
        cout << arr[i] << " "; 
    cout << endl; 
} 
int main() {

    vector<int> test = {7, 69, 2, 221, 8974};
    int arr[test.size()];

    for (int i = 0; i < test.size(); i++) {
        arr[i] = test[i];
    }

    int minSum = 0, maxSum = 0;
    int size = sizeof(arr) / sizeof(arr[0]);
    cout << "Unsorted Array: \n";
    printArray(arr, size);
    bubbleSort(arr, size);
    cout << "Sorted Array: \n";
    printArray(arr, size);

    for (int i = 0; i < size; i++) {
        if (i != 0) maxSum += arr[i];
        if (i != size - 1) minSum += arr[i];
    }

    cout << "Minimum Sum: " << minSum << "\n";
    cout << "Maximum Sum: " << maxSum << "\n";
}