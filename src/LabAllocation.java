import java.util.Scanner;
public class LabAllocation {
    public static void main(String[] args) {
        int[] labCapacities = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lab - 1 seating capacity");

        labCapacities[0] = scanner.nextInt();

        System.out.println("Enter lab - 2 seating capacity");

        labCapacities[1] = scanner.nextInt();

        System.out.println("Enter lab - 3 seating capacity");

        labCapacities[2] = scanner.nextInt();

        System.out.println("Enter the number of students");

        int noOfStudents = scanner.nextInt();

        int capacityDifference = Integer.MAX_VALUE;

        int labNumber = 0;

        for( int iterator = 0 ; iterator < 3 ; iterator++ ){

            if( labCapacities[iterator] < 0 ){

                System.out.println("seating capacity cannot be less than zero");

            }
            else{
                int tempDifference =  labCapacities[iterator] -  noOfStudents ;

                if( tempDifference > 0  && capacityDifference > tempDifference ){

                    capacityDifference = tempDifference;

                    labNumber = iterator+1;

                }

            }
        }
        if(labNumber == 0){

            System.out.println("None of the labs are sufficient for the no of students ");

        }
        else{

            System.out.println("L" + labNumber);

        }
    }
}