class Solution:
    
    def solveKnapsack(self, wt, val, W,n,mem):
        if n==0 or W==0:
            return 0
        
        if mem[n][W]!=-1:
            return mem[n][W]
        
        if (wt[n-1]>W):
            mem[n][W] = self.solveKnapsack(wt,val,W,n-1,mem)
            return mem[n][W]
        else:
            mem[n][W] = max(val[n-1]+self.solveKnapsack(wt,val,W-wt[n-1],n-1,mem),self.solveKnapsack(wt,val,W-wt[n-1],n-1,mem))
            return mem[n][W]
        
        
        
if __name__=="__main__":
    wt = [4,5,1]
    val = [1,2,3]
    W = 4
    n = len(wt)
    print(Solution().solveKnapsack(wt,val,W,n,[[-1]*(W+1) for _ in range(n+1)]))
            