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
        arr[i] = tolower(arr[i]); // ��� �ҹ��ڷ� ��ȯ
        arr2[arr[i] - 'a']++;
    }
    int max_cnt = *max_element(arr2, arr2 + 26); // �ִ밪 ���ϱ�
    int max_idx = max_element(arr2, arr2 + 26) - arr2; // �ִ밪 �ε��� ���ϱ�
    int cnt = count(arr2, arr2 + 26, max_cnt); // �ִ밪 ���� ���ϱ�
    if (cnt == 1) {
        char ch = max_idx + 'A'; // �ε����� �빮�ڷ� ��ȯ
        cout << ch << endl;
    }
    else {
        cout << '?' << endl;
    }
    return 0;
}