#include <iostream>
#include <cstring>
using namespace std;

char word[101] = {'\0', };
int result = 1; // �⺻���� 1�� ����

int main() {
    cin >> word;
    int size = strlen(word);
    for(int i = 0; i < size/2; i++){ // �ݸ� �˻��ϵ��� ����
        if (word[i] != word[size-1-i]) { // �ϳ��� �ٸ��� �縰����� �ƴ�
            result = 0;
            break; // �˻� �ߴ�
        }
    }
    cout << result << endl;
    return 0;
}