package com.aplicacion.ecomicospro.Configurations.ApiConfigurations;

public class ApiConfigurations {
    // Server address
    private static final String Server_http      = "http://";
    //private static final String Server_direction = "api-el-economico.atwebpages.com/api/";
    private static final String Server_direction = "api-el-economico.000webhostapp.com/api/";

    /**
     *  Addresses
     */

    // Auth
    private static final String login          = "auth/auth.php";
    private static final String loginWithToken = "auth/auth2.php";
    private static final String logout         = "auth/logout.php";
    private static final String resetPassword  = "auth/reset_password.php";
    private static final String newPassword    = "auth/new_password.php";
    private static final String verify         = "auth/verify.php";

    // Categories
    private static final String getAllCategories = "categories/get.php";
    private static final String createCategories = "categories/create.php";
    private static final String updateCategories = "categories/update.php";
    private static final String deleteCategories = "categories/delete.php";

    // Products
    private static final String getAllProducts = "products/get.php";
    private static final String searchProducts = "products/search.php";
    private static final String createProducts = "products/create.php";
    private static final String updateProducts = "products/update.php";
    private static final String deleteProducts = "products/delete.php";

    private static final String getAllUser = "users/get.php";
    private static final String searchUser = "users/search.php";
    private static final String createUser = "users/create.php";
    private static final String updateUser = "users/update.php";
    private static final String deleteUser = "users/delete.php";

/*
    // Pedidos
    private static final String getAllPedidos = "products/get.php";
    private static final String searchPedidos = "products/search.php";
    private static final String createPedidos = "products/create.php";
    private static final String updatePedidos = "products/update.php";
    private static final String deletePedidos = "products/delete.php";
*/
    /**



    /**
     * Endpoints
     */

    // Auth
    public static final String loginEndpoint          = Server_http + Server_direction + login;
    public static final String loginWithTokenEndpoint = Server_http + Server_direction + loginWithToken;
    public static final String logoutEndpoint         = Server_http + Server_direction + logout;
    public static final String resetPasswordEndpoint  = Server_http + Server_direction + resetPassword;
    public static final String newPasswordEndpoint    = Server_http + Server_direction + newPassword;
    public static final String verifyEndpoint         = Server_http + Server_direction + verify;

    // Categories
    public static final String getAllCategoriesEndpoint = Server_http + Server_direction + getAllCategories;
    public static final String createCategoriesEndpoint = Server_http + Server_direction + createCategories;
    public static final String updateCategoriesEndpoint = Server_http + Server_direction + updateCategories;
    public static final String deleteCategoriesEndpoint = Server_http + Server_direction + deleteCategories;

    // Products
    public static final String getAllProductsEndpoint = Server_http + Server_direction + getAllProducts;
    public static final String searchProductsEndpoint = Server_http + Server_direction + searchProducts;
    public static final String createProductsEndpoint = Server_http + Server_direction + createProducts;
    public static final String updateProductsEndpoint = Server_http + Server_direction + updateProducts;
    public static final String deleteProductsEndpoint = Server_http + Server_direction + deleteProducts;

    public static final String getAllUsersEndpoint = Server_http + Server_direction + getAllProducts;
    public static final String searchUsersEndpoint = Server_http + Server_direction + searchProducts;
    public static final String createUsersEndpoint = Server_http + Server_direction + createProducts;
    public static final String updateUsersEndpoint = Server_http + Server_direction + updateProducts;
    public static final String deleteUsersEndpoint = Server_http + Server_direction + deleteProducts;

    //public static String createUsersEndpoint;
}

