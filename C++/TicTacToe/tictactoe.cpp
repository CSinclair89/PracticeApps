#include <iostream>
using namespace std;

char board[3][3] = {{'1', '2','3'}, {'4','5','6'}, {'7', '8', '9'}};
char currentMarker;
int currentPlayer;

void drawBoard() {
    cout << " " << board[0][0] << " | " << board[0][1] << " | " << board[0][2] << endl;
    cout << "-----------\n";
    cout << " " << board[1][0] << " | " << board[1][1] << " | " << board[1][2] << endl;
    cout << "-----------\n";
    cout << " " << board[2][0] << " | " << board[2][1] << " | " << board[2][2] << endl;
}

bool placeMarker(int slot) {
    int row = slot / 3;
    int col;

    if (slot % 3 == 0) {
        row = row - 1;
        col = 2;
    } else {
        col = (slot % 3) - 1;
    }
    
    if (board[row][col] != 'X' && board[row][col] != 'O') {
        board[row][col] = currentMarker;
        return true;
    } else {
        return false;
    }
    
}

int winner() {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            return currentPlayer;
        }
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
            return currentPlayer;
        }
    }
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        return currentPlayer;
    }
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        return currentPlayer;
    }

    return 0;
}

void swapPlayerAndMarker() {
    if (currentMarker == 'X') {
        currentMarker = 'O';
    } else {
        currentMarker = 'X';
    }

    if (currentPlayer == 1) {
        currentPlayer = 2;
    } else {
        currentPlayer = 1;
    }
}

void game() {
    cout << "Player 1, choose your marker: ";
    char markerPlayerOne;
    cin >> markerPlayerOne;

    currentPlayer = 1;
    currentMarker = markerPlayerOne;

    drawBoard();
    int playerWon;

    for (int i = 0; i < 9; i++) {
        cout << "Player " << currentPlayer << ", please enter your slot: ";
        int slot;
        cin >> slot;

        if ((slot > 9) || (slot < 1)) {
            cout << "Invalid number. Please enter a number between 1-9.\n";
            i--;
            continue;
        }
        
        if (!placeMarker(slot)) {
            cout << "That slot is ocupied! Try another slot!\n";
            i--;
            continue;
        }
        playerWon = winner();

        
        drawBoard();

        if (playerWon == 1) {
            cout << "Player 1 won! Congratulations!\n";
            break;
        }

        if (playerWon == 2) {
            cout << "Player 2 won! Congratulations!\n";
            break;
        }

        swapPlayerAndMarker();

    }

    if (playerWon == 0) {
        cout << "This is a tie game!\n";
    }

}

int main() {
    game();
}