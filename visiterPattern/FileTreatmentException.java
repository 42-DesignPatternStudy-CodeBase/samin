package visiterPattern;

public class FileTreatmentException extends Exception{
    public FileTreatmentException() {}
    
    public FileTreatmentException(String msg) {
        super(msg);
    }

    @Override
    public void printStackTrace() {
        // super.printStackTrace();
        System.out.println("파일 에러 입니다");
    }
}