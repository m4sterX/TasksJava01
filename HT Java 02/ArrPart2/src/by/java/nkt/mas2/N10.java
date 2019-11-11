package by.java.nkt.mas2;
// 10. Сортировка подсчетом. Выходной массив заполняется значениями -1.
// Затем для каждого элемента определяется его место в выходном массиве
// путем подсчета количества элементов строго меньших данного. Естественно,
// что все одинаковые элементы попадают на одну позицию, за которой следует ряд значений -1.
// После этого оставшиеся в выходном массиве позиции со значением -1 заполняются копией предыдущего значения.
public class N10 {
    public static int[] countingSort(int[] theArray, int maxValue) {
        // Массив со "счётчиками" размером от 0 до максимального значения
        int numCounts[] = new int[maxValue + 1];
        // В соответствующей ячейке (индекс = значение) увеличиваем счётчик
        for (int num : theArray) {
            numCounts[num]++;
        }
        // Подготавливаем массив для отсортированного результата
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;
        // идём по массиву со "счётчиками"
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            // идём по количеству значений
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
            }
        }
        return sortedArray;
    }
}
