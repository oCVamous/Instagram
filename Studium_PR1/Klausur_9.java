public class Klausur_9 {
    public static void main(String[] args) {
        rekur(0, "0", "....#..##....#.##.....###.#.#...#...".toCharArray());
    }

    public static void rekur(int index, String weg, char[ ] array) {
        if (index == array.length-1) {
            System.out.println(weg);
        } else if (index > array.length-1) {
            return;
        } else if (array[index] == '#') {
            return;
        }
        rekur(index+1, weg + ", " +  (index+1), array);
        rekur(index+6, weg + ", " +  (index+6), array);

    }
}
