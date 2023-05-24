#include <iostream>
#include <cstring>
using namespace std;

char word[101] = {'\0', };
int result = 1; // 기본값을 1로 설정

int main() {
    cin >> word;
    int size = strlen(word);
    for(int i = 0; i < size/2; i++){ // 반만 검사하도록 수정
        if (word[i] != word[size-1-i]) { // 하나라도 다르면 펠린드롬이 아님
            result = 0;
            break; // 검사 중단
        }
    }
    cout << result << endl;
    return 0;
}