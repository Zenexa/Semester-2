import java.util.Scanner;

class Login{

    
    public static void AccountLocked(){
        System.exit(0);
    }

    public static void Dashboard(){
        System.out.println("Welcome to dashboard");
    }

    // static void LoginUser(String username, String password)
        public static void LoginUser(){
        String username = "user",password ="user";
        // Scanner input = new Scanner(System.in);
        
        // System.out.print("Masukan username ");
        // username = input.nextLine();

        // System.out.print("Masukan password ");
        // password = input.nextLine();
        
        // input.close();
        if (username == "user")
        {
            int TempPassword = 0;
            while (true){
                TempPassword = TempPassword + 1;
                if (TempPassword == 10){
                    System.out.println("Account Locked Please contact administrator");
                    AccountLocked();
                }

                else{
                    if (password == "user"){
                        int OTP = 53423;
                        int TempOTP = 0;

                        while (true){
                            TempOTP = TempOTP + 1;
                            if (TempOTP == 10){
                                System.out.println("Account Locked Please contact administrator");
                                AccountLocked();
                            }

                            else{
                                Scanner InputOTP = new Scanner(System.in);
                                System.out.print("Masukan OTP = ");
                                int ValOTPInput = InputOTP.nextInt();
                                InputOTP.close();
                                if (ValOTPInput == OTP){
                                    System.out.println("Login Successfull");
                                    Dashboard();
                                }

                                else{
                                    System.out.println("Incorrect OTP");
                                }

                            }
                        }  
                    }
                }
            }
        }

        else{
            System.out.println("Incorrect username please input correct username");
            System.exit(0);

        }

    }
    public static void main(String[] args) {
        // String username,password;
        // Scanner input = new Scanner(System.in);

        // username = input.nextLine();
        // password = input.nextLine();

        // LoginUser(username,password);

        // input.close();

        LoginUser();
    }
}
