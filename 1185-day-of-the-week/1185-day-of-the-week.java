class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
        java.time.LocalDate date = java.time.LocalDate.of(year, month, day);
        return days[date.getDayOfWeek().getValue() % 7];
    }
}