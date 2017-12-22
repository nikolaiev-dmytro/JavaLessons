package lesson6;

public class List implements iList {
    private int[] list;

    public List() {
        this.list = new int[0];
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    @Override
    public void add(int x) {
        if (list.length == 0) {
            this.list = new int[1];
            list[0] = x;
        } else {
            int[] tempList = new int[list.length + 1];
            for (int i = 0; i < tempList.length - 1; i++) {
                tempList[i] = list[i];
            }
            tempList[tempList.length - 1] = x;
            this.list = new int[tempList.length];
            this.list = tempList;
        }
    }


    @Override
    public int size() {
        return list.length;
    }

    @Override
    public void delete(int index) {
        int[] tempList1 = new int[index];
        int[] tempList2 = new int[list.length - index - 1];
        int[] resultList = new int[list.length - 1];
        for (int i = 0; i < index; i++) {
            tempList1[i] = list[i];
        }
        for (int i = index + 1; i < list.length; i++) {
            tempList2[i - index - 1] = list[i];
        }
        for (int i = 0; i < tempList1.length; i++) {
            resultList[i] = tempList1[i];
        }
        for (int i = tempList1.length; i < list.length - 1; i++) {
            resultList[i] = tempList2[i - tempList1.length];
        }
        this.list = new int[list.length - 1];
        this.list = resultList;
    }

    public int get(int index) {
        return list[index];
    }

    @Override
    public void clear() {
        this.list = new int[0];
    }

    @Override
    public void addArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.add(array[i]);
        }
    }

    @Override
    public void sort() {
        int min, imin, temp;
        for (int i = 0; i < this.list.length; i++) {
            min = this.list[i];
            imin = i;
            for (int j = i + 1; j < this.list.length; j++) {
                if (this.list[j] < min) {
                    min = this.list[j];
                    imin = j;
                }
            }
            if (i != imin) {
                temp = this.list[i];
                this.list[i] = this.list[imin];
                this.list[imin] = temp;
            }
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(this.get(i));

        }
    }
}
