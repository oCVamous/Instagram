public class alf {
    public static void main(String[] args) {
        rekur(0, "0", "....#..##....#.##.....###.#.#...#...".toCharArray());
    }

    public static void rekur(int index, String weg,char[ ] arr) {
        if(index == arr.length-1) {           //letztes gültiges Array-Index
            System.out.println(weg);
        } else if(index > arr.length-1) {        //über letzten gültiges Array-Index
            return;
        }else if(arr[index] == '#') {           //Raute
            return;
        }
        rekur(index+1, weg + ", " + (index+1), arr);  //index+1
        rekur(index+6, weg + ", " + (index+6), arr); //index+6
    }
    
}