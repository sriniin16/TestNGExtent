package API;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest {

    RequestSpecBuilder builder;
    RequestSpecification spec;

    @Test
    public void getOps()
    {
        builder = new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:3000");
        spec = builder.build();
        RequestSpecification request = RestAssured.given().spec(spec);
        String author = request.get("/posts/2").getBody().jsonPath().get("author");
        System.out.println(author);
    }

//    public static void main(String args[])
//    {
//        APITest api = new APITest();
//        api.getOps();
//    }

    @Test
    public void fullStarPattern()
    {
        int n=5;

        for (int i=0; i<n ; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++)
            {
                System.out.print("*");
            }

            for(int j=0; j<=i-1; j++)
            {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
    }



}
