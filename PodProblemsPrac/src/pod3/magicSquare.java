package pod3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class magicSquare {
	/*static HashMap<Boolean,Integer> getRowsSum(int arr[][]){
		HashMap<Boolean,Integer> hmRows = new HashMap<Boolean,Integer>();
		ArrayList<Integer> rowsSum = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum+= arr[i][j];
			}
			rowsSum.add(sum);
		}
		int curr = rowsSum.get(0);
		boolean isSame = true;
		for(Integer i: rowsSum) {
			if(curr != i) {
				isSame = false;
				break;
			}	
		}
		hmRows.put(isSame, curr);
		return hmRows;
	}*/
	static HashMap<Boolean,Integer> getRowsSum(int arr[][]){
		HashMap<Boolean,Integer> hmRows = new HashMap<Boolean,Integer>();
		ArrayList<Integer> rowsSum = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum+= arr[i][j];
			}
			rowsSum.add(sum);
		}
		int curr = rowsSum.get(0);
		boolean isSame = true;
		for(Integer i: rowsSum) {
			if(curr != i) {
				isSame = false;
				break;
			}	
		}
		hmRows.put(isSame, curr);
		return hmRows;
	}
	static boolean checkIfMagicSquarePossibleOfGivenSize(int arr[][], int r, int c, int size) {
		//magic square
		//every row sum, diagonal sum, every column sum equal
		for (int startRow = 0; startRow <= r - size; startRow++) {
            for (int startCol = 0; startCol <= c - size; startCol++) {
                int[][] subarray = new int[size][size];
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        subarray[i][j] = arr[startRow + i][startCol + j];
                    }
                }
                
                HashMap<Boolean,Integer> hmRows = getRowsSum(subarray);
                if(hmRows.containsKey(true)) {
                	//HashMap<Boolean,Integer> hmColumns = getColumnsSum(subarray);
                }
                //HashMap<Boolean,Integer> hmColumns = getColumnsSum(subarray);
                //HashMap<Boolean,Integer> hmDiagonals = getDiagonalsSum(subarray);
                
            }
        }
		return false;
	}
	static int getSizeOflargestMagicSquare(int arr[][], int r, int c) {
		int nResult = 1;
		if(r == 1 || c == 1)
			nResult = 1;
		else {
			int nSize = 2;
			int maxSize = Math.min(r, c);
			for(int i = nSize; i<=maxSize; i++) {
				if(checkIfMagicSquarePossibleOfGivenSize(arr, r, c, i)) {
					nResult = Math.max(nResult, i);
				}
			}
		}
		return nResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int matrix[][] = new int[r][c];
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				matrix[i][j] = sc.nextInt();
		int nResult = getSizeOflargestMagicSquare(matrix, r, c);
		System.out.println(nResult);
		sc.close();

	}

}
