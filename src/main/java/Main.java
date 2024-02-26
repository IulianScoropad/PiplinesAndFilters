


public class Main {
    public static void main(String[] args) {
        Filter C = new SeatCutter();
        Filter B = new BackrestAssembler();
        Filter F = new FeetAssembler();
        Filter S = new StabilizerBarAssembler();
        Filter P = new Package();
        Filter A = new ArmrestAssembler();

        Pipe Type1 = new Pipe();
        Type1.addWorker(C);
        Type1.addWorker(F);
        Type1.addWorker(S);
        Type1.addWorker(B);
        Type1.addWorker(P);

        Pipe Type2 = new Pipe();
        Type2.addWorker(C);
        Type2.addWorker(F);
        Type2.addWorker(S);
        Type2.addWorker(P);


        Pipe Type3 = new Pipe();
        Type3.addWorker(C);
        Type3.addWorker(F);
        Type3.addWorker(S);
        Type3.addWorker(A);
        Type3.addWorker(B);
        Type3.addWorker(P);


        Chair chair1 = new Chair("Standart Chair");
        Type1.produceChair(chair1);
        System.out.println(chair1.toString());

        Chair chair2 = new Chair("Chairs without a backrest");
        Type2.produceChair(chair2);
        System.out.println(chair2.toString());

        Chair chair3 = new Chair("Chairs with armrests");
        Type3.produceChair(chair3);
        System.out.println(chair3.toString());
    }
}
