#include <bits/stdc++.h>
using namespace std;

int func(vector<int>&status, vector<int>&dist){
    int  n = status.size();
    vector<int> res(n, INT_MAX), res2(n, INT_MAX);
    int prev = -1;
    for(int i=0; i<n; ++i){
        if(prev == -1){
            if(status[i] == 1){
                prev = dist[i];
                res[i] = 0;
            }
        }
        else{
            if(status[i] == 0){
                res[i] = (dist[i] -prev);
            }
            else{
                res[i] = 0;
            }
            prev = dist[i];
        }
    }
    prev = -1;
    for(int i=n-1; i>=0; --i){
        if(prev == -1){
            if(status[i] == 1){
                prev = dist[i];
                res2[i] = 0;
            }
        }
        else{
            if(status[i] == 0){
                res2[i] = (prev - dist[i]);
            }
            else{
                res2[i] == 0;
            }
            prev = dist[i];
        }
    }
    int ans = 0;
    for(int i=0; i<n;  ++i){
        if(status[i] == 0){
            ans += min(res[i] , res2[i]);
        }
    }
    return ans;
}

int main()
{
    int n ;
    cin >> n;
    
    vector<int>vec(n, 0);
    for(int i=0; i<n; ++i){
        cin>> vec[i];
    }
    int m; 
    cin>>m;
    vector<int> dist(m,0);
    for(int i=0; i<m; ++i){
        cin >> dist[i];
    }
    cout << func(vec, dist);
   

    return 0;
}
