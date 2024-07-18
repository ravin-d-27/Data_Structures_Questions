class Solution:
    def solveKnapsack(self, wt, val, W,n):
        if n==0 or W==0:
            return 0
        
        if (wt[n-1]<=W):
            return max(val[n-1]+self.solveKnapsack(wt,val,W-wt[n-1],n-1),self.solveKnapsack(wt,val,W-wt[n-1],n-1))
        
        if (wt[n-1]>W):
            return self.solveKnapsack(wt,val,W,n-1)
        
if __name__=="__main__":
    
    print(Solution().solveKnapsack([4,5,1],[1,2,3],4,3))
            