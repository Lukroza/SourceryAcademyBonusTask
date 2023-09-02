
class Main {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);

    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        // for loop which counts years
        for (int i = fromYear; i <= toYear; i++) {
            // for loop which counts months
            for (int j = 1; j <= 12; j++) {
                // for loop which counts days
                for (int k = 1; k <= 31; k++) {
                    if (isValidDate(i, j, k)) {
                        System.out.println(String.format("%04d", i) + "-" + String.format("%02d", j) + "-"
                                + String.format("%02d", k));
                    }
                }
            }
        }
    }

    public static Boolean isValidDate(int year, int month, int day) {
        try {
            String resultDay = String.format("%02d", day);
            String resultMonth = String.format("%02d", month);
            String resultYear = String.format("%04d", year);
            String date = resultYear + "" + resultMonth + "" + resultDay;
            // check if the date lenght is even
            if (date.length() % 2 == 0) {
                for (int i = 0; i < date.length(); i++) {
                    if (date.charAt(i) != date.charAt(date.length() - i - 1)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}