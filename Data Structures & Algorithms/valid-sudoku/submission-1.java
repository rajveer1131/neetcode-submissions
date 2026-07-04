class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> squareMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rowMap.put(i, new HashSet<>());
            squareMap.put(i, new HashSet<>());
            colMap.put(i, new HashSet<>());
        }

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int boxIndex = (i / 3) * 3 + (j / 3);
                char num = board[i][j];
                if (num == '.')
                    continue;

                if (!rowMap.get(i).add(num) || !colMap.get(j).add(num)
                    || !squareMap.get(boxIndex).add(num)) {
                    return false;
                }
            }
        }

        return true;
    }
}
