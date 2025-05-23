package api.endpoints;

/*
 https://petstore.swagger.io/
 1)Create user(Post): https://petstore.swagger.io/v2/user
 2)Get user(get): https://petstore.swagger.io/v2/user/{username}
 3)Update user(put) : https://petstore.swagger.io/v2/user/{username}
 4)Delete user(delete) : https://petstore.swagger.io/v2/user/{username}
 */
public class Routes 
{
    public static String base_url="https://petstore.swagger.io/v2";
    
    //User model
    
    public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";
}
