class Solution(object):
    def luckyNumbers (self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        ans = []
        
        row = 0
        print(len(matrix),len(matrix[0]))
        
        while (row<len(matrix)):
            mini = min(matrix[row])
            mini_row_index = matrix[row].index(mini)
            maxi = []
            col = 0
            while (col<len(matrix)):
                maxi.append(matrix[col][mini_row_index])
                col+=1
            maximum = max(maxi)     
            if maximum==mini:
                ans.append(mini)
            
            row+=1
            
        return ans
        
if __name__=="__main__":
    mat = [[3,7,8],
        [9,11,13],
        [15,16,17]]
    print(mat[2][1])
    Solution().luckyNumbers(mat)
            
            