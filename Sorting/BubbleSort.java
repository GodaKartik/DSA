class BubbleSort{
    BubbleSort(int array[]){
        this.sort(array);
    }
    int[] sort(int array[]){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 1; j < array.length; j++){
                if (array[j-1] > array[j]) {
			int temp = array[j-1];
			array[j-1] = array[j];
			array[j] = temp;
		}
            }
        }
        return array;
    }
}

// change type of 'array' (line 2 and line 5) and 'temp' to whatever type of numeric data being used
