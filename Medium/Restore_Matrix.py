class Solution(object):
    def restoreMatrix(self, rowSum, colSum):
        """
        :type rowSum: List[int]
        :type colSum: List[int]
        :rtype: List[List[int]]
        """
        
        matrix = [[0] * len(colSum) for _ in range(len(rowSum))]
        
        for i in range(len(rowSum)):
            for j in range(len(colSum)):
                matrix[i][j] = min(rowSum[i], colSum[j])
                rowSum[i] -= matrix[i][j]
                colSum[j] -= matrix[i][j]
        
        return matrix


if __name__=="__main__":
    rowSum = [5,7,10]
    colSum = [8,6,8]
    
    print(Solution().restoreMatrix(rowSum,colSum))