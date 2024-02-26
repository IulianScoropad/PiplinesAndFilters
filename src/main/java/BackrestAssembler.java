

public class BackrestAssembler implements Filter {

    public void operate(Chair chair) {
        chair.setOperations("Backrest assembled");
    }
}
