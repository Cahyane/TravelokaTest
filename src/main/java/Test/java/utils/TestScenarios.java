package Test.java.utils;

public enum TestScenarios {
    T1("User login into web Traveloka");
    private String testCaseName;

    TestScenarios(String value){

    testCaseName = value;
}
public String getTestCaseName(){
        return testCaseName;
    }



}
