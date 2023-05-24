#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;

char arr[1000001];
int arr2[26] = { 0, };

int main(void) {
    cin >> arr;
    int len = strlen(arr);
    for (int i = 0; i < len; i++) {
        arr[i] = tolower(arr[i]); // 모두 소문자로 변환
        arr2[arr[i] - 'a']++;
    }
    int max_cnt = *max_element(arr2, arr2 + 26); // 최대값 구하기
    int max_idx = max_element(arr2, arr2 + 26) - arr2; // 최대값 인덱스 구하기
    int cnt = count(arr2, arr2 + 26, max_cnt); // 최대값 개수 구하기
    if (cnt == 1) {
        char ch = max_idx + 'A'; // 인덱스를 대문자로 변환
        cout << ch << endl;
    }
    else {
        cout << '?' << endl;
    }
    return 0;
}