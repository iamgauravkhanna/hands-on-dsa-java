package elemental;

public class DiagonalDifference {

    public static void main(String args[]){

        int[][] a2dArray = new int[5][5];

        for(int i = 0; i<5; i++){
            for(int j=0;j<5;j++){
                a2dArray[i][j]=i+j+8;
                System.out.print(a2dArray[i][j]+" , ");
            }
            System.out.println("");
        }

        int counter = 0;
        int primaryDiagSum = 0;

        for(int i = 0; i<a2dArray.length; i++){
            for(int j=0;j<a2dArray.length;j++){
                if(i==j) {
                    primaryDiagSum += a2dArray[i][j];
                    System.out.println("primaryDiagSum => "+ primaryDiagSum);
                    counter++;
                }
            }
        }

        System.out.println("FINAL primaryDiagSum => "+ primaryDiagSum);

    }

}
