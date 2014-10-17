#include <iostream>
#include <string>
#include <tr1/unordered_map>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        unorder_map<int, int> hash;
        vector<int> ret;
        for(int i=0;i<number.size();i++) {
            if(hash.find(target-numbers[i])!=hash.end()) {
                ret.push_back(hash[target-numbers[i]]+1);
                ret.push_back(i+1);
                return result;
            }
            hash[numbers[i]]=i;
        }
        return ret;
    }
};

