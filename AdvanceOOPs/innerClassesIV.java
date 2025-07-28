package AdvanceOOPs;

public class innerClassesIV {
    interface Sample {
        public void execute();
    }
    abstract class Task {
        abstract void job();
    }
    public static void main(String[] args) {
        Sample sample = new Sample() {
            //Anonymous Inner Class
            @Override
            public void execute() {
                System.out.println("executed");
            }
        };
        sample.execute();

        innerClassesIV.Task task = new innerClassesIV().new Task() {
            @Override
            public void job() {
                System.out.println("Job executed");
            }
        };
        task.job();
    }
}
