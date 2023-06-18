class test {

    static int findSingle(int N, int arr[]) {
        int occ = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j])
                    occ++;
            }

            if (occ > 1) {
                occ = 0;
            } else {
                return arr[i];
            }

        }
        return 0;

    }

    public static void main(String[] args) {

    }

}