public class USdatum {
    public static void main(String[] args) {
        String datumUS = "10/02/2025";
        String[] parts = datumUS.split("/");
        String datumEU = parts[1] + "." + parts[0] + "." +  parts[2];
        System.out.println(datumEU);
    }
}
