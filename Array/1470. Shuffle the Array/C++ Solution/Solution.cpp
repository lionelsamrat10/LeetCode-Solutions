using namespace std;
vector<int> shuffle(vector<int>& nums, int n) {
    for(int i=n;i<2*n;i++){
        nums[i] = nums[i]<<10;
        nums[i] |= nums[i-n];
    }
    int z = n;
    for(int i=0;i<2*n;i+=2){
        nums[i] = nums[z] & 1023;
        nums[i+1] = nums[z++] >> 10;
    }
    return nums;
}

int main() {
    vector<int> input = {2,5,1,3,4,7};
    int n = 3;
    vector<int> output = shuffle(input, n);
    for(auto x: output)
        cout<<x<<" ";
}

Time Complexity: O(N)
Space Complexity:O(1)
