public class TryingMethods {
    public static void main(String[] args) {
    };
    public String dayOfWeek(int day) {
        // This method is supposed to have an integer and returns string,
        // and switch statement is used to return the day of the week
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;
    }

    public void teacherCommentGiven(int score) {

        // This method receives an integer and
        // returns a statement based on the
        // value of the int

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 80) {
            System.out.println("Very good job");
        } else if (score >= 70) {
            System.out.println("Good job");
        } else if (score >= 60) {
            System.out.println("Good job, can do better");
        } else if (score < 60) {
            System.out.println("Push again, you can do it!");
        } else {
            System.out.println("Please pass by Emily's office");
        }
    }

}