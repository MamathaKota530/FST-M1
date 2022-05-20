package activities;

public class Activity8 {
    public static void main(String args[]) {
        try {
            Activity8 obj = new Activity8();
            obj.exceptionTest("Will print to console");
            obj.exceptionTest(null);
        }catch (CustomException ex){
            System.out.println("Inside catch block: " + ex.getMessage());
        }
    }
    void exceptionTest(String value) throws CustomException {
        if(value == null){
           throw new CustomException("Given value is null");
        }else{
            System.out.println(value);
        }
    }
}
class CustomException extends Exception {
    private String message = null;
    CustomException(String newMessage){
        message = newMessage;
    }
    @Override
    public String getMessage() {
        return message;
    }

}
